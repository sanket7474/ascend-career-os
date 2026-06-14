# Sprint 11 - Performance and Security Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Deliver Redis caching, rate limiting, headers, monitoring, health checks, logging.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 10 exit criteria passed.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| PERF-001 | Add Redis client configuration and connection properties | 45 | SETUP-005 | Redis connection initializes across local profile with sensible timeout settings. |
| PERF-002 | Implement cache key strategy constants | 35 | PERF-001 | Centralized cache key patterns created for dashboard/analytics/reference data. |
| PERF-003 | Apply caching to dashboard summary endpoint | 45 | PERF-001, DASH-003 | Endpoint returns cached responses and invalidates on relevant source updates. |
| PERF-004 | Apply caching to analytics endpoints | 50 | PERF-001, ANLT-011 | Analytics endpoints use TTL-based caching and bypass on cache miss correctly. |
| PERF-005 | Configure rate limiting filter for auth-sensitive endpoints | 55 | AUTH-012 | Excess requests to auth routes return 429 with retry metadata. |
| PERF-006 | Add security headers policy (CSP/HSTS/XFO/etc.) | 50 | AUTH-011 | Response headers include configured security policy values. |
| PERF-007 | Harden CORS policy for allowed origins and methods | 40 | AUTH-011 | CORS blocks unapproved origins and permits configured frontend origins. |
| PERF-008 | Enable Spring Boot Actuator health/info endpoints | 35 | SETUP-005 | /actuator/health and /actuator/info respond with expected status and limited details. |
| PERF-009 | Add custom health indicator for DB and Redis dependencies | 50 | PERF-001, PERF-008 | Health endpoint reflects DOWN state when DB or Redis unreachable. |
| PERF-010 | Add Prometheus metrics endpoint and scrape config | 50 | PERF-008 | Metrics endpoint exposed and scrape config documented for local monitoring. |
| PERF-011 | Create baseline Grafana dashboard JSON panels | 55 | PERF-010 | Dashboard includes request latency, error rate, JVM, DB, cache hit rate panels. |
| PERF-012 | Introduce structured logging format with correlation ID | 50 | PERF-008 | Logs include timestamp, level, trace/correlation id, route, and user context fields. |
| PERF-013 | Add request timing interceptor for API latency tracking | 45 | PERF-012 | Each request logs duration and status for observability. |
| PERF-014 | Add load smoke test for key endpoints | 55 | PERF-003, PERF-004, PERF-005 | Smoke test captures p95 latency and verifies rate-limit behavior. |
| PERF-015 | Add security regression tests for headers and auth throttling | 55 | PERF-006, PERF-005 | Tests assert required headers and 429 behavior on threshold breach. |
