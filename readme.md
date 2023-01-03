
## Proof of concept of an Electron packaged Vaadin web application

This kind of packaged application is useful to have in a same code base the possibility to run locally (as an Electron application) and to install on a remote server as a normal web application. 

This project is inspired to the very good: https://github.com/appreciated/maven-springboot-electron

With some upgrades:

- Java 19 : as compilation language but also as embedded JRE to be shipped with the application
- Vaadin: 23.3.2 (the latest available)
- Small Ant build script on top of maven to add a bit of old good procedural logic  
- A more complete Vaadin app created via https://start.vaadin.com 

To start build:

- Install Java JDK 19
- Install Ant (1.10.12)
- Install Maven (mine is 3.6.3 and never triasadsed )

