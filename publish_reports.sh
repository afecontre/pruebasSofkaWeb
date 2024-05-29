#!/bin/bash
# Stash any changes in the main branch
git stash push -m "Saving local changes"
# Checkout to the gh-pages branch
git checkout gh-pages
<<<<<<< Updated upstream
=======
# Clear existing files
git clean -fdx
>>>>>>> Stashed changes
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