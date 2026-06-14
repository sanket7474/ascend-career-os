# Sprint 14 - Release v1.0 Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Ship stable production release with complete release assets.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 13 exit criteria passed.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| REL-001 | Build release candidate bug triage board | 40 | DEPLOY-014 | Board created with severity labels and ownership for all open defects. |
| REL-002 | Fix highest-priority backend defects (batch 1) | 60 | REL-001 | Assigned critical backend defects closed and verified by targeted tests. |
| REL-003 | Fix highest-priority frontend defects (batch 1) | 60 | REL-001 | Assigned critical UI defects closed and verified in affected flows. |
| REL-004 | Run full regression suite and capture report | 55 | REL-002, REL-003 | Regression suite passes or failures are logged with owner/severity. |
| REL-005 | Perform performance verification against release targets | 55 | REL-004 | API p95 and dashboard load meet documented targets or create explicit waiver items. |
| REL-006 | Update product documentation for released behavior | 50 | REL-004 | Docs reflect implemented scope, known limits, and setup/run instructions. |
| REL-007 | Capture updated UI screenshots for major modules | 45 | REL-003 | Screenshot set exists for dashboard, learning, planner, habits, career, projects, interview, finance, analytics. |
| REL-008 | Refresh README with release-grade quickstart and module map | 45 | REL-006 | README includes clear install/run/test/deploy instructions for v1.0. |
| REL-009 | Prepare demo script and recording outline | 45 | REL-007 | Script covers narrative, flow order, and timing for release demo video. |
| REL-010 | Record and export demo video asset | 60 | REL-009 | Demo video recorded, exported, and linked from release notes. |
| REL-011 | Prepare portfolio project summary document | 45 | REL-007 | Summary includes problem, architecture, modules, impact, and tech highlights. |
| REL-012 | Prepare resume update bullets from shipped outcomes | 35 | PROJ-009, REL-011 | 4 to 6 quantified resume bullets drafted from release achievements. |
| REL-013 | Create v1.0 release notes with known issues | 45 | REL-004, REL-006 | Release notes include features, fixes, known issues, and migration notes. |
| REL-014 | Tag release candidate and perform final smoke deployment | 55 | REL-013 | Release tag created and post-tag smoke checks pass in production. |
| REL-015 | Publish ASCEND v1.0 and archive release checklist | 35 | REL-014 | Release marked published with completed checklist artifacts attached. |
