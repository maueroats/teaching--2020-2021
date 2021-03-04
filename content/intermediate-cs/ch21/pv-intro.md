---
title: "21. PV Intro"
date: 2018-02-05T14:48:00-06:00
weight: 40
draft: false
type: slide
theme: white
description: "Slides with introduction to position-velocity struct exercises."
---

## Pick a model

* A ball moves around the screen. 
* It keeps going in the direction it starts. 
* What could the model be?

---

## Define the model

Keep the names short; we will type them a lot.

---

## Define the model

Keep the names short; we will type them a lot.

`(define-struct pv (pos vel))`

---

## Example needed

Create a `pv` structure called `ex1`.

* Position `(100,50)`
* Velocity `(-5,8)`

---

## Sketch 

```racket
(make-pv (make-posn 50 200) 
         (make-posn 10 -30))
```

---

## update-pos

* Write `update-pos: pv -> pv`.
* Use velocity to change position, one time step.

---

## scale-velocity

* `scale-velocity: pv(orig) num(scale) -> pv`
* Multiply both x and y components of velocity of `orig` by `scale`.

---

## turn-180

What would this mean? Sketch first.

---

## Bouncing off walls 1

Should you bounce off of a wall?

Sketch three true and three false. 

```racket
should-bounce-r? : pv num(xwall) -> boolean
```
The wall on the right is at `x=xwall`.

---

## Bouncing off walls 2

```racket
should-bounce-r? : pv num(xwall) -> boolean
```
The wall on the right is at `x=xwall`.

Now actually write the function.

--- 

## Bouncing off walls 3

```racket
bounce-r-velocity: pv -> posn(new-velocity)
```

Given that you bounced, what should your new velocity be?

Draw a sketch!

