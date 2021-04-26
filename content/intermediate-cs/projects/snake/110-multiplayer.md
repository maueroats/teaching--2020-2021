---
title: "Snake Multiplayer"
date: 2020-04-24T13:28:39-05:00
weight: 110
draft: false
#type: slide
#theme: white
description: "Snake with an unlimited number of players."
---

Make sure you have a working [single
player](https://maueroats.github.io/teaching--2018-2019/intermediate-cs/projects/snake/)
snake (if not two player snake) before
starting this project!

Overall, people report that the code for multiplayer snake gets
large. You probably want to make a separate folder for your snake game
and break it into separate files using require and provide. I
recommend each file only do one "part" of the animation. To give you
an idea, I made separate files for:

* define-struct
* examples used in testing
* draw handler
* key handler
* tick handler
* collision detection (which is part of the tick handler, but it was
  complicated enough that I made another file)
* computer player (again, called in tick handler)

## Model

For many multi-player snake, we will want:

* a list of apple locations
* a list of snakes,

where each snake has

* id - a number to identify the snake to make it easier to control
* head - position of the head (could just be first of the body)
* body - a list of positions
* dir - a posn giving the direction of motion of the head

```racket
(define-struct sn (id head body dir))
(define-struct multi (apples snakes))
```

## Draw Handler

Break the job into pieces, draw each piece on a provided background. 

* draw-snake-1: sn image -> image
* draw-snakes: list-of-snakes image -> image
* draw-apple-1: posn image -> image
* draw-apples: list-of-posn image -> image

## Key Handler

I wrote one function to determine which id number snake certain keys
control and another function to determine which way the snake turns
given the keys.

I then applied the change in direction to the snake with the
appropriate id (going through the whole list of snakes and not
changing the rest of them).

## Tick Handler

There's a lot to the tick handler. I'm going to leave planning this up
to you. Email with questions! This sketch is short / incomplete. 



