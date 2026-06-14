# Sprint 8 - Interview Tracker Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Deliver question bank, mock interviews, revision, applications, and readiness views.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 7 exit criteria passed.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| INTV-001 | Create DB migration for interview_question table | 45 | SETUP-010 | interview_question table created with category, difficulty, tags, and answer fields. |
| INTV-002 | Create DB migration for mock_interview table | 45 | INTV-001 | mock_interview table created with schedule, outcome score, and notes. |
| INTV-003 | Create DB migration for application_tracker table | 45 | INTV-001 | application_tracker table created with company, role, stage, status timeline. |
| INTV-004 | Implement interview entities and repositories | 50 | INTV-003 | Repositories compile and expose category/stage query helpers. |
| INTV-005 | Implement question bank CRUD endpoints | 50 | INTV-004 | CRUD endpoints support filters by category/difficulty/tag. |
| INTV-006 | Implement mock interview scheduling/results endpoints | 50 | INTV-004 | User can schedule, complete, and score mock interviews. |
| INTV-007 | Implement application tracker endpoints | 50 | INTV-004 | User can create/update application entries and interview stage transitions. |
| INTV-008 | Implement interview revision queue logic | 55 | INTV-005 | Incorrect or weak questions can be queued with next review date. |
| INTV-009 | Implement company readiness score service | 55 | INTV-006, INTV-007 | Score computes from mocks, question coverage, and application stage metrics. |
| INTV-010 | Implement interview dashboard endpoint | 45 | INTV-008, INTV-009 | Endpoint returns readiness summary, upcoming mocks, and active applications. |
| INTV-011 | Build Interview Dashboard UI route | 45 | INTV-010 | Dashboard shows readiness, due revisions, and upcoming interview sessions. |
| INTV-012 | Build mock interview execution screen UI | 55 | INTV-006, INTV-011 | Screen supports timed prompts, notes, scoring, and completion save. |
| INTV-013 | Build applications pipeline UI | 50 | INTV-007, INTV-011 | Pipeline board shows application stages with filter/search controls. |
| INTV-014 | Build question bank management UI | 50 | INTV-005, INTV-011 | User can add/edit/questions and filter by topic/difficulty. |
| INTV-015 | Build readiness insights panel UI | 45 | INTV-009, INTV-011 | Insights list weak areas with recommended follow-up actions. |
| INTV-016 | Add interview tracker integration tests | 55 | INTV-010, INTV-013 | Tests cover question CRUD, mock lifecycle, applications workflow, readiness payload. |
