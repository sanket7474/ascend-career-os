# ASCEND

# 20_DATABASE_DESIGNS.md

Version: 1.0

---

# Purpose

This document defines the database design standards for all ASCEND projects.

The objective is not simply to create tables.

The objective is to design scalable, maintainable, normalized, and production-ready relational databases suitable for enterprise backend systems.

Every schema should support:

* High Availability
* Data Integrity
* Performance
* Scalability
* Auditability
* Maintainability

---

# Database Design Principles

Normalize first.

Denormalize only when performance demands it.

Every table should have:

* Primary Key
* Audit Fields
* Index Strategy
* Constraints
* Foreign Keys
* Soft Delete (where applicable)

Never duplicate business data unnecessarily.

---

# Naming Convention

Tables

snake_case

Examples

users

expense_category

payment_transaction

audit_log

notification_template

---

Columns

snake_case

Examples

created_at

updated_at

deleted_at

user_id

order_status

---

Primary Key

id

BIGSERIAL

UUID (future)

---

Audit Fields

created_at

updated_at

created_by

updated_by

version

deleted

---

# Standard User Table

```sql
users

id

name

email

password

phone

status

role

created_at

updated_at

deleted
```

Indexes

email

phone

role

---

# Authentication Schema

users

roles

permissions

user_role

refresh_token

login_history

failed_login

---

Relationships

User

↓

Role

↓

Permission

---

# Expense Tracker Schema

users

↓

expense

↓

category

↓

budget

↓

monthly_summary

---

## expense

id

user_id

category_id

amount

description

expense_date

payment_mode

created_at

updated_at

---

Indexes

user_id

expense_date

category_id

---

## category

id

name

icon

color

created_at

---

## budget

id

user_id

category_id

limit_amount

month

year

---

# Bank Ledger Schema

customer

account

ledger

transaction

statement

audit

beneficiary

---

## account

id

customer_id

account_number

balance

status

created_at

---

## ledger

id

account_id

type

amount

reference

balance_after

created_at

---

Indexes

account_id

created_at

reference

---

# Payment Gateway Schema

merchant

payment

refund

webhook

settlement

payment_log

retry

---

## payment

id

merchant_id

reference

amount

currency

status

method

created_at

---

Indexes

reference

merchant_id

status

---

# Inventory Schema

product

stock

warehouse

supplier

purchase_order

inventory_log

stock_adjustment

---

## product

id

name

sku

price

status

created_at

---

Indexes

sku

status

---

# Notification Schema

notification

template

delivery_log

retry_queue

subscriber

preference

---

# URL Shortener Schema

short_url

click_log

analytics

custom_domain

rate_limit

---

## short_url

id

original_url

short_code

expiry

user_id

click_count

created_at

---

Indexes

short_code

expiry

user_id

---

# Chat Application Schema

room

participant

message

attachment

read_receipt

typing_status

presence

---

## message

id

room_id

sender_id

message

type

created_at

---

Indexes

room_id

sender_id

created_at

---

# Order Management Schema

customer

order

order_item

shipment

invoice

payment

status_history

---

## order

id

customer_id

status

total

created_at

updated_at

---

Indexes

customer_id

status

created_at

---

# Analytics Schema

event

metric

daily_summary

monthly_summary

dashboard_cache

user_activity

---

# Audit Schema

audit_log

id

entity

entity_id

action

before_data

after_data

user_id

created_at

---

Indexes

entity

entity_id

created_at

---

# Soft Delete Strategy

Use

deleted

BOOLEAN

or

deleted_at

TIMESTAMP

Never physically delete critical business data.

---

# Versioning Strategy

version

BIGINT

Used for optimistic locking.

---

# Indexing Guidelines

Primary Key

Unique Index

Composite Index

Covering Index

Partial Index

Expression Index

Avoid unnecessary indexes.

Monitor usage.

---

# Partitioning Strategy

Use for:

audit_log

payment

ledger

analytics

notification

Partition by:

Month

Year

Tenant

---

# Foreign Key Strategy

Always enforce relationships unless performance requires otherwise.

Avoid orphan records.

Use cascading carefully.

---

# Transaction Design

Use ACID for:

Payments

Transfers

Orders

Inventory

Ledger

Avoid long-running transactions.

---

# Normalization Strategy

1NF

↓

2NF

↓

3NF

↓

BCNF

Denormalize only for reporting.

---

# Caching Strategy

Cache:

Products

Users

Configuration

Reference Data

Leaderboard

Use Redis.

Never cache frequently changing financial balances.

---

# Multi-Tenant Strategy (Future)

tenant_id

Added to every business table.

Composite Index

tenant_id + id

---

# Backup Strategy

Daily Backup

Point In Time Recovery

Snapshots

Replication

Offsite Backup

---

# Migration Strategy

Flyway

Versioned SQL

Rollback Script

Checksum Validation

Never modify old migrations.

Always create new ones.

---

# Performance Guidelines

Avoid SELECT *

Use Pagination

Use Indexes

Avoid N+1

Batch Updates

Prepared Statements

Connection Pooling

Analyze Execution Plans

---

# Security Guidelines

Encrypt Passwords

Hash Sensitive Data

Never Store CVV

Encrypt Secrets

Use Least Privilege

Parameterized Queries

Audit Sensitive Access

---

# Production Checklist

Indexes

Constraints

FK

Unique Keys

Audit

Soft Delete

Version

Backup

Migration

Monitoring

Performance Test

---

# Recommended ER Diagrams

Expense Tracker

Bank Ledger

Payment Gateway

Inventory

Notification

Chat

Order System

URL Shortener

Analytics

User Management

---

# Final Goal

Every ASCEND project should have a database design that resembles enterprise-grade production systems.

The schema should prioritize correctness, scalability, maintainability, and performance while remaining easy to understand and evolve as requirements grow.
