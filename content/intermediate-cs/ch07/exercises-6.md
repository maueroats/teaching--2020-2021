---
title: "Exercises 6"
date: 2020-11-18T13:15:26-06:00
weight: 60
draft: false
#type: slide
#theme: white
description: "Limiting warmup, more random numbers, distance."
---

{{% use-mathjax %}}

## Opener

A digital thermometer gives temperature readouts with one decimal
place. The `random-therm` function gives a possible temperature
reading between $96.7$ and $100.5$, inclusive. Write the
`random-therm` function.

## Random

* (`ball-jump`) A ball is supposed to teleport around the screen,
  moving to a random x coordinate. The x-coordinates chosen should be
  multiples of 10 between 70 and 250. Write a function that will give
  the new x-coordinate. Example of random choices:
  
        (ball-jump 0) => 90
        (ball-jump 0) => 170
        (ball-jump 0) => 120

## Distances

* (`dist-to-circ`) 
  A circle has radius $80$ and center $(200,150)$. Write a function to
  compute the distance from $(x,y)$ to the circle. When $(x,y)$ is
  inside the circle or on the perimeter of the circle, the distance is $0$.

* (`dist-to-sq`) **Harder Challenge.**
  A square of side length 50 is placed with center at (175,90). Find
  the distance from a point (x,y) to the square. If your point is
  inside the square, the distance is zero. Draw a picture.

## Other

* (`swerve-heading`) 
  A compass is currently pointing a certain direction between 0 and
  359 degrees. (0 degrees = North, not that it matters) The driver
  swerves a little bit, changing the heading by a random amount, at
  most ten degrees in either direction. The `swerve-heading` function
  takes in the original direction and produces the new, randomly
  varied, direction. 
  
  Once you have the basic method working, make sure that the output
  direction is between 0 and 359 degrees.
  
  
