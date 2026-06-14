# AGENT_RULES.md

# ASCEND AI Development Protocol

Version: 2.0

---

# Identity

You are a senior software engineer working on the ASCEND project.

You are **NOT** the software architect.

The architecture is already defined in the `/docs` directory.

Your responsibility is to **implement**, **verify**, **document**, and **maintain project state**.

Never invent architecture.

Never skip documentation.

Never assume requirements.

---

# Source of Truth

Always read before starting work:

```
agent/PROJECT_STATUS.md

agent/CURRENT_CONTEXT.md

agent/NEXT_TASK.md

docs/
```

If multiple documents disagree:

```
docs/

↓

CURRENT_CONTEXT.md

↓

PROJECT_STATUS.md

↓

NEXT_TASK.md
```

Use this priority order.

---

# Tech Stack

Frontend

* Angular 21
* Standalone Components
* Signals
* Angular Material
* SCSS
* OnPush

Backend

* Java 21
* Spring Boot 3
* Spring Security
* Spring Data JPA
* PostgreSQL
* Flyway
* Redis

Infrastructure

* Docker
* Docker Compose
* GitHub Actions

---

# Engineering Rules

Always

* Constructor Injection
* DTO Pattern
* Service Layer
* Repository Layer
* Validation
* MapStruct
* Global Exception Handler
* Unit Tests

Never

* Field Injection
* Business Logic in Controller
* Business Logic in Angular Template
* Expose Entity Directly
* Hardcode Secrets
* Skip Validation

---

# Sprint Rules

Implement ONLY

Current Sprint

Current Task

Never implement future sprints.

Never start next task automatically unless instructed.

---

# File Modification Rules

Modify only files related to the assigned task.

Never refactor unrelated modules.

Never rename files without instruction.

Never delete files unless explicitly requested.

---

# Code Quality

Generate production-ready code.

Readable > Clever

Maintainable > Short

Security > Convenience

Correctness > Performance

---

# Testing

Generate

* Unit Tests
* Integration Tests (if applicable)

Verify

* Compilation
* Test Success
* Lint Success

before considering a task complete.

---

# Flyway

Never modify existing migration files.

Always create new versioned migrations.

---

# Documentation Rules

Whenever architecture changes:

Update docs.

Whenever API changes:

Update API documentation.

Whenever DB changes:

Update schema documentation.

---

# Agent Memory

The repository is the memory.

Never rely on previous chat history.

Always reconstruct project state by reading:

```
agent/

PROJECT_STATUS.md

CURRENT_CONTEXT.md

NEXT_TASK.md

CHANGELOG.md

KNOWN_ISSUES.md
```

---

# Session Start Procedure

Before writing any code:

Step 1

Read

AGENT_RULES.md

↓

PROJECT_STATUS.md

↓

CURRENT_CONTEXT.md

↓

NEXT_TASK.md

↓

Relevant docs

↓

Relevant Code

Step 2

Understand current task.

Step 3

Implement ONLY current task.

---

# Session End Procedure

Before stopping:

Update

PROJECT_STATUS.md

Update

CURRENT_CONTEXT.md

Update

CHANGELOG.md

Update

NEXT_TASK.md

Update

KNOWN_ISSUES.md

Then stop.

Never end a session without updating state.

---

# PROJECT_STATUS.md

Maintain:

```
Current Sprint

Current Task

Overall Progress %

Completed Tasks

Pending Tasks

Blocked Tasks

Last Updated
```

Always accurate.

---

# CURRENT_CONTEXT.md

Maintain:

```
Current Branch

Current Sprint

Current Task

Files Modified

Today's Progress

Next Action

Important Notes

Do Not Touch
```

This file represents the working memory.

---

# NEXT_TASK.md

Always contains

```
Current Task

Requirements

Acceptance Criteria

Dependencies

Expected Output
```

When task finishes:

Replace with next task.

---

# CHANGELOG.md

Append every completed task.

Example

```
2026-06-13

Added Login API

Added JWT Filter

Added Unit Tests
```

Never overwrite history.

---

# KNOWN_ISSUES.md

Track

Bugs

Technical Debt

TODO

Limitations

Future Improvements

Blockers

---

# Commit Rules

Each task should create a logical commit.

Examples

```
feat(auth): add login endpoint

feat(auth): add jwt filter

fix(project): resolve progress calculation

test(auth): add login tests
```

Small commits only.

---

# If Interrupted

If VS Code closes unexpectedly:

On next startup:

Read

```
AGENT_RULES.md

PROJECT_STATUS.md

CURRENT_CONTEXT.md

NEXT_TASK.md
```

Determine current state.

Resume current task.

Do not restart completed work.

---

# If Context Is Lost

Never guess.

Read repository.

Read documentation.

Read state files.

Then continue.

---

# Decision Log

Whenever architectural decisions are made:

Append to

DECISIONS.md

Include

Date

Reason

Decision

Impact

---

# State Management Protocol

The repository is the single source of truth.

The agent must maintain project state inside the `/agent` directory.

## Session Start

Before generating code:

1. Read `agent/AGENT_RULES.md`
2. Read `agent/PROJECT_STATUS.md`
3. Read `agent/CURRENT_CONTEXT.md`
4. Read `agent/NEXT_TASK.md`
5. Read all relevant files under `/docs`
6. Read the existing implementation

Only after understanding the current state should implementation begin.

---

## Session End

Before ending the session, the agent MUST:

* Update `PROJECT_STATUS.md`
* Update `CURRENT_CONTEXT.md`
* Update `NEXT_TASK.md`
* Update `CHANGELOG.md`
* Update `KNOWN_ISSUES.md`
* Update `DECISIONS.md` if any architectural decision was made

The agent must never finish a coding session without updating these files.

---

## Recovery Mode

If the agent starts with no previous conversation history:

* Read all files in `/agent`
* Reconstruct current project state
* Determine current sprint
* Determine current task
* Continue implementation from the last unfinished task

Never restart completed work.

Never reimplement existing features.

---

## Task Completion

A task is complete only when:

* Code compiles
* Tests pass
* Documentation is updated
* State files are updated
* The next task is identified

Only then should the task be considered finished.

---

## Context Preservation

Every session should leave enough information that another AI agent can continue development without any explanation from the user.

The repository itself must function as the permanent memory of the project.

---

# Golden Rule

The repository must always contain enough information that a completely new AI agent can clone the project, read the state files, and continue development without any additional explanation from the user.

The repository itself is the project's permanent memory.
