# INTRODUCTION TO JAVA, MVN, AND GIT: LOC COUNTING

## Autor

Jhon Sebastian Piñeros Barrera

## Fecha

08/06/2022

## Descripcion

Este proyecto consiste en realizar el diseño y construccion de un programa capaz de realizar el conteo de lineas de un archivo o 
directorio dado, de acuerdo a si se desea realizar el conteo de la totalidad de las lineas (phy) o de las lineas de codigo (loc).

### LOC/h

Se realizaron 122 lineas de codigo en aproximadamente 3 horas de trabajo, es decir, 40.6 lineas de codigo por hora.

### Prerrequisitos

- JAVA
- Maven
- GIT

### Diagrama de clases

[![image.png](https://i.postimg.cc/d1BChRK6/image.png)](https://postimg.cc/JDs0gk0H)

### Descripcion diagrama de clases

En el diagrama de clases se puede observar que para el diseño de este proyecto se implemento en la clase CountLoc los metodos:

- phyFunction: Realiza el conteo del total de lineas en el archivo.
- locFunction: Realiza el conteo del total de lineas de codigo en el archivo.
- directorySearch: Realiza la busqueda de archivos en el directorio dado y su conteo de lineas.

Y tambien se realizo la implementacion de la clase CountLocTest encargada de la ejecucion de las pruebas unitarias a traves de Junit.

### Reporte de pruebas

```
mvn test
```

[![image.png](https://i.postimg.cc/zB7LVNR6/image.png)](https://postimg.cc/6276mDcf)

Se realizaron 4 test durante los cuales se comprueba la correcta ejecucion de del conteo phy y loc tanto para archivos como para directorios.

### Estructura del proyecto

```
C:.
├───main
│   └───java
│       └───edu
│           └───escuelaing
│               └───arsw
│                   └───ASE
│                       └───app
│                           └───CountLoc.java
└───test
    └───java
        └───edu
            └───escuelaing
                └───arsw
                    └───ASE
                        └───app
                            └───CountLocTest.java
```

### JavaDoc

El javadoc se puede vizualizar con el comando 

```
mvn javadoc:javadoc
```

y posteriormente vamos a la carpeta de nuestro proyecto y buscamos en target/site/apidocs/index.html