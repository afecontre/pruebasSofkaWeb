#!/bin/bash

# Abortar en caso de cualquier error
set -e

# Nombre de las ramas
SOURCE_BRANCH="master"
TARGET_BRANCH="gh-pages"
TARGET_DIR="target/site/serenity"
TEMP_DIR="/tmp/serenity-site"

# Asegurarse de que estamos en la rama correcta y actualizar
echo "Checkout and update $SOURCE_BRANCH branch"
git checkout $SOURCE_BRANCH
git pull origin $SOURCE_BRANCH

# Construir el proyecto para generar la carpeta target/site/serenity/
echo "Building the project to generate Serenity reports"
mvn clean verify  # Cambiar este comando según tu herramienta de construcción

# Crear una carpeta temporal y copiar los archivos generados
echo "Copying generated files to temporary directory"
mkdir -p $TEMP_DIR
cp -R $TARGET_DIR/* $TEMP_DIR

# Cambiar a la rama gh-pages y limpiar el directorio target/site/serenity
echo "Checkout $TARGET_BRANCH branch"
git checkout $TARGET_BRANCH

echo "Cleaning up old files in $TARGET_DIR in gh-pages branch"
rm -rf $TARGET_DIR/*
mkdir -p $TARGET_DIR  # Asegurarse de que el directorio existe

# Copiar los archivos desde la carpeta temporal a la ubicación deseada en gh-pages
echo "Copying files from temporary directory to $TARGET_DIR in gh-pages branch"
cp -R $TEMP_DIR/* $TARGET_DIR

# Limpiar la carpeta temporal
echo "Cleaning up temporary directory"
rm -rf $TEMP_DIR

# Añadir y confirmar los cambios
echo "Adding and committing changes"
git add .
git commit -m "Update Serenity reports"

# Enviar los cambios al repositorio remoto
echo "Pushing changes to $TARGET_BRANCH branch"
git push origin $TARGET_BRANCH

echo "Done!"
