# ASCEND

# 57_UI_WIREFRAMES.md

Version: 1.0

---

# Purpose

This document defines the UI layout, navigation structure, component hierarchy, and screen wireframes for the ASCEND platform.

The objective is to provide a complete frontend blueprint before implementation.

Every screen should be consistent, responsive, accessible, and built using Angular Material with a modern dashboard aesthetic.

---

# Design Philosophy

Simple

↓

Minimal

↓

Fast

↓

Beautiful

↓

Data Driven

↓

Responsive

The interface should feel like a professional SaaS application rather than a traditional CRUD application.

---

# Layout Structure

```text
+----------------------------------------------------------+

LOGO

Search

Notifications

Profile

+----------------------+-----------------------------------+

Sidebar

Main Content

|

|

|

|

|

|

|

|

+----------------------+-----------------------------------+

Status Bar

```

---

# Sidebar Navigation

```text
ASCEND

━━━━━━━━━━━━━━

🏠 Dashboard

📚 Learning

📅 Planner

💼 Career

💻 Projects

🎯 Interview

💰 Finance

📈 Analytics

📝 Notes

🏆 Achievements

⚙ Settings

━━━━━━━━━━━━━━
```

Sidebar collapses automatically on tablets and mobile.

---

# Dashboard

```text
+------------------------------------------------------+

Career Score

Learning

Finance

Habit

+------------------------------------------------------+

Today's Tasks

Study Hours

Streak

Projects

+------------------------------------------------------+

Skill Radar

Career Progress

+------------------------------------------------------+

Study Heatmap

+------------------------------------------------------+

Recent Activity

Recommendations

+------------------------------------------------------+
```

---

# Learning Screen

```text
+------------------------------------------------------+

Search

Filter

Sort

+------------------------------------------------------+

Java

82%

Spring

63%

Redis

22%

AWS

40%

+------------------------------------------------------+

Topics

Quiz

Revision

Bookmarks

Notes

+------------------------------------------------------+
```

---

# Planner Screen

```text
+------------------------------------------------------+

Calendar

Today's Plan

+------------------------------------------------------+

09:00 Java

10:00 DSA

11:00 Project

12:00 Break

+------------------------------------------------------+

Weekly Goals

Progress

+------------------------------------------------------+
```

---

# Career Screen

```text
+------------------------------------------------------+

Career Score

72

+------------------------------------------------------+

Skill Matrix

Radar Chart

+------------------------------------------------------+

Promotion Readiness

Salary Estimate

+------------------------------------------------------+

Recommendations

Milestones

+------------------------------------------------------+
```

---

# Project Tracker

```text
+------------------------------------------------------+

Projects

8

In Progress

2

Completed

6

+------------------------------------------------------+

Expense Tracker

78%

URL Shortener

30%

+------------------------------------------------------+

Tasks

Architecture

Deployment

README

+------------------------------------------------------+
```

---

# Interview Tracker

```text
+------------------------------------------------------+

Readiness

74%

+------------------------------------------------------+

Java

Spring

SQL

DSA

System Design

+------------------------------------------------------+

Today's Revision

Mock Interview

Applications

+------------------------------------------------------+
```

---

# Finance Screen

```text
+------------------------------------------------------+

Income

Expense

Savings

Net Worth

+------------------------------------------------------+

Net Worth Chart

+------------------------------------------------------+

Goals

Travel

Home

Car

Emergency Fund

+------------------------------------------------------+

Recent Transactions

+------------------------------------------------------+
```

---

# Analytics Screen

```text
+------------------------------------------------------+

Career Trend

Study Trend

Finance Trend

+------------------------------------------------------+

Radar

Heatmap

Timeline

+------------------------------------------------------+

Projects

Habits

Learning

Interview

+------------------------------------------------------+
```

---

# Notes Screen

```text
+------------------------------------------------------+

Search Notes

+------------------------------------------------------+

Tags

Bookmarks

Pinned

+------------------------------------------------------+

Markdown Editor

+------------------------------------------------------+

Preview

+------------------------------------------------------+
```

---

# Achievements Screen

```text
+------------------------------------------------------+

Career Milestones

+------------------------------------------------------+

🏆 Java Master

🏆 100 DSA

🏆 Docker Explorer

🏆 Backend Builder

+------------------------------------------------------+

Progress Timeline

+------------------------------------------------------+
```

---

# Settings Screen

```text
+------------------------------------------------------+

Profile

Theme

Notifications

Security

Export

About

+------------------------------------------------------+

Preferences

Account

Backup

+------------------------------------------------------+
```

---

# Mobile Layout

```text
Top App Bar

↓

Current Screen

↓

Cards

↓

Floating Action Button

↓

Bottom Navigation
```

Bottom Navigation

Dashboard

Learning

Planner

Projects

Profile

---

# Tablet Layout

Sidebar

Collapsed

Two Column Dashboard

Adaptive Cards

Responsive Charts

---

# Responsive Breakpoints

Mobile

< 768 px

Tablet

768 - 1024 px

Desktop

1024+ px

Large

1440+ px

---

# Color Palette

Primary

Deep Blue

Secondary

Purple

Success

Green

Warning

Orange

Danger

Red

Background

Dark Gray

Surface

Light Gray

---

# Typography

Heading

32 px

Section

24 px

Card

18 px

Body

16 px

Caption

14 px

---

# Component Library

Button

Card

Dialog

Table

Chart

Stepper

Progress Bar

Heatmap

Calendar

Timeline

Chip

Avatar

Badge

Snackbar

Toolbar

Navigation Rail

---

# Dashboard Widgets

Career Score

Learning Progress

Finance Summary

Today's Plan

Study Heatmap

Skill Radar

Recent Activity

Recommendations

---

# UX Principles

One Click Navigation

Minimal Scrolling

Clear Hierarchy

Consistent Spacing

Accessible Colors

Keyboard Friendly

Responsive Design

Fast Rendering

---

# Future UI

Glassmorphism

Micro Animations

Theme Builder

Custom Widgets

Resizable Dashboard

Drag & Drop Layout

Desktop Widgets

Workspace Mode

---

# Final Goal

The ASCEND interface should provide a clean, modern, and highly productive experience that enables software engineers to manage their learning, projects, finances, career progression, and personal growth from a single unified dashboard.

Every screen should prioritize clarity, speed, and actionable insights while maintaining a professional enterprise-grade appearance.
