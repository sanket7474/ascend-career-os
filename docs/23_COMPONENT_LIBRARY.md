# ASCEND

# 23_COMPONENT_LIBRARY.md

Version: 1.0

---

# Purpose

This document defines the complete reusable component library for ASCEND.

The objective is to ensure that every UI element is built once and reused everywhere.

No page should create custom implementations of buttons, cards, dialogs, progress bars, or forms.

Consistency is mandatory.

---

# Component Philosophy

Every component should be:

Reusable

Configurable

Accessible

Responsive

Theme Aware

Strongly Typed

Stateless whenever possible

Independent

Testable

---

# Component Hierarchy

Application

↓

Layout

↓

Feature

↓

Section

↓

Card

↓

Widget

↓

Atomic Component

---

# Folder Structure

```text
shared/

components/

button/

card/

stat-card/

progress-card/

goal-card/

chart-card/

empty-state/

loader/

skeleton/

avatar/

badge/

tag/

timeline/

dialog/

toast/

modal/

search-box/

command-palette/

data-table/

stepper/

chip/

accordion/

tabs/

```

---

# Button Component

Selector

app-button

---

Inputs

variant

size

disabled

loading

icon

fullWidth

color

---

Variants

Primary

Secondary

Ghost

Danger

Success

Outline

Text

---

Sizes

Small

Medium

Large

---

Outputs

clicked

---

States

Default

Hover

Focus

Pressed

Disabled

Loading

---

# Icon Button

Selector

app-icon-button

---

Supports

Tooltip

Badge

Loading

Disabled

ARIA Label

Keyboard

---

# Card Component

Selector

app-card

---

Supports

Header

Body

Footer

Actions

Elevation

Border

Padding

Radius

Hover

---

Used By

Dashboard

Planner

Finance

Analytics

Learning

Projects

Interview

---

# Stat Card

Selector

app-stat-card

---

Inputs

title

value

subtitle

icon

trend

percentage

color

loading

---

Example

Study Hours

120

+12%

---

# Progress Card

Selector

app-progress-card

---

Inputs

title

progress

description

color

target

completed

---

Displays

Animated Progress

Percentage

Remaining

---

# Goal Card

Selector

app-goal-card

---

Displays

Current

Target

Deadline

Progress

Milestone

Completion

---

# Finance Card

Selector

app-finance-card

---

Displays

Salary

Savings

EMI

Travel Fund

Investment

Net Worth

Forecast

---

# Chart Card

Selector

app-chart-card

---

Supports

Line

Bar

Area

Donut

Radar

Heatmap

Sparkline

---

Inputs

title

chartType

data

labels

legend

height

---

# Avatar Component

Selector

app-avatar

---

Supports

Image

Initial

Online Status

Size

Border

Badge

---

# Badge Component

Selector

app-badge

---

Types

Success

Warning

Error

Info

Neutral

Primary

---

# Tag Component

Selector

app-tag

---

Supports

Clickable

Removable

Colored

Icon

Rounded

---

# Search Box

Selector

app-search

---

Features

Debounce

Clear

Autocomplete

History

Keyboard Navigation

Recent Search

---

# Empty State

Selector

app-empty-state

---

Displays

Illustration

Title

Description

Primary Action

Secondary Action

Documentation Link

---

# Skeleton Loader

Selector

app-skeleton

---

Types

Text

Card

Avatar

List

Table

Chart

Custom

---

# Spinner

Selector

app-loader

---

Sizes

Small

Medium

Large

Fullscreen

Inline

---

# Data Table

Selector

app-table

---

Features

Sorting

Pagination

Filtering

Sticky Header

Column Resize

Search

Selection

Export

Responsive

---

# Accordion

Selector

app-accordion

---

Supports

Expand

Collapse

Multiple

Nested

Animation

---

# Tabs

Selector

app-tabs

---

Supports

Horizontal

Vertical

Icons

Badges

Lazy Loading

---

# Timeline

Selector

app-timeline

---

Used For

Study History

Project Timeline

Career Timeline

Finance Timeline

Interview Timeline

---

# Stepper

Selector

app-stepper

---

Used For

Learning Path

Project Progress

Onboarding

Checkout

Career Roadmap

---

# Toast Component

Selector

app-toast

---

Types

Success

Warning

Error

Info

---

Position

Top Right

Duration

4 Seconds

Queue

3 Max

---

# Dialog Component

Selector

app-dialog

---

Supports

Confirmation

Alert

Custom

Form

Delete

Warning

---

# Modal

Selector

app-modal

---

Features

Backdrop

Blur

ESC Close

Responsive

Animation

Scrollable

---

# Command Palette

Selector

app-command-palette

---

Shortcut

Ctrl + K

---

Supports

Navigation

Search

Commands

Quick Open

History

AI Commands

---

# Breadcrumb

Selector

app-breadcrumb

---

Supports

Icons

Links

Current Page

Nested Levels

---

# Sidebar Navigation

Selector

app-sidebar

---

Supports

Collapse

Expand

Nested Menu

Badges

Icons

Profile

Settings

Version

---

# Navbar

Selector

app-navbar

---

Contains

Search

Notifications

Theme

Profile

Quick Add

Command Palette

---

# Notification Bell

Selector

app-notification

---

Unread Count

Dropdown

History

Actions

Mark Read

---

# Theme Switch

Selector

app-theme-switch

---

Dark

Light

System

Persistent

---

# KPI Widget

Selector

app-kpi

---

Displays

Metric

Trend

Target

Difference

Forecast

---

# Heatmap

Selector

app-heatmap

---

Used For

Study Hours

GitHub Style Activity

Consistency

Learning

---

# Skill Radar

Selector

app-skill-radar

---

Displays

Java

Spring

DSA

SQL

System Design

AWS

Docker

Redis

Kafka

---

# AI Recommendation Card

Selector

app-ai-card

---

Displays

Recommendation

Priority

Reason

Estimated Hours

Start Button

---

# Accessibility

All components must support:

Keyboard Navigation

ARIA Labels

Focus Ring

Screen Reader

Reduced Motion

Color Contrast

---

# Testing Requirements

Every component must include:

Unit Test

Accessibility Test

Visual Test

Input Validation

Responsive Test

---

# Engineering Rules

No business logic inside UI components.

Use Inputs and Outputs.

Use Angular Signals where applicable.

Avoid duplicate implementations.

Every component should be independently reusable across multiple features.

---

# Final Goal

The ASCEND Component Library should enable an entire application to be assembled from reusable building blocks while maintaining a consistent visual language, engineering quality, and user experience across every screen.
