# ASCEND

# 19_PROJECT_ARCHITECTURES.md

Version: 1.0

---

# Purpose

This document defines the architecture standards that every ASCEND project should follow.

The objective is not to create working applications.

The objective is to create systems that resemble real production applications used in fintech and large-scale technology companies.

Every project should demonstrate:

* Clean Architecture
* Layered Design
* SOLID Principles
* Scalability
* Observability
* Security
* Maintainability
* Fault Tolerance

---

# High Level Architecture

```text
                Client (Angular)

                        │

                        ▼

               Spring Boot REST API

                        │

        ┌───────────────┼───────────────┐

        ▼                               ▼

 Business Services             Authentication

        │                               │

        ▼                               ▼

   Domain Layer                  Security Layer

        │

        ▼

 Repository Layer

        │

        ▼

 PostgreSQL

        │

        ▼

 Redis Cache

        │

        ▼

 Kafka Events

        │

        ▼

 External Services
```

---

# Architecture Principles

Every project must follow:

Single Responsibility

Open Closed

Dependency Inversion

Interface Driven Development

Separation of Concerns

Layered Architecture

Fail Fast

Defensive Programming

---

# Standard Folder Structure

```
src/main/java

controller/

service/

repository/

entity/

dto/

mapper/

config/

security/

exception/

util/

events/

scheduler/

cache/

audit/

```

---

# API Layer

Responsibilities

Receive Request

Validate

Map DTO

Call Service

Return Response

Never contain business logic.

---

# Service Layer

Responsibilities

Business Rules

Validation

Transactions

Events

Security

Cache Coordination

No HTTP knowledge.

---

# Repository Layer

Responsibilities

Database Access

Queries

Specifications

Pagination

Sorting

Native Queries

No business logic.

---

# DTO Layer

Purpose

Hide entities

Version APIs

Control serialization

Validation

---

Example

UserRequestDTO

UserResponseDTO

ExpenseRequestDTO

ExpenseResponseDTO

---

# Entity Layer

Contains

@Table

@Column

@Id

@OneToMany

@ManyToOne

@ManyToMany

@OneToOne

Should not expose directly to clients.

---

# Mapper Layer

Responsibilities

DTO → Entity

Entity → DTO

Use MapStruct (preferred)

Manual Mapping if required

---

# Exception Layer

Global Exception Handler

Validation Exception

Business Exception

Resource Not Found

Unauthorized

Conflict

Rate Limit

---

Response Format

```json
{
  "success": false,
  "message": "Validation failed",
  "errors": []
}
```

---

# Security Layer

JWT

BCrypt

Roles

Authorities

Filters

Authentication

Authorization

Refresh Token

Logout

Method Security

---

# Configuration Layer

Swagger

CORS

Jackson

Redis

Kafka

Security

OpenAPI

Bean Configuration

---

# Cache Layer

Redis

Cache Aside

TTL

Eviction

JSON Serialization

Distributed Cache

Invalidate on Update

---

# Event Layer

Kafka Producer

Kafka Consumer

Retry

Dead Letter Queue

Idempotency

Ordering

Outbox Pattern

---

# Scheduler Layer

Cron Jobs

Cleanup

Reports

Notifications

Settlement

Email Retry

Daily Summary

---

# Logging Strategy

SLF4J

Logback

Correlation ID

Structured Logs

JSON Logs

Request Logging

Response Logging

Error Logging

Audit Logging

---

# Monitoring

Actuator

Health Check

Metrics

Prometheus

Grafana

Tracing

OpenTelemetry

Alerts

---

# Database Architecture

Normalized

Indexes

Foreign Keys

Soft Delete

Audit Tables

Version Columns

Optimistic Lock

Pagination

Partitioning

---

# API Standards

Use nouns

Plural resources

Proper HTTP codes

Consistent naming

Pagination

Sorting

Filtering

Versioning

---

Example

GET /users

POST /users

PUT /users/{id}

DELETE /users/{id}

---

# Validation Strategy

@NotNull

@NotBlank

@Email

@Size

@Pattern

Custom Validator

Cross Field Validation

---

# Error Handling

400

Validation

401

Unauthorized

403

Forbidden

404

Not Found

409

Conflict

429

Too Many Requests

500

Internal Error

---

# Transaction Strategy

Service Layer Only

Never Controller

Rollback on Exception

ReadOnly for Reads

Propagation Required

Isolation Configurable

---

# Testing Strategy

Unit Tests

Mockito

JUnit 5

Integration Tests

Testcontainers

API Tests

Performance Tests

Load Tests

---

# Docker Architecture

Application

↓

Redis

↓

Kafka

↓

PostgreSQL

↓

Prometheus

↓

Grafana

↓

Nginx

↓

Client

Docker Compose for local development.

---

# CI/CD Pipeline

Git Push

↓

GitHub Actions

↓

Build

↓

Unit Test

↓

Docker Build

↓

Push Image

↓

Deploy

↓

Health Check

↓

Notify

---

# Production Readiness Checklist

Authentication

Authorization

Validation

Logging

Monitoring

Caching

Retry

Backup

Health Checks

Documentation

Testing

Deployment

Rollback

Rate Limiting

---

# Scalability Guidelines

Horizontal Scaling

Stateless Services

External Sessions

Distributed Cache

Async Processing

Connection Pooling

Pagination

Batch Processing

Read Replicas

---

# Security Checklist

HTTPS

JWT

BCrypt

Secrets Manager

SQL Injection Prevention

XSS Prevention

CORS

CSRF

Rate Limiting

Audit Logs

Input Validation

---

# Resume Mapping

Every architecture should demonstrate knowledge of:

Spring Boot

JPA

Security

Redis

Kafka

Docker

SQL

System Design

Microservices

Cloud Deployment

Observability

Distributed Systems

---

# Final Goal

Every ASCEND project should resemble an enterprise backend system that could realistically be deployed in a fintech or product company.

The architecture should prioritize maintainability, scalability, security, and performance while remaining simple enough for a single engineer to understand and extend.
