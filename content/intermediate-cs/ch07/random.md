---
title: "Randomness"
date: 2017-10-17T22:10:45-05:00
draft: false
description: "Making random numbers.  Testing functions that use random numbers."
---

* Random numbers: `(random 3)` gives a random number 0, 1, or 2. Notice that there are three possible answers, but they start counting at 0. Run the code below and you should get different answers each time.
```racket 
(random 10) 
(random 10) 
(random 10) 
```

## Random ranges

{{% notice note %}}
We use the phrase "from 10 to 200" or "between 10 and 200" to both mean all of the integers n so that 10<=n<=200.
{{% /notice %}}

How many numbers are there from 10 to 200, inclusive? It's easy to make a mistake. My favorite method is to subtract a number to make the bottom of the range start counting at one. 

Be sure you understand the previous paragraph before reading on!

When you already have a random number from 0 to 50, how can you get a random number between 30 and 80?

## Using randomness

It is hard to test random functions, so write non-random versions first, and use the randomness as an input. Test the non-random functions!

Example: Make an ellipse of a random height 150-250 pixels tall, and twice as wide.

```racket
; make-ellipse-nr: string(color) number(height) -> image
; purpose: make an ellipse height units tall and 2*height units wide in the given color
(define (make-ellipse-nr color height)
    (ellipse (* 2 height) height "solid" color))
; see below for check-expect
(define (make-ellipse color)
    (make-ellipse-nr color (+ 150 (random 101))))
```
{{% figure src="nonrandom-check.png" title="Test your nonrandom function well!" %}}
