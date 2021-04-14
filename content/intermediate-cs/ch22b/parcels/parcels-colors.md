---
title: "Coloring"
date: 2021-04-13T22:08:21-05:00
weight: 40
draft: false
#type: slide
#theme: white
description: "Ways color your grid."
---
The basic way to color the grid is by making a function that takes in
a distance and puts out a color.

An more challenging way to color the grid is by figuring out which
depot is closest and then coloring all points by a color assigned to the
closest depot.

You can choose your own coloring function or use mine. I suggest you change this
once you start making images and would like to adjust the way they
look. 

```racket
(define (color-select n)
  (make-color (limit (- 255 (* 50 n)))
              0
              (limit (* 100 n))))
(define (limit n)
  (max 0 (min 255 (real->int n))))
```
