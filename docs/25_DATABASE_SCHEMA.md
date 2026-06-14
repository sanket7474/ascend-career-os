# ASCEND

# 25_DATABASE_SCHEMA.md

Version: 1.0

---

# Purpose

This document defines the complete database schema architecture for ASCEND.

Unlike `20_DATABASE_DESIGNS.md`, which describes database design principles, this document specifies the actual schema that powers ASCEND itself.

This schema should support:

* Learning Progress
* Planner
* Finance
* Projects
* Interview Preparation
* Notes
* Analytics
* AI Coach
* User Preferences
* Career Tracking

The schema should be extensible enough to support future mobile and AI features.

---

# Database Choice

Primary Database

PostgreSQL

Future Cache

Redis

Future Search

Elasticsearch

Future Analytics

ClickHouse

Future Event Store

Kafka

---

# Schema Overview

```text id="c6r7j4"
User
 │
 ├── Planner
 │
 ├── Learning
 │
 ├── Finance
 │
 ├── Projects
 │
 ├── Interview
 │
 ├── Notes
 │
 ├── Analytics
 │
 └── AI Coach
```

---

# Common Audit Fields

Every table should contain:

id

created_at

updated_at

created_by

updated_by

version

deleted

Never omit audit columns.

---

# USER MODULE

## users

```sql id="w0f4ch"
id
uuid

name

email

password

avatar

bio

experience_years

current_company

current_ctc

target_ctc

city

country

created_at

updated_at
```

Indexes

email

current_company

---

# USER_SETTINGS

theme

language

notifications

timezone

sidebar_collapsed

default_dashboard

study_target

daily_goal

---

# LEARNING MODULE

## learning_category

id

name

icon

display_order

---

Examples

Java

Spring

DSA

System Design

SQL

Redis

Kafka

AWS

Docker

---

## learning_topic

id

category_id

title

slug

difficulty

estimated_hours

description

prerequisite

display_order

---

## learning_progress

id

user_id

topic_id

status

completion

quiz_score

revision_count

last_studied

notes

bookmarked

---

Status

NOT_STARTED

IN_PROGRESS

COMPLETED

MASTERED

---

## learning_revision

id

user_id

topic_id

revision_date

duration

score

remarks

---

# PLANNER MODULE

## task

id

user_id

title

description

priority

status

start_time

end_time

estimated_hours

actual_hours

created_at

---

Priority

LOW

MEDIUM

HIGH

CRITICAL

---

Status

TODO

DOING

DONE

SKIPPED

---

## habit

id

user_id

title

icon

target

frequency

streak

best_streak

created_at

---

## habit_log

id

habit_id

completed

date

---

## journal

id

user_id

title

content

mood

reflection

created_at

---

# FINANCE MODULE

## income

id

user_id

source

amount

date

remarks

---

## expense

id

user_id

category

amount

payment_mode

date

remarks

---

## investment

id

user_id

instrument

amount

value

returns

platform

created_at

---

## emi

id

user_id

bank

loan_type

principal

interest_rate

tenure

emi

remaining_balance

---

## savings_goal

id

user_id

goal

target_amount

current_amount

deadline

status

---

# PROJECT MODULE

## project

id

title

description

status

github

live_demo

difficulty

technology

completion

---

## project_task

id

project_id

title

status

estimated_hours

completed_at

---

## project_note

id

project_id

content

created_at

---

# INTERVIEW MODULE

## interview_company

id

name

package

location

role

difficulty

---

## interview_question

id

category

title

answer

difficulty

tags

---

## mock_interview

id

user_id

score

feedback

duration

completed_at

---

# NOTES MODULE

## notes

id

user_id

title

markdown

tags

favorite

created_at

updated_at

---

## bookmark

id

user_id

entity

entity_id

created_at

---

# ANALYTICS MODULE

## study_session

id

user_id

topic

duration

completed

date

---

## weekly_summary

id

user_id

week

study_hours

problems

projects

notes

completion

---

## monthly_summary

id

user_id

month

learning_score

finance_score

habit_score

career_score

overall_score

---

# AI MODULE

## ai_chat

id

user_id

question

answer

created_at

---

## ai_recommendation

id

user_id

title

description

priority

estimated_time

status

generated_at

---

## ai_skill_gap

id

user_id

skill

current_level

target_level

gap

recommendation

---

# ACHIEVEMENTS

id

user_id

title

description

badge

earned_at

---

Examples

100 Study Hours

30 Day Streak

Java Complete

DSA 100 Problems

Project Completed

Interview Ready

---

# STREAKS

id

user_id

current_streak

best_streak

last_activity

---

# FILE STORAGE

id

user_id

filename

content_type

size

storage_path

uploaded_at

---

Future

AWS S3

Cloudflare R2

MinIO

---

# NOTIFICATIONS

id

user_id

title

message

type

read

created_at

---

# SEARCH INDEX

id

entity_type

entity_id

title

keywords

content

---

Future

ElasticSearch

OpenSearch

---

# ENUMS

LearningStatus

NOT_STARTED

IN_PROGRESS

COMPLETED

MASTERED

---

Priority

LOW

MEDIUM

HIGH

CRITICAL

---

TaskStatus

TODO

DOING

DONE

SKIPPED

---

Theme

LIGHT

DARK

SYSTEM

---

# Relationships

```text id="9z13vd"
User
│
├── Learning Progress
├── Planner Tasks
├── Habits
├── Journal
├── Notes
├── Finance
├── Projects
├── Mock Interviews
├── Study Sessions
├── AI Recommendations
└── Achievements
```

---

# Migration Strategy

Flyway

Versioned Scripts

Rollback Scripts

Never modify old migrations.

Always create new versions.

---

# Performance Strategy

Indexes

Pagination

Batch Inserts

Connection Pooling

Read Replicas (Future)

Redis Cache

Partition Large Tables

---

# Security Strategy

Encrypted Passwords

BCrypt

Parameterized Queries

Least Privilege

Soft Delete

Audit Logs

Sensitive Field Encryption

---

# Future Expansion

Multi User Support

Team Dashboard

Leaderboard

Study Groups

Mentorship

AI Tutor

Job Tracker

Resume Builder

Portfolio Builder

Mobile Sync

Offline Mode

---

# Final Goal

The ASCEND database schema should serve as the single source of truth for every feature in the platform.

It should be scalable enough to support hundreds of thousands of users while remaining simple enough for a single engineer to maintain and extend.
