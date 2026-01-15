# Spring Boot MongoDB CRUD Application

## Date
6-01-2026

## Description
This project is a Spring Boot CRUD application developed using MongoDB as the database.
The application exposes REST APIs and provides interactive API documentation using Swagger UI.

All sensitive configurations are externalized using environment variables and stored in a `.env` file,
which is excluded from version control.

---

## Tech Stack
- Java 21
- Spring Boot
- MongoDB
- Gradle (Wrapper)
- Swagger / OpenAPI
- JUnit
- VS Code

---

## Features
- Create, Read, Update, Delete (CRUD) operations
- MongoDB integration
- Swagger UI for API testing
- Environment-based configuration
- Gradle wrapper (no local Gradle installation required)

---

## API Documentation
Swagger UI is available at: http://localhost:8080/swagger-ui/index.html

---

## How to Run
./gradlew clean build
./gradlew bootRun
