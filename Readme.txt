RetoApiDemoPlaze
Descripción
Este proyecto de automatización utiliza SerenityRest BDD con el patrón Screenplay para realizar pruebas a las api de Login 
y singup de demoplaze, en los cuales se plantean los escenarios de crear usuario nuevo, intentar crear usuario ya existente, realizar inicio de sesion con contraseña correcta he incorrecta,  

Pre-requisitos
Asegúrate de tener instalados los siguientes componentes antes de ejecutar el proyecto:

Java 8 u 11: Puedes descargar Java en https://www.java.com/es/download/.


IntelliJ

Gradle: En la versión gradle-7.4-bin.zip

Paquetes utilizados en el patrón Screenplay
Este proyecto utiliza el patrón Screenplay para mejorar la legibilidad y la mantenibilidad de las pruebas. Los principales paquetes utilizados son:


questions: Contiene clases que permiten crear los modelos necesarios para el body de las peticiones como obtener las respuestas de los servicios mediante modelado tambien, informacion que podremos usar en las validaciones dispuestas en el then del stepDefinition

tasks: Contiene clases que definen tareas completas, que tienen como objetivo ejecutar el post de cada servicio

utils: Contiene clases para generar utilidades en las interacciones, con el propósito de ejecutar funciones específicas.

runners: Contiene las clases que permiten ejecutar los features.

stepsdefinitions: Contiene las clases que implementan los pasos definidos en los features.

features: Contiene las historias de usuario en lenguaje Gherkin.

Instalación
Para ejecutar este proyecto en tu máquina local, debes: Clona este repositorio en tu máquina local utilizando Git:

git clone 

Ejecución por consola
Para ejecutar las pruebas localmente por medio de la terminal, con este comando:

gradle clean test -Dcucumber.options="--tags @etiqueta"