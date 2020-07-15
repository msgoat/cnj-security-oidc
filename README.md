# cnj-security-oidc

Showcase of a "Hello-World" style cloud native Java application using OpenID Connect for REST endpoint protection.
The actual integration of OpenID Connect security is demonstrated with three different Java backend technologies:

* Java EE (see: [cnj-security-oidc-backend-javaee](cnj-security-oidc-backend-javaee/README.md))
* Eclipse MicroProfile (see: [cnj-security-oidc-backend-micro](cnj-security-oidc-backend-micro/README.md))
* Spring Boot (see: [cnj-security-oidc-backend-spring](cnj-security-oidc-backend-spring/README.md))
* Quarkus (see: [cnj-security-oidc-backend-quarkus](cnj-security-oidc-backend-quarkus/README.md))

In this showcase, KeyCloak is used as an OpenID Connect Authentication Provider. 

## Status
![Build status](https://drone.at41tools.k8s.aws.msgoat.eu/api/badges/msgoat/cnj-security-oidc/status.svg)

## Release information

Latest version is: `4.0.0`.

A changelog can be found in [changelog.md](changelog.md).

## Build this showcase 

### Prerequisites

In order to run the build, you have to install the following tools locally:
* Docker
* Docker Compose 
* Maven
* Java JDK 11

You need to have an Open ID connect provider (like KeyCloak) up an running.

### Run Maven

You can build all showcase applications by running Maven:
```
mvn clean install -P pre-commit-stage
```

The Maven build will create Docker images for all showcase applications and run system tests on them.