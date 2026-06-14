# ASCEND

# 18_PROJECT_BLUEPRINTS.md

Version: 1.0

---

# Purpose

This document defines the complete set of production-grade backend projects that power the ASCEND learning engine.

The objective is not to build CRUD applications.

The objective is to build projects that demonstrate:

* Backend Engineering
* Distributed Systems
* Clean Architecture
* Database Design
* Caching
* Messaging
* Scalability
* Security
* Deployment

Every project should be resume-worthy and production-inspired.

---

# Learning Strategy

Every project should be built in phases:

Requirements

↓

Database Design

↓

API Design

↓

Backend Implementation

↓

Caching

↓

Messaging

↓

Authentication

↓

Testing

↓

Docker

↓

Deployment

↓

Monitoring

↓

Optimization

---

# PROJECT 1

Expense Tracker API

Difficulty

Easy

Estimated Time

12 Hours

Tech Stack

Spring Boot

PostgreSQL

Docker

JWT

Swagger

---

## Features

Authentication

Income

Expense

Category

Monthly Report

Budget

Statistics

CSV Export

Search

Pagination

---

## Database Tables

users

expenses

income

category

budget

audit_log

---

## APIs

Register

Login

Add Expense

Delete Expense

Monthly Report

Analytics

Export CSV

---

## Concepts Learned

REST

Validation

JPA

JWT

Pagination

Exception Handling

DTO Mapping

---

# PROJECT 2

Bank Ledger System

Difficulty

Medium

Estimated Time

18 Hours

---

## Features

Account

Deposit

Withdraw

Transfer

Transaction History

Statement

Balance

Audit

---

## Concepts

Transactions

Isolation

ACID

Optimistic Lock

Pessimistic Lock

Ledger Design

Concurrency

---

## Tables

account

ledger

transaction

audit

customer

---

# PROJECT 3

URL Shortener

Difficulty

Medium

Estimated Time

15 Hours

---

## Features

Generate Short URL

Redirect

Analytics

Expiry

Custom Alias

QR Code

Rate Limit

Click Count

---

## Tech

Redis

PostgreSQL

Spring Boot

Docker

---

## Concepts

Caching

Hashing

Base62

Rate Limiting

Distributed Cache

Scalability

---

# PROJECT 4

Notification Service

Difficulty

Medium

Estimated Time

20 Hours

---

## Features

Email

SMS

Push Notification

Retry

DLQ

Scheduling

Templates

Priority Queue

---

## Tech

Kafka

Redis

Spring Boot

Docker

---

## Concepts

Event Driven

Retry

Queue

DLQ

Asynchronous Processing

---

# PROJECT 5

Inventory Management

Difficulty

Medium

Estimated Time

22 Hours

---

## Features

Products

Stock

Warehouse

Supplier

Orders

Reports

Alerts

Barcode

---

## Concepts

Transactions

Optimistic Lock

Caching

Batch Update

Reporting

---

# PROJECT 6

Payment Gateway Simulator

Difficulty

Advanced

Estimated Time

30 Hours

---

## Features

Create Payment

Capture

Refund

Cancel

Webhook

Retry

Status

Settlement

---

## Tech

Kafka

Redis

Spring Boot

PostgreSQL

---

## Concepts

Idempotency

Saga

Retry

Distributed Lock

State Machine

Compensation

---

# PROJECT 7

Chat Backend

Difficulty

Advanced

Estimated Time

28 Hours

---

## Features

Rooms

Messages

Typing

Read Receipt

Online Users

Media

Notification

History

---

## Tech

WebSocket

Redis

Kafka

PostgreSQL

---

## Concepts

Pub/Sub

Real Time

WebSocket

Scaling

Presence

---

# PROJECT 8

Order Management System

Difficulty

Advanced

Estimated Time

30 Hours

---

## Features

Order

Payment

Inventory

Shipment

Invoice

Tracking

Status

Cancellation

---

## Tech

Spring Boot

Kafka

Redis

Docker

---

## Concepts

Saga

Microservices

Event Driven

CQRS

Transactions

---

# PROJECT 9

File Storage Service

Difficulty

Advanced

Estimated Time

18 Hours

---

## Features

Upload

Download

Delete

Signed URL

Metadata

Preview

Compression

Virus Scan

---

## Tech

AWS S3

Spring Boot

Docker

---

## Concepts

Blob Storage

Streaming

Metadata

Security

Encryption

---

# PROJECT 10

Realtime Analytics Engine

Difficulty

Advanced

Estimated Time

35 Hours

---

## Features

Live Dashboard

Metrics

Aggregation

Filters

Charts

Alerts

Time Series

Export

---

## Tech

Kafka

Redis

PostgreSQL

Spring Boot

Angular

---

## Concepts

Streaming

Aggregation

Window Processing

Caching

Scaling

---

# Resume Mapping

Every completed project should demonstrate:

REST API

Database Design

Authentication

Validation

Exception Handling

Testing

Docker

Deployment

Caching

Messaging

Documentation

Monitoring

Logging

---

# GitHub Standards

README

Architecture Diagram

ER Diagram

API Documentation

Docker Compose

Postman Collection

Deployment Guide

Screenshots

Sample Data

License

---

# Folder Structure

controller

service

repository

entity

dto

mapper

config

exception

security

util

test

resources

---

# Project Deliverables

Working Source Code

Docker Support

Swagger

Unit Tests

Integration Tests

README

Architecture Diagram

Database Diagram

API Collection

Deployment Guide

Resume Points

---

# Production Enhancements

Redis

Kafka

Circuit Breaker

Rate Limiter

Caching

Metrics

Prometheus

Grafana

Tracing

Health Checks

Feature Flags

Audit Logging

---

# Interview Mapping

Each project should prepare the learner for:

Java Interview

Spring Boot Interview

SQL Interview

System Design Interview

Behavioral Round

Low Level Design

High Level Design

Production Debugging

---

# Final Goal

By completing all ten projects, the learner should possess a portfolio equivalent to 3–5 years of practical backend engineering experience.

The projects should collectively demonstrate the ability to design, build, deploy, monitor, and scale enterprise-grade backend systems using modern Java technologies.
