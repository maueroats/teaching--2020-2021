---
title: "Snake Functions"
date: 2019-03-25T15:44:03-05:00
weight: 100
draft: false
#type: slide
#theme: white
description: "A walkthrough of the functions needed to make a Snake game."
---

## Draw-handler

* Draw-apple: posn image(background) -> image
* Draw-snake: list-of-posns image(background) -> image

## Helper Functions

* Hit-apple? posn(snake-head) posn(apple) -> boolean
* Hit-self?: list-of-posns(body) -> boolean
* Hit-wall?: posn(snake-head) -> boolean
* New-head-position: posn(snake-head) posn(direction) -> posn
* Update-snake: list-of-posns(body) posn(direction) -> list-of-posns.
    Change the list of posns so the snake moves. Add the direction posn to the first posn in the body. Put that result in front of a list made by dropping the last posn from the list of posns.

## Tick handler

* Tick-apple: model -> model.
Make the apple vanish/move and snake grow longer when it hits the apple.
* Tick-snake: model -> model.
Update snake position.

## Key handler

* Key-handler: model key -> model.
Straightforward. It is good to add a feature so you can't go back on yourself.

## Update-snake

The snake appears to move by removing the last body segment and adding
a new segment in the correct location for the head. You should do this
in two separate functions before putting it together.


