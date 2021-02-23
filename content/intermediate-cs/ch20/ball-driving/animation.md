---
title: "6. Animation"
date: 2021-02-23T08:49:57-06:00
weight: 60
draft: false
#type: slide
#theme: white
description: "The functions to use with big-bang: draw handler, mouse handler."
---

Actually making the animation requires a draw handler and a mouse
handler. You will have to write those.


## Draw Handler

* Create a background that includes the target and the controls.
* Draw the ball at the position indicated by the model.

`draw-h: posn(model) -> image`

## Mouse Handler

When the mouse is inside the control grid, the ball should
move. Otherwise nothing happens.

## Big Bang

This is what my `big-bang` looks like.

```racket
(big-bang (make-posn 200 100)
  (check-with posn?)
  (stop-when win? win-screen)
  (on-draw draw-h)
  (on-mouse mouse-h))
```
