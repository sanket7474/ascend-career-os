# ASCEND

# 10_SPRINT_PLANNING.md

Version: 2.0

---

# Purpose

This document defines the complete execution roadmap for building ASCEND.

Unlike a traditional sprint plan, this document serves as the master implementation guide for the project, breaking the platform into logical milestones that can be executed by a solo developer.

Each sprint produces a deployable increment while reducing technical risk and maintaining a working application throughout development.

---

# Project Timeline

```text
Sprint 0  → Project Setup

Sprint 1  → Authentication

Sprint 2  → Dashboard & Layout

Sprint 3  → Learning Engine

Sprint 4  → Planner Engine

Sprint 5  → Habit Engine

Sprint 6  → Career Engine

Sprint 7  → Project Tracker

Sprint 8  → Interview Tracker

Sprint 9  → Finance Engine

Sprint 10 → Analytics Engine

Sprint 11 → Performance & Security

Sprint 12 → Testing & Bug Fixes

Sprint 13 → Deployment & CI/CD

Sprint 14 → Release v1.0
```

---

# Sprint Duration

Recommended

2 Weeks

Total

14 Sprints

Estimated Duration

28 Weeks

(~7 Months)

---

# Sprint 0

## Goal

Create development foundation.

### Deliverables

* Angular Project
* Spring Boot Project
* PostgreSQL
* Docker Compose
* Flyway
* JWT Skeleton
* GitHub Repository
* CI Pipeline Skeleton
* Folder Structure

### Database

users

roles

permissions

---

### Exit Criteria

* Project runs locally
* Docker works
* CI passes

---

# Sprint 1

## Authentication

### Backend

Register

Login

Refresh Token

JWT Filter

Role Management

Validation

Global Exception

---

### Frontend

Login

Register

Forgot Password UI

Profile

Protected Routes

Guards

---

### Database

users

roles

user_roles

refresh_token

---

### APIs

POST /auth/register

POST /auth/login

POST /auth/refresh

GET /profile

---

### Exit Criteria

User can authenticate successfully.

---

# Sprint 2

## Dashboard

### Backend

Dashboard API

Statistics

Summary

Quick Actions

Recent Activity

---

### Frontend

Sidebar

Navbar

Dashboard

Cards

Charts

Widgets

Dark Theme

---

### Components

DashboardCard

Heatmap

RadarChart

ProgressCard

SummaryCard

---

### Exit Criteria

Dashboard fully functional.

---

# Sprint 3

## Learning Engine

### Features

Curriculum

Modules

Topics

Bookmarks

Notes

Progress

Quiz

Revision Queue

Study Sessions

Mastery

---

### Database

learning_module

learning_topic

learning_progress

quiz

quiz_attempt

revision

bookmark

note

---

### APIs

GET /learning

GET /topic

POST /progress

POST /quiz

POST /revision

---

### UI

Learning Dashboard

Topic Screen

Quiz

Notes

Bookmarks

Progress

---

### Exit Criteria

Learning module complete.

---

# Sprint 4

## Planner

### Features

Calendar

Daily Plan

Weekly Plan

Goals

Pomodoro

Tasks

Reminders

---

### Database

planner_task

planner_goal

planner_schedule

planner_reminder

---

### APIs

/tasks

/goals

/calendar

/planner

---

### UI

Calendar

Daily Planner

Weekly Planner

Goal Board

---

### Exit Criteria

Planner operational.

---

# Sprint 5

## Habit Engine

### Features

Habits

Streaks

Heatmap

Templates

Consistency

Achievements

---

### Database

habit

habit_log

habit_summary

---

### APIs

/habit

/habit/log

/habit/template

---

### UI

Habit Dashboard

Heatmap

Streak

Today's Habits

---

### Exit Criteria

Habit tracking complete.

---

# Sprint 6

## Career Engine

### Features

Career Score

Skill Matrix

Promotion Readiness

Salary Estimate

Milestones

Recommendations

---

### Database

career_score

career_skill

career_history

milestone

---

### UI

Career Dashboard

Skill Radar

Career Timeline

---

### Exit Criteria

Career Engine functional.

---

# Sprint 7

## Project Tracker

### Features

Projects

Tasks

Architecture

Deployment

Resume Points

Portfolio

---

### Database

project

project_task

project_document

project_note

---

### UI

Project List

Project Detail

Sprint Board

Deployment

---

### Exit Criteria

Projects manageable.

---

# Sprint 8

## Interview Tracker

### Features

Question Bank

Mock Interviews

Revision

Applications

Company Readiness

Behavioral

---

### Database

interview_question

mock_interview

application_tracker

---

### UI

Interview Dashboard

Mock Screen

Applications

---

### Exit Criteria

Interview module complete.

---

# Sprint 9

## Finance Engine

### Features

Income

Expense

Savings

Investment

Net Worth

Goals

EMI

Travel Fund

---

### Database

income

expense

investment

goal

loan

asset

liability

---

### UI

Finance Dashboard

Net Worth

Transactions

Goals

Charts

---

### Exit Criteria

Finance module operational.

---

# Sprint 10

## Analytics Engine

### Features

Heatmaps

Radar Charts

Timeline

Reports

Growth

Insights

---

### Database

analytics_daily

analytics_weekly

analytics_monthly

analytics_yearly

---

### UI

Analytics Dashboard

Heatmap

Charts

Timeline

---

### Exit Criteria

Analytics complete.

---

# Sprint 11

## Performance & Security

### Features

Redis

Caching

Rate Limiting

Security Headers

Monitoring

Health Checks

Logging

---

### Deliverables

Redis Integration

Prometheus

Grafana

Actuator

---

### Exit Criteria

Performance optimized.

---

# Sprint 12

## Testing

### Tasks

Unit Tests

Integration Tests

Repository Tests

Security Tests

Manual Tests

Responsive Tests

Accessibility Tests

---

### Coverage Target

Backend

90%

Frontend

80%

---

### Exit Criteria

Quality gates passed.

---

# Sprint 13

## Deployment

### Tasks

Docker

Docker Compose

NGINX

AWS EC2

GitHub Actions

Monitoring

SSL

Domain

---

### Deliverables

Production Environment

CI/CD

Monitoring

---

### Exit Criteria

Application deployed publicly.

---

# Sprint 14

## Release

### Tasks

Bug Fixes

Performance

Documentation

Screenshots

README

Demo Video

Portfolio

Resume Update

---

### Deliverables

ASCEND v1.0

---

### Exit Criteria

Stable production release.

---

# Sprint Dependency Graph

```text
Setup

↓

Authentication

↓

Dashboard

↓

Learning

↓

Planner

↓

Habit

↓

Career

↓

Projects

↓

Interview

↓

Finance

↓

Analytics

↓

Performance

↓

Testing

↓

Deployment

↓

Release
```

---

# Story Point Scale

1

Tiny

---

2

Small

---

3

Medium

---

5

Large

---

8

Complex

---

13

Epic (Split Required)

---

# Definition of Done

* Code Complete
* Unit Tests Pass
* Integration Tests Pass
* Documentation Updated
* API Tested
* Responsive
* Dark Theme Supported
* Accessibility Verified
* Build Successful
* Docker Verified

---

# Release Milestones

v0.1

Authentication

Dashboard

---

v0.2

Learning

Planner

Habits

---

v0.3

Career

Projects

Interview

---

v0.4

Finance

Analytics

---

v1.0

Production Ready

---

# Risk Register

High

Scope Creep

Mitigation

Strict Sprint Scope

---

High

Performance

Mitigation

Redis

Indexes

Caching

---

Medium

UI Complexity

Mitigation

Reuse Components

---

Medium

Technical Debt

Mitigation

Continuous Refactoring

---

# Success Metrics

* All 14 sprints completed
* 90% backend test coverage
* 80% frontend test coverage
* Lighthouse Score > 95
* API Response < 200ms
* Dashboard Load < 1 second
* Docker Deployment Successful
* AWS Deployment Successful

---

# Final Goal

The Sprint Planning document should act as the day-to-day execution blueprint for ASCEND, transforming a large vision into small, achievable milestones.

Each sprint should produce a deployable increment that moves the platform closer to becoming a production-grade Career Operating System for software engineers.
