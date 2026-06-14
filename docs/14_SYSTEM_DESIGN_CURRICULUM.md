# ASCEND

# 14_SYSTEM_DESIGN_CURRICULUM.md

Version: 1.0

---

# Purpose

This document defines the complete System Design curriculum used by ASCEND.

The objective is not to memorize architecture diagrams.

The objective is to understand how large-scale distributed systems are designed, scaled, monitored, and maintained in production.

The curriculum targets backend engineers preparing for Senior Software Engineer and Staff Engineer interviews.

Estimated Duration

4 Months

Estimated Study Time

120 Hours

Recommended Daily Study

45-60 Minutes

---

# Learning Philosophy

Every topic should follow:

Problem

↓

Requirements

↓

Naive Solution

↓

Bottlenecks

↓

Optimized Architecture

↓

Trade-offs

↓

Real World Examples

↓

Interview Questions

↓

Revision

---

# Learning Roadmap

System Basics

↓

Networking

↓

Load Balancing

↓

Caching

↓

Database Scaling

↓

CAP Theorem

↓

Replication

↓

Partitioning

↓

Sharding

↓

Messaging

↓

Event Driven Systems

↓

Microservices

↓

Distributed Transactions

↓

Observability

↓

Case Studies

---

# MODULE 1

System Design Fundamentals

Estimated Hours

8

Topics

Functional Requirements

Non Functional Requirements

Availability

Scalability

Reliability

Latency

Throughput

Fault Tolerance

Consistency

Durability

Trade-offs

Capacity Planning

---

Mini Project

Design Tiny URL Requirements

---

Interview Topics

Scalability

Availability

Latency

---

# MODULE 2

Networking Basics

Estimated Hours

8

Topics

OSI Model

TCP

UDP

HTTP

HTTPS

REST

gRPC

WebSockets

DNS

CDN

TLS

SSL

Connection Pooling

---

Mini Project

Request Lifecycle Visualization

---

# MODULE 3

Load Balancing

Estimated Hours

6

Topics

Round Robin

Least Connections

Weighted

Sticky Sessions

Health Checks

Reverse Proxy

NGINX

HAProxy

Cloud Load Balancers

---

Mini Project

Simple Load Balancer Simulation

---

# MODULE 4

Caching

Estimated Hours

10

Topics

Cache Aside

Read Through

Write Through

Write Back

TTL

Eviction

LRU

LFU

Redis

Cache Invalidation

Distributed Cache

---

Mini Project

Redis Cache Layer

---

Interview Questions

Cache Stampede

Cache Penetration

Cache Avalanche

---

# MODULE 5

Database Design

Estimated Hours

12

Topics

Normalization

Denormalization

Indexes

Composite Index

Partitioning

Sharding

Replication

Read Replica

Write Master

Transactions

Query Optimization

---

Mini Project

Bank Database Design

---

# MODULE 6

CAP Theorem

Estimated Hours

4

Topics

Consistency

Availability

Partition Tolerance

Trade-offs

PACELC

Real Examples

---

Mini Project

Distributed Key Value Store Discussion

---

# MODULE 7

Messaging Systems

Estimated Hours

10

Topics

Kafka

RabbitMQ

ActiveMQ

Producer

Consumer

Partition

Offset

Consumer Group

Ordering

Retry

Dead Letter Queue

---

Mini Project

Notification Service

---

# MODULE 8

Microservices

Estimated Hours

12

Topics

Monolith

Microservice

API Gateway

Discovery

Config Server

Circuit Breaker

Saga

CQRS

Event Sourcing

Bounded Context

Service Communication

---

Mini Project

Order Management Platform

---

# MODULE 9

Distributed Transactions

Estimated Hours

5

Topics

Two Phase Commit

Saga Pattern

Compensation

Outbox Pattern

Idempotency

Exactly Once

---

Mini Project

Payment Workflow

---

# MODULE 10

Observability

Estimated Hours

6

Topics

Logging

Metrics

Tracing

Prometheus

Grafana

ELK

Jaeger

OpenTelemetry

Health Checks

Alerts

---

Mini Project

Monitoring Dashboard

---

# MODULE 11

Security

Estimated Hours

6

Topics

Authentication

Authorization

JWT

OAuth2

API Keys

Encryption

Hashing

Secrets

Rate Limiting

DDOS Protection

---

Mini Project

Secure API Gateway

---

# MODULE 12

Case Studies

Estimated Hours

35

Design

Tiny URL

Instagram

YouTube

WhatsApp

Uber

Netflix

Twitter

Google Drive

Dropbox

Paytm

Amazon Cart

Notification Service

Ride Matching

News Feed

Chat System

Leaderboard

File Storage

Search Engine

URL Shortener

Video Streaming

Payment Gateway

---

# Capacity Estimation

Users

QPS

Storage

Bandwidth

Memory

CPU

Cache Size

Growth Rate

Peak Load

---

# Design Checklist

Requirements

APIs

Database

Cache

Message Queue

Scaling

Monitoring

Security

Failure Recovery

Trade-offs

---

# Interview Framework

Clarify Requirements

Estimate Scale

Design APIs

Choose Database

Add Cache

Add Queue

Handle Scaling

Handle Failure

Discuss Trade-offs

Summarize

---

# Recommended Projects

URL Shortener

Notification Service

Chat Server

File Upload Service

Payment Gateway

Ride Sharing Backend

Video Streaming Backend

Distributed Cache

Analytics Engine

---

# Recommended Books

Designing Data Intensive Applications

System Design Interview Volume 1

System Design Interview Volume 2

Building Microservices

Release It

---

# Progress Tracking

Topics Completed

Case Studies

Architecture Drawings

Interview Score

Notes

Revision Count

Mock Interviews

Weak Areas

Strong Areas

---

# Revision Strategy

Day 1

Day 3

Day 7

Day 15

Day 30

Day 60

Day 90

---

# Mastery Criteria

A topic is mastered only if:

Theory Understood

Architecture Drawn

Trade-offs Explained

Mini Project Completed

Interview Questions Solved

Notes Written

Revision Completed

Able to explain without references

---

# Final Goal

At the end of this curriculum, the learner should be able to:

Design scalable distributed systems

Estimate system capacity

Choose appropriate databases

Use caching effectively

Design event-driven architectures

Explain trade-offs confidently

Handle senior backend system design interviews with confidence

Build production-ready architectures used in modern technology companies.
