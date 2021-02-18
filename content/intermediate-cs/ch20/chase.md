---
title: "20. Chase"
date: 2021-02-16T14:41:53-06:00
weight: 47
draft: false
#type: slide
#theme: white
description: "A simple game where a square chases the mouse."
---

In this animation, a 20x20 square moves toward the mouse whenever the
mouse does something. If the square touches the mouse, then the game
is over.

* model
* what model will we use to indicate that the game is over?
* draw handler
* stop-when: decide when the game is over
* lose screen draw handler: put "game over" on the screen

## Square moves toward the mouse

You want the square to move toward the mouse, but not too fast or
nobody will want to play the game.

Ideas:

* When you add posns A + B, that moves posn A in direction B
* When you want to limit your motion, scale the motion posn so that
  its length is (say) 5.


### Basic: we will make the "1/20 of the distance" chase

The `next-change` function will tell how to adjust the current
position of the square based on the goal position of the mouse.

    next-change: posn(goal) posn(current) -> posn

### Advanced: make the "speed = 3" chase

A variation on this is to make the square chase the mouse at a
"constant speed" of 3 pixels every mouse motion. This done by making
a helper function `scale-to-3: posn -> posn` that adjusts the posn so
its length is always 3 (assume the posn is not (0,0)).


