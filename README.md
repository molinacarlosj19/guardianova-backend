# Guardianova Backend

This is the backend codebase for Guardianova, a LegalTech SaaS platform for microenterprises. Built with Spring Boot microservices, secured with JWT, and monitored with Prometheus + Grafana.

## Services

- `auth-service`: Handles user registration and authentication.
- `diagnosis-service`: Evaluates risk based on user input.
- `legalbot-service`: Generates legal documents and evaluations.
- `course-service`: Manages educational content.
- `guardianova-api-gateway`: Routes requests to services.
- `guardianova-eureka-server`: Service discovery.

## Prerequisites

- Java 17
- Maven
- Docker and Docker Compose

## Running the Project Locally

1. **Build the project**:
   ```bash
   ./mvnw clean install
   ```

2. **Run with Docker Compose**:
   ```bash
   docker-compose up --build
   ```

3. Access:
   - API Gateway: http://localhost:8080
   - Eureka Dashboard: http://localhost:8761
   - Grafana: http://localhost:3000 (login: admin / admin)
   - Prometheus: http://localhost:9090

## Development

Each microservice is an independent Spring Boot app. Use IntelliJ IDEA to run/debug services individually.

## License

MIT
