---
title: "21. Two Actions, One Tick"
date: 2018-02-06T21:47:06-06:00
weight: 60
draft: false
#type: slide
#theme: white
description: "Combining actions into one big tick handler."
---

We will start by a using an analogy to talk about doing multiple actions in one tick handler.

## Math Analogy

Suppose you have two functions, `f` and `g`. The `f` function takes
its input, multiplies by three, and adds one. The `g` function takes
its input, squares it, and subtracts 9. Make a new `h` function that
takes it input, multiplies by 3, adds one, then squares the answer and
subtracts 9.

```racket
(define (f x) (+ (* 3 x) 1))
(define (g x) (- (sqr x) 9))
```

* [Solution 1 - typical but long](math-soln-1). 
* [Solution 2 - much better](math-soln-2). 

## Big-bang

You can combine two tick-handler actions into one by using "function composition":

```racket
; first-action: model -> model
; second-action: model -> model
; tick-handler: model -> model
(define (tick-handler model)
   (second-action (first-action model)))
```

Try combining the ball bouncing and ball moving actions in this way.

