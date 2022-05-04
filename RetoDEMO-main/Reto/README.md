# RetoLATAM
#RetoDEMO


# serenity-cucumber-maven  dayanna Rodriguez 2022/05/03
Un proyecto donde se ejemplifica el uso del patrón serenity 
 con cucumber y maven.

Las pruebas de este ejemplo se corren contra la página web de (https://demo.opencart.com/admin/index.php?route=common/dashboard).

Por defecto, los tests corren en Chrome con DriverManager, así que es NO necesario tener instalada la última versión del chrome driver y tenerla agregada como una variable en el path del sistema.

## Detalles generales 

# esta automatización corresponde a los procesos de login, busqueda de ordenes generadas y por ultimo
	# comprobar que no se cuentaan con los permisos necesarios para editar un producto

## Requerimientosde de implementación

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 4.7.

## Para correr el proyecto
se corre bajo configuración maven


RUN: clean install serenity:aggregate
 es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity/
