---
title: "Moving Ball"
date: 2019-01-16T20:19:59-06:00
weight: 110
draft: false
#type: slide
#theme: white
description: "Drive a ball around the screen with a constant velocity."
---

We practice the basics of structures by creating an animation where
you can direct a ball to move around the screen.

* Use WASD keys to control the ball.
* Once you pick a direction, the ball continues to move in that
  direction at the same speed until you tell it a different
  direction. 
* The game is over when the ball leaves the screen.

## Planning

* We used a structure holding the position and velocity of the ball.
* We listed the handlers we needed.
* We wrote check-expects as a class.

## Writing

Using the starter code from class, it took less than a day to get a
working animation.

## Advanced Features

* Bounce off walls.
* Keys control accelerate the ball in a given direction instead of
  just setting the velocity. (So when the velocity was (5,0) and
  you hit the left arrow, it would slow to a velocity of (4,0).)
  
