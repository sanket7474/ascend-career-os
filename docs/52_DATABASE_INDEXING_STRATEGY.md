# ASCEND

# 52_DATABASE_INDEXING_STRATEGY.md

Version: 1.0

---

# Purpose

This document defines the database indexing and query optimization strategy for the ASCEND platform.

The objective is to ensure predictable query performance as data volume grows from thousands to millions of records.

Indexes should be designed intentionally rather than added reactively.

---

# Philosophy

Design

↓

Measure

↓

Index

↓

Benchmark

↓

Monitor

↓

Optimize

Indexes improve reads but increase write cost.

Every index should have a purpose.

---

# Database Stack

PostgreSQL 17

Flyway

Spring Data JPA

Hibernate

Redis Cache

---

# Performance Goals

Single Record Lookup

< 5 ms

---

Indexed Query

< 20 ms

---

Complex Search

< 50 ms

---

Dashboard Query

< 100 ms

---

Analytics Query

< 200 ms

---

# Index Strategy

Primary Key Index

Unique Index

Composite Index

Partial Index

Covering Index

GIN Index

BRIN Index (Future)

Expression Index

---

# Primary Keys

Every table must have

BIGSERIAL

or

UUID

Primary Key

Automatically Indexed

---

Example

```sql
CREATE TABLE project (

    id BIGSERIAL PRIMARY KEY

);
```

---

# Unique Index

Use for

Email

Username

GitHub Username

Project Slug

Habit Code

---

Example

```sql
CREATE UNIQUE INDEX

idx_user_email

ON users(email);
```

---

# Composite Index

Use when filtering by multiple columns.

Example

```sql
(user_id, status)

(user_id, created_at)

(project_id, task_status)
```

---

Example

```sql
CREATE INDEX

idx_project_user_status

ON project(user_id, status);
```

---

# Partial Index

Use for

ACTIVE

NOT_DELETED

OPEN

PENDING

---

Example

```sql
CREATE INDEX

idx_active_task

ON task(user_id)

WHERE status='ACTIVE';
```

---

# Covering Index

Include additional columns to avoid table lookups.

Example

```sql
(user_id, created_at)

INCLUDE

(title, status)
```

---

# Expression Index

Example

Lowercase Search

```sql
CREATE INDEX

idx_email_lower

ON users(lower(email));
```

---

# GIN Index

Use for

Tags

JSON

Arrays

Full Text Search

---

Example

```sql
CREATE INDEX

idx_note_tags

ON notes

USING GIN(tags);
```

---

# BRIN Index

Future

Large Analytics Tables

Time Series Data

Audit Logs

Event Logs

---

# Tables Requiring Indexes

users

email

username

---

project

user_id

status

created_at

---

task

project_id

status

priority

---

habit

user_id

status

---

study_session

user_id

created_at

---

career_score

user_id

---

finance_transaction

user_id

transaction_date

category

---

investment

user_id

---

goal

user_id

status

---

quiz_attempt

user_id

topic

created_at

---

revision

user_id

next_revision

---

# Query Guidelines

Always use

WHERE

LIMIT

ORDER BY indexed column

Pagination

---

Avoid

SELECT *

Full Table Scan

Functions on indexed columns

Leading Wildcards

---

# Pagination

Preferred

OFFSET

LIMIT

---

Future

Cursor Pagination

---

Example

```sql
SELECT *

FROM project

WHERE user_id=?

ORDER BY created_at DESC

LIMIT 20;
```

---

# Sorting

Sort only on indexed columns.

Examples

created_at

updated_at

name

priority

status

---

# Search

Prefer

ILIKE with trigram index

Future

PostgreSQL Full Text Search

ElasticSearch

---

# Join Optimization

Join only indexed columns.

Example

```text
project.user_id

↓

user.id
```

---

Avoid unnecessary joins.

---

# Foreign Keys

Every foreign key should be indexed.

Examples

user_id

project_id

task_id

goal_id

habit_id

---

# Analytics Tables

Separate from OLTP.

Daily Summary

Weekly Summary

Monthly Summary

Yearly Summary

Precompute expensive queries.

---

# Materialized Views

Use for

Dashboard

Analytics

Reports

Career Summary

Finance Summary

Learning Summary

---

Refresh

Scheduled

Nightly

---

# Redis Integration

Cache

Dashboard

Career Score

Settings

Metadata

Learning Progress

Analytics Summary

---

Database should not be hit repeatedly for static data.

---

# Monitoring

Track

Sequential Scan

Index Scan

Slow Queries

Deadlocks

Lock Wait

Cache Hit

Index Usage

---

# EXPLAIN ANALYZE

Every complex query should be benchmarked.

Use

```sql
EXPLAIN ANALYZE
```

before production deployment.

---

# Index Maintenance

Vacuum

Analyze

Reindex

Monitor Bloat

Drop Unused Indexes

---

# Naming Convention

```text
idx_table_column

uk_table_column

pk_table

fk_table_reference
```

---

Examples

idx_project_user

idx_task_status

uk_user_email

---

# Flyway Strategy

Every new index should be introduced through

Flyway Migration

Never create indexes manually in production.

---

# Dashboard Widgets

Slow Queries

Index Usage

Cache Hit Ratio

Deadlocks

Table Growth

Index Size

Query Time

---

# Future Optimizations

Read Replicas

Partitioning

Sharding

ElasticSearch

TimescaleDB

BRIN Indexes

Vector Search

---

# Engineering Principles

Index intentionally.

Measure before optimizing.

Avoid duplicate indexes.

Monitor index usage regularly.

Prefer simple queries over complex queries.

---

# Success Metrics

Dashboard Query

< 100 ms

API Query

< 50 ms

Sequential Scan

< 5%

Cache Hit

> 90%

Deadlocks

0

Unused Indexes

0

---

# Final Goal

The ASCEND database indexing strategy should ensure consistent, scalable, and predictable performance as the platform grows.

Every query should leverage appropriate indexes, minimize full table scans, and provide a responsive experience while maintaining efficient storage and write performance.
