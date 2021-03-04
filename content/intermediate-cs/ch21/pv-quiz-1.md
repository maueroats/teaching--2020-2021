---
title: "21. PV Quiz"
date: 2018-02-13T08:00:07-06:00
weight: 80
draft: true
#type: slide
#theme: white
description: "Quiz on the bouncing ball 21.7.6."
---

1. The screen is a 500x300 empty scene. Illustrate approximate
   position and velocity of each of the following using a dot for
   position and an arrow for velocity.
   
    1. Point A: `(make-pv (make-posn 100 300) (make-posn 10 -20))`
    2. Point B: `(make-pv (make-posn 10 40) (make-posn 100 50))`
    3. Point C: `(make-pv (make-posn 500 10) (make-posn -10 30))`
   
2. `should-bounce-left?` 

    1. Write a signature.
    2. Write a `check-expect` for a point on the left wall traveling
       left.
    3. Write a `check-expect` for a point on the left wall traveling right.

3. Describe one difficulty that you had while writing the "ball
   bounce" program. Include details. Explain what you did to overcome
   that difficulty.
   
4. The ball is going to be "Firebrick Red" when it is returning from
   the right wall, going left. It stays that color until it hits the
   halfway point, when it turns blue. (Use the same 500x300 scene as
   earlier.) 
   
   Write `ball-color: pv -> color`
   
   
