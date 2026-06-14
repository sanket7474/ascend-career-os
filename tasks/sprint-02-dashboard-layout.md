# Sprint 2 - Dashboard and Layout Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Deliver dashboard APIs and fully usable dashboard layout in dark theme.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 1 exit criteria passed.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| DASH-001 | Define dashboard summary response DTOs | 35 | AUTH-001 | DTOs include statistics, quick actions, and recent activity sections. |
| DASH-002 | Implement dashboard service aggregation scaffold | 55 | DASH-001 | Service composes dashboard payload from placeholder data sources without controller logic leakage. |
| DASH-003 | Implement dashboard controller endpoint GET /dashboard | 35 | DASH-002 | Endpoint returns typed dashboard payload and requires authenticated user. |
| DASH-004 | Add backend unit test for dashboard service mapping | 50 | DASH-002 | Test verifies expected field mapping and default values. |
| DASH-005 | Create layout shell component with responsive grid | 50 | SETUP-001 | Shell renders top navbar + sidebar + content slot with desktop/mobile breakpoints. |
| DASH-006 | Build sidebar navigation component with route model | 45 | DASH-005 | Sidebar shows all module links and highlights active route. |
| DASH-007 | Build top navbar component with profile menu trigger | 40 | DASH-005 | Navbar displays app title, quick actions, and profile menu stub. |
| DASH-008 | Create dashboard page route and lazy loading config | 35 | DASH-005 | Dashboard route loads lazily and appears in navigation. |
| DASH-009 | Build reusable DashboardCard component | 45 | DASH-008 | Card supports title/value/icon/trend slots and is reused by dashboard widgets. |
| DASH-010 | Build ProgressCard and SummaryCard components | 50 | DASH-009 | Components accept typed inputs and render loading/empty states. |
| DASH-011 | Build Heatmap component scaffold | 50 | DASH-008 | Heatmap grid renders from sample data and supports tooltip text. |
| DASH-012 | Build RadarChart component scaffold | 55 | DASH-008 | Radar chart renders from config and handles no-data state gracefully. |
| DASH-013 | Integrate dashboard API call into page store/service | 45 | DASH-003, DASH-010 | Page fetches live payload and binds cards/widgets with loading/error states. |
| DASH-014 | Apply dark theme tokens to dashboard/layout surfaces | 45 | DASH-005 | Colors/spacing/borders derive from design tokens; no hardcoded palette in dashboard components. |
| DASH-015 | Add dashboard smoke test for render and API integration | 55 | DASH-013, DASH-014 | Test verifies dashboard route render, API call success path, and key widget visibility. |
