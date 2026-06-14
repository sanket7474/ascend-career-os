# ASCEND

# 47_OBSERVABILITY.md

Version: 1.0

---

# Purpose

This document defines the observability strategy for ASCEND.

Monitoring tells us **that** something is wrong.

Observability tells us **why** it is wrong.

The objective is to provide complete visibility into the behavior of the system through logs, metrics, traces, and business events.

---

# Observability Pillars

Logs

↓

Metrics

↓

Traces

↓

Business Events

↓

System Understanding

---

# High Level Architecture

```text
Angular

↓

NGINX

↓

Spring Boot

↓

OpenTelemetry

↓

Logs
Metrics
Traces

↓

Grafana Stack
```

---

# Goals

Understand application behavior

Diagnose production issues

Measure business health

Measure technical health

Reduce debugging time

Improve reliability

---

# Three Pillars

## Logs

Capture discrete events.

Examples

Authentication Success

Authentication Failure

Project Created

Career Score Updated

Database Error

API Failure

---

## Metrics

Measure numerical values.

Examples

Requests/sec

Memory Usage

CPU Usage

Heap Usage

Career Score Calculations

Study Sessions

Active Users

---

## Traces

Measure request execution across components.

Example

```text
Angular

↓

Spring Boot

↓

Career Service

↓

Learning Service

↓

Repository

↓

PostgreSQL

↓

Response
```

Each step should include execution time.

---

# Business Observability

Track

Study Sessions

Projects Built

Habits Completed

Career Score Changes

Finance Goal Progress

Interview Readiness

Daily Active Users

Monthly Active Users

---

# Technical Metrics

Application Uptime

Response Time

Heap Usage

CPU

Disk

GC

Thread Count

Connection Pool

Cache Hit Rate

---

# API Metrics

Request Count

Average Response

P95

P99

Error Rate

Slow Requests

Payload Size

---

# Database Metrics

Connections

Query Time

Deadlocks

Transactions

Locks

Index Usage

Table Growth

---

# Redis Metrics

Hit Ratio

Miss Ratio

Memory

Latency

Evictions

Key Count

Connections

---

# Scheduler Metrics

Jobs Executed

Jobs Failed

Retries

Execution Time

Skipped Jobs

Success Rate

---

# Career Engine Metrics

Career Score Updates

Average Skill Score

Promotion Readiness

Salary Prediction Count

Milestones Achieved

---

# Learning Metrics

Study Hours

Topics Completed

Quiz Accuracy

Revision Count

Mastery Score

Bookmarks

---

# Habit Metrics

Completion %

Consistency

Current Streak

Best Streak

Missed Days

---

# Finance Metrics

Savings Rate

Net Worth

EMI Remaining

Investment Growth

Goal Progress

Emergency Fund

---

# Project Metrics

Projects Completed

Deployments

Commits

Documentation Score

Architecture Score

Resume Score

---

# Interview Metrics

Questions Solved

Mock Score

Interview Readiness

Applications

Offers

Revision Rate

---

# Distributed Tracing

Future

OpenTelemetry

Jaeger

Zipkin

Grafana Tempo

---

# Correlation ID

Every request should propagate

X-Correlation-ID

through

Controller

Service

Repository

Redis

Scheduler

External APIs

---

# Dashboard

Operations Dashboard

Application Health

Infrastructure Dashboard

Business Dashboard

Career Dashboard

Finance Dashboard

Learning Dashboard

---

# Alert Thresholds

API Response > 500ms

Heap > 90%

CPU > 90%

Error Rate > 5%

Redis Down

Database Down

Scheduler Failure

Disk > 85%

---

# SLI

Service Level Indicators

Availability

Latency

Throughput

Error Rate

---

# SLO

99.9% Availability

95% Requests < 200ms

Error Rate < 1%

Scheduler Success > 99%

---

# Error Budget

Monthly Error Budget

0.1%

Used to prioritize stability over feature development.

---

# Incident Timeline

Issue

↓

Detection

↓

Alert

↓

Investigation

↓

Resolution

↓

Postmortem

↓

Improvement

---

# Data Retention

Logs

30 Days

Metrics

90 Days

Business Metrics

2 Years

Audit

7 Years

---

# Dashboard Widgets

System Health

Career Score Trend

Learning Trend

Finance Trend

API Latency

Heap Usage

Recent Errors

Scheduler Status

Study Hours

Net Worth Growth

---

# Future Enhancements

OpenTelemetry

Grafana Tempo

Jaeger

Distributed Tracing

Real User Monitoring

Synthetic Monitoring

Business Intelligence Dashboards

Anomaly Detection

---

# Engineering Principles

Measure Everything

Alert Intelligently

Correlate Events

Keep Business Metrics Separate

Monitor User Experience

Prefer Data Over Assumptions

---

# Final Goal

The ASCEND observability platform should provide complete visibility into technical operations and business behavior.

Every request, background job, learning session, project update, and career milestone should be measurable and traceable, enabling rapid debugging and continuous improvement of the platform.
