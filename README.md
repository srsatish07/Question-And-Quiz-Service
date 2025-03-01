# Question-And-Quiz-Service

# Question-And-Quiz-Service

## Overview
**Question-And-Quiz-Service** is a microservices-based application that manages quizzes and questions. It uses **Spring Boot**, **Spring Cloud Eureka**, **Feign Clients**, and **MySQL** for data persistence.

## Tech Stack
- **Java 17**
- **Spring Boot**
- **Spring Cloud Eureka (Service Discovery)**
- **Spring Data JPA (Hibernate)**
- **Feign Client (Inter-Service Communication)**
- **MySQL (Database)**
- **Lombok (Code Simplification)**

## Architecture
The project consists of two microservices:
1. **Question-Service** → Manages questions.
2. **Quiz-Service** → Manages quizzes and fetches questions using **Feign Client**.

## Features
- Create and manage quizzes.
- Add and retrieve questions.
- Service discovery with **Eureka**.
- Inter-service communication using **Feign Client**.

## Setup Instructions
### Prerequisites
Ensure you have the following installed:
- **Java 17**
- **Maven**
- **MySQL Server**
- **Spring Boot**

### Clone the Repository
```sh
git clone https://github.com/srsatish07/Question-And-Quiz-Service.git
cd Question-And-Quiz-Service
```

### Database Configuration
Update `application.properties` in both services:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/micro_project
spring.datasource.username=root
spring.datasource.password=1234
spring.jpa.hibernate.ddl-auto=update
```

### Start Eureka Server
```sh
cd Eureka-Server
mvn spring-boot:run
```

### Start Services
#### Start **Question-Service**
```sh
cd Question-Service
mvn spring-boot:run
```

#### Start **Quiz-Service**
```sh
cd Quiz-Service
mvn spring-boot:run
```

## API Endpoints
### Question-Service
| Method | Endpoint | Description |
|--------|---------|-------------|
| **POST** | `/questions` | Add a new question |
| **GET** | `/questions/{quizId}` | Get questions for a quiz |

### Quiz-Service
| Method | Endpoint | Description |
|--------|---------|-------------|
| **POST** | `/quiz` | Create a new quiz |
| **GET** | `/quiz` | Get all quizzes |
| **GET** | `/quiz/{id}` | Get a quiz by ID (includes questions) |

## Troubleshooting
### Common Issues & Fixes
1. **Service Not Found (404)**
   - Ensure Eureka Server is running.
   - Check if service names in Feign Client match those registered in Eureka.
2. **Database Connection Errors**
   - Verify MySQL is running.
   - Ensure credentials in `application.properties` are correct.

## License
This project is **open-source**. Feel free to contribute! 😊

