# Spring 6 Demo App

This is a Spring Boot 3 + Spring 6 + Hibernate demo project with REST endpoints.

Each subfolder focuses on specific features or concepts.

## Features

- REST controllers
- Java 21 + Maven + IntelliJ setup

## How to Run

```bash
./mvnw spring-boot:run
```

## Setup

Copy the sample configuration and customize it:

```bash
cp src/main/resources/application-sample.properties src/main/resources/application.properties
```

## Subfolders

### 📁 01-spring-boot-overview

#### `01-spring-boot-demo`
Basic Spring Boot setup with a simple REST API.

- Adds Spring 6 demo project files
- Includes: basic project structure, starter dependencies

---

#### `02-dev-tools-demo`
Demonstrates Spring Boot DevTools for hot reloads and development experience improvements.

- Moves `README.md` to root
- Adds `README.md` and two example REST controllers to test Dev-Tools changes
- Shows live-reloading in action

---

#### `03-actuator-demo`
Enables and exposes Spring Boot Actuator endpoints.

- Adds Spring Boot Actuator and exposes all endpoints
- Stops tracking `application.properties` and add to `.gitignore`
- Focus: monitoring endpoints and secure configuration handling

---

#### `04-actuator-security-demo`
Secures actuator endpoints with Spring Security.

- Adds security dependency to `pom.xml`, practice exclusion of endpoints
- Demonstrates fine-tuned control over actuator visibility

---

#### `05-command-line-demo`
Experimentation with running and configuring the app via command line.

- Removes actuator and security dependency to test running from command line
- Clean test of CLI and simplified dependency context

---

#### `06-properties-demo`
Custom configuration properties and their injection into a REST controller.

- Defines custom properties for coach and team name in `application.properties`, inject into controller, expose endpoint
- Configures server port and context path in `application.properties`
- Demonstrates property injection using `@Value` and basic customization of Spring Boot environment 
- Adds `application-sample.properties` to `src/main/resources` as a template config file
- Updates README file with organized summary and configuration explanation

---

### 📁 02-spring-boot-spring-core

#### `01-constructor-injection`
This module demonstrates constructor-based dependency injection using Spring Boot's core features.

- Defines a Coach interface and CricketCoach class annotated with @Component
- Creates a DemoController REST controller
- Injects the Coach dependency via the controller constructor
- Exposes a REST endpoint:
  - GET /dailyworkout
  - Returns a string workout message from the injected Coach

---