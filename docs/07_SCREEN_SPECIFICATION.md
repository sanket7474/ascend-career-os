# ASCEND

# 07_SCREEN_SPECIFICATION.md

Version: 1.0

---

# Purpose

This document defines every screen in ASCEND.

Each screen should have:

* Clear objective
* UI layout
* Components
* User actions
* Data sources
* Navigation
* Empty states
* Loading states
* Future enhancements

---

# SCREEN 1

# Dashboard

## Purpose

Provide a complete overview of career progress.

The dashboard should answer:

* What should I do today?
* How am I progressing?
* What is my next milestone?

---

## Layout

12-column CSS Grid

Hero

12 columns

Statistics

3

3

3

3

Tasks

6

Progress

6

Finance

6

Quick Links

6

Charts

12

Recent Activity

12

---

## Components

Hero Banner

Statistics Grid

Today's Tasks

Learning Progress

Finance Summary

Quick Links

Study Heatmap

Recent Activity

Weekly Progress

---

## Primary Actions

Complete Task

Add Task

Open Java

Open Planner

Open Project

Open Finance

---

## Empty State

Welcome to ASCEND

Create your first goal

---

## Loading State

Skeleton cards

---

---

# SCREEN 2

# Planner

Purpose

Plan the day.

---

Sections

Today's Schedule

Tasks

Timeline

Habits

Reflection

Weekly Goals

Monthly Goals

Calendar

---

Actions

Create Task

Complete Task

Move Task

Delete Task

Archive

---

Future

Drag and Drop

Recurring Tasks

Calendar Sync

Google Calendar

---

---

# SCREEN 3

# Java Learning

Purpose

Master Java.

---

Layout

Sidebar

Topics

Content

Notes

Progress

Resources

Interview

Quiz

---

Tree

Core Java

Collections

Generics

Streams

Concurrency

JVM

GC

Reflection

Serialization

CompletableFuture

Memory

ClassLoader

---

Actions

Mark Complete

Bookmark

Open Notes

Open Quiz

Start Project

---

---

# SCREEN 4

# Spring Boot

Tree Navigation

REST

Validation

Security

JPA

Transactions

Redis

Kafka

Docker

Swagger

Monitoring

Deployment

Projects

Interview

---

Actions

Complete

Bookmark

Open Project

Take Quiz

---

---

# SCREEN 5

# DSA

Sidebar

Patterns

Problems

Progress

Revision

Notes

Bookmarks

---

Patterns

Arrays

Strings

HashMap

Sliding Window

Binary Search

Tree

Graph

Heap

Trie

DP

Backtracking

---

Actions

Mark Solved

Add Note

Bookmark

Revision

---

---

# SCREEN 6

# SQL

Topics

Joins

Indexes

Window Functions

CTE

Optimization

Transactions

Deadlocks

Execution Plan

Interview

---

---

# SCREEN 7

# System Design

Theory

Diagram

Example

Quiz

Interview

Project

Progress

---

Topics

Caching

Redis

Kafka

Load Balancer

Rate Limiter

Sharding

Replication

Partitioning

API Gateway

Saga

CQRS

Circuit Breaker

Bloom Filter

---

---

# SCREEN 8

# Projects

Card Grid

Project Details

Architecture

Progress

Tasks

Deployment

Resume Points

---

Projects

Expense Tracker

Bank Ledger

Payment Gateway

UPI Clone

URL Shortener

Notification Service

Chat Application

Ecommerce

---

---

# SCREEN 9

# Finance

Cards

Charts

Goals

History

Forecast

Investments

Travel

Retirement

Net Worth

---

Actions

Add Income

Add Expense

Update Salary

Add Investment

Export

---

---

# SCREEN 10

# Interview

Dashboard

Java

Spring

SQL

DSA

System Design

Behavior

Companies

Applications

Mock Scores

Calendar

Offers

---

Actions

Schedule

Review

Mark Complete

Add Feedback

---

---

# SCREEN 11

# Analytics

Study Heatmap

Weekly Hours

Monthly Hours

GitHub

Leetcode

Books

Projects

Radar Chart

Skill Matrix

Salary Trend

Savings Trend

Consistency

---

---

# SCREEN 12

# Notes

Markdown

Code Blocks

Search

Tags

Archive

Pin

Export

Import

Recent

---

Actions

Create

Edit

Delete

Pin

Share

---

---

# SCREEN 13

# Profile

Avatar

Name

Company

Experience

Salary

Target

GitHub

LinkedIn

Resume

Skills

Travel Goals

Financial Goals

---

---

# SCREEN 14

# Settings

Theme

Language

Notifications

Backup

Import

Export

Reset

Privacy

About

---

---

# SCREEN 15

# AI Coach (Future)

Daily Review

Weekly Review

Monthly Review

Skill Analysis

Career Advice

Mock Interview

Project Suggestions

Learning Suggestions

Salary Estimation

Question Generator

---

# Navigation Rules

Sidebar on Desktop

Collapsed Sidebar on Tablet

Bottom Navigation on Mobile

Keyboard Shortcut

Ctrl + K

Global Search

Every screen reachable within two clicks.

---

# Breadcrumbs

Dashboard

>

Java

>

Collections

>

HashMap

Navigation should always show hierarchy.

---

# Empty States

Every page should provide:

Illustration

Title

Subtitle

Primary Action

Secondary Action

Example

"No projects yet."

Create your first project.

---

# Loading States

Skeleton

Shimmer

Fade

Never show blank white screens.

---

# Error States

Friendly

Retry Button

Details

Support Link

Never expose stack traces.

---

# Success Messages

Task Completed

Project Saved

Progress Updated

Finance Updated

Settings Saved

Use toast notifications.

---

# Modal Guidelines

Centered

Blur Background

Escape closes

Enter confirms

Mobile friendly

---

# UX Rule

Every screen must answer:

"What is the next action the user should take?"

If the answer is unclear,

the screen needs redesign.

---

# Final Goal

The user should be able to open ASCEND every morning and know exactly:

* What to learn
* What to build
* What to revise
* How close they are to their salary goal
* Whether they are improving

ASCEND should become the user's engineering headquarters.
