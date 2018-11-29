# Screenplay-bdd-Alibaba

Automatizacion de la pagina web Alibaba.com, empleando el patron de diseño Screenplay y las herramientas Cucumber, Gherkin, JUnit y el gestor de dependencias Gradle. Para abrir el proyecto se deben tener instaladas estas herramientas.

## Instalacion de Gradle
Ir a la direccion https://gradle.org/install/ donde se encontraran los link de descarga y los pasos a seguir para instalar Gradle en su equipo.
Posteriormente se debe verificar que cuenta con la ultima version del plugin en su IDE, en Eclipse siga la ruta File->Eclipse Marketplace y realice la busqueda "gradle" e instale o actualice a la ultima version.

## Configuracion Build.gralde
Con la siguiente configuracion se hace uso de las herramientas Cucumber, Gherkin, Serenity Y JUnit bajo la implementacion propia del patron de diseño Screenplay

```
apply plugin: 'java-library'

compileJava.options.encoding = 'UTF-8'

tasks.withType(JavaCompile) {
    options.encoding = 'UTF-8'
}
// In this section you declare where to find the dependencies of your project
repositories {
	mavenLocal()
	jcenter()
}

buildscript {
    repositories {
        mavenLocal()
        jcenter()
    }
    dependencies {
        classpath("net.serenity-bdd:serenity-gradle-plugin:1.9.9")
    }
}

apply plugin: "java"
apply plugin: "eclipse"
apply plugin: "idea"
apply plugin: "net.serenity-bdd.aggregator"

dependencies{
	testCompile 'net.serenity-bdd:serenity-core:2.0.8'
	testCompile 'net.serenity-bdd:serenity-junit:2.0.8'
	testCompile 'junit:junit:4.12'
	testCompile 'org.assertj:assertj-core:1.7.0'
	testCompile 'org.slf4j:slf4j-simple:1.7.7'
	
	compile 'net.serenity-bdd:serenity-core:2.0.8'
	compile 'net.serenity-bdd:serenity-junit:2.0.8'
	compile 'net.serenity-bdd:serenity-cucumber:1.9.19'
	compile 'net.serenity-bdd:serenity-screenplay:2.0.8'
	compile 'net.serenity-bdd:serenity-screenplay-webdriver:2.0.8'
}
gradle.startParameter.continueOnFailure = true
test.finalizedBy(aggregate)
```
## Importar el proyecto
Para importar el proyecto debe seguir la ruta y seleccionar la carpeta que contiene el proyecto.
```
File -> Import... -> Gradle -> Existing Gradle Project
```
## Automatizacion
La ejecucion abre el navegador Chrome en la pagina https://www.alibaba.com/ y realiza una busqueda de un elemento que se ingresa por parametro desde el Feature del proyecto, luego de esto selecciona el primer resultado y posteriormente procede a ponerse en contacto con el proveedor, suministrando un correo electronico personal, la cantidad de unidades requeridas y un comentario sobre el producto, todo esto se pasa tambien como parametro desde el Feature o directamente desde los StepDefinitions.
