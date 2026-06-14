# ASCEND

# 01_ARCHITECTURE.md

Version: 1.0

---

# High Level Architecture

ASCEND is designed as a modular application.

Every feature should be independently maintainable.

The architecture must support:

* Easy feature additions
* Independent modules
* Future backend integration
* Offline support
* Responsive UI
* AI integration
* Multi-device sync

---

# Technology Stack

## Frontend

Angular 21

TypeScript

SCSS

Angular Material

Angular Signals

RxJS

Chart.js

Angular CDK

Angular Animations

---

## Backend (Future)

Spring Boot 3

Java 21

PostgreSQL

Redis

JWT

Docker

Spring Security

Spring Data JPA

---

## DevOps

GitHub

GitHub Actions

Docker

AWS EC2

Nginx

SSL

---

# Frontend Architecture

The frontend follows Feature-Based Architecture.

Instead of grouping by type, everything is grouped by business feature.

Example:

Dashboard owns its own:

* html
* ts
* scss
* models
* service

This improves scalability.

---

# Folder Structure

src/

app/

core/

layout/

shared/

features/

services/

models/

assets/

styles/

---

# Core Module

Contains application-wide functionality.

core/

services/

interceptors/

guards/

config/

constants/

theme/

storage/

logger/

The core module should never contain feature-specific logic.

---

# Shared Module

Reusable UI components.

Examples:

Stat Card

Progress Card

Chart Card

Button

Dialog

Loader

Skeleton

Empty State

Avatar

Tag

Badge

Search

Modal

Tabs

These should be generic.

Never business specific.

---

# Layout Module

Contains application layout.

Sidebar

Navbar

Footer

Shell

Page Container

Theme Toggle

Breadcrumb

Notifications

---

# Feature Modules

Every feature owns itself.

Example:

dashboard/

dashboard.html

dashboard.ts

dashboard.scss

dashboard.service.ts

dashboard.model.ts

No feature should directly depend on another feature.

Communication should happen through services.

---

# Main Features

Dashboard

Planner

Learn

Java

Spring Boot

DSA

System Design

Projects

Finance

Interview

Analytics

Settings

Profile

Notes

AI Coach

---

# Routing

/

Dashboard

/planner

Planner

/java

Java

/spring

Spring

/dsa

DSA

/system-design

System Design

/projects

Projects

/finance

Finance

/interview

Interview

/analytics

Analytics

/settings

Settings

---

# Dashboard Layout

The dashboard uses CSS Grid.

12-column system.

Row 1

Hero

12 columns

Row 2

Stats

3

3

3

3

Row 3

Tasks

6

Progress

6

Row 4

Finance

6

Quick Links

6

Row 5

Charts

12

Everything should collapse responsively.

---

# State Management

Angular Signals

should be preferred.

Avoid unnecessary RxJS complexity.

Example:

Tasks

Study Hours

Theme

Progress

Current User

Dashboard Metrics

should all be Signal based.

---

# Local Storage

Initial version uses browser storage.

Keys:

ascend-theme

ascend-tasks

ascend-progress

ascend-finance

ascend-notes

ascend-settings

ascend-profile

Later these migrate to backend APIs.

---

# Service Layer

Each feature owns a service.

dashboard.service

planner.service

java.service

finance.service

analytics.service

settings.service

No business logic inside components.

Components remain thin.

Services remain fat.

---

# Models

Example:

Task

Progress

Finance

Goal

LearningNode

Project

Interview

Habit

Analytics

StudySession

Every model must be strongly typed.

Avoid using "any".

---

# UI Principles

Minimal

Clean

Fast

Responsive

Accessible

Dark First

Keyboard Friendly

Animations should be subtle.

Never distract.

---

# Theme

Background

#020617

Surface

#0F172A

Card

#111827

Border

#334155

Primary

#3B82F6

Success

#22C55E

Warning

#F59E0B

Danger

#EF4444

Text

#E2E8F0

Secondary Text

#94A3B8

Radius

16px

---

# Typography

Primary Font

Inter

Fallback

Segoe UI

Weight

400

500

600

700

Spacing

Generous

Readable

Modern

---

# Component Philosophy

Components should be:

Reusable

Small

Stateless whenever possible

Configurable

Composable

Example:

StatCard

Accepts

title

value

icon

color

trend

No business logic.

---

# Data Flow

User

↓

Component

↓

Signal

↓

Service

↓

Local Storage

↓

Backend API (future)

One direction.

Predictable.

---

# Error Handling

Graceful

No crashes

Friendly UI

Retry Support

Logging

Fallback State

---

# Performance Goals

Initial Load

Under 2 seconds

Navigation

Instant

Animations

60 FPS

No blocking UI

Lazy load feature routes

Use defer blocks where appropriate.

---

# Security

Sanitize user input.

Avoid innerHTML.

Future JWT support.

Role based access later.

No secrets in frontend.

---

# Testing Strategy

Unit Tests

Component Tests

Service Tests

Integration Tests

Future E2E

Playwright

Coverage Target

80%+

---

# Git Strategy

main

Stable

develop

Integration

feature/dashboard

feature/java

feature/planner

feature/finance

Commit Messages

feat:

fix:

refactor:

docs:

style:

test:

Example:

feat(dashboard): add statistics cards

---

# Sprint Strategy

Sprint 1

Dashboard

Sprint 2

Planner

Sprint 3

Java

Sprint 4

Spring Boot

Sprint 5

DSA

Sprint 6

System Design

Sprint 7

Projects

Sprint 8

Finance

Sprint 9

Interview

Sprint 10

Analytics

Sprint 11

AI Coach

Sprint 12

Backend Integration

---

# Long-Term Evolution

Current

Angular SPA

↓

Spring Boot APIs

↓

Authentication

↓

Cloud Sync

↓

AI Mentor

↓

Resume Builder

↓

Portfolio Generator

↓

Community Features

↓

Mobile App

---

# Engineering Rule

Every feature added to ASCEND must answer one question:

"Will this help the user become a better engineer?"

If the answer is no,

the feature should not exist.
