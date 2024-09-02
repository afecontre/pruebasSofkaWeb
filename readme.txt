# Instrucciones para ejecutar el proyecto Demoblaze Checkout

## Prerrequisitos

1. Java JDK 11 o superior instalado.
2. Gradle instalado (puedes descargarlo desde https://gradle.org/).
3. Google Chrome instalado (el proyecto está configurado para ejecutar pruebas en Chrome).
4. Configurar las variables de entorno para Java y Gradle.

## Configuración del proyecto

1. Clona el repositorio del proyecto:
   ```
   git clone [URL del repositorio]
   ```
2. Navega al directorio del proyecto:
   ```
   cd [nombre-del-directorio]
   ```
3. Configura el entorno y descarga las dependencias:
   ```
   gradle clean test
   ```

## Ejecutar las pruebas

Para ejecutar las pruebas automáticas del proyecto, usa el siguiente comando:
```
gradle test
```

## Generar reportes

Para generar un reporte de pruebas con Serenity, ejecuta:
```
gradle aggregate
```

Los reportes se generarán en el directorio `target/site/serenity`.

## Consideraciones adicionales

- Asegúrate de que todos los servicios necesarios estén disponibles y configurados correctamente antes de ejecutar las pruebas.
- Para ejecutar las pruebas en modo headless (sin interfaz gráfica), modifica el archivo de configuración `serenity.conf` para utilizar el entorno `headless`.
