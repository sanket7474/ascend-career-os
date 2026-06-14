# ASCEND

# 53_SCHEDULER_DESIGN.md

Version: 1.0

---

# Purpose

This document defines the scheduler architecture for the ASCEND platform.

Schedulers are responsible for executing recurring background jobs without user intervention.

The objective is to automate repetitive tasks while ensuring reliability, observability, and fault tolerance.

---

# Philosophy

Schedule

↓

Execute

↓

Validate

↓

Log

↓

Retry

↓

Complete

Background jobs should be idempotent and resilient.

---

# Scheduler Architecture

```text
Spring Boot Scheduler

↓

Task Dispatcher

↓

Job Executor

↓

Database

Redis

Notification Service

Analytics Engine

Career Engine
```

---

# Scheduler Categories

Daily Jobs

Hourly Jobs

Weekly Jobs

Monthly Jobs

Yearly Jobs

One-Time Jobs

Manual Jobs

---

# Daily Jobs

Generate Daily Planner

Revision Queue

Habit Reset

Career Score Refresh

Learning Summary

Dashboard Cache Refresh

Study Reminder

Finance Summary

---

Execution Time

00:05 UTC

---

# Hourly Jobs

Cache Refresh

Analytics Aggregation

Health Check

Notification Queue

Session Cleanup

Token Cleanup

Temporary File Cleanup

---

Execution

Every Hour

---

# Weekly Jobs

Weekly Analytics

Career Report

Habit Summary

Finance Summary

Learning Summary

Project Progress

Interview Progress

---

Execution

Sunday

23:30 UTC

---

# Monthly Jobs

Monthly Report

Goal Progress

Net Worth Calculation

Career Growth Report

Skill Progress

Leaderboard (Future)

Archive Logs

---

Execution

Last Day of Month

23:55 UTC

---

# Yearly Jobs

Year Summary

Career Timeline

Financial Report

Achievement Summary

Statistics Archive

Cleanup

---

Execution

31 December

23:59 UTC

---

# One-Time Jobs

Password Reset

Email Verification

Export Generation

Account Activation

Migration

---

# Scheduler Framework

Spring Boot

@Scheduled

Future

Quartz Scheduler

Distributed Scheduler

---

# Scheduler Flow

```text
Trigger

↓

Validate

↓

Lock

↓

Execute

↓

Log

↓

Success

↓

Release Lock
```

---

# Locking Strategy

Use

ShedLock

Prevent duplicate execution.

Single instance executes the job.

---

# Retry Strategy

Retry

Network Failure

Database Timeout

Redis Failure

Temporary API Failure

---

Maximum Retries

3

---

Backoff

Exponential

---

# Never Retry

Validation Errors

Authentication Errors

Business Rule Failures

Duplicate
