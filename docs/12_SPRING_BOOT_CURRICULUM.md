# ASCEND

# 12_SPRING_BOOT_CURRICULUM.md

Version: 1.0

---

# Purpose

This document defines the complete Spring Boot curriculum used by ASCEND.

The objective is not to memorize annotations.

The objective is to understand how enterprise backend systems are designed, implemented, secured, tested, deployed, and maintained.

The curriculum is project-driven and production-focused.

Estimated Duration

4-5 Months

Estimated Study Time

140 Hours

Recommended Daily Study

60-90 Minutes

---

# Learning Philosophy

Every topic should be learned using:

Concept

↓

Visualization

↓

Implementation

↓

Debugging

↓

Mini Project

↓

Best Practices

↓

Interview Questions

↓

Revision

↓

Mastery

Watching tutorials alone does not count.

Code everything.

---

# Learning Roadmap

Spring Fundamentals

↓

Spring Core

↓

Spring Boot

↓

REST APIs

↓

Validation

↓

Exception Handling

↓

Spring Data JPA

↓

Hibernate

↓

Transactions

↓

Security

↓

JWT

↓

Caching

↓

Redis

↓

Kafka

↓

Scheduling

↓

Testing

↓

Docker

↓

Monitoring

↓

Deployment

↓

Interview Preparation

---

# MODULE 1

Spring Fundamentals

Estimated Hours

6

Topics

Spring History

Problems Spring Solves

Dependency Injection

Inversion of Control

Bean Factory

Application Context

Spring Ecosystem

Spring Modules

---

Mini Project

Simple Bean Configuration

---

Interview

IOC

DI

Advantages

Container Lifecycle

---

# MODULE 2

Spring Core

Estimated Hours

10

Topics

Beans

Scopes

Singleton

Prototype

Configuration

Java Config

XML Config

Component Scan

Autowired

Qualifier

Primary

Lifecycle

@PostConstruct

@PreDestroy

---

Mini Project

Employee Service

---

Interview

Bean Lifecycle

Autowired

Qualifier

Component Scan

---

# MODULE 3

Spring Boot

Estimated Hours

10

Topics

Auto Configuration

Starter Dependencies

@SpringBootApplication

Configuration

Profiles

application.yml

application.properties

CommandLineRunner

Banner

Boot Lifecycle

---

Mini Project

Boot Starter Application

---

# MODULE 4

REST API Development

Estimated Hours

15

Topics

@Controller

@RestController

@RequestMapping

@GetMapping

@PostMapping

@PutMapping

@DeleteMapping

@PathVariable

@RequestParam

@RequestBody

ResponseEntity

Status Codes

Headers

Content Negotiation

Versioning

HATEOAS

Pagination

Sorting

Filtering

---

Mini Project

Expense Tracker REST API

---

Interview

REST Principles

Idempotency

PUT vs PATCH

GET vs POST

HTTP Codes

---

# MODULE 5

Validation

Estimated Hours

5

Topics

Bean Validation

@NotNull

@NotBlank

@Size

@Email

@Pattern

Custom Validator

Validation Groups

Global Validation

---

Mini Project

Registration API

---

# MODULE 6

Exception Handling

Estimated Hours

5

Topics

Exception Hierarchy

@ControllerAdvice

@ExceptionHandler

Custom Exception

Error Response

Problem Details

Global Exception Handler

Logging

---

Mini Project

Global Error Handler

---

# MODULE 7

Spring Data JPA

Estimated Hours

15

Topics

Repository

CrudRepository

JpaRepository

PagingAndSortingRepository

Derived Queries

JPQL

Native Query

Specifications

Pagination

Sorting

Projection

Auditing

Entity Graph

---

Mini Project

Employee CRUD

---

Interview

JPA vs Hibernate

Lazy Loading

N+1 Problem

---

# MODULE 8

Hibernate Deep Dive

Estimated Hours

12

Topics

Entity Lifecycle

Persistence Context

Dirty Checking

Flush

Detach

Cascade

Fetch Types

Inheritance

OneToOne

OneToMany

ManyToOne

ManyToMany

Optimistic Lock

Pessimistic Lock

Batch Fetch

Caching

---

Mini Project

Order Management

---

# MODULE 9

Transactions

Estimated Hours

6

Topics

@Transactional

Propagation

Isolation

Rollback

Commit

Nested Transactions

Read Only

Transaction Manager

Distributed Transaction

---

Mini Project

Bank Transfer Service

---

Interview

Isolation Levels

Propagation Types

Rollback Rules

---

# MODULE 10

Spring Security

Estimated Hours

15

Topics

Authentication

Authorization

Security Filter Chain

Password Encoder

BCrypt

Roles

Authorities

Method Security

CSRF

CORS

Security Context

---

Mini Project

Secure REST API

---

# MODULE 11

JWT Authentication

Estimated Hours

10

Topics

JWT Structure

Claims

Token Creation

Token Validation

Refresh Token

Filter

Authentication Manager

Custom UserDetails

Stateless Authentication

Logout

---

Mini Project

Login System

---

# MODULE 12

Caching

Estimated Hours

5

Topics

Cache Manager

@EnableCaching

Cacheable

CachePut

CacheEvict

TTL

Cache Aside

Best Practices

---

Mini Project

Cached Product API

---

# MODULE 13

Redis Integration

Estimated Hours

6

Topics

Redis Template

String

Hash

List

Set

Sorted Set

TTL

Session Storage

Distributed Lock

Cache Integration

Spring Data Redis

---

Mini Project

Session Store

---

# MODULE 14

Kafka Integration

Estimated Hours

8

Topics

Producer

Consumer

Topics

Partitions

Offsets

Consumer Group

Retry

Dead Letter Queue

Serialization

Spring Kafka

---

Mini Project

Notification Service

---

# MODULE 15

Scheduling

Estimated Hours

3

Topics

@EnableScheduling

Cron

Fixed Delay

Fixed Rate

Async Scheduling

---

Mini Project

Email Reminder

---

# MODULE 16

Swagger / OpenAPI

Estimated Hours

3

Topics

OpenAPI

Swagger UI

Annotations

Documentation

Examples

Security

---

Mini Project

Document Existing APIs

---

# MODULE 17

Testing

Estimated Hours

10

Topics

JUnit 5

Mockito

@SpringBootTest

@WebMvcTest

@DataJpaTest

MockMvc

Integration Testing

Testcontainers

Assertions

Coverage

---

Mini Project

Complete API Test Suite

---

# MODULE 18

Logging & Monitoring

Estimated Hours

5

Topics

SLF4J

Logback

Structured Logging

Actuator

Health

Metrics

Prometheus

Grafana

Tracing

---

Mini Project

Production Monitoring

---

# MODULE 19

Docker

Estimated Hours

5

Topics

Dockerfile

Compose

Environment Variables

Layer Optimization

Build

Run

Container Networking

Volumes

---

Mini Project

Dockerized Spring App

---

# MODULE 20

Deployment

Estimated Hours

6

Topics

Nginx

AWS EC2

Systemd

SSL

Reverse Proxy

Health Check

Zero Downtime

Environment Config

Secrets

CI/CD

---

Mini Project

Deploy Expense Tracker

---

# Production Best Practices

DTO Pattern

Service Layer

Repository Layer

Mapper

Global Exception Handler

Validation

Logging

Transactions

Pagination

Caching

Configuration

Profiles

Secrets Management

Monitoring

---

# Interview Preparation

Theory Questions

150+

Scenario Questions

50+

Coding Questions

30+

Architecture Questions

20+

Debugging Questions

20+

---

# Recommended Mini Projects

Expense Tracker

Bank Ledger

Inventory System

Employee Portal

Notification Service

Payment Gateway

Order Management

Library System

Task Manager

URL Shortener Backend

---

# Recommended Books

Spring Start Here

Spring in Action

Hibernate Tips

Clean Code

Building Microservices

---

# Progress Tracking

Every topic stores

Status

Study Hours

Quiz Score

Revision Count

Notes

Bookmarks

Project Completed

Interview Confidence

Completion Date

---

# Revision Strategy

Day 1

Day 3

Day 7

Day 15

Day 30

Day 60

Day 90

Spaced repetition.

---

# Mastery Criteria

A topic is mastered only when:

Theory Complete

Hands-on Code Written

Mini Project Completed

Interview Questions Solved

Revision Completed

Notes Written

Quiz Score Above 80%

Able to explain concept without documentation

---

# Final Goal

At the end of this curriculum, the learner should be able to:

Design production-ready REST APIs

Build secure Spring Boot applications

Use JPA and Hibernate efficiently

Implement authentication and authorization

Integrate Redis and Kafka

Write maintainable enterprise code

Test and deploy backend services

Confidently crack Spring Boot backend interviews for top product companies.
