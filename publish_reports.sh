#!/bin/bash
# Build the project and generate the Serenity reports
./gradlew clean test aggregate
# Stash any changes in the main branch
git stash push -m "Saving local changes"
# Checkout to the gh-pages branch
git checkout gh-pages
# Clear existing files
git rm -rf .
git clean -fdx
# Copy new report files from the build directory cp -R target/site/serenity/* .
# Add all files to git
git add .
# Commit the changes
git commit -m "Publish Serenity Report"
# Push to GitHub
git push origin gh-pages
# Switch back to the main branch
git checkout master
# Apply stashed changes
git stash pop