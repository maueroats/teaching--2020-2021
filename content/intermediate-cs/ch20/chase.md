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


### First we will make the "1/3 of the distance" chase

The `next-change` function will tell how to adjust the current
position of the square based on the goal position of the mouse.

    next-change: posn(goal) posn(current) -> posn

### Next we will make the "speed = 10" chase

In this the length of next-change is adjusted to be 10.
