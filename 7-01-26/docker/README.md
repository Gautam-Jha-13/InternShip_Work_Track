# Mongo CRUD Spring Boot Application

This project is a Spring Boot CRUD application using MongoDB, Gradle (Groovy), Swagger UI, and Docker.
The project uses environment variables via `.env` file to avoid exposing sensitive configuration.

---

##  Tech Stack
- Java 21
- Spring Boot
- Gradle (Wrapper – No local Gradle installation)
- MongoDB
- Swagger (OpenAPI)
- Docker & Docker Compose

---

## Features
- CRUD operations with MongoDB
- Swagger UI for API testing
- Dockerized Spring Boot + MongoDB
- Environment-based configuration
- JUnit test support

---

## Run Locally (Without Docker)

### Prerequisites
- Java 21
- MongoDB running on localhost:27017

### Steps

./gradlew clean bootRun

### Run Using Docker

### Prerequisites

Docker Desktop installed & running

Build & Run: docker compose up --build


Swagger UI : http://localhost:8080/swagger-ui
