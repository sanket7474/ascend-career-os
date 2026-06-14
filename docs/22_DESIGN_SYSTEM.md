# ASCEND

# 22_DESIGN_SYSTEM.md

Version: 1.0

---

# Purpose

This document defines the complete design system for ASCEND.

The design system should ensure that every screen, component, animation, color, spacing rule, typography style, and interaction follows a single unified language.

The objective is consistency.

Users should feel like they are interacting with one cohesive product rather than multiple pages stitched together.

---

# Design Philosophy

ASCEND should feel like a premium SaaS product.

Inspired by:

* Linear
* Vercel
* Notion
* Stripe
* GitHub
* Raycast
* Apple Human Interface Guidelines

Characteristics:

Minimal

Elegant

Professional

Calm

Focused

Modern

Fast

---

# Visual Identity

Keywords

Focus

Clarity

Depth

Productivity

Precision

Engineering

Growth

Discipline

Learning

Progress

---

# Theme Strategy

Dark First

Light Theme Optional

System Theme Supported

Persistent Theme Selection

Automatic Theme Detection

---

# Color Palette

## Primary Background

```css
#020617
```

Used for:

App Background

Main Layout

Drawer Background

---

## Surface

```css
#0F172A
```

Used for:

Cards

Dialogs

Panels

Containers

---

## Elevated Surface

```css
#111827
```

Used for:

Hover Cards

Dropdowns

Floating Panels

Command Palette

---

## Border

```css
#334155
```

Used for:

Cards

Inputs

Dividers

Tables

---

## Primary Brand

```css
#3B82F6
```

Buttons

Links

Progress

Charts

Active State

---

## Success

```css
#22C55E
```

Completed Tasks

Healthy Systems

Success Toast

Positive Trends

---

## Warning

```css
#F59E0B
```

Budget Alerts

Warnings

Pending State

---

## Error

```css
#EF4444
```

Validation

Delete

Danger

Critical Alerts

---

## Purple Accent

```css
#8B5CF6
```

AI Features

Highlights

Future Modules

---

# Typography

Primary Font

Inter

Fallback

Segoe UI

Roboto

Arial

Sans Serif

---

# Font Scale

Display

56px

Bold

---

H1

48px

Bold

---

H2

36px

SemiBold

---

H3

28px

SemiBold

---

H4

22px

Medium

---

Body

16px

Regular

---

Small

14px

Regular

---

Caption

12px

Medium

---

# Spacing System

4

8

12

16

20

24

32

40

48

64

96

128

Use 8px Grid.

Never use arbitrary spacing.

---

# Border Radius

Small

8px

Medium

12px

Large

16px

Hero Cards

24px

Pill

999px

---

# Shadows

Small

0 2px 8px rgba(0,0,0,.15)

Medium

0 8px 24px rgba(0,0,0,.20)

Large

0 12px 36px rgba(0,0,0,.28)

---

# Elevation

Level 0

Background

Level 1

Cards

Level 2

Dialogs

Level 3

Floating Panels

Level 4

Command Palette

---

# Grid System

Desktop

12 Columns

Tablet

8 Columns

Mobile

4 Columns

Gap

24px

---

# Responsive Breakpoints

Mobile

0-767

Tablet

768-1023

Laptop

1024-1439

Desktop

1440+

Ultra Wide

1920+

---

# Icons

Angular Material Icons

Outlined

24px

Active

Filled

Hover

Scale 1.05

---

# Buttons

Primary

Filled Blue

---

Secondary

Outlined

---

Ghost

Transparent

---

Danger

Red Filled

---

Icon Button

Circular

Hover Elevation

---

Button Height

40px

Radius

12px

---

# Inputs

Height

44px

Rounded

12px

Floating Label

Yes

Helper Text

Yes

Error State

Red Border

Focus

Blue Glow

---

# Cards

Radius

16px

Padding

24px

Shadow

Medium

Hover

Lift

Scale

1.01

Transition

200ms

---

# Tables

Sticky Header

Hover Row

Rounded Container

Pagination

Sorting

Filtering

Responsive

---

# Charts

Line

Bar

Area

Radar

Donut

Heatmap

Sparkline

Animated Once

No Continuous Animation

---

# Navigation

Sidebar Width

280px

Collapsed

80px

Navbar Height

72px

Bottom Navigation

Mobile Only

---

# Sidebar

Logo

Navigation

Divider

Quick Links

Settings

Profile

Version

---

Active Item

Blue Background

Blue Border

Rounded

---

# Dashboard Layout

Hero

12 Columns

Statistics

3 x 4

Tasks

6

Progress

6

Finance

6

Quick Actions

6

Charts

12

Recent Activity

12

---

# Motion Design

Fade

Slide

Scale

Opacity

Duration

150ms

200ms

300ms

Ease Out

---

# Loading

Skeleton

Pulse

Shimmer

Progress Bar

Never Blank Screen

---

# Empty States

Illustration

Title

Subtitle

Action Button

Documentation Link

---

# Toast Notifications

Top Right

4 Seconds

Success

Warning

Error

Info

Stack Limit

3

---

# Dialogs

Centered

Blur Background

ESC Close

Enter Confirm

Accessible

Mobile Friendly

---

# Accessibility

Keyboard Navigation

ARIA Labels

High Contrast

Reduced Motion

Screen Reader Support

Visible Focus

Color Safe

---

# Dark Theme Rules

Dark should never feel black.

Use blue-gray surfaces.

Maintain depth using elevation instead of brightness.

---

# Animation Principles

Motion should communicate state.

Never animate for decoration alone.

Animations should feel invisible.

---

# UX Principles

Every page should answer:

What should I do?

What changed?

What is my next action?

How close am I to my goal?

---

# ASCEND Experience

Opening ASCEND should feel like opening a mission control dashboard for your engineering career.

Every interaction should reinforce:

Progress

Consistency

Discipline

Growth

Confidence

---

# Final Goal

The ASCEND Design System should ensure that every new screen added in the future automatically feels like part of the same premium product.

Consistency should become a feature, not an afterthought.
