---
title: "21. PV Review"
date: 2018-02-08T13:15:41-06:00
weight: 70
draft: true
#type: slide
#theme: white
description: "Review problems for PV quiz."
---

Use computer coordinates for this review!

1. As a background use `(empty-scene 300 200)`.
   Graph a point or position with an arrow showing the direction of velocity.

   1. Point A. ```(make-pv (make-posn 225 30) (make-posn 25 -10))```
   2. Point B. ```(make-pv (make-posn 50 180) (make-posn -10 20))```
   
   
2. Should each point bounce? Explain which wall and why.

    | Point |    Pos    |     Vel    |
    |-------|-----------|------------|
    |  C    | (200, 10) | (-10, 20)  |
    |  D    | (  0,190) | ( -5, 15)  |
    |  E    | (180,200) | ( 10,-20)  |
    
3. Amaja has an animation that looks good until the ball tries to bounce off the right side. The ball slowly slides up the right side, shaking back and forth. What could be wrong?

        (define (should-bounce-right? w)
           (<= 300 (posn-x (pv-pos w))))
           
4. Helena's program is almost done. The ball bounces correctly off the left, right, and top. However, it ignores the code to bounce off the bottom. What should she do?

5. Travis has been written a tick handler to make the ball move and
   one tick handler to make the ball bounce off each side.

        (define (update-pos model) ...)
        (define (do-left-wall model) ...)
        (define (do-right-wall model) ...)
        (define (do-top-wall model) ...)
        (define (do-bottom-wall model) ...)

    What should he do to combine them?
    How can he make one tick handler to do all five actions?
    
    
