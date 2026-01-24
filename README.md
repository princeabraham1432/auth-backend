# 🔐 Spring Boot JWT Authentication Backend

A backend authentication system built with Spring Boot and Spring Security using JWT-based stateless authentication.

## 🚀 Features
- User registration & login
- Password hashing using BCrypt
- JWT token generation & validation
- Secured endpoints
- Global exception handling
- Clean layered architecture (Controller, Service, Repository)

## 🛠 Tech Stack
- Java 17
- Spring Boot
- Spring Security
- JWT
- JPA / Hibernate
- H2 / MySQL
- Maven

## 📌 API Endpoints

### Register
POST /auth/register
```json
{
  "username": "admin",
  "password": "admin123"
}
