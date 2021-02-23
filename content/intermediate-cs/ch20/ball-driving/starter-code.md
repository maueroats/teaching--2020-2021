---
title: "2. Starter Code"
date: 2021-02-23T08:45:38-06:00
weight: 20
draft: false
#type: slide
#theme: white
description: "Starter code so everyone begins from the same spot."
---

```racket
(require picturing-programs)
(require "posn-util.rkt")

(define Q1 (square 25 "outline" "black"))
(define Q2 (beside Q1 Q1))
(define Q4 (above Q2 Q2))

(define BG0 (empty-scene 400 300))

(define BALL (circle 5 "solid" "red"))
(define TARGET
  (overlay (circle 15 "solid" "white")
           (circle 25 "solid" "pink")))
;; we wrote random-posn. pick a posn if that does not work
(define TARGET-POSN
  (random-posn 400 300)) 
```
