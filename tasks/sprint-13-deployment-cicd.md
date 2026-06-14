# Sprint 13 - Deployment and CI/CD Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Prepare public deployment with Docker, NGINX, AWS EC2, SSL, and monitored CI/CD.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 12 exit criteria passed.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| DEPLOY-001 | Finalize production Dockerfile for backend | 45 | SETUP-007 | Backend image builds reproducibly and starts with production profile. |
| DEPLOY-002 | Finalize production Dockerfile for frontend | 45 | SETUP-008 | Frontend build outputs static assets served by NGINX container image. |
| DEPLOY-003 | Create production docker-compose profile | 55 | DEPLOY-001, DEPLOY-002 | Compose profile wires frontend/backend/data services with prod-safe env references. |
| DEPLOY-004 | Add NGINX reverse proxy config for API and SPA routes | 55 | DEPLOY-002 | NGINX routes /api to backend and fallback to index for SPA navigation. |
| DEPLOY-005 | Add environment-specific config templates (dev/stage/prod) | 45 | DEPLOY-003 | Config templates exist with non-secret placeholders and consistent key names. |
| DEPLOY-006 | Create GitHub Actions build/test/publish pipeline | 55 | TEST-016 | Workflow builds, tests, and publishes container images on main release events. |
| DEPLOY-007 | Add deployment workflow step for EC2 remote update | 55 | DEPLOY-006 | Pipeline can securely trigger remote compose pull/up on target host. |
| DEPLOY-008 | Provision EC2 instance bootstrap script | 55 | DEPLOY-003 | Script installs Docker/Compose, creates app user, and prepares directories. |
| DEPLOY-009 | Add SSL certificate provisioning runbook | 45 | DEPLOY-004 | Runbook defines certificate issue/renewal steps and NGINX binding updates. |
| DEPLOY-010 | Add domain DNS configuration checklist | 35 | DEPLOY-008 | Checklist covers A/CNAME records, TTL, and verification steps. |
| DEPLOY-011 | Configure production health checks and restart policy | 45 | DEPLOY-003 | Containers define healthchecks and restart policies in compose config. |
| DEPLOY-012 | Configure monitoring endpoints exposure policy | 45 | PERF-011 | Monitoring endpoints restricted and reachable by approved network paths only. |
| DEPLOY-013 | Execute staging deployment dry run | 60 | DEPLOY-007, DEPLOY-011 | Staging stack starts successfully and smoke tests pass. |
| DEPLOY-014 | Execute production deployment checklist rehearsal | 50 | DEPLOY-013 | Rehearsal checklist completed with no unresolved critical blockers. |
| DEPLOY-015 | Document rollback strategy and emergency procedures | 45 | DEPLOY-013 | Rollback steps documented for app image, compose version, and DB migration issues. |
