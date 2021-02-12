---
title: "20. Click Circle Questions"
date: 2019-01-08T08:34:10-06:00
draft: false
#type: slide
#theme: white
weight: 35
description: "Brief explanation of how to stop animations and show a win screen." 
---

Main questions about the click circle project (20.6.4):

## Stopping an animation

|Stop condition| How? |
|--------------|------|
| user action  | return `(stop-with model)` from a handler |
| model state  | `(stop-when ...)` in big-bang|


## Win screen

Question: How do you make a win screen show?

Answer: There are three steps:

   1. Write a `win-draw-handler` function.
   2. Write a `should-stop?` function. This is a technical annoyance. 
      For now this can do nothing:

```racket
(define (should-stop? model) 
    false)
```

3. Add a `(stop-when should-stop? win-draw-handler)` clause to 
your `big-bang`.
     

