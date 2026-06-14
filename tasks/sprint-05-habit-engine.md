# Sprint 5 - Habit Engine Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Deliver habits, streaks, heatmap, templates, consistency, achievements.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 4 exit criteria passed.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| HABIT-001 | Create DB migration for habit table | 45 | SETUP-010 | habit table created with category/frequency/target fields and audit columns. |
| HABIT-002 | Create DB migration for habit_log table | 45 | HABIT-001 | habit_log captures completion entries with date/status/value fields. |
| HABIT-003 | Create DB migration for habit_summary table | 45 | HABIT-002 | habit_summary stores computed streaks and consistency metrics per user/habit. |
| HABIT-004 | Implement habit entities and repositories | 50 | HABIT-003 | Repositories compile with methods for daily log retrieval and summary lookups. |
| HABIT-005 | Implement /habit CRUD endpoints | 55 | HABIT-004 | API supports create/read/update/archive habit records with validation. |
| HABIT-006 | Implement /habit/log endpoint for daily completion | 50 | HABIT-004 | Completion logs can be added/updated and are ownership-protected. |
| HABIT-007 | Implement /habit/template endpoint | 45 | HABIT-004 | Endpoint returns reusable predefined habit templates. |
| HABIT-008 | Implement streak calculation service | 55 | HABIT-006 | Service computes current streak and best streak correctly for ordered logs. |
| HABIT-009 | Implement consistency score computation service | 50 | HABIT-006 | Service returns rolling consistency percentage for configurable date window. |
| HABIT-010 | Build Habit Dashboard UI route | 45 | DASH-005 | Dashboard route displays habits summary and daily completion status. |
| HABIT-011 | Build Today's Habits checklist UI | 50 | HABIT-010, HABIT-006 | User can mark habits complete/incomplete and see immediate state update. |
| HABIT-012 | Build streak widget UI | 40 | HABIT-008, HABIT-010 | Widget renders current/best streak values and empty state. |
| HABIT-013 | Build habit heatmap component integration | 50 | HABIT-002, HABIT-010 | Heatmap visualizes habit completion by date intensity. |
| HABIT-014 | Build habit template picker UI | 45 | HABIT-007, HABIT-010 | User can create new habit from template and edit key fields before save. |
| HABIT-015 | Add habit achievements badge rules | 50 | HABIT-008, HABIT-009 | Badge logic awards deterministic milestones based on streak/consistency thresholds. |
| HABIT-016 | Add integration tests for habit APIs and streak logic | 55 | HABIT-009 | Tests cover CRUD/log/template and streak/consistency calculations. |
