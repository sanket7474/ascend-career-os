# ASCEND

# 30_DEPLOYMENT.md

Version: 1.0

---

# Purpose

This document defines the complete deployment architecture for ASCEND.

The objective is not simply to deploy an application.

The objective is to build an automated, scalable, observable, secure deployment pipeline that follows modern DevOps practices used by SaaS and fintech companies.

The deployment process should support:

* Local Development
* QA Environment
* Staging Environment
* Production Environment
* Future Kubernetes Migration

---

# Deployment Philosophy

Build Once

↓

Test Once

↓

Deploy Everywhere

↓

Monitor

↓

Rollback if Needed

Automation over manual deployment.

---

# Environment Strategy

Development

↓

QA

↓

Staging

↓

Production

Each environment should have:

Independent Database

Independent Redis

Independent Kafka

Independent Secrets

Independent Logs

---

# Technology Stack

Backend

Spring Boot

---

Frontend

Angular

NGINX

---

Database

PostgreSQL

---

Cache

Redis

---

Messaging

Kafka

---

Container

Docker

Docker Compose

---

Reverse Proxy

NGINX

---

Monitoring

Prometheus

Grafana

---

Logging

ELK Stack (Future)

---

Cloud

AWS EC2

---

# High Level Architecture

```text id="wjm5ol"
                     Internet

                         │

                         ▼

                  NGINX Reverse Proxy

                  │              │

                  ▼              ▼

          Angular Static     Spring Boot API

                                 │

          ┌──────────────┬───────────────┐

          ▼              ▼               ▼

     PostgreSQL        Redis          Kafka

                                      
                  │

                  ▼

      Prometheus + Grafana
```

---

# Local Development

Run using

Docker Compose

Services

Angular

Spring Boot

PostgreSQL

Redis

Kafka

PgAdmin

---

Command

```bash id="3frp3l"
docker compose up
```

---

# Docker Compose

Services

frontend

backend

postgres

redis

kafka

zookeeper

prometheus

grafana

---

Networks

backend-network

frontend-network

---

Volumes

postgres-data

redis-data

grafana-data

---

# Spring Boot Image

Multi Stage Build

```text id="k06wdd"
Builder

↓

Maven Package

↓

Runtime Image

↓

Java 21 JRE
```

Minimize image size.

---

# Angular Image

Build Angular

↓

Copy dist/

↓

NGINX

↓

Serve Static Assets

---

# NGINX

Responsibilities

SSL

Compression

Caching

Reverse Proxy

Load Balancing

Static Assets

Security Headers

---

Example Routes

```text id="jlwmh3"
/ → Angular

/api → Spring Boot

/swagger → OpenAPI

/actuator → Actuator
```

---

# Environment Variables

Backend

DB_URL

DB_USER

DB_PASSWORD

JWT_SECRET

REDIS_HOST

KAFKA_BOOTSTRAP

OPENAI_KEY

---

Frontend

API_BASE_URL

THEME

VERSION

ENVIRONMENT

---

Never hardcode values.

---

# Secrets Management

Development

.env

---

Production

AWS Secrets Manager

Future

HashiCorp Vault

---

# CI/CD Pipeline

```text id="1v43zb"
Git Push

↓

GitHub Actions

↓

Build

↓

Unit Tests

↓

Integration Tests

↓

Docker Build

↓

Push Docker Image

↓

Deploy Server

↓

Health Check

↓

Notify Success
```

---

# GitHub Actions Workflow

Checkout

Java Setup

Node Setup

Build Angular

Build Spring

Run Tests

Build Docker

Push Registry

SSH Deploy

Verify Health

---

# Deployment Strategy

Current

Rolling Deployment

Future

Blue Green

Canary

Feature Flags

---

# Health Checks

Spring Boot

```text id="f3xdo0"
/actuator/health
```

NGINX

Status Page

Docker

Container Healthcheck

Redis

PING

Kafka

Broker Status

---

# Rollback Strategy

Keep Last 5 Images

↓

Health Failure

↓

Rollback Previous Image

↓

Restart

↓

Notify Team

---

# Monitoring

Application

CPU

Memory

Threads

GC

Requests

Latency

Errors

---

Infrastructure

Disk

RAM

Network

Containers

Processes

---

# Logging

Application Logs

Access Logs

Error Logs

Audit Logs

Deployment Logs

Container Logs

---

Log Format

JSON

Correlation ID

Timestamp

Request ID

User ID

---

# Metrics

Requests/sec

Error Rate

Average Latency

95th Percentile

99th Percentile

Heap Usage

Thread Count

Cache Hit Rate

Kafka Lag

---

# Prometheus

Collect

Spring Metrics

JVM Metrics

Redis Metrics

Kafka Metrics

Docker Metrics

Node Metrics

---

# Grafana Dashboards

Application

Database

Redis

Kafka

Docker

Host

Business Metrics

Learning Progress

Finance

AI Usage

---

# Backup Strategy

Database

Daily

Redis

Every 12 Hours

Files

Daily

Configuration

Git

Secrets

Encrypted Backup

---

# Disaster Recovery

Restore Database

↓

Restore Redis

↓

Restore Files

↓

Deploy Last Stable Build

↓

Verify Health

↓

Resume Traffic

---

# Scaling Strategy

Phase 1

Single EC2

↓

Phase 2

Load Balancer

↓

Multiple Spring Instances

↓

Shared Redis

↓

Shared PostgreSQL

↓

Kafka Cluster

↓

CDN

---

# Security

HTTPS

TLS 1.3

Firewall

Private Database

Private Redis

Private Kafka

IAM

Least Privilege

Secrets Rotation

Audit Logs

---

# Cost Optimization

Stop Unused Resources

Reserved Instances

Compress Images

Optimize Docker Layers

Cache Dependencies

Use S3 for Assets

Monitor Costs

---

# Performance Optimization

Enable GZIP

HTTP2

CDN

Browser Cache

Redis

Database Indexes

Connection Pooling

Async Processing

---

# Production Checklist

HTTPS

JWT

Secrets

Logging

Metrics

Tracing

Health Checks

Monitoring

Backup

Restore Plan

SSL

Compression

Caching

Rate Limiting

Audit Logs

---

# Future Roadmap

Kubernetes

Helm

Terraform

AWS ECS

AWS EKS

CloudFront

CloudWatch

Auto Scaling

Multi Region

Zero Downtime Deployment

---

# Final Goal

ASCEND should be deployable with a single automated pipeline that builds, tests, packages, deploys, monitors, and rolls back the application with minimal human intervention.

The deployment architecture should resemble the DevOps practices used by modern product companies while remaining simple enough to maintain as a solo developer project.
