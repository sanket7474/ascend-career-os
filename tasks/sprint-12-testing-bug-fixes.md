# Sprint 12 - Testing and Bug Fixes Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Reach quality gates with comprehensive tests and targeted fixes.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 11 exit criteria passed.
Targets: Backend coverage 90 percent, Frontend coverage 80 percent.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| TEST-001 | Generate backend coverage baseline report | 35 | PERF-015 | Coverage report produced and module-level gaps listed. |
| TEST-002 | Generate frontend coverage baseline report | 35 | DASH-015 | Frontend coverage report produced with low-coverage component list. |
| TEST-003 | Add unit tests for auth validators and mappers | 55 | AUTH-020 | Tests cover invalid formats, edge lengths, and mapper field correctness. |
| TEST-004 | Add unit tests for dashboard aggregation service | 50 | DASH-004 | Tests cover zero-data, partial-data, and normal-data scenarios. |
| TEST-005 | Add unit tests for learning progress and quiz scoring | 55 | LEARN-016 | Tests validate progress transitions and deterministic scoring outcomes. |
| TEST-006 | Add unit tests for planner scheduling and reminder logic | 55 | PLAN-016 | Tests verify recurrence expansion and reminder trigger calculations. |
| TEST-007 | Add unit tests for habit streak and consistency services | 50 | HABIT-016 | Tests verify streak reset/continue edge cases and rolling consistency math. |
| TEST-008 | Add unit tests for career score and readiness services | 50 | CAREER-016 | Tests validate weighted scoring and readiness classification boundaries. |
| TEST-009 | Add unit tests for finance net worth and EMI calculations | 50 | FIN-016 | Tests cover rounding, liabilities, and monthly payment edge cases. |
| TEST-010 | Add repository integration tests for core query methods | 55 | TEST-001 | Repository tests run against test DB and validate query behavior. |
| TEST-011 | Add security integration tests for protected routes | 55 | PERF-015 | Unauthorized and role-restricted access cases assert correct status codes. |
| TEST-012 | Add frontend component tests for layout and dashboard cards | 50 | TEST-002 | Components render states for loading/error/data and match expected outputs. |
| TEST-013 | Add responsive UI test suite for key pages | 55 | TEST-012 | Core screens pass desktop/tablet/mobile viewport checks. |
| TEST-014 | Add accessibility checks for contrast, labels, keyboard nav | 55 | TEST-013 | Automated a11y checks pass and manual keyboard navigation checklist passes. |
| TEST-015 | Triage top 10 failing tests and apply focused fixes | 60 | TEST-001, TEST-002 | Previously failing tests now pass without introducing new regressions. |
| TEST-016 | Enforce coverage thresholds in CI quality gate | 45 | TEST-014, TEST-015 | CI fails when coverage drops below backend 90 percent or frontend 80 percent. |
