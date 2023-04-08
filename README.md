# SkillKamp_Web-Ecommerce

This is a Spring Boot ecommerce project with a Postgres database and Swagger documentation. It includes unit tests and generates test coverage reports.

## Getting Started
### Prerequisites
- Java 11 or higher
 - Postgres database

### Running the Application

1. Clone the repository.
2. Update the database configuration in src/main/resources/application.properties with your Postgres credentials.
```
spring.datasource.url=jdbc:postgresql://{yourHostUrl}:{}yourPort}/{dbName}
spring.datasource.username={userName}
spring.datasource.password={password}

spring.flyway.url=jdbc:postgresql://{yourHostUrl}:{}yourPort}/{dbName}
spring.flyway.user={userName}
spring.flyway.password={password}
```
3. Build the application with the command .
```
./mvnw clean package
```
4. Run the application with the command.
```
java -jar target/ecommerce-0.0.1-SNAPSHOT.jar
```

The application will start on http://localhost:8844.

### Running the Application

Swagger documentation is available at http://localhost:8844/swagger-ui/index.html#/.

### Running Unit Tests
Unit tests can be run with the command 
```
./mvnw clean test
```

### Generating Test Coverage Reports
Test coverage reports can be generated with the command
```
./mvnw clean test jacoco:report
```
The coverage report will be available at
```
target/site/jacoco/index.html
```

### Built With
- Spring Boot
- Postgres
- Swagger
- Junit
- JWT
