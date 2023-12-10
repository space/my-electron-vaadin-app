
## Proof of concept of an Electron packaged Vaadin web application

This kind of packaged application is useful to have in a same code base the possibility to run locally (as an Electron application) and to install on a remote server as a normal web application.

This project is inspired to the very good: https://github.com/appreciated/maven-springboot-electron

With some upgrades:

- Java 19 : as compilation language but also as embedded JRE to be shipped with the application
- Vaadin: 23.3.2 (the latest available)
- Small Ant build script on top of maven to add a bit of old good procedural logic to the build process
- A bit more rich Vaadin app created via https://start.vaadin.com 

To build:

- Install Java JDK 19 and define your JAVA_HOME
- Install Ant (1.10.12) and define your ANT_HOME
- Install Maven (mine is 3.6.3 and never tried a newer version) and define your MAVEN_HOME
- For Vaadin normal build install also node (18.12.1) and npm (8.19.2)

then run:

    ant

and the list of available task will be printed:

    clean             Clean all not essential elements using maven
    clean.all         Clean all not essential elements (including all boring JS related Vaadin config)
    package.electron  Create Electron app ready for distribution  

so to create the final Electron bundle (for Win, Mac and Linux):

    ant package.electron

than take a coffee (first full build take 10 min on my machine...)
