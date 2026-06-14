# ASCEND

# 40_CODING_STANDARDS.md

Version: 1.0

---

# Purpose

This document defines the coding standards for the ASCEND platform.

The objective is not merely to write working code.

The objective is to write code that is:

* Readable
* Maintainable
* Testable
* Extensible
* Consistent
* Production Ready

The codebase should remain understandable even after years of development.

---

# Engineering Philosophy

Readable Code

↓

Maintainable Code

↓

Testable Code

↓

Scalable Code

↓

Reliable Product

Code is read far more often than it is written.

---

# General Principles

Follow

KISS

Keep It Simple

---

YAGNI

You Aren't Gonna Need It

---

DRY

Don't Repeat Yourself

---

SOLID

Object Oriented Principles

---

Composition over Inheritance

Prefer immutability

Prefer explicitness

Avoid magic numbers

---

# Java Version

Java 21

Use modern language features where appropriate.

Avoid deprecated APIs.

---

# Package Structure

```text id="qw2v9m"
com.ascend

config

controller

service

repository

entity

dto

mapper

security

exception

cache

event

util

constant

validator

scheduler

```

Feature-first organization is preferred over technical grouping for large modules.

---

# Naming Convention

Packages

lowercase

---

Classes

PascalCase

---

Interfaces

PascalCase

---

Methods

camelCase

---

Variables

camelCase

---

Constants

UPPER_CASE

---

Enums

PascalCase

---

# Example

```java id="jlwm61"
public class CareerService {

    public CareerScore calculateCareerScore() {

    }

}
```

---

# Class Design

One responsibility per class.

Avoid classes larger than 300 lines whenever possible.

Avoid God Objects.

---

# Method Design

Maximum recommended length

30 lines

---

One responsibility

One abstraction level

Return early

Avoid deep nesting

---

Bad

```text id="eph3d7"
if

↓

if

↓

if

↓

if
```

---

Prefer

Guard Clauses

---

# Constructor Injection

Always use

Constructor Injection

Never

Field Injection

---

Preferred

```java id="4kfx3x"
@RequiredArgsConstructor
```

---

# Dependency Injection

Inject

Services

Repositories

Clients

Validators

Never instantiate manually.

---

# DTO Rules

Always use DTOs.

Never expose Entity objects.

Create

Request DTO

Response DTO

Update DTO

Search DTO

---

# Entity Rules

Entities represent database state.

No business logic.

No API serialization.

Minimal methods.

---

# Service Rules

Contains

Business Logic

Validation

Transaction

Events

Cache

Never

HTTP Logic

Request Objects

Response Objects

---

# Controller Rules

Responsibilities

Receive Request

Validate

Call Service

Return Response

Never implement business logic.

---

# Repository Rules

Only persistence logic.

No business rules.

Prefer Spring Data JPA.

---

# Mapper Rules

Use

MapStruct

Preferred

Manual Mapping

Acceptable

Never map inside controllers.

---

# Exception Handling

Use custom exceptions.

BusinessException

NotFoundException

ValidationException

ConflictException

UnauthorizedException

---

Global exception handling only.

---

# Logging

Use

SLF4J

Never

System.out.println()

---

Log

Start

Finish

Errors

External Calls

Performance

---

Never log

Passwords

JWT

Secrets

Sensitive Data

---

# Constants

Avoid hardcoded values.

Use

Constant Class

Configuration

Enum

---

# Validation

Use

@NotBlank

@NotNull

@Email

@Pattern

@Size

Custom Validator

---

Validate at API boundary.

---

# Transactions

Service Layer Only

@Transactional

ReadOnly

Where Possible

Short Transactions

Avoid Nested Transactions

---

# Optional Usage

Good

Return Optional

Bad

Accept Optional Parameter

Never return null if Optional is suitable.

---

# Collections

Prefer

List

Set

Map

Use immutable collections when possible.

Avoid raw types.

---

# Streams

Use for

Transformation

Filtering

Grouping

Aggregation

Avoid overcomplicated stream chains.

Readable > Clever.

---

# Concurrency

Use

ExecutorService

CompletableFuture

Virtual Threads (Future)

Avoid shared mutable state.

---

# Null Handling

Prefer

Optional

Validation

Default Values

Avoid NullPointerException risks.

---

# API Response

Consistent structure

```json id="l2v9zf"
{
  "success": true,
  "data": {},
  "message": "",
  "timestamp": ""
}
```

---

# Configuration

Use

application.yml

Profiles

local

dev

qa

prod

Never hardcode secrets.

---

# SQL

Use

Indexes

Pagination

Prepared Statements

Batch Updates

Parameterized Queries

Never

SELECT *

---

# JPA

Avoid

N+1

LazyInitializationException

Large Fetch Graphs

Use

Projection

EntityGraph

Pagination

---

# Caching

Use Redis

Cache Read Heavy Data

Invalidate Correctly

Never cache critical mutable financial values.

---

# Security

BCrypt

JWT

Validation

Parameterized Queries

Least Privilege

HTTPS

Rate Limiting

Audit Logging

---

# Performance

Connection Pool

Pagination

Batch Processing

Caching

Async Processing

Compression

Monitoring

---

# Code Comments

Explain

Why

Not

What

Good code should explain itself.

---

# TODO Comments

Format

```text id="h5m7dk"
TODO:

Issue

Owner

Expected Version
```

Never leave anonymous TODOs.

---

# Documentation

Every public API should have

Description

Parameters

Response

Example

Error Codes

---

# Unit Tests

Mandatory

Business Logic

Validators

Calculators

Services

Utility Classes

---

# Code Review Checklist

Readable

Tested

Secure

Performant

Documented

Consistent

Reusable

No Dead Code

---

# Formatting

Use IDE formatter.

No mixed indentation.

Maximum Line Length

120 Characters

One Statement Per Line

---

# Git Rules

Small Commits

Descriptive Messages

No Generated Files

No Secrets

No Temporary Files

---

# Angular Standards

Standalone Components

Signals

OnPush Strategy

Strong Typing

Reusable Components

Shared UI Library

Feature Modules

No Business Logic in Templates

---

# Database Standards

Flyway

Indexes

Constraints

Audit Fields

Soft Delete

Versioning

Migration Scripts

---

# Docker Standards

Multi Stage Build

Non Root User

Small Image

Health Check

Environment Variables

No Secrets Inside Image

---

# Documentation Standards

README

Architecture

Database

API

Deployment

Testing

Known Issues

Future Scope

---

# Refactoring Rules

Refactor when

Method Too Large

Duplicate Code

Complex Logic

Poor Naming

Low Testability

Deep Nesting

---

# Engineering Metrics

Cyclomatic Complexity

Code Coverage

Technical Debt

Duplication

Maintainability

Performance

Security

---

# Static Analysis

Checkstyle

SpotBugs

PMD

SonarQube

OWASP Dependency Check

---

# Developer Mindset

Write for the next engineer.

That engineer might be you six months later.

Choose clarity over cleverness.

Optimize for maintainability before optimization.

---

# Final Goal

The ASCEND codebase should reflect professional engineering standards comparable to those used in leading product companies.

Every file should be clean, predictable, well-tested, and easy to extend, allowing the platform to grow without accumulating unnecessary technical debt.
