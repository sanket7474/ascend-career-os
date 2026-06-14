# ASCEND

# 05_COMPONENT_ARCHITECTURE.md

Version: 1.0

---

# Purpose

This document defines the frontend component architecture of ASCEND.

Every component should be:

* Reusable
* Stateless whenever possible
* Small
* Testable
* Configurable
* Independent

The application should follow a feature-first architecture.

---

# Folder Structure

```
src/

app/

│

├── core/

├── layout/

├── shared/

├── features/

├── services/

├── models/

├── pipes/

├── directives/

├── guards/

├── interceptors/

└── utils/
```

---

# Layout Module

Responsible for application shell.

```
layout/

sidebar/

navbar/

page-container/

footer/

command-palette/

theme-switch/
```

---

# Sidebar

Responsibilities

* Navigation
* Active Route
* Collapse
* Expand
* User Profile
* Version

Should never contain business logic.

Only navigation.

---

# Navbar

Contains

* Search
* Notifications
* Theme
* Profile
* Quick Actions
* Command Palette

Sticky.

Blur background.

---

# Page Container

Provides

* Width
* Padding
* Responsive Layout
* Scroll Handling

Every feature page should be wrapped inside it.

---

# Shared Components

Shared components should never know business logic.

They receive Inputs and emit Outputs.

---

## Stat Card

Inputs

```
title

value

icon

trend

color

subtitle
```

Displays

```
Study Hours

120 Hours

↑ 12%

```

Reusable everywhere.

---

## Progress Card

Inputs

```
title

progress

description

color
```

Displays

```
Java

74%

███████░░░
```

---

## Chart Card

Inputs

```
title

type

data

labels
```

Supports

* Line
* Bar
* Radar
* Area
* Donut

---

## Task Card

Inputs

```
title

completed

priority

category
```

Outputs

```
taskCompleted
```

---

## Goal Card

Displays

```
Current

Target

Progress

Deadline
```

---

## Section Header

Reusable heading component.

```
Title

Subtitle

Action
```

Example

```
Learning Progress

Keep going

View All
```

---

# Dashboard Module

Dashboard owns:

```
dashboard/

dashboard.ts

dashboard.html

dashboard.scss

dashboard.service.ts

dashboard.model.ts
```

Dashboard contains

Hero

Statistics

Tasks

Progress

Finance

Charts

Quick Links

Recent Activity

---

# Hero Component

Contains

Greeting

Motivation

Target Salary

Study Streak

Today's Focus

Progress Ring

---

# Statistics Grid

Contains

Study Hours

Leetcode

GitHub

Projects

Books

Salary Goal

Savings

Interview Readiness

Consistency

Responsive grid.

---

# Tasks Component

Displays

Daily Checklist

Supports

Complete

Delete

Add

Reset Daily

Persistent Storage

---

# Progress Component

Displays

Java

Spring

DSA

System Design

SQL

AWS

Redis

Kafka

Each with

Progress

Percentage

Description

---

# Finance Widget

Displays

Salary

EMI

Savings

Net Worth

Travel Fund

Emergency Fund

Investment

Mini Chart

---

# Quick Links

Buttons

Resume

GitHub

LinkedIn

Portfolio

Notes

Calendar

Planner

---

# Recent Activity

Shows

Recent Study

Recent Commit

Recent Notes

Recent Interview

Recent Book

Recent Project

---

# Planner Components

Planner Page

Calendar

Timeline

Task List

Weekly Goals

Monthly Goals

Reflection

Habits

Progress

---

# Learning Module

Contains

Sidebar

Tree

Content

Notes

Quiz

Progress

Resources

Bookmarks

---

# Tree Component

Reusable tree.

Supports

Expand

Collapse

Search

Progress

Completion

Nested Children

Used by

Java

Spring

DSA

SQL

System Design

AWS

Docker

---

# Topic Page

Contains

Overview

Theory

Code

Examples

Interview

Quiz

Notes

Resources

Project

Progress

---

# Notes Component

Markdown

Autosave

Search

Pin

Archive

Export

Import

Syntax Highlight

---

# Finance Components

Summary Card

Income Chart

Expense Chart

Savings Chart

Goal Card

Net Worth Card

Forecast Card

Investment Card

---

# Interview Components

Question Card

Company Tracker

Mock Score

Revision

Progress

Bookmarks

Calendar

Applications

Offers

---

# Analytics Components

Heatmap

Radar Chart

Bar Chart

Line Chart

Timeline

Pie Chart

Skill Matrix

Consistency Graph

---

# Profile Components

Avatar

Bio

Experience

Company

Goals

Links

Resume

Achievements

---

# Settings Components

Theme

Notifications

Backup

Import

Export

Preferences

Danger Zone

---

# AI Components (Future)

Chat Window

Recommendations

Daily Coach

Weekly Review

Monthly Review

Code Review

Skill Analysis

Interview Coach

Career Coach

---

# Responsive Rules

Desktop

Sidebar Visible

12 Grid

Full Analytics

Tablet

Collapsed Sidebar

2 Columns

Mobile

Bottom Navigation

Single Column

Cards Stack

---

# Animation Rules

Fade

Scale

Slide

Opacity

Duration

200ms

Ease Out

Hover

Lift

Shadow

Border Glow

Never excessive.

---

# Accessibility

Keyboard Support

ARIA Labels

Focus States

Screen Reader

High Contrast

Reduced Motion

---

# Component Rules

No component should exceed 300 lines.

Move logic to services.

Move types to models.

Move constants to config.

Keep HTML clean.

Avoid nested complexity.

Prefer composition over inheritance.

---

# Engineering Principle

A component should do one thing well.

If a component becomes difficult to explain in one sentence,

split it into smaller components.

---

# Final Architecture Goal

The component tree should remain understandable after years of development.

A new contributor should understand the project within 30 minutes.

Simplicity scales.

Complexity does not.
