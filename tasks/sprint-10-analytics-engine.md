# Sprint 10 - Analytics Engine Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Deliver heatmaps, radar charts, timeline, reports, growth insights.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 9 exit criteria passed.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| ANLT-001 | Create DB migration for analytics_daily table | 45 | SETUP-010 | analytics_daily created with metric key, value, date, user dimensions, indexes. |
| ANLT-002 | Create DB migration for analytics_weekly table | 45 | ANLT-001 | weekly aggregate table created with period boundaries and metric fields. |
| ANLT-003 | Create DB migration for analytics_monthly table | 45 | ANLT-001 | monthly aggregate table created with summary metrics and indexes. |
| ANLT-004 | Create DB migration for analytics_yearly table | 45 | ANLT-001 | yearly aggregate table created with trend/comparison fields. |
| ANLT-005 | Implement analytics entities and repositories | 50 | ANLT-004 | Repository queries support period-based retrieval and upsert semantics. |
| ANLT-006 | Implement ETL service for daily metric aggregation | 55 | ANLT-005 | Service computes and stores daily aggregates from module source tables. |
| ANLT-007 | Implement weekly/monthly/yearly rollup jobs | 55 | ANLT-006 | Rollup jobs aggregate prior period correctly and are idempotent. |
| ANLT-008 | Implement analytics heatmap endpoint | 45 | ANLT-006 | Endpoint returns date-grid payload for selected metric and window. |
| ANLT-009 | Implement analytics radar endpoint | 45 | ANLT-006 | Endpoint returns normalized axis series for career/learning/habit dimensions. |
| ANLT-010 | Implement analytics timeline endpoint | 45 | ANLT-007 | Endpoint returns trend points with period granularity selection. |
| ANLT-011 | Implement analytics insights/report endpoint | 50 | ANLT-008, ANLT-009, ANLT-010 | Endpoint returns top insights, growth deltas, and report summaries. |
| ANLT-012 | Build Analytics Dashboard UI route | 45 | ANLT-011 | Route loads analytics summary and renders key sections. |
| ANLT-013 | Build heatmap visualization UI integration | 50 | ANLT-008, ANLT-012 | Heatmap displays selected metric and date window with legend. |
| ANLT-014 | Build radar chart visualization UI integration | 45 | ANLT-009, ANLT-012 | Radar chart renders dimension scores and tooltips from API data. |
| ANLT-015 | Build timeline/reports UI integration | 50 | ANLT-010, ANLT-011, ANLT-012 | Timeline and report cards render and respond to period filters. |
| ANLT-016 | Add analytics integration tests for aggregate endpoints | 55 | ANLT-011 | Tests validate endpoint schema and rollup correctness on seeded fixtures. |
