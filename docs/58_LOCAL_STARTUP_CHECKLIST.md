# Local Startup Command Sequence

Purpose: Validate the expected startup order and commands for Sprint 0 service skeletons.

## Compose Services Map
- postgres -> `postgres` service in docker-compose.yml (port 5432)
- backend -> `backend` service in docker-compose.yml (port 8080)
- frontend -> `frontend` service in docker-compose.yml (port 4200)

## Startup Checklist
1. Verify Docker is running.
2. From repository root, build and start all services:
   - `docker compose up --build`
3. Confirm service containers are up:
   - `docker compose ps`
4. Validate ports are reachable:
   - frontend: http://localhost:4200
   - backend: http://localhost:8080
   - postgres: localhost:5432

## Shutdown Checklist
1. Stop and remove service containers:
   - `docker compose down`
2. If a clean database state is needed, remove volumes:
   - `docker compose down -v`

## Troubleshooting Quick Steps
- Rebuild from scratch: `docker compose build --no-cache`
- Show service logs: `docker compose logs -f backend` (or frontend/postgres)
- Check running containers: `docker ps`
