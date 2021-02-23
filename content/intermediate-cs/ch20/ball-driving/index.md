---
title: "Ball Driving"
date: 2021-02-23T08:10:35-06:00
weight: 80
draft: false
#type: slide
#theme: white
description: "Move the ball around the screen with a little control panel. Win when you get inside the target."
---

## Starter Code

We will all use the same target.

```racket
(define TARGET
  (overlay (circle 15 "solid" "white")
           (circle 25 "solid" "pink")))
(define TARGET-POSN
  (random-posn 400 300))
```

## Draw Handler

* Create a background that includes the target and the controls.
* Draw the ball at the position indicated by the model.

`draw-h: posn(model) -> image`


## Active controls?

We will write a function to determine if a point is in the control grid.

`in-control-grid? : posn -> boolean`

3a. What are the coordinates of the center of the Q4 control grid?

3b. Write two check-expects, one showing a point that is not the
center is inside the grid, and another showing a point that is outside
the grid.

3c. Write the function `in-control-grid?`

## Motion

There are two helper functions for motion: 

### 4a. `compute-push: posn(mouse-pos) -> posn`

Given the coordinates of the mouse, determine how the position of the
ball should change.

### 4b. `limit-motion: posn(p) -> posn`

Do not let the x or y coordinates move outside the screen (in either a
positive or negative direction). We used to do this all of the time
for numbers.

```racket
(check-expect (limit-motion (make-posn 405 100)) (make-posn 400 100))
(check-expect (limit-motion (make-posn -5 80)) (make-posn 0 80))
(check-expect (limit-motion (make-posn 135 -8)) (make-posn 135 0))
(check-expect (limit-motion (make-posn 187 315)) (make-posn 187 300))
(check-expect (limit-motion (make-posn 285 193)) (make-posn 285 193))
```

### 4c. `move-ball`

Now put this all together to create a function that takes in the
position of the ball and the mouse, and puts out the new ball
position.

`move-ball: posn(ball-pos) posn(mouse-pos) -> posn`

## End Game

You win the game by moving your ball completely inside the white part
 of the target.
 
* 5a. `win? : posn(ball-pos) -> boolean` 

Check your function to make sure it does not count a win until the
ball is completely inside the white area of the target.

* Adding a win screen is optional. (`win-screen: posn(ball-posn) -> image`)
