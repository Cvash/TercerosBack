# GENESIS Microservice Template 0.1.24
* New framework Genesis version 1.3.12.
* Actualización de los archivos de configuración del checkstyle.

# GENESIS Microservice Template 0.1.23
* Se agrega el test al método main.

# GENESIS Microservice Template 0.1.22

## Other issues
* New framework Genesis version 1.3.11.
* En la interfaz ReactiveWebServiceOperations se agregan nuevas sobrecargas al metodo marshalSendAndReceive.
* Actualización de los plugins de lombok y spotbugs en la compilación con gradle.

# GENESIS Microservice Template 0.1.21

## Other issues
* New framework Genesis version 1.3.10
* Se agregó el starter webclient con los filtros para trazar el request y response cuando se usa WebClient.

# GENESIS Microservice Template 0.1.20

## Other issues
* En el Dockerfile se reemplazó la imagen java:8 por anapsix/alpine-java:latest.

# GENESIS Microservice Template 0.1.19

## Other issues
* New framework Genesis version 1.3.9.
* Se agregó el starter oauth para gestionar los tipos de token:
    - geocoding
    - authorization
    - microsoft-login

# GENESIS Microservice Template 0.1.18

## Other issues
* Se actualizó la versión del framework.

## Other issues
* New framework Genesis vesion 1.3.8
* Se agregó el nuevo starter para notificaciones.
* Se corrigió un error en el starter de catálogo de errores. Al definir un Genesis Exception Detail no retornaba el http status correspondiente.

# GENESIS Microservice Template 0.1.17

## Other issues
* Fix de test. Se elimina el test de validación de request no valido.

# GENESIS Microservice Template 0.1.16

## Other issues
* New framework Genesis vesion 1.3.7.
* Se agregan el http status a los mensajes del catalogo de errores.
* Se habilitó comodines para el campo exceptionText del catalogo de errores.

# GENESIS Microservice Template 0.1.15

## Other issues
* New framework Genesis vesion 1.3.6.
* Se agregan las dependencias para el uso del starter Génesis para el Cosmos.
* Los test tienen ahora su propio application.yml que indica la sobreescritura de Beans.

# GENESIS Microservice Template 0.1.13

## Other issues
* New framework Genesis vesion 1.3.5.
* Se agregó al application.yml información adicional a mostrar en el Swagger.

# GENESIS Microservice Template 0.1.12

## Other issues
* New framework Genesis vesion 1.3.4.
* Se agregó dependencias para uso del Starter Table Storage.

# GENESIS Microservice Template 0.1.11

## Other issues
* New framework Genesis vesion 1.3.3.

# GENESIS Microservice Template 0.1.10-SNAPSHOT

## Other issues
* New framework Genesis vesion 1.3.2.

# GENESIS Microservice Template 0.1.9-SNAPSHOT

## Other issues
* New framework Genesis vesion 1.3.1.

# GENESIS Microservice Template 0.1.8

## Other issues
* New framework Genesis vesion 1.3.0

# GENESIS Microservice Template 0.1.7

## Other issues
* Corrección a minúsculas de todos los headers.

# GENESIS Microservice Template 0.1.5-SNAPSHOT

## Other features
* Evaluation removed on thirdparty packages from Checkstyle, Spotbugs and PMD plugins.

# GENESIS Microservice Template 0.1.2-SNAPSHOT

## Other features
* Adding stage reporting to create on local reports of checkstyle, pmd, spotbugs and jacoco.

# GENESIS Microservice Template 0.1.1-SNAPSHOT

## Other features
* The context path was configured and must be indicated in each microservice.

# GENESIS Microservice Template 0.1.0-SNAPSHOT

## Changes
## 2020-03-23

* Se implemento la creación del arquetipo base usando el gestor de dependencias `gradle`, para lo cual se añadio la opción para seleccionar el gestor de depedencias con las opciones `gradle` y `maven`.

## Genesis Framework | 1.2.0

### Dependencies deleted
junit

### Other features
* cfg folder with DevOps configuration added.
* Project name normalized with the format ${project.groupId}:${project.artifactId}.
* Swagger annotations updated.
* Adding files: .gitattributes, RELEASE.md and lombok.config.
* Lombok library was included in sonar configuration.
* Resolved some Smell Codes (Critics and majors).
* It was increased coverage for unit tests.
* Deprecated method from libraries were replaced.
* Scan stage was added.
* Classes without use were removed.
* Fixed potential bugs detected with new version of spotbugs.
* Test units were updated to JUnit 5.
* Deleting gradle configuration.

### New dependencies
* reactor-core.
* spring-webflux.
* springfox-spring-webflux.
* spring-boot-starter-actuator.
* jakarta.validation-api.
* validation-api.
* junit-jupiter-api.
