# ASCEND

# 06_DATA_MODEL_AND_STORAGE.md

Version: 1.0

---

# Purpose

This document defines the data model for ASCEND.

The objective is to create a scalable model that works:

* Offline (LocalStorage)
* Online (Spring Boot API)
* Cloud Sync (Future)
* Mobile App (Future)

The frontend should never depend directly on LocalStorage.

All storage should be abstracted through services.

---

# Storage Strategy

## Phase 1

Browser LocalStorage

No authentication

Offline First

---

## Phase 2

Spring Boot REST API

JWT Authentication

PostgreSQL

Redis Cache

---

## Phase 3

Cloud Synchronization

Multiple Devices

Automatic Backup

Conflict Resolution

---

# Storage Keys

ascend-profile

ascend-dashboard

ascend-settings

ascend-tasks

ascend-progress

ascend-finance

ascend-projects

ascend-learning

ascend-notes

ascend-interview

ascend-analytics

ascend-ai

---

# Entity Relationship

User

↓

Goals

↓

Tasks

↓

Learning Progress

↓

Projects

↓

Analytics

↓

Finance

↓

Interview

↓

Notes

---

# User Model

Fields

id

name

email

experience

company

designation

currentSalary

targetSalary

location

github

linkedin

resume

bio

profileImage

createdAt

updatedAt

---

# Goal Model

id

title

description

type

startDate

endDate

currentValue

targetValue

completed

priority

status

---

Example

Reach 35 LPA

Current

20

Target

35

Deadline

June 2027

---

# Task Model

id

title

description

completed

priority

category

estimatedMinutes

createdAt

completedAt

repeatDaily

repeatWeekly

---

Example

Learn Streams

Category

Java

Priority

High

---

# Study Session Model

id

topic

technology

duration

date

notes

difficulty

rating

---

Purpose

Track learning history.

---

# Learning Category

Java

Spring

DSA

SQL

Redis

Kafka

Docker

AWS

Git

Linux

System Design

Design Patterns

Testing

Microservices

---

# Learning Topic Model

id

title

parent

category

difficulty

completed

progress

notes

resources

quizScore

bookmarked

lastVisited

estimatedHours

---

Example

Collections

Progress

70%

---

# Progress Model

technology

percentage

completedTopics

totalTopics

hoursSpent

lastUpdated

---

Example

Java

72%

48 Topics

65 Topics

92 Hours

---

# Finance Model

currentSalary

targetSalary

monthlyIncome

monthlyExpense

monthlyInvestment

monthlySavings

emi

emergencyFund

travelFund

carFund

retirementFund

netWorth

---

# Investment Model

type

amount

frequency

returns

goal

createdAt

---

Example

Index Fund

5000

Monthly

---

# Travel Goal

country

estimatedCost

savedAmount

deadline

completed

---

Example

Switzerland

Estimated

300000

Saved

85000

---

# Project Model

id

name

description

status

progress

github

liveDemo

architecture

techStack

resumePoints

createdAt

updatedAt

---

Project Status

Planned

In Progress

Completed

Archived

---

# Project Task

id

projectId

title

completed

estimatedHours

priority

category

---

# Interview Model

company

position

date

status

result

feedback

salary

notes

---

Status

Applied

Interview

Rejected

Offer

Accepted

---

# Mock Interview

topic

score

feedback

date

notes

---

# Analytics Model

studyHours

projectsCompleted

leetcodeSolved

githubCommits

booksRead

notesCreated

interviewsGiven

salaryGrowth

savingsGrowth

consistencyScore

---

# Habit Model

name

completed

date

streak

category

---

Examples

Running

Reading

Coding

Learning

Sleep

Writing

Meditation

---

# Daily Reflection

date

wins

mistakes

blockers

gratitude

notes

rating

---

Purpose

Build self-awareness.

---

# Weekly Review

week

studyHours

projects

books

learning

exercise

consistency

score

reflection

---

# Monthly Review

month

salary

investments

learning

projects

books

travel

career

reflection

---

# Notes Model

id

title

content

tags

favorite

createdAt

updatedAt

category

---

Supports

Markdown

Code Blocks

Images

Tables

Links

---

# Bookmark Model

type

referenceId

createdAt

---

Can bookmark

Topic

Project

Interview Question

Article

Note

---

# AI Conversation

id

question

answer

category

createdAt

---

Future AI history.

---

# Dashboard Aggregate

studyStreak

studyHours

tasksCompleted

progress

salaryProgress

savingsProgress

interviewReadiness

projectCompletion

consistency

---

Computed.

Not stored directly.

---

# Local Storage Rules

Never store duplicated data.

Always serialize using JSON.

Validate before loading.

Provide default values.

Recover gracefully from corruption.

---

# Backend API Mapping

Frontend Model

↓

DTO

↓

Service

↓

Repository

↓

Database

No UI should directly know database structure.

---

# Caching Strategy

Frequently read

Dashboard

Progress

Tasks

Settings

Cache first.

Sync later.

---

# Future Database Tables

users

goals

tasks

study_sessions

learning_topics

progress

finance

investments

projects

project_tasks

interviews

analytics

notes

habits

reviews

bookmarks

ai_history

---

# Design Principle

Everything in ASCEND should be measurable.

If something cannot be tracked,

it cannot be improved.

Every model exists to answer one question:

"Am I becoming a better engineer today than I was yesterday?"
