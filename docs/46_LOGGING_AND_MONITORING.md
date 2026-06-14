# ASCEND

# 46_LOGGING_AND_MONITORING.md

Version: 1.0

---

# Purpose

This document defines the logging, monitoring, alerting, and operational visibility strategy for the ASCEND platform.

The objective is to make production issues easy to detect, diagnose, and resolve.

The system should answer:

* What failed?
* When did it fail?
* Why did it fail?
* Who was affected?
* How can it be fixed?

---

# Philosophy

Observe

↓

Detect

↓

Alert

↓

Investigate

↓

Fix

↓

Learn

Monitoring should detect problems before users report them.

---

# Architecture

```text
Angular

↓

NGINX

↓

Spring Boot

↓

Application Logs

↓

Prometheus Metrics

↓

Grafana Dashboard

↓

Alerts
```

---

# Logging Levels

TRACE

Detailed debugging

---

DEBUG

Development diagnostics

---

INFO

Normal business events

---

WARN

Recoverable issues

---

ERROR

Application failures

---

FATAL

Application cannot continue

---

# What To Log

Application Startup

Shutdown

Authentication

Authorization

Business Events

External API Calls

Database Errors

Cache Misses

Scheduler Execution

Performance Metrics

Exceptions

---

# Never Log

Passwords

JWT Tokens

Refresh Tokens

Secrets

Bank Details

Sensitive Personal Information

Large Payloads

---

# Log Format

Every log entry should contain:

Timestamp

Level

Application

Environment

Thread

Correlation ID

Request ID

User ID (if available)

Class

Method

Message

Execution Time

Exception

---

# Example Log

```text
2026-06-13T12:10:30Z

INFO

ASCEND

CareerService

CorrelationId=abc123

User=42

Career score recalculated

Duration=25ms
```

---

# Correlation ID

Every incoming request receives

X-Correlation-ID

Used across:

Application Logs

Database Calls

Redis

Kafka

External APIs

Schedulers

This enables end-to-end tracing.

---

# Request Logging

Capture

Method

URL

Response Status

Execution Time

User

IP

Payload Size

Never log request bodies containing credentials.

---

# Business Event Logging

Examples

User Registered

Habit Completed

Study Session Started

Project Completed

Career Score Updated

Finance Goal Achieved

Interview Mock Completed

---

# Error Logging

Log

Stack Trace

Message

Cause

SQL

External Response

Correlation ID

User

Environment

---

# Performance Logging

Track

Slow Queries

Slow APIs

Large Payloads

Memory Usage

CPU Usage

GC Activity

Thread Count

Connection Pool

---

# Metrics

Requests Per Second

Average Response Time

95th Percentile

99th Percentile

Error Rate

Cache Hit Ratio

DB Latency

Heap Usage

Active Sessions

---

# Prometheus Metrics

HTTP Requests

JVM Memory

Heap

GC

Threads

Datasource

Redis

Kafka

Custom Business Metrics

---

# Business Metrics

Study Hours Today

Career Score

Projects Completed

Habits Completed

Finance Goal Progress

Interview Readiness

Daily Active Users

---

# Health Checks

Application

Database

Redis

Kafka

Disk

Memory

Scheduler

External APIs

---

Endpoint

```text
/actuator/health
```

---

# Alerting Rules

Error Rate > 5%

Response Time > 500ms

Database Down

Redis Down

Scheduler Failure

Heap > 90%

Disk > 85%

CPU > 90%

Too Many Failed Logins

---

# Grafana Dashboards

Application Health

Infrastructure

Database

Redis

Scheduler

Career Engine

Finance Engine

Learning Engine

API Performance

---

# Dashboard Widgets

System Status

Active Users

API Latency

Memory Usage

CPU Usage

Heap Usage

Slow Queries

Recent Errors

Scheduler Status

---

# Scheduler Monitoring

Track

Execution Time

Success Count

Failure Count

Retry Count

Skipped Jobs

Next Execution

---

# Database Monitoring

Connections

Slow Queries

Deadlocks

Transactions

Locks

Index Usage

Table Size

---

# Redis Monitoring

Memory

Keys

Hit Rate

Miss Rate

Evictions

Latency

Connections

---

# Kafka Monitoring (Future)

Consumer Lag

Producer Rate

Broker Health

Partition Count

Failed Messages

Retry Queue

---

# Log Retention

Application Logs

30 Days

Audit Logs

365 Days

Security Logs

365 Days

Performance Logs

30 Days

Debug Logs

7 Days

---

# Log Rotation

Daily

Compressed

Archived

Deleted after retention period

---

# Incident Response

Detect

↓

Alert

↓

Investigate

↓

Mitigate

↓

Recover

↓

Postmortem

---

# Production Checklist

Structured Logging

Correlation ID

Health Checks

Metrics

Grafana

Prometheus

Alerts

Retention

Rotation

Backups

---

# Future Enhancements

OpenTelemetry

Jaeger

Zipkin

ELK Stack

Loki

Grafana Tempo

Distributed Tracing

Slack Alerts

PagerDuty

---

# Success Metrics

99.9% Availability

<200ms Average Response

<1% Error Rate

100% Scheduler Success

Zero Silent Failures

Real-Time Alerting

---

# Final Goal

The ASCEND monitoring strategy should provide complete operational visibility into the application.

Every request, background job, database call, and business event should be observable, measurable, and traceable, enabling rapid diagnosis and resolution of production issues while maintaining a reliable and professional software platform.
