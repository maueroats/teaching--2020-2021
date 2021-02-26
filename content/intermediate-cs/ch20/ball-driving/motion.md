---
title: "4. Motion"
date: 2021-02-23T08:45:19-06:00
weight: 40
draft: false
#type: slide
#theme: white
description: "Actually moving the point according to the mouse position in the control grid."
---

Motion is a combination of helper functions:

* `compute-push`
* `limit-motion`
* `move-ball`


### 4a. Compute Push Helper

Signature: `compute-push-h: posn(mouse-pos) posn(origin-pos) -> posn`

Given the coordinates of the mouse and the (control center) origin,
determine how the position of the ball should change.

Use the position of the mouse in the "control center" axes to
determine the motion.
When then mouse is 2 pixels to the right and 5 pixels
above the "origin," the ball should move 2 pixels to the right and 5 up.

### 4b. Limit Motion

Signature: `limit-motion: posn(p) -> posn`

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

### 4c. Move Ball

Signature: `move-ball: posn(ball-pos) posn(mouse-pos) -> posn`

Now put this all together to create a function that takes in the
position of the ball and the mouse, and puts out the new ball
position.

