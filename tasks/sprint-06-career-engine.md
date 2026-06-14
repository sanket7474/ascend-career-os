# Sprint 6 - Career Engine Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Deliver career score, skill matrix, promotion readiness, salary estimate, milestones, recommendations.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 5 exit criteria passed.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| CAREER-001 | Create DB migration for career_score table | 45 | SETUP-010 | career_score table created with weighted components and total score fields. |
| CAREER-002 | Create DB migration for career_skill table | 45 | CAREER-001 | career_skill table stores skill name/domain/level/target level with indexes. |
| CAREER-003 | Create DB migration for career_history table | 45 | CAREER-001 | career_history records score snapshots over time with source metadata. |
| CAREER-004 | Create DB migration for milestone table | 40 | CAREER-001 | milestone table captures milestone state, due date, and completion timestamp. |
| CAREER-005 | Implement career entities and repositories | 50 | CAREER-004 | Repository methods support score history retrieval and skill matrix listing. |
| CAREER-006 | Implement career score calculator service | 55 | CAREER-005 | Calculator returns deterministic weighted total from component metrics. |
| CAREER-007 | Implement promotion readiness evaluator | 50 | CAREER-005 | Service maps score/skills/milestones to readiness state and required gaps. |
| CAREER-008 | Implement salary estimate service rule set | 50 | CAREER-005 | Rule-based estimate returns min/median/max with confidence note. |
| CAREER-009 | Implement career dashboard endpoint | 45 | CAREER-006, CAREER-007, CAREER-008 | Endpoint returns score, skill matrix, readiness, and salary estimate payload. |
| CAREER-010 | Implement milestones CRUD endpoints | 45 | CAREER-005 | User can create/update/complete milestones with validation checks. |
| CAREER-011 | Build Career Dashboard UI route | 45 | DASH-005 | Route renders top-level score card, readiness summary, and recommendations. |
| CAREER-012 | Build skill matrix UI grid | 50 | CAREER-009, CAREER-011 | Matrix shows current vs target proficiency and highlights gap areas. |
| CAREER-013 | Build skill radar chart integration | 45 | CAREER-009, DASH-012 | Radar chart renders skills data and legend with accessible labels. |
| CAREER-014 | Build career timeline UI from history snapshots | 45 | CAREER-003, CAREER-011 | Timeline displays score trend and milestone events chronologically. |
| CAREER-015 | Build recommendation list UI and action links | 40 | CAREER-007, CAREER-011 | Recommendations render prioritized items with actionable next steps. |
| CAREER-016 | Add career engine tests for score/readiness/salary logic | 55 | CAREER-009 | Tests validate calculation determinism and endpoint contract shape. |
