# ASCEND

# 26_SPRING_BOOT_ARCHITECTURE.md

Version: 1.0

---

# Purpose

This document defines the backend architecture for the ASCEND platform.

The objective is to build a production-grade Spring Boot backend following enterprise engineering practices used by fintech and product companies.

The backend should prioritize:

* Maintainability
* Scalability
* Testability
* Security
* Performance
* Observability
* Clean Architecture

---

# Technology Stack

Language

Java 21

---

Framework

Spring Boot 3.x

---

Build Tool

Maven

---

Database

PostgreSQL

---

Cache

Redis

---

Message Broker

Kafka

---

Security

Spring Security

JWT

BCrypt

---

ORM

Spring Data JPA

Hibernate

---

API Documentation

OpenAPI

Swagger

---

Migration

Flyway

---

Testing

JUnit 5

Mockito

Testcontainers

---

Monitoring

Spring Boot Actuator

Prometheus

Grafana

---

Deployment

Docker

Docker Compose

AWS EC2

NGINX

---

# Architecture Style

Hexagonal Architecture

(Clean Architecture)

```text
                 REST API

                     │

                     ▼

              Controller Layer

                     │

                     ▼

              Application Layer

                     │

                     ▼

              Domain Layer

                     │

         ┌───────────┴───────────┐

         ▼                       ▼

Persistence Adapter      External Adapter

         │                       │

         ▼                       ▼

 PostgreSQL              Redis / Kafka / AI
```

---

# Layer Responsibilities

Controller

↓

Validate Request

↓

Call Service

↓

Return Response

---

Service

↓

Business Logic

↓

Transaction

↓

Events

↓

Cache

---

Repository

↓

Database

↓

Queries

↓

Persistence

---

Entity

↓

Domain Model

---

DTO

↓

Request

↓

Response

---

Mapper

↓

DTO ↔ Entity

---

# Package Structure

```text
com.ascend

config

controller

service

repository

entity

dto

mapper

exception

security

cache

event

scheduler

util

constant

validator

client

```

---

# Module Structure

Each feature should follow:

```text
learning/

controller/

service/

repository/

entity/

dto/

mapper/

```

No giant service classes.

No shared business logic.

---

# Request Flow

```text
Angular

↓

REST API

↓

Controller

↓

Service

↓

Repository

↓

Database

↓

Entity

↓

Mapper

↓

DTO

↓

JSON Response
```

---

# Controller Layer

Responsibilities

Input Validation

Authentication

Authorization

DTO Mapping

HTTP Response

No business logic.

---

Example

```java
GET /api/v1/tasks
```

↓

TaskController

↓

TaskService

---

# Service Layer

Contains

Business Rules

Transactions

Validation

Events

Caching

Integration

Never access HTTP objects.

---

# Repository Layer

Spring Data JPA

JpaRepository

Specification

Pagination

Sorting

Native Queries

Projection

Entity Graph

---

# DTO Pattern

Every endpoint should have

Request DTO

Response DTO

Update DTO

Search DTO

Never expose Entity objects.

---

# Mapper Pattern

Preferred

MapStruct

Alternative

Manual Mapper

Never map inside controllers.

---

# Validation Layer

Bean Validation

@NotNull

@NotBlank

@Email

@Pattern

@Size

Custom Validators

Cross Field Validation

---

# Exception Handling

Global Exception Handler

@ControllerAdvice

Handles

Validation

Business

Authentication

Authorization

System

Unknown Errors

---

Response

```json
{
 "success": false,
 "message": "...",
 "errors": []
}
```

---

# Security Architecture

JWT

Refresh Token

BCrypt

Role Based Access

Method Security

Request Filter

Authentication Manager

Security Context

---

Authentication Flow

Login

↓

Validate

↓

Generate JWT

↓

Return Token

↓

Every Request Validates JWT

---

# Cache Layer

Redis

Cache Aside Pattern

TTL

JSON Serialization

Distributed Cache

Invalidate on Update

---

Cached Objects

Learning Topics

Statistics

Dashboard

Settings

Profile

Reference Data

---

# Event Architecture

Kafka Producer

Kafka Consumer

Retry

DLQ

Outbox Pattern

Idempotency

Event Logging

---

Events

Study Completed

Project Created

Habit Completed

Goal Achieved

Notification Triggered

---

# Scheduler

Daily Goal Check

Weekly Summary

Monthly Analytics

Revision Reminder

Backup

Notification Cleanup

---

# Async Processing

Spring Async

ExecutorService

CompletableFuture

Kafka

Background Jobs

---

# Logging

SLF4J

Logback

JSON Logs

Correlation ID

Request ID

Audit Logs

Error Logs

Performance Logs

---

# Monitoring

Spring Boot Actuator

Health

Metrics

Prometheus

Grafana

JVM Metrics

Memory

Threads

Connections

Response Time

---

# Database Strategy

PostgreSQL

Connection Pool

HikariCP

Pagination

Indexes

Optimistic Lock

Soft Delete

Audit Fields

Flyway Migration

---

# Transaction Strategy

Service Layer Only

@Transactional

Rollback

ReadOnly

Propagation Required

Isolation Configurable

---

# API Standards

REST

Plural Resources

Versioning

Pagination

Filtering

Sorting

Search

Consistent Response

---

# File Upload

Multipart

S3 Ready

Virus Scan

Metadata Table

Size Validation

Content Type Validation

---

# Configuration

application.yml

profiles

dev

qa

prod

local

Secrets via Environment Variables

---

# Testing Pyramid

Unit Tests

↓

Integration Tests

↓

API Tests

↓

Performance Tests

↓

Manual Verification

---

# Docker Architecture

```text
Angular

↓

NGINX

↓

Spring Boot

↓

Redis

↓

Kafka

↓

PostgreSQL
```

---

# CI/CD

GitHub Push

↓

Build

↓

Unit Test

↓

Docker Build

↓

Push

↓

Deploy

↓

Smoke Test

↓

Health Check

↓

Notify

---

# Production Checklist

Validation

Logging

Caching

Metrics

Tracing

Health

Retry

Rate Limit

Security

Backup

Monitoring

Documentation

---

# Coding Standards

Constructor Injection Only

No Field Injection

Use Records for DTOs

Use Lombok Carefully

No Business Logic in Controller

No Static Utility Abuse

Strong Typing

Use Optional Carefully

Avoid N+1 Queries

---

# Performance Guidelines

Pagination

Batch Processing

Streaming

Connection Pool

Caching

Async Processing

Projection Queries

Index Optimization

---

# Scalability Roadmap

Phase 1

Monolith

↓

Phase 2

Modular Monolith

↓

Phase 3

Event Driven

↓

Phase 4

Microservices

↓

Phase 5

Cloud Native

---

# Future Integrations

OpenAI

Gemini

Claude

GitHub

LeetCode

Codeforces

LinkedIn

Google Calendar

Notion

Slack

---

# Final Goal

The ASCEND backend should resemble the architecture used in modern fintech and SaaS products.

It should be easy to maintain by a single developer today while remaining scalable enough to evolve into a distributed platform serving hundreds of thousands of users in the future.
