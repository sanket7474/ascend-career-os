# Sprint 4 - Planner Engine Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Deliver calendar, daily/weekly planning, goals, pomodoro, tasks, reminders.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 3 exit criteria passed.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| PLAN-001 | Create DB migration for planner_task table | 50 | SETUP-010 | planner_task table created with status, priority, due date, and audit fields. |
| PLAN-002 | Create DB migration for planner_goal table | 45 | PLAN-001 | planner_goal table created with timeline and progress fields. |
| PLAN-003 | Create DB migration for planner_schedule table | 45 | PLAN-001 | planner_schedule stores calendar slots with start/end and recurrence metadata. |
| PLAN-004 | Create DB migration for planner_reminder table | 45 | PLAN-001 | planner_reminder table created with channel/time/status fields. |
| PLAN-005 | Implement planner entities and repositories | 55 | PLAN-004 | Repositories compile and expose task/goal/schedule/reminder query methods. |
| PLAN-006 | Implement tasks API endpoints under /tasks | 55 | PLAN-005 | CRUD endpoints for tasks support validation and auth ownership checks. |
| PLAN-007 | Implement goals API endpoints under /goals | 50 | PLAN-005 | CRUD endpoints for goals return expected payloads and status codes. |
| PLAN-008 | Implement calendar API endpoint under /calendar | 45 | PLAN-005 | Endpoint returns merged schedule/task timeline by date range. |
| PLAN-009 | Implement planner summary endpoint under /planner | 45 | PLAN-006, PLAN-007, PLAN-008 | Endpoint returns daily and weekly planning summary model. |
| PLAN-010 | Build calendar UI component with week/day navigation | 55 | PLAN-008 | Calendar view renders events and supports date navigation. |
| PLAN-011 | Build daily planner board UI | 50 | PLAN-006, PLAN-009 | Daily board shows prioritized tasks, pomodoro blocks, reminders. |
| PLAN-012 | Build weekly planner UI | 50 | PLAN-008, PLAN-009 | Weekly view displays scheduled work by weekday columns. |
| PLAN-013 | Build goal board UI with progress indicators | 45 | PLAN-007 | Goal board lists active goals and progress bars. |
| PLAN-014 | Add reminder creation/edit interactions in UI | 45 | PLAN-011 | User can create/update reminder entries and see confirmation feedback. |
| PLAN-015 | Add planner API integration and store state management | 50 | PLAN-010, PLAN-013 | Planner pages load/save data through typed services with loading/error states. |
| PLAN-016 | Add planner integration tests for tasks/goals/calendar | 55 | PLAN-009 | Automated tests cover core planner flows and validation errors. |
