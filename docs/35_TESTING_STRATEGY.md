# ASCEND

# 35_LEARNING_ENGINE_ARCHITECTURE.md

Version: 1.0

---

# Purpose

The Learning Engine is the core execution system of ASCEND.

Its responsibility is not to store courses.

Its responsibility is to transform a large learning goal into daily actionable tasks and continuously track mastery.

The Learning Engine powers:

* Learning Roadmaps
* Progress Tracking
* Revisions
* Quizzes
* Notes
* Bookmarks
* Projects
* Career Score
* Daily Planner

Every learning action should contribute toward measurable growth.

---

# Vision

Goal

↓

Roadmap

↓

Module

↓

Topic

↓

Study Session

↓

Revision

↓

Quiz

↓

Mastery

↓

Career Growth

---

# Learning Philosophy

ASCEND follows:

Learn

↓

Build

↓

Revise

↓

Practice

↓

Teach

↓

Master

Completion does not imply mastery.

Only consistent revision and application result in mastery.

---

# Learning Architecture

```text
Curriculum

↓

Module

↓

Topic

↓

Subtopic

↓

Study Session

↓

Quiz

↓

Revision

↓

Project

↓

Mastery
```

---

# Curriculum Structure

Java

Spring Boot

SQL

DSA

System Design

Redis

Kafka

Docker

AWS

Linux

Git

Security

Testing

Microservices

CI/CD

---

# Module Structure

Each curriculum contains:

Introduction

Theory

Examples

Practice

Mini Project

Interview Questions

Quiz

Revision

Resources

Completion Criteria

---

# Topic Structure

Each topic contains:

Title

Description

Difficulty

Estimated Hours

Prerequisites

Resources

Examples

Quiz

Notes

Status

---

# Topic Status

NOT_STARTED

IN_PROGRESS

REVISION_DUE

COMPLETED

MASTERED

---

# Learning Dashboard

Display

Current Module

Today's Goal

Weekly Goal

Progress %

Study Hours

Revision Queue

Bookmarks

Notes

Career Impact

---

# Daily Study Plan

Generated every morning.

Example

```text
Java Streams

30 min

↓

DSA

45 min

↓

Project

45 min

↓

Revision

20 min

↓

System Design

20 min
```

---

# Learning Path

```text
Java

↓

Spring Boot

↓

SQL

↓

Redis

↓

Kafka

↓

Docker

↓

AWS

↓

System Design

↓

Microservices

↓

Advanced Backend
```

---

# Study Session

Stores

Start Time

End Time

Duration

Topic

Module

Completion

Notes

Distractions

Mood

---

# Time Tracking

Pomodoro

25 min

Short Break

5 min

Long Break

15 min

Future

Custom Timer

---

# Mastery Model

Level 0

Unknown

↓

Level 1

Started

↓

Level 2

Understood

↓

Level 3

Applied

↓

Level 4

Revised

↓

Level 5

Mastered

---

# Mastery Requirements

Theory Read

Examples Completed

Quiz Passed

Mini Project Done

Revision Completed

Interview Questions Solved

Notes Written

---

# Revision Engine

Uses

Spaced Repetition

Intervals

1 Day

3 Days

7 Days

15 Days

30 Days

60 Days

90 Days

---

# Revision Queue

Priority

Forgotten Topics

↓

Weak Topics

↓

Recent Topics

↓

Strong Topics

---

# Quiz Engine

Question Types

MCQ

True False

Code Output

Fill Blank

Scenario Based

Interview Style

---

# Quiz Difficulty

Easy

Medium

Hard

Expert

---

# Quiz Scoring

Correct

+1

Wrong

0

Skipped

0

Score stored permanently.

---

# Notes Engine

Markdown Support

Code Blocks

Images

Tables

Bookmarks

Tags

Search

Export

---

# Bookmark Engine

Bookmark

Topic

Question

Code

Article

Project

Video

Book

---

# Learning Resources

Books

Documentation

YouTube

Blogs

GitHub

Articles

Cheat Sheets

PDF

---

# Mini Projects

Every module should end with a project.

Examples

Collections

Library System

Spring Boot

Expense Tracker

Redis

Cache Layer

Kafka

Notification Service

System Design

TinyURL

---

# Learning Analytics

Track

Hours

Completion

Quiz Score

Revision

Consistency

Projects

Career Contribution

---

# Progress Calculation

```text
Topic Weight

+

Quiz Weight

+

Revision Weight

+

Project Weight

=

Mastery Score
```

---

# Weak Topic Detection

Low Quiz Score

↓

No Revision

↓

Repeated Mistakes

↓

Low Confidence

↓

Mark Weak

---

# Strong Topic Detection

High Quiz

High Revision

Project Complete

Interview Solved

Mastered

---

# Career Engine Integration

Every completed topic updates

Skill %

Career Score

Promotion Readiness

Salary Estimate

Dashboard

---

# Planner Integration

Learning Engine generates

Today's Tasks

Weekly Goals

Revision Reminders

Project Tasks

---

# Habit Engine Integration

Daily Study

↓

Habit Complete

↓

Career Score

↓

Achievement

↓

Streak

---

# Analytics Integration

Study Hours

Revision

Quiz

Projects

Consistency

Growth

Mastery

---

# Achievements

First Topic

First Module

100 Hours

500 Hours

Java Master

Spring Master

Redis Master

AWS Explorer

Interview Ready

---

# Database Tables

learning_category

learning_module

learning_topic

study_session

revision

quiz

quiz_attempt

bookmark

notes

mastery

learning_summary

---

# Caching

Learning Metadata

24 Hours

Progress

10 Minutes

Dashboard

5 Minutes

Revision Queue

30 Minutes

---

# Notifications

Today's Goal

Revision Due

Quiz Reminder

Project Reminder

Milestone

Weekly Review

Monthly Review

---

# Future Features

Offline Learning

Flashcards

Mind Maps

Code Playground

Compiler

Peer Learning

Certificates

Learning Groups

Mentorship

---

# Performance

Lazy Load Modules

Cache Metadata

Background Progress Calculation

Precompute Dashboard

Async Analytics Generation

---

# UX Principles

Minimal Distraction

One Click Continue

Visual Progress

Clear Next Step

No Information Overload

Always show:

"What should I learn next?"

---

# Success Metrics

Study Hours

Topics Completed

Revision Rate

Quiz Score

Projects Completed

Mastery %

Consistency

Career Score Growth

---

# Final Goal

The Learning Engine should become the operating system for continuous technical growth.

Rather than simply tracking completed lessons, it should guide users from **learning** to **understanding**, from **understanding** to **building**, and from **building** to **mastery**, creating measurable long-term career improvement through structured and disciplined learning.
