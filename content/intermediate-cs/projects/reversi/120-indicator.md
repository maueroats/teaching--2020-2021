---
title: "Reversi Indicator" 
date: 2021-06-01T13:44:13-05:00
weight: 120
draft: false
#type: slide
#theme: white
description: "Instructions to add an indicator showing where you will place a piece."
---

The indicator should be a somewhat-transparent version of the actual
piece. 


## Draw Handler 

* draw-indicator: posn player image -> image.
* draw-h2: game-model -> image.
  The second draw handler should call the first draw handler to draw
  the pieces on the board.

## Mouse Handler

If your mouse handler does not remember the most recent position of
the mouse, you will have to add that now.

