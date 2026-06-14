# Sprint 0 - Project Setup Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Create development foundation.
Rule: Every task is scoped to <= 60 minutes.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| SETUP-001 | Create frontend workspace folder skeleton | 30 | None | Folders exist for core/layout/shared/features/services/models/guards/interceptors/utils. |
| SETUP-002 | Create backend package skeleton under com.ascend | 40 | None | Packages for config/controller/service/repository/entity/dto/mapper/security/exception exist. |
| SETUP-003 | Add root .gitignore baseline for Node/Java/Docker artifacts | 25 | None | Generated files and secrets are ignored; file validates with no obvious missing critical patterns. |
| SETUP-004 | Add frontend package manifest with minimal scripts placeholder | 40 | SETUP-001 | package.json present with start/build/test script placeholders and pinned runtime version notes. |
| SETUP-005 | Add backend Maven pom skeleton with core dependencies list | 50 | SETUP-002 | pom.xml present with Spring Boot/Data/Security/Flyway/PostgreSQL test dependency placeholders. |
| SETUP-006 | Create docker-compose skeleton with service placeholders | 45 | SETUP-004, SETUP-005 | Compose file includes frontend/backend/postgres service entries and mapped ports. |
| SETUP-007 | Add backend Dockerfile multi-stage skeleton | 35 | SETUP-005 | Dockerfile builds jar in builder stage and runs from slim runtime image. |
| SETUP-008 | Add frontend Dockerfile build-and-serve skeleton | 35 | SETUP-004 | Dockerfile includes build stage and static serving stage. |
| SETUP-009 | Create Flyway migration directory structure | 20 | SETUP-005 | Path for db migration exists under backend resources. |
| SETUP-010 | Create initial migration stub for users/roles/permissions | 55 | SETUP-009 | SQL migration file exists with create table statements scaffolded and reversible constraints considered. |
| SETUP-011 | Add CI workflow skeleton for build and test jobs | 50 | SETUP-004, SETUP-005 | Workflow file triggers on push/PR and defines frontend/backend build-test steps. |
| SETUP-012 | Add repository README quickstart skeleton | 45 | SETUP-006, SETUP-011 | README documents setup prerequisites and local run steps. |
| SETUP-013 | Create environment variable template files | 30 | SETUP-006 | Example env files created for backend/frontend with non-secret placeholders only. |
| SETUP-014 | Validate local startup command sequence document | 30 | SETUP-006, SETUP-007, SETUP-008 | Written startup checklist exists and maps to compose services. |
| SETUP-015 | Record Sprint 0 verification checklist in docs/tasks context | 25 | SETUP-010, SETUP-011, SETUP-014 | Checklist includes project runs locally, docker works, CI passes. |
