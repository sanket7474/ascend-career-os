# ASCEND Agent Rules

Version: 1.0
Last Updated: 2026-06-14

## Source Of Truth Priority
1. /docs
2. agent/CURRENT_CONTEXT.md
3. agent/PROJECT_STATUS.md
4. agent/NEXT_TASK.md

## Operating Principles
- Follow architecture defined in /docs.
- Do not invent architecture or future features.
- Implement only the current sprint and current task.
- Keep changes task-scoped; avoid unrelated edits.
- Update state files at the end of each working session.

## Required Session Start Reads
- agent/AGENT_RULES.md
- agent/PROJECT_STATUS.md
- agent/CURRENT_CONTEXT.md
- agent/NEXT_TASK.md
- Relevant files in /docs

## Required Session End Updates
- agent/PROJECT_STATUS.md
- agent/CURRENT_CONTEXT.md
- agent/CHANGELOG.md
- agent/NEXT_TASK.md
- agent/KNOWN_ISSUES.md
- agent/SESSION_SUMMARY.md

## Current Guardrails
- No business feature implementation during repository initialization.
- No auth/API/database feature implementation during repository initialization.
- Repository setup and AI state management only.
