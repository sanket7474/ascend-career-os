# ASCEND

# 56_DATABASE_ERD.md

Version: 1.0

---

# Purpose

This document defines the complete database schema and entity relationships for the ASCEND platform.

The database is designed using a modular architecture where each engine (Learning, Career, Finance, Habit, Projects, etc.) owns its own entities while sharing the User entity as the root aggregate.

---

# Database Overview

```text
User

├── Learning
├── Career
├── Habit
├── Project
├── Finance
├── Interview
├── Planner
├── Analytics
├── Notes
└── Settings
```

---

# Core Tables

## users

Stores user information.

Fields

* id
* full_name
* email
* password_hash
* avatar_url
* timezone
* created_at
* updated_at

Primary Key

id

Unique

email

---

## learning_module

Stores curriculum modules.

Fields

* id
* title
* category
* difficulty
* estimated_hours

Relationship

User → Many Learning Modules Progress

---

## learning_progress

Tracks user learning.

Fields

* id
* user_id
* module_id
* progress
* mastery_level
* completed_at

FK

user_id → users.id

module_id → learning_module.id

---

## study_session

Stores study history.

Fields

* id
* user_id
* topic
* duration
* created_at

---

## revision_queue

Stores spaced repetition tasks.

Fields

* id
* user_id
* topic_id
* next_revision
* interval_days

---

# Career Engine

career_score

career_skill

career_history

career_milestone

salary_prediction

promotion_readiness

---

career_skill

Fields

* id
* user_id
* skill_name
* score

---

# Habit Engine

habit

habit_log

habit_template

habit_summary

---

habit

Fields

* id
* user_id
* title
* frequency
* streak
* status

---

habit_log

Fields

* id
* habit_id
* completed_date

---

# Project Tracker

project

project_task

project_sprint

project_document

project_note

---

project

Fields

* id
* user_id
* title
* description
* status
* completion

---

project_task

Fields

* id
* project_id
* title
* status
* priority

---

# Interview Tracker

interview_question

question_attempt

mock_interview

application_tracker

company_profile

---

# Finance Engine

income

expense

investment

goal

loan

asset

liability

net_worth

---

expense

Fields

* id
* user_id
* category
* amount
* date

---

investment

Fields

* id
* user_id
* type
* amount
* current_value

---

# Planner

planner_task

planner_goal

planner_schedule

planner_reminder

---

planner_task

Fields

* id
* user_id
* title
* due_date
* status

---

# Notes

note

bookmark

tag

note_tag

---

# Analytics

analytics_daily

analytics_weekly

analytics_monthly

analytics_yearly

---

# Achievements

achievement

user_achievement

badge

milestone

---

# Settings

user_setting

notification_setting

theme_setting

preference

---

# Relationships

```text
User

│

├── Learning Progress

├── Study Sessions

├── Revision Queue

├── Career Score

├── Career Skill

├── Habit

├── Habit Log

├── Project

│      └── Tasks

├── Planner Task

├── Finance

├── Investment

├── Expense

├── Interview Attempt

├── Analytics

├── Notes

└── Settings
```

---

# Audit Columns

Every table should contain

created_at

updated_at

created_by

updated_by

version

deleted

---

# Soft Delete

Use

deleted BOOLEAN

instead of physical deletion where appropriate.

---

# Foreign Key Strategy

Every FK must have

Index

Constraint

Cascade Rule

---

# Index Strategy

Index

user_id

created_at

status

category

updated_at

next_revision

project_id

habit_id

---

# Estimated Tables

Core

12

Learning

8

Career

6

Finance

8

Projects

6

Interview

6

Analytics

4

Planner

4

Settings

4

Achievements

4

Total

≈ 60 Tables

---

# Future Tables

event_log

notification

job_queue

api_key

audit_log

plugin

theme

integration

---

# Final Goal

The ASCEND database should be highly normalized, modular, scalable, and optimized for long-term maintainability while supporting millions of records with predictable performance.
