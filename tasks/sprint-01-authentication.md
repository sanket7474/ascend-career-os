# Sprint 1 - Authentication Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Deliver register/login/refresh/profile with role-aware protection.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 0 exit criteria passed.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| AUTH-001 | Create auth domain packages and DTO classes | 40 | SETUP-002 | DTOs compile and map request/response contracts for register/login/refresh. |
| AUTH-002 | Add validation annotations to auth request DTOs | 30 | AUTH-001 | Invalid payloads produce constraint violations for email/password/name fields. |
| AUTH-003 | Implement password encoder configuration | 25 | SETUP-005 | BCrypt bean available and injected in auth service. |
| AUTH-004 | Implement JWT provider token generation methods | 55 | AUTH-001 | Access and refresh token generation methods return signed tokens with expiry metadata. |
| AUTH-005 | Implement JWT validation and claims extraction | 50 | AUTH-004 | Invalid/expired tokens are rejected and claims parser returns subject/roles on valid token. |
| AUTH-006 | Implement registration service method | 55 | AUTH-002, AUTH-003 | New user persists with encoded password and duplicate email is rejected. |
| AUTH-007 | Implement login service method | 55 | AUTH-003, AUTH-004, AUTH-005 | Valid credentials return access+refresh tokens and user summary payload. |
| AUTH-008 | Implement refresh token persistence model/repository | 45 | AUTH-001 | Refresh token entity/repository compile and support create/find/revoke operations. |
| AUTH-009 | Implement refresh token endpoint service logic | 50 | AUTH-005, AUTH-008 | Valid refresh token rotates tokens and invalid token returns unauthorized response. |
| AUTH-010 | Add JWT filter into security chain | 45 | AUTH-005 | Protected endpoint resolves authenticated principal from bearer token. |
| AUTH-011 | Configure protected routes and role mapping rules | 45 | AUTH-010 | /profile requires auth; role restrictions evaluate correctly. |
| AUTH-012 | Implement auth controller endpoints | 50 | AUTH-006, AUTH-007, AUTH-009 | POST /auth/register, /auth/login, /auth/refresh respond with documented contracts. |
| AUTH-013 | Implement profile GET endpoint | 35 | AUTH-011 | GET /profile returns authenticated user profile data only. |
| AUTH-014 | Add global exception mapping for auth failures | 35 | AUTH-012, AUTH-013 | Validation/auth exceptions map to consistent error response shape. |
| AUTH-015 | Build frontend auth service methods (register/login/refresh/logout) | 55 | SETUP-004, AUTH-012 | Service methods call backend contracts and handle token storage lifecycle. |
| AUTH-016 | Build login UI with form validation and submit states | 55 | AUTH-015 | Login form validates and submits; error and loading states render correctly. |
| AUTH-017 | Build register UI with confirm password validation | 55 | AUTH-015 | Register form blocks invalid input and submits valid payloads successfully. |
| AUTH-018 | Build forgot password UI stub screen | 30 | AUTH-016 | Route exists with non-functional placeholder UI per sprint scope. |
| AUTH-019 | Implement route guard and auth interceptor | 55 | AUTH-015 | Protected routes redirect unauthenticated users; bearer token attached to outbound API calls. |
| AUTH-020 | Add auth smoke tests (backend + frontend happy paths) | 55 | AUTH-014, AUTH-019 | Register/login/refresh/profile core flow passes in automated smoke test set. |
