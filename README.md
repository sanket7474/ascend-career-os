# ASCEND Career OS

ASCEND is a career operating system for software engineers, combining learning, planning, habits, career tracking, interview prep, projects, and finance workflows.

## Sprint 0 Status
This repository currently contains setup skeletons for frontend, backend, Docker, Flyway, and CI.

## Prerequisites
- Git
- Docker Desktop (or Docker Engine + Compose)
- Node.js 22.x and npm 10.x
- Java 21
- Maven 3.9+

## Quickstart (Local)
1. Clone the repository.
2. Start containers:
   - `docker compose up --build`
3. Stop containers:
   - `docker compose down`

## Service Endpoints (Planned)
- Frontend: http://localhost:4200
- Backend: http://localhost:8080
- PostgreSQL: localhost:5432

## Project Layout
- `frontend/` Angular frontend workspace skeleton
- `backend/` Spring Boot backend skeleton
- `docs/` product and architecture documentation
- `tasks/` sprint-wise atomic backlog tasks
- `.github/workflows/` CI pipeline skeleton

## Notes
- Current scripts are placeholders intended for progressive Sprint 0 implementation.
- Environment examples will be added in `.env` template files.
