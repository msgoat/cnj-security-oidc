# cnj-security-oidc

Showcase of a "Hello-World" style cloud native Java application using OpenID Connect for REST endpoint protection.
The actual integration of OpenID Connect security is demonstrated with three different Java backend technologies:
* Java EE (see: cnj-security-oidc-backend-javaee)
* Eclipse MicroProfile (see: cnj-security-oidc-backend-micro)
* Spring Boot (see: cnj-security-oidc-backend-spring)

In this showcase, KeyCloak is used as an OpenID Connect Authentication Provider. 

## Status
![Build status](https://drone.at.automotive.msg.team/api/badges/cloudtrain/cnj-security-oidc/status.svg)

## Build this showcase 

### Prerequisites

In order to run the build, you have to install the following tools locally:
* Docker
* Docker Compose 
* Maven
* Java JDK 8

### Run Maven

You can build all showcase applications by running Maven:
```
mvn clean install -P pre-commit-stage
```

The Maven build will create Docker images for all showcase applications and run system tests on them.