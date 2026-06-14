# Sprint 3 - Learning Engine Backlog

Source: docs/10_SPRINT_PLANNING.md
Sprint Goal: Deliver learning module with curriculum, topic, progress, quiz, revision, notes, bookmarks.
Rule: Every task is scoped to <= 60 minutes.
Prerequisite: Sprint 2 exit criteria passed.

| ID | Atomic Task | Est (min) | Depends On | Acceptance Criteria |
|---|---|---:|---|---|
| LEARN-001 | Create DB migration for learning_module table | 50 | SETUP-010 | Table created with audit columns and key indexes. |
| LEARN-002 | Create DB migration for learning_topic table | 50 | LEARN-001 | Table references module and includes ordering metadata/indexes. |
| LEARN-003 | Create DB migration for learning_progress table | 50 | LEARN-002 | Progress table stores user/topic status and uniqueness constraints. |
| LEARN-004 | Create DB migration for quiz and quiz_attempt tables | 55 | LEARN-002 | Quiz entities created with FK relations and attempt tracking. |
| LEARN-005 | Create DB migration for revision/bookmark/note tables | 55 | LEARN-003 | Revision, bookmark, note tables exist with required FKs and constraints. |
| LEARN-006 | Implement entity and repository classes for learning core tables | 55 | LEARN-005 | Repositories compile and basic query methods exist for module/topic/progress. |
| LEARN-007 | Implement GET /learning service + controller | 50 | LEARN-006 | Endpoint returns curriculum hierarchy for authenticated user. |
| LEARN-008 | Implement GET /topic endpoint | 45 | LEARN-006 | Endpoint returns topic detail with bookmark/note/progress metadata. |
| LEARN-009 | Implement POST /progress endpoint | 50 | LEARN-006 | Endpoint upserts progress state and returns updated status snapshot. |
| LEARN-010 | Implement POST /quiz endpoint | 55 | LEARN-006 | Endpoint records attempt and returns score breakdown. |
| LEARN-011 | Implement POST /revision endpoint | 45 | LEARN-006 | Endpoint adds/updates revision queue entry with next due date logic. |
| LEARN-012 | Build Learning Dashboard UI route and shell | 50 | DASH-005 | Learning page route renders module list and summary widgets. |
| LEARN-013 | Build Topic screen UI with notes/bookmarks/progress panes | 55 | LEARN-012, LEARN-008 | Topic view displays details and supports bookmark/note actions. |
| LEARN-014 | Build Quiz UI and submission flow | 55 | LEARN-010, LEARN-013 | User can start quiz, answer questions, submit, and view score result. |
| LEARN-015 | Integrate revision queue and progress visuals | 50 | LEARN-011, LEARN-013 | Due revisions and topic progress indicators render correctly. |
| LEARN-016 | Add integration tests for learning endpoints | 55 | LEARN-011 | Tests cover learning/topic/progress/quiz/revision happy and validation paths. |
