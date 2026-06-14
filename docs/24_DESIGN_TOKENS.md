# ASCEND

# 24_DESIGN_TOKENS.md

Version: 1.0

---

# Purpose

This document defines the design tokens used throughout ASCEND.

Design tokens are the single source of truth for:

* Colors
* Typography
* Spacing
* Radius
* Shadows
* Motion
* Borders
* Icons
* Z-Index
* Layout
* Responsive Breakpoints

No component should hardcode these values.

All values should come from a centralized design token system.

---

# Philosophy

Design tokens should allow:

Consistency

↓

Maintainability

↓

Scalability

↓

Theme Switching

↓

Component Reusability

↓

Future Mobile Support

---

# Theme Modes

Dark

Light

System

High Contrast (Future)

---

# Color Tokens

## Background

```scss
--bg-primary: #020617;
--bg-secondary: #0F172A;
--bg-tertiary: #111827;
```

---

## Surface

```scss
--surface-primary: #1E293B;
--surface-hover: #334155;
--surface-active: #475569;
```

---

## Brand

```scss
--brand-primary: #3B82F6;
--brand-secondary: #2563EB;
--brand-light: #60A5FA;
```

---

## Success

```scss
--success: #22C55E;
--success-light: #4ADE80;
```

---

## Warning

```scss
--warning: #F59E0B;
--warning-light: #FBBF24;
```

---

## Error

```scss
--error: #EF4444;
--error-light: #F87171;
```

---

## AI Accent

```scss
--ai-primary: #8B5CF6;
```

---

## Text

```scss
--text-primary: #E2E8F0;
--text-secondary: #94A3B8;
--text-muted: #64748B;
```

---

# Border Tokens

```scss
--border-light: #334155;
--border-medium: #475569;
--border-heavy: #64748B;
```

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

# Font Sizes

```scss
--font-display: 56px;
--font-h1: 48px;
--font-h2: 36px;
--font-h3: 28px;
--font-h4: 22px;
--font-body: 16px;
--font-small: 14px;
--font-caption: 12px;
```

---

# Font Weights

```scss
--fw-light: 300;
--fw-regular: 400;
--fw-medium: 500;
--fw-semibold: 600;
--fw-bold: 700;
```

---

# Line Heights

```scss
--lh-tight: 1.2;
--lh-normal: 1.5;
--lh-loose: 1.8;
```

---

# Spacing Scale

```scss
--space-1: 4px;
--space-2: 8px;
--space-3: 12px;
--space-4: 16px;
--space-5: 20px;
--space-6: 24px;
--space-7: 32px;
--space-8: 40px;
--space-9: 48px;
--space-10: 64px;
--space-11: 96px;
```

Always follow the 8px grid.

---

# Border Radius

```scss
--radius-xs: 4px;
--radius-sm: 8px;
--radius-md: 12px;
--radius-lg: 16px;
--radius-xl: 24px;
--radius-pill: 999px;
```

---

# Shadow Tokens

```scss
--shadow-sm: 0 2px 8px rgba(0,0,0,.12);

--shadow-md: 0 8px 20px rgba(0,0,0,.18);

--shadow-lg: 0 12px 36px rgba(0,0,0,.24);
```

---

# Blur Tokens

```scss
--blur-sm: 4px;
--blur-md: 8px;
--blur-lg: 16px;
```

Used for:

Dialogs

Glass Cards

Command Palette

Navbar

---

# Transition Tokens

```scss
--transition-fast: 150ms;

--transition-normal: 250ms;

--transition-slow: 350ms;
```

---

# Animation Curves

```scss
ease-in

ease-out

ease-in-out

linear
```

Default

ease-out

---

# Z Index Scale

```scss
--z-base: 1;

--z-dropdown: 100;

--z-sticky: 500;

--z-modal: 1000;

--z-toast: 1500;

--z-tooltip: 2000;

--z-command: 2500;
```

---

# Layout Tokens

Sidebar

280px

Collapsed Sidebar

80px

Navbar

72px

Container Max Width

1600px

Content Padding

24px

Card Padding

24px

---

# Grid Tokens

Desktop

12 Columns

Tablet

8 Columns

Mobile

4 Columns

Gap

24px

---

# Breakpoints

```scss
Mobile

0 - 767px

Tablet

768 - 1023px

Laptop

1024 - 1439px

Desktop

1440+

Ultra Wide

1920+
```

---

# Icon Sizes

```scss
Small

16px

Medium

20px

Default

24px

Large

32px

Hero

48px
```

---

# Avatar Sizes

```scss
XS

24px

SM

32px

MD

40px

LG

56px

XL

72px
```

---

# Button Heights

```scss
Small

32px

Medium

40px

Large

48px
```

---

# Input Heights

```scss
Small

36px

Default

44px

Large

52px
```

---

# Chart Colors

Primary

Blue

Success

Green

Warning

Orange

Error

Red

Purple

AI

Gray

Neutral

Use consistent color mapping across all dashboards.

---

# Skeleton Colors

```scss
Base

#1E293B

Highlight

#334155
```

---

# Elevation System

Level 0

Background

Level 1

Cards

Level 2

Dropdown

Level 3

Dialogs

Level 4

Command Palette

Level 5

Notifications

---

# Motion Principles

Animations should:

Communicate change

Guide attention

Never distract

Respect reduced motion settings

Remain below 300ms unless justified

---

# Accessibility Tokens

Minimum Contrast

AA

Preferred

AAA

Focus Ring

2px Brand Primary

Focus Offset

2px

Minimum Touch Target

44px

---

# Angular Implementation

Store all tokens inside:

```text
src/styles/tokens.scss
```

Expose them as CSS variables.

Never hardcode values inside components.

---

# Future Support

Figma Tokens

Tailwind Mapping

React Native Mapping

Flutter Mapping

Design Token Export

Theme Generator

---

# Final Goal

Every visual element in ASCEND should derive from this token system.

Changing one token should automatically propagate throughout the application, ensuring consistency, maintainability, and effortless theme evolution.
