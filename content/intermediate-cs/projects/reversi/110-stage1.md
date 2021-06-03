---
title: "Reversi Placement" 
date: 2021-05-26T09:47:32-05:00
weight: 110
draft: false
#type: slide
#theme: white
description: "A basic mechanic of placing pieces on the board."
---

We are going to make an animation where clicking places a piece and
space bar changes the current player.

You can choose the colors of the pieces yourself.

## Example Model 

Make an example game model showing one piece at (2,5) and the current
player being the opposite of the one who owns the piece. The mode
should be 1.

## Grid

You need a grid and functions to convert to and from grid
coordinates. Those should already be written from earlier
projects. Find them now.

## Draw Handler

Write a draw handler to draw the pieces of the game on the board. If
you are not sure how to do this, break it down into small steps:

* draw-one: piece image -> image
* draw-all: list-of-piece image -> image
* draw-h1: game -> image

## Mouse Handler

The mouse handler (version 1) places the piece where you click.

Write a check-expect so you think through what need to do
before you write the function. 

    mouse-h: game-model x y mouse-event -> game-model
    

## Key Handler

Hitting the space bar should switch between players. 

Surprisingly, I recommend a helper function!

    switch-player: game-model -> game-model
    
