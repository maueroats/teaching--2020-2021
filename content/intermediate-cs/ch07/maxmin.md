---
title: "Max and min slides"
date: 2017-10-18T14:28:44-05:00
draft: false
type: slide
theme: white
description: "Slideshow of exercises to learn max, min, abs, and random."
---

# Maximum, Minimum, Random

---

## Make a Table

Max = greatest.
Min = least.
Abs = absolute value.

|  x | (min x 10) | (max x 10) | (abs x) |
|:--:|:----------:|:----------:|:-------:|
| -15| |||
| -5 | |||
|  ... | |||

Include x = 8, 13, 18 as well.

---

# Which keeps numbers small?

|  x | (min x 10) | (max x 10) | (abs x) |
|:--:|:----------:|:----------:|:-------:|
| -15| -15        | 10         |   15    |
| -5 | -5 | 10| 5 |
|  8 | 8  | 10| 8 |
| 13 |10  | 13|13 |
| 18 |10  | 18|18 |

---

# Use Check-expect

Always write check-expects when keeping numbers small or large. It is very easy to have mistakes in this kind of code.

---

# Random

(random 5) => 0, 1, 2, 3, 4

( ????   ) => 0, 1, 2, ..., 100

---

# Random range

(random 101) => 0, 1, 2, ..., 100

( ????     ) => 50, 51,52, ..., 150

---

# Random functions

Beginning student needs at least one parameter for a function.
You can give the parameter a job if you want:
```racket
(define (random start-num)
    (+ start-num (random 101))
```


---

# Checking random?

* Uses random number? [Test a helper function]({{% relref "random.md" %}}).

* Produces a random number? No check.

