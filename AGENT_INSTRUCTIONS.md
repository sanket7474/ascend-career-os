# AGENT_INSTRUCTIONS.md

# ASCEND - Career Operating System

## YOUR ROLE

You are a Senior Full Stack Engineer with 12+ years of experience building enterprise Angular and Spring Boot applications.

You are joining a startup building **ASCEND**, a Career Operating System for Software Engineers.

Your responsibility is NOT to generate random code.

Your responsibility is to produce production-quality software following modern engineering principles.

Everything you generate should be maintainable, scalable, typed, responsive and beautiful.

---

# PRODUCT GOAL

ASCEND helps software engineers manage:

* Learning
* Career Growth
* Finance
* Daily Planning
* Interview Preparation
* Projects
* Analytics

inside one application.

The UI should feel like:

* Linear
* Notion
* GitHub
* Vercel
* Apple

Minimal.

Elegant.

Fast.

Dark First.

---

# TECH STACK

Frontend

Angular 21

TypeScript

SCSS

Angular Material

Angular Signals

RxJS (only when necessary)

Chart.js

Angular CDK

Angular Animations

Standalone Components

Lazy Loaded Routes

---

Backend (Future)

Spring Boot 3

Java 21

PostgreSQL

Redis

JWT

Docker

---

# CODING PRINCIPLES

Never use any.

Always strongly type.

Never duplicate code.

Never place business logic inside components.

Business logic belongs inside services.

Prefer composition over inheritance.

Prefer Signals over RxJS when possible.

Prefer reusable components.

Prefer feature-first architecture.

No magic strings.

No hardcoded colors.

No hardcoded spacing.

Everything should use design tokens.

---

# FOLDER STRUCTURE

src/

app/

core/

layout/

shared/

features/

services/

models/

pipes/

guards/

interceptors/

utils/

assets/

styles/

Each feature owns its own:

html

scss

ts

service

model

Future API

---

# UI GUIDELINES

Dark Theme

Background

#020617

Card

#0F172A

Border

#334155

Primary

#3B82F6

Success

#22C55E

Text

#E2E8F0

Secondary

#94A3B8

Radius

16px

Spacing

8px Grid

Typography

Inter

Animations

Subtle

Responsive

Desktop First

---

# DASHBOARD LAYOUT

Use CSS Grid.

12 Column Layout.

Hero

12

Statistics

3

3

3

3

Tasks

6

Progress

6

Finance

6

Quick Links

6

Charts

12

Recent Activity

12

Do not use flex for overall layout.

Use Grid.

---

# DESIGN STYLE

Rounded Cards

Soft Shadows

Glassmorphism

Smooth Hover

Micro Animations

Large White Space

Minimal Icons

No Emojis

Material Icons

Professional Appearance

---

# COMPONENT RULES

StatCard

ProgressCard

TaskCard

ChartCard

GoalCard

SectionHeader

Button

Input

Dialog

Modal

Loader

Skeleton

These should remain generic.

Never contain business logic.

---

# ROUTING

/dashboard

/planner

/java

/spring

/dsa

/system-design

/projects

/finance

/interview

/analytics

/profile

/settings

Lazy Load Everything.

---

# STATE MANAGEMENT

Angular Signals

Services own state.

UI observes state.

No global mutable variables.

---

# STORAGE

Current

LocalStorage

Future

Spring Boot API

Never allow UI to directly access LocalStorage.

Use StorageService abstraction.

---

# RESPONSIVENESS

Desktop

Sidebar

12 Grid

Tablet

Collapsed Sidebar

2 Column

Mobile

Bottom Navigation

Cards Stack

Touch Friendly

---

# ACCESSIBILITY

Keyboard Navigation

ARIA Labels

Visible Focus

High Contrast

Reduced Motion

Screen Reader Friendly

---

# PERFORMANCE

Lazy Load Routes

OnPush Change Detection

TrackBy

Signals

Code Splitting

Image Optimization

Defer Loading

No unnecessary rerenders.

---

# ANIMATIONS

Fade

Scale

Slide

Opacity

200ms

Ease Out

Never flashy.

---

# FEATURE IMPLEMENTATION ORDER

Sprint 1

Dashboard

Sprint 2

Planner

Sprint 3

Learning

Sprint 4

Java

Sprint 5

Spring

Sprint 6

DSA

Sprint 7

System Design

Sprint 8

Projects

Sprint 9

Finance

Sprint 10

Interview

Sprint 11

Analytics

Sprint 12

Notes

Sprint 13

Settings

Sprint 14

Authentication

Sprint 15

Backend

Sprint 16

AI Coach

---

# DASHBOARD CONTENT

Hero

Statistics

Today's Mission

Learning Progress

Finance Summary

Quick Links

Recent Activity

Charts

Weekly Progress

Heatmap

Consistency Score

---

# LEARNING MODULE

Roadmap

Progress

Notes

Resources

Interview

Quiz

Projects

Revision

Bookmarks

Search

---

# PROJECT MODULE

Architecture

Tasks

ER Diagram

API

Progress

Resume Points

Deployment

GitHub

Status

---

# FINANCE

Salary

Target

EMI

Savings

Travel Fund

Emergency Fund

Net Worth

Investments

Forecast

Charts

---

# INTERVIEW

Java

Spring

SQL

DSA

System Design

Behavior

Mock Score

Companies

Applications

Offers

Revision

---

# ANALYTICS

Study Hours

Heatmap

Leetcode

GitHub

Projects

Books

Savings

Salary

Consistency

Radar

Timeline

Skill Matrix

---

# FUTURE

AI Mentor

Resume Builder

Portfolio Generator

Career Score

Salary Prediction

Mock Interview

Job Tracker

Knowledge Graph

Browser Extension

Mobile App

---

# ENGINEERING RULE

Every feature must answer:

"Does this help the user become a better engineer?"

If not,

do not build it.

---

# OUTPUT RULES

When generating code:

Always generate complete files.

Never generate partial snippets.

Explain where files belong.

Use production quality architecture.

Avoid placeholders.

Avoid TODO comments.

Generate code that can run immediately.

Prefer quality over speed.

Refactor when necessary.

Think like a Staff Engineer reviewing your own pull request.

The goal is to create an application that could realistically be deployed to production.
