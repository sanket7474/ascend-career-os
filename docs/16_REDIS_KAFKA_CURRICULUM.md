# ASCEND

# 16_REDIS_KAFKA_CURRICULUM.md

Version: 1.0

---

# Purpose

This document defines the complete Redis and Apache Kafka curriculum used by ASCEND.

The objective is not to memorize Redis commands or Kafka terminology.

The objective is to understand when, why, and how to use caching and messaging systems in production-grade distributed applications.

This curriculum is intended for backend engineers targeting Senior Software Engineer roles.

Estimated Duration

2 Months

Estimated Study Time

70 Hours

Recommended Daily Study

45 Minutes

---

# Learning Philosophy

Every topic should follow:

Problem

↓

Why Existing Solution Fails

↓

Technology Introduction

↓

Implementation

↓

Scaling

↓

Failure Handling

↓

Production Use Case

↓

Interview Questions

↓

Revision

---

# Learning Roadmap

Caching Fundamentals

↓

Redis Basics

↓

Redis Data Structures

↓

Expiration

↓

Persistence

↓

Pub/Sub

↓

Distributed Locking

↓

Spring Data Redis

↓

Kafka Fundamentals

↓

Producer

↓

Consumer

↓

Partitions

↓

Consumer Groups

↓

Ordering

↓

Retries

↓

Dead Letter Queue

↓

Event Driven Architecture

↓

Kafka + Spring Boot

↓

Real Projects

---

# PART 1

Caching Fundamentals

Estimated Hours

4

Topics

Why Cache

Latency

Memory vs Disk

Read Heavy Systems

Write Heavy Systems

Cache Hit

Cache Miss

Hot Data

Cold Data

---

Production Example

Product Catalog

User Profile

Session Storage

Leaderboard

Configuration Cache

---

Interview Questions

Why Redis?

Why not database?

When should cache be avoided?

---

# PART 2

Redis Fundamentals

Estimated Hours

5

Topics

Installation

CLI

Configuration

Persistence

RDB

AOF

Replication

Sentinel

Cluster

Memory Management

Eviction Policies

---

Mini Project

Redis Playground

---

# PART 3

Redis Data Structures

Estimated Hours

8

Topics

String

Hash

List

Set

Sorted Set

Bitmap

HyperLogLog

GeoSpatial

Streams

Bloom Filter

---

Use Cases

User Session

Cart

Leaderboard

Tag System

Search History

Notifications

Rate Limiter

Analytics

---

Mini Project

Gaming Leaderboard

---

# PART 4

Caching Strategies

Estimated Hours

6

Topics

Cache Aside

Read Through

Write Through

Write Behind

Refresh Ahead

TTL

Eviction

Invalidation

Distributed Cache

Near Cache

---

Production Examples

Bank Balance

Orders

Products

Inventory

Coupons

Exchange Rates

---

Mini Project

Product Cache Service

---

# PART 5

Distributed Locking

Estimated Hours

3

Topics

SETNX

RedLock

Mutex

Idempotency

Concurrency

Duplicate Prevention

---

Mini Project

Payment Lock Service

---

# PART 6

Redis with Spring Boot

Estimated Hours

6

Topics

RedisTemplate

StringRedisTemplate

CacheManager

@EnableCaching

@Cacheable

@CachePut

@CacheEvict

TTL

Serialization

JSON Cache

---

Mini Project

Expense Tracker Cache Layer

---

# PART 7

Apache Kafka Fundamentals

Estimated Hours

8

Topics

Why Kafka

Broker

Topic

Partition

Offset

Producer

Consumer

Cluster

Replication

Retention

Compaction

---

Mini Project

Kafka Playground

---

# PART 8

Producer

Estimated Hours

4

Topics

Producer Config

ACK

Batching

Compression

Idempotent Producer

Transactions

Serialization

---

Mini Project

Order Event Publisher

---

# PART 9

Consumer

Estimated Hours

5

Topics

Consumer Group

Polling

Offset Commit

Auto Commit

Manual Commit

Seek

Lag

Scaling

---

Mini Project

Email Notification Consumer

---

# PART 10

Advanced Kafka

Estimated Hours

8

Topics

Exactly Once

At Least Once

At Most Once

Retry

Dead Letter Queue

Ordering

Rebalancing

Backpressure

Schema Registry

Avro

---

Mini Project

Payment Retry System

---

# PART 11

Spring Boot Kafka

Estimated Hours

8

Topics

Spring Kafka

KafkaTemplate

Listener

Error Handler

Retry

DLQ

Transactions

Serialization

Monitoring

Testing

---

Mini Project

Order Processing Service

---

# PART 12

Event Driven Architecture

Estimated Hours

8

Topics

Domain Events

Integration Events

Event Choreography

Event Orchestration

Saga Pattern

CQRS

Outbox Pattern

Inbox Pattern

Event Sourcing

---

Mini Project

Ecommerce Order System

---

# Real World Architectures

Notification System

Payment Gateway

Inventory Update

Email Queue

Audit Service

Activity Feed

Analytics Pipeline

Fraud Detection

Recommendation Engine

Ride Matching

---

# Production Best Practices

Never Cache Everything

Use TTL

Avoid Cache Stampede

Handle Cache Failure

Use Idempotency

Retry Carefully

Monitor Consumer Lag

Partition Correctly

Avoid Large Messages

Compress Payloads

---

# Common Mistakes

Using Redis as Database

Infinite TTL

Large Keys

Hot Keys

Too Many Partitions

Ignoring DLQ

Manual Offset Bugs

Blocking Consumers

---

# Interview Preparation

Theory Questions

100+

Scenario Questions

40+

Architecture Questions

30+

Debugging Questions

20+

Coding Questions

15+

---

# Mini Projects

Leaderboard Service

OTP Cache

Rate Limiter

Distributed Lock

Notification Queue

Email Service

Payment Processor

Inventory Sync

Analytics Pipeline

Order Service

---

# Recommended Books

Redis in Action

Kafka: The Definitive Guide

Designing Event Driven Systems

Designing Data Intensive Applications

---

# Progress Tracking

Topics Completed

Projects Completed

Quiz Score

Revision Count

Architecture Drawings

Interview Confidence

Notes

Bookmarks

Study Hours

---

# Revision Strategy

Day 1

Day 3

Day 7

Day 15

Day 30

Day 60

---

# Mastery Criteria

A topic is mastered only when:

Theory Complete

Hands-on Code Written

Mini Project Completed

Failure Cases Understood

Interview Questions Solved

Revision Completed

Able to explain production use cases confidently

---

# Final Goal

At the end of this curriculum, the learner should be able to:

Design high-performance caching layers

Implement Redis effectively

Integrate Kafka with Spring Boot

Build event-driven microservices

Handle retries and failures correctly

Design scalable distributed systems

Confidently answer Redis and Kafka interview questions for senior backend engineering roles.
