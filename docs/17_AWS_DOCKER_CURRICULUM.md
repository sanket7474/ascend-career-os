# ASCEND

# 17_AWS_DOCKER_CURRICULUM.md

Version: 1.0

---

# Purpose

This document defines the complete AWS and Docker curriculum used by ASCEND.

The objective is not to memorize AWS services or Docker commands.

The objective is to understand how modern backend applications are containerized, deployed, monitored, secured, and scaled in production environments.

This curriculum targets backend engineers preparing for Senior Software Engineer and Platform Engineering roles.

Estimated Duration

2 Months

Estimated Study Time

80 Hours

Recommended Daily Study

45-60 Minutes

---

# Learning Philosophy

Every topic should follow:

Concept

↓

Visualization

↓

Hands-on Implementation

↓

Production Scenario

↓

Failure Analysis

↓

Optimization

↓

Interview Questions

↓

Revision

↓

Mastery

Never learn cloud services in isolation.

Deploy real applications.

---

# Learning Roadmap

Linux Basics

↓

Virtualization

↓

Containers

↓

Docker

↓

Docker Compose

↓

Container Networking

↓

Volumes

↓

Image Optimization

↓

AWS Fundamentals

↓

EC2

↓

IAM

↓

S3

↓

RDS

↓

VPC

↓

Load Balancer

↓

CloudWatch

↓

Lambda

↓

SNS

↓

SQS

↓

Secrets Manager

↓

Deployment

↓

CI/CD

↓

Production Monitoring

---

# MODULE 1

Linux Fundamentals

Estimated Hours

8

Topics

Filesystem

Users

Groups

Permissions

chmod

chown

Processes

ps

top

grep

find

tail

head

systemctl

journalctl

cron

networking

ssh

scp

curl

wget

tar

zip

---

Mini Project

Deploy Java Application on Linux VM

---

Interview

Permissions

Processes

SSH

Cron

Logs

---

# MODULE 2

Docker Fundamentals

Estimated Hours

8

Topics

What is Docker

Containers

Images

Registry

Docker Hub

Lifecycle

Docker CLI

Build

Run

Stop

Remove

Inspect

Logs

Exec

Stats

Prune

---

Mini Project

Run Spring Boot API in Docker

---

# MODULE 3

Dockerfile

Estimated Hours

6

Topics

FROM

COPY

ADD

RUN

CMD

ENTRYPOINT

WORKDIR

EXPOSE

ENV

ARG

LABEL

USER

Multi Stage Build

Layer Caching

Optimization

---

Mini Project

Optimized Spring Boot Image

---

# MODULE 4

Docker Compose

Estimated Hours

5

Topics

Compose File

Services

Networks

Volumes

Environment Variables

Health Checks

Depends On

Scaling

Profiles

---

Mini Project

Spring Boot + PostgreSQL + Redis

---

# MODULE 5

Docker Networking

Estimated Hours

4

Topics

Bridge

Host

Overlay

DNS

Port Mapping

Communication

Network Isolation

Service Discovery

---

Mini Project

Microservice Communication

---

# MODULE 6

Docker Volumes

Estimated Hours

3

Topics

Bind Mount

Named Volume

Anonymous Volume

Persistence

Backup

Restore

---

Mini Project

Persistent PostgreSQL Container

---

# MODULE 7

AWS Fundamentals

Estimated Hours

6

Topics

Regions

Availability Zones

Global Infrastructure

Billing

Pricing

Shared Responsibility

Free Tier

Cloud Concepts

---

Interview

AZ vs Region

IaaS

PaaS

SaaS

---

# MODULE 8

EC2

Estimated Hours

6

Topics

Launch Instance

AMI

Key Pair

Security Group

Elastic IP

Storage

SSH

Scaling

User Data

Auto Recovery

---

Mini Project

Deploy Spring Boot API

---

# MODULE 9

IAM

Estimated Hours

4

Topics

Users

Groups

Roles

Policies

Least Privilege

MFA

Access Keys

Temporary Credentials

---

Mini Project

Secure Deployment User

---

# MODULE 10

S3

Estimated Hours

5

Topics

Bucket

Objects

Lifecycle

Versioning

Encryption

Public Access

Pre Signed URL

Static Hosting

Storage Classes

---

Mini Project

Image Upload Service

---

# MODULE 11

RDS

Estimated Hours

4

Topics

MySQL

PostgreSQL

Backup

Restore

Snapshots

Read Replica

Scaling

Parameter Group

Monitoring

---

Mini Project

Expense Tracker Database

---

# MODULE 12

VPC

Estimated Hours

5

Topics

CIDR

Subnet

Public

Private

Route Table

Internet Gateway

NAT Gateway

Security Group

NACL

---

Mini Project

Secure Backend Network

---

# MODULE 13

Elastic Load Balancer

Estimated Hours

3

Topics

ALB

NLB

Health Check

Routing

SSL

Sticky Session

---

Mini Project

High Availability API

---

# MODULE 14

CloudWatch

Estimated Hours

4

Topics

Metrics

Logs

Dashboards

Alarm

Events

Monitoring

Insights

---

Mini Project

Application Monitoring Dashboard

---

# MODULE 15

Lambda

Estimated Hours

4

Topics

Serverless

Triggers

Timeout

Memory

IAM

Environment Variables

Cold Start

---

Mini Project

Image Resize Service

---

# MODULE 16

SNS & SQS

Estimated Hours

5

Topics

Pub Sub

Queue

FIFO

Standard Queue

Visibility Timeout

Dead Letter Queue

Long Polling

---

Mini Project

Order Notification Pipeline

---

# MODULE 17

Secrets Manager

Estimated Hours

2

Topics

Secrets

Rotation

Encryption

Application Integration

---

Mini Project

Database Credential Management

---

# MODULE 18

CI/CD

Estimated Hours

5

Topics

GitHub Actions

Jenkins

Build

Test

Docker Build

Push

Deploy

Rollback

Environment Variables

---

Mini Project

Automatic Deployment Pipeline

---

# MODULE 19

Production Deployment

Estimated Hours

6

Topics

Nginx

Reverse Proxy

SSL

Domain

Health Check

Blue Green Deployment

Rolling Update

Zero Downtime

Monitoring

Logging

Backup

---

Mini Project

Production Expense Tracker

---

# Production Best Practices

Never store secrets in code

Use IAM Roles

Use Multi Stage Builds

Minimize Image Size

Enable Monitoring

Use Auto Scaling

Enable Backups

Use HTTPS

Use Health Checks

Keep Containers Stateless

---

# Common Mistakes

Using Root User

Large Docker Images

Ignoring Logs

Hardcoded Secrets

Public S3 Buckets

No Monitoring

No Backup

No Health Check

Ignoring Cost Optimization

---

# Interview Preparation

Theory Questions

100+

Scenario Questions

40+

Architecture Questions

25+

Debugging Questions

20+

Hands-on Questions

20+

---

# Recommended Mini Projects

Image Hosting Service

Expense Tracker Deployment

Notification Pipeline

CI/CD Pipeline

Portfolio Deployment

File Storage Service

Containerized Chat Backend

Microservices Demo

Analytics Pipeline

---

# Recommended Books

Docker Deep Dive

AWS Certified Developer Associate

AWS Well Architected Framework

Designing Data Intensive Applications

---

# Progress Tracking

Topics Completed

Labs Completed

Projects Completed

Deployment Count

Revision Count

Interview Confidence

Cloud Cost Understanding

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

Hands-on Lab Completed

Mini Project Deployed

Production Use Case Understood

Interview Questions Solved

Revision Completed

Able to deploy a complete backend independently

---

# Final Goal

At the end of this curriculum, the learner should be able to:

Containerize enterprise applications

Deploy Spring Boot applications to AWS

Manage cloud infrastructure securely

Build CI/CD pipelines

Monitor production systems

Optimize cloud costs

Handle real-world deployment scenarios

Confidently answer AWS and Docker interview questions for senior backend engineering roles.
