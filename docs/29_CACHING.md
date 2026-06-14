# ASCEND

# 29_CACHING.md

Version: 1.0

---

# Purpose

This document defines the complete caching strategy for the ASCEND platform.

The objective is not simply to improve response time.

The objective is to reduce database load, improve scalability, minimize latency, and support future horizontal scaling while maintaining data consistency.

Caching should be implemented thoughtfully.

Improper caching can create more problems than it solves.

---

# Caching Philosophy

Never cache everything.

Cache only:

* Frequently Read Data
* Rarely Updated Data
* Expensive Computations
* Reference Data
* Aggregated Statistics

Never cache sensitive or rapidly changing financial information unless absolutely necessary.

---

# Cache Architecture

```text id="rqy0d8"
             Angular Client

                    │

                    ▼

            Spring Boot Service

                    │

          Check Redis Cache

          ┌─────────┴─────────┐

          │                   │

      Cache Hit          Cache Miss

          │                   │

          ▼                   ▼

    Return Cached      Query PostgreSQL

          │                   │

          │            Store in Redis

          └───────────► Return Data
```

---

# Cache Objectives

Reduce Response Time

Reduce Database Load

Improve Throughput

Reduce Network Calls

Support Horizontal Scaling

Handle Traffic Spikes

---

# Technology Stack

Redis

Spring Cache

Spring Data Redis

Jackson Serialization

Docker

Future Redis Cluster

---

# Cache Types

Application Cache

Distributed Cache

Session Cache

Configuration Cache

Analytics Cache

Reference Cache

Computed Cache

Search Cache

---

# Cache Patterns

Cache Aside

Read Through

Write Through

Write Behind

Refresh Ahead

---

# Recommended Pattern

Cache Aside

```text id="4ehjlwm"
Application

↓

Redis

↓

PostgreSQL
```

If cache misses,

query database,

then populate cache.

---

# Read Through

```text id="q8x3m4"
Client

↓

Cache

↓

Database
```

Useful for transparent caching layers.

---

# Write Through

```text id="qz4l4r"
Client

↓

Database

↓

Redis
```

Guarantees consistency.

Higher write latency.

---

# Write Behind

```text id="jlwmc4"
Client

↓

Redis

↓

Async Database Write
```

Useful for analytics.

Not recommended for financial data.

---

# Refresh Ahead

Cache refreshed before expiration.

Useful for:

Dashboard

Leaderboards

Statistics

Daily Reports

---

# Redis Data Structures

String

Hash

List

Set

Sorted Set

Bitmap

HyperLogLog

Streams

Geo

Bloom Filter (Future)

---

# ASCEND Cache Categories

Dashboard

Learning

Planner

Finance

Projects

Analytics

Settings

Profile

Achievements

Leaderboard

---

# Dashboard Cache

Key

```text id="eyz4jj"
dashboard:user:{id}
```

TTL

5 Minutes

---

Contains

Statistics

Study Hours

Progress

Finance Summary

Recent Activity

AI Recommendations

---

# Learning Cache

Key

```text id="9e92p3"
learning:topic:{id}
```

TTL

24 Hours

---

Contains

Topic Metadata

Description

Estimated Hours

Prerequisites

Resources

---

# Learning Progress Cache

Key

```text id="4dctxt"
learning:progress:{userId}
```

TTL

15 Minutes

---

# Planner Cache

Key

```text id="gyfg8j"
planner:{userId}
```

TTL

10 Minutes

---

Contains

Today's Tasks

Calendar

Habits

Reflection

---

# Finance Cache

Key

```text id="q1dcxg"
finance:summary:{userId}
```

TTL

30 Minutes

---

Contains

Income

Expense

Savings

Net Worth

Travel Fund

Investment

---

Never cache:

Live Balance

EMI Payment Status

Critical Transactions

---

# Project Cache

Key

```text id="ewah4r"
project:{id}
```

TTL

1 Hour

---

Contains

Project Metadata

Tasks

Completion

Technology

---

# Analytics Cache

Key

```text id="67bdbw"
analytics:{userId}:{month}
```

TTL

2 Hours

---

Contains

Study Hours

Charts

Consistency

Heatmap

Score

---

# Settings Cache

Key

```text id="h87i3b"
settings:{userId}
```

TTL

24 Hours

---

# AI Recommendation Cache

Key

```text id="ywgh4u"
ai:recommendation:{userId}
```

TTL

6 Hours

---

# Cache Key Naming Convention

```text id="d9rqia"
module:entity:id
```

Examples

user:12

project:5

dashboard:user:10

learning:topic:23

analytics:monthly:1

---

# Serialization

Preferred

JSON

Jackson Serializer

Avoid Java Native Serialization

---

# Expiration Strategy

Dashboard

5 Minutes

Profile

30 Minutes

Learning Topics

24 Hours

Settings

24 Hours

Projects

1 Hour

Analytics

2 Hours

AI

6 Hours

---

# Cache Invalidation

On Update

Delete Cache

↓

Database Update

↓

Repopulate

---

Never rely only on TTL for critical updates.

---

# Spring Boot Integration

Use

@EnableCaching

@Cacheable

@CachePut

@CacheEvict

@Caching

---

Example

```java
@Cacheable("learningTopics")
public Topic getTopic(Long id)
```

---

# Batch Eviction

When:

Course Updated

Category Updated

Project Updated

Bulk Import

Clear related caches.

---

# Distributed Cache

Redis Shared

Multiple Spring Boot Instances

Stateless Backend

Load Balancer Ready

---

# Cache Stampede Prevention

Random TTL

Mutex Lock

Refresh Ahead

Background Refresh

---

# Cache Penetration

Prevent using

Bloom Filter

Null Cache

Input Validation

---

# Cache Avalanche

Random Expiration

Distributed TTL

Partial Refresh

Circuit Breaker

---

# Hot Key Problem

Use

Replication

Sharding

Partitioning

Local Cache

---

# Memory Management

Max Memory

Configured

Eviction Policy

LRU

LFU

TTL

Compression (Future)

---

# Monitoring

Redis Memory

Cache Hit Rate

Cache Miss Rate

Evictions

Latency

Connections

Key Count

---

# Metrics

Hit Ratio

Miss Ratio

Average Latency

Memory Usage

Eviction Count

Expired Keys

Slow Commands

---

# Security

Private Network

Password Protected

TLS (Future)

Key Expiration

Sensitive Data Encryption

No Public Exposure

---

# Docker Architecture

```text id="lhwb8t"
Angular

↓

Spring Boot

↓

Redis

↓

PostgreSQL
```

---

# Testing

Cache Hit

Cache Miss

TTL Expiry

Invalidation

Concurrent Access

Memory Usage

Redis Restart

Failure Recovery

---

# Common Mistakes

Caching Everything

Infinite TTL

Large Objects

No Invalidation

Caching User Sessions Improperly

Ignoring Memory Limits

Ignoring Serialization Size

---

# Production Checklist

Redis Health Check

Monitoring

Backup

Persistence

Replication

Authentication

Memory Limit

TTL Policy

Cache Eviction

Alerting

---

# Future Enhancements

Redis Cluster

Redis Sentinel

Local Cache Layer

Multi Region Cache

CDN Integration

AI Prediction Cache

Semantic Cache

Vector Cache

---

# Final Goal

The ASCEND caching strategy should significantly improve application performance while maintaining correctness, consistency, and scalability.

Caching should remain an optimization layer—not the source of truth—and should always degrade gracefully when unavailable.
