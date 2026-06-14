# Sprint 9 - Finance Engine Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Deliver income, expense, savings, investments, net worth, goals, EMI, travel fund management.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 8 exit criteria passed.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| FIN-001 | Create DB migration for income table | 45 | SETUP-010 | income table created with source, amount, frequency, and period fields. |
| FIN-002 | Create DB migration for expense table | 45 | FIN-001 | expense table created with category, amount, date, and recurrence metadata. |
| FIN-003 | Create DB migration for investment table | 45 | FIN-001 | investment table created with instrument type, principal, current value, return fields. |
| FIN-004 | Create DB migration for goal table | 45 | FIN-001 | finance goal table created with target amount/date and progress fields. |
| FIN-005 | Create DB migration for loan/asset/liability tables | 55 | FIN-001 | loan, asset, liability tables created with balances, rates, and timeline fields. |
| FIN-006 | Implement finance entities and repositories | 55 | FIN-005 | Repositories compile and support summary queries for net worth calculation. |
| FIN-007 | Implement income and expense CRUD endpoints | 50 | FIN-006 | Endpoints support create/update/list/delete with validation and ownership checks. |
| FIN-008 | Implement investment and goal CRUD endpoints | 50 | FIN-006 | Endpoints return typed payloads and enforce non-negative monetary validations. |
| FIN-009 | Implement EMI and travel-fund service logic | 50 | FIN-005 | Service computes monthly EMI and travel-fund contribution progress correctly. |
| FIN-010 | Implement net worth calculation service and endpoint | 55 | FIN-006 | Endpoint returns assets-liabilities trend with point-in-time totals. |
| FIN-011 | Implement finance dashboard summary endpoint | 45 | FIN-007, FIN-008, FIN-010 | Endpoint returns income/expense/savings/investment/net-worth summaries. |
| FIN-012 | Build Finance Dashboard UI route | 45 | FIN-011 | Dashboard route renders KPI cards and trend sections. |
| FIN-013 | Build transactions UI list with filters | 50 | FIN-007, FIN-012 | Income/expense list supports date/category filters and pagination. |
| FIN-014 | Build net worth visualization UI | 45 | FIN-010, FIN-012 | Chart displays assets, liabilities, and net worth over time. |
| FIN-015 | Build finance goals panel UI | 45 | FIN-008, FIN-012 | Goals page supports create/update and shows progress bars. |
| FIN-016 | Add finance integration tests for summaries and net worth | 55 | FIN-011, FIN-014 | Tests validate finance CRUD and summary/net-worth endpoint contracts. |
