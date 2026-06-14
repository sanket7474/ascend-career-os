# ASCEND

# 50_DEV_ENV_SETUP.md

Version: 1.0

---

# Purpose

This document defines the complete development environment setup for the ASCEND platform.

The objective is to ensure that any developer can clone the repository and start developing within minutes with a consistent environment.

Development should be reproducible across Windows, macOS, and Linux.

---

# Development Philosophy

Clone

↓

Setup

↓

Run

↓

Code

↓

Test

↓

Commit

↓

Repeat

Environment setup should never become a blocker.

---

# Minimum Requirements

RAM

16 GB

Recommended

32 GB

---

CPU

4 Cores

Recommended

8 Cores

---

Disk

20 GB Free

Recommended

50 GB SSD

---

Internet

Required

---

# Operating Systems

Windows 11

Windows 10

Ubuntu 22+

macOS

WSL2 Supported

---

# Required Software

Java 21

Node.js 22+

Angular CLI

Docker Desktop

Git

VS Code

Postman

DBeaver

---

# Optional Tools

IntelliJ IDEA Ultimate

WebStorm

DataGrip

Redis Insight

PgAdmin

Lens

---

# Java Setup

Version

21

Verify

```bash id="java1"
java -version
```

Expected

Java 21

---

# Maven Setup

Verify

```bash id="mvn1"
mvn -version
```

Use Maven Wrapper whenever possible.

---

# Node Setup

Version

22+

Verify

```bash id="node1"
node -v
```

---

# NPM Setup

Verify

```bash id="npm1"
npm -v
```

---

# Angular CLI

Install

```bash id="ng1"
npm install -g @angular/cli
```

Verify

```bash id="ng2"
ng version
```

---

# Docker

Install

Docker Desktop

Verify

```bash id="docker1"
docker version
```

---

Docker Compose

```bash id="docker2"
docker compose version
```

---

# Git

Verify

```bash id="git1"
git --version
```

Configure

```bash id="git2"
git config --global user.name

git config --global user.email
```

---

# Clone Repository

```bash id="clone1"
git clone https://github.com/<username>/ascend.git

cd ascend
```

---

# Project Structure

```text id="project1"
ascend/

frontend/

backend/

database/

docker/

docs/

scripts/

README.md
```

---

# Backend Setup

Navigate

```bash id="backend1"
cd backend
```

Install

```bash id="backend2"
mvn clean install
```

Run

```bash id="backend3"
mvn spring-boot:run
```

Default Port

8080

---

# Frontend Setup

Navigate

```bash id="front1"
cd frontend
```

Install

```bash id="front2"
npm install
```

Run

```bash id="front3"
ng serve
```

Default Port

4200

---

# Docker Setup

Run Entire Stack

```bash id="compose1"
docker compose up
```

Detached

```bash id="compose2"
docker compose up -d
```

Shutdown

```bash id="compose3"
docker compose down
```

---

# Docker Services

Angular

Spring Boot

PostgreSQL

Redis

Kafka (Future)

PgAdmin

Prometheus

Grafana

---

# Environment Variables

Backend

```text id="env1"
DB_URL

DB_USER

DB_PASSWORD

JWT_SECRET

REDIS_HOST

REDIS_PORT

SPRING_PROFILE
```

---

Frontend

```text id="env2"
API_BASE_URL

VERSION

ENVIRONMENT
```

---

Never commit .env files.

---

# Database

Create

ascend_db

Run Flyway

Automatically

---

Default Port

5432

---

# Redis

Port

6379

Verify

```bash id="redis1"
redis-cli ping
```

Expected

PONG

---

# Swagger

Available At

```text id="swagger1"
http://localhost:8080/swagger-ui
```

---

# Actuator

```text id="actuator1"
http://localhost:8080/actuator
```

---

# Angular Development

Use

Standalone Components

Signals

OnPush

Shared Components

SCSS

Angular Material

---

# Spring Development

Use

DTO

Mapper

Service

Repository

Validation

Security

Global Exception

---

# IDE Extensions

VS Code

Angular Language Service

Spring Boot Extension

Java Extension Pack

ESLint

Prettier

Docker

GitLens

Markdown All In One

---

# IntelliJ Plugins

Lombok

MapStruct

Docker

Database Tools

GitToolBox

SonarLint

---

# Code Formatting

Frontend

Prettier

---

Backend

Google Java Format

---

Never commit unformatted code.

---

# Testing

Backend

```bash id="test1"
mvn test
```

Frontend

```bash id="test2"
ng test
```

---

# Build

Backend

```bash id="build1"
mvn clean package
```

Frontend

```bash id="build2"
ng build
```

---

# Production Build

Angular

```bash id="prod1"
ng build --configuration production
```

---

Spring

```bash id="prod2"
mvn clean package -Pprod
```

---

# Troubleshooting

Port Busy

Kill Process

Restart

---

Database Failure

Verify PostgreSQL

Restart Docker

---

Redis Failure

Restart Redis

Clear Cache

---

Angular Build Error

Delete

node_modules

Reinstall

---

Maven Failure

Clean

Rebuild

Update Dependencies

---

# Health Verification

Backend

200 OK

Frontend

Loads

Database

Connected

Redis

Connected

Swagger

Available

Actuator

Healthy

---

# Developer Workflow

Pull

↓

Build

↓

Run

↓

Develop

↓

Test

↓

Commit

↓

Push

↓

PR

---

# Git Hooks

Future

Pre Commit

Formatting

Lint

Tests

Secret Scan

---

# Recommended Hardware

CPU

8 Core

RAM

32 GB

SSD

512 GB

Dual Monitor

Recommended

---

# Future Improvements

Dev Container

GitHub Codespaces

Remote Development

WSL Optimized Setup

Kubernetes Local Cluster

Tilt

Skaffold

---

# Engineering Principles

One Command Setup

Reproducible Environment

Zero Manual Configuration

Consistent Tool Versions

Fast Local Development

---

# Final Goal

Every new developer should be able to clone ASCEND, install dependencies, start all services, and begin development in less than 15 minutes with a predictable and fully reproducible local environment.

The setup process should be automated, documented, and platform-independent to maximize productivity and minimize onboarding friction.
