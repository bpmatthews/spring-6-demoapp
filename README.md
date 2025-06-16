# Spring 6 Demo App

This is a Spring Boot 3 + Spring 6 + Hibernate demo project with REST endpoints.

## Features

- REST controllers
- Java 21 + Maven + IntelliJ setup

## How to Run

```bash
./mvnw spring-boot:run
```

## 03 - Actuator

Spring Boot Actuator was enabled by adding the required dependency and configuring `application.properties` to:

- Expose all management endpoints:
  ```properties
  management.endpoints.web.exposure.include=*
  ```
- Enable the environment info endpoint:
  ```properties
  management.info.env.enabled=true
  ```
- Provide custom application metadata under the `/actuator/info` endpoint:
  ```properties
  info.app.name=Demo App
  info.app.description=Spring Boot 3, Spring 6, Hibernate Project
  info.app.version=1.0.0
  ```

After these changes, you can access the following:

- `/actuator` — view all available endpoints
- `/actuator/info` — view custom app metadata
- `/actuator/health` — check app health status