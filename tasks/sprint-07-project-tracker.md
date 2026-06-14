# Sprint 7 - Project Tracker Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Deliver project and task tracking with architecture/deployment notes plus resume/portfolio extraction.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 6 exit criteria passed.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| PROJ-001 | Create DB migration for project table | 45 | SETUP-010 | project table created with status, stack, start/end dates, and audit fields. |
| PROJ-002 | Create DB migration for project_task table | 45 | PROJ-001 | project_task created with assignee, status, priority, and due date fields. |
| PROJ-003 | Create DB migration for project_document table | 45 | PROJ-001 | project_document table stores architecture/deployment doc metadata and links. |
| PROJ-004 | Create DB migration for project_note table | 40 | PROJ-001 | project_note table stores markdown notes tied to project scope. |
| PROJ-005 | Implement project entities and repositories | 50 | PROJ-004 | Repositories compile with methods for list/search and project detail retrieval. |
| PROJ-006 | Implement project CRUD service and endpoints | 55 | PROJ-005 | User can create/read/update/archive projects with ownership checks. |
| PROJ-007 | Implement project task board endpoints | 50 | PROJ-005 | Endpoints support task create/move/update for kanban-style workflow. |
| PROJ-008 | Implement project documents and notes endpoints | 45 | PROJ-005 | Endpoints persist and retrieve architecture/deployment docs and notes. |
| PROJ-009 | Implement resume bullet extraction helper service | 50 | PROJ-006 | Service generates concise achievement bullets from project metadata. |
| PROJ-010 | Implement portfolio summary endpoint | 45 | PROJ-009 | Endpoint returns curated portfolio cards with stack, impact, and links. |
| PROJ-011 | Build Project List UI route and filters | 50 | PROJ-006 | List page supports status/stack filters and pagination controls. |
| PROJ-012 | Build Project Detail UI tabs | 55 | PROJ-008, PROJ-011 | Detail page includes overview/tasks/docs/notes tabs with lazy loading. |
| PROJ-013 | Build Sprint Board UI for project tasks | 50 | PROJ-007, PROJ-012 | Drag/drop or status-change interactions update task state correctly. |
| PROJ-014 | Build deployment notes panel UI | 40 | PROJ-008, PROJ-012 | Deployment section saves/retrieves checklists and environment notes. |
| PROJ-015 | Build portfolio preview UI card set | 45 | PROJ-010, PROJ-011 | Portfolio preview renders project highlights and generated resume bullets. |
| PROJ-016 | Add project tracker integration tests | 55 | PROJ-010, PROJ-013 | Tests cover project CRUD, task updates, and portfolio summary contract. |
