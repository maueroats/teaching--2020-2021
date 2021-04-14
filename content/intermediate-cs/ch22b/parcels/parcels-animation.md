---
title: "Animation"
date: 2021-04-13T22:50:40-05:00
weight: 50
draft: false
#type: slide
#theme: white
description: "The details of making an animation for Parcels."
---
{{% use-mathjax %}}

Making an animation with the work you have done so far mostly involves combining the pieces
that you have. The only new ingredients are helper functions to translate between
grid coordinates like $(3,4)$ and computer coordinates like $(125,175)$.

## Warmup: Working with a grid

Let's get used to working with a grid. Each grid square will be
50x50. Numbering the grid posns just like we did in the grid generator keeps
everything else uncomplicated, but it does mean we have to do a bit of math to
figure out what computer coordinates we want to use.

* $(1,1)$ will the the upper left - traditionally computer would use $(0,0)$, so that's ok too
* Every grid square will be 50x50.
* What is the center of the grid square labeled $(1,1)$? Draw a picture, figure it out, do
  not rely on someone else to tell you!
* What is the center of the square at $(2,1)$?
* What is the center of the square at $(3,1)$?

### Grid posn to computer posn

Write a function that translates "grid posns" (`gp`) to "computer posns"
(`cp`). Make sure you write at least three checks (change both x and y in your checks).

```racket
;; Skeleton:
(define (gp->cp pt)
  (make-posn 0 0))`
```

### Placing lots of circles

Use your translation function to write a function that will place a bunch of circles
everywhere in a list of given grid posns.

`place-circles: (Listof Posn) Image -> Image`: Place a radius 25 solid blue circle in the
center of every one of the squares whose grid posns coordinates are given. The list
`ex-ps` below should make shape shown here:

    O
    O
    OO

```racket
(define ex-ps (list (make-posn 1 1) (make-posn 1 2) (make-posn 1 3) 
                    (make-posn 1 4) (make-posn 2 4)))
```


## Model

The model is a list of posns, the coordinates of all of the depots.

## Draw Handler

Given a list of _depot_ posns, you want to generate a whole colored grid.
Use the idea from the warmup combined with your earlier work. Making 50x50 squares looks good to me.

* Create a list of all of the grid posns in a 10x10 grid.
* Given one grid posn, find the distance to the closest depot.
* Make a square of the correct color based on that information.
* Use the idea from the warmup to place the square at the correct location in
  your grid.
* Repeat this process for all of the posns in the grid.

## Mouse Handler

The job of the mouse handler is to add a depot where you click.

* Given a mouse click at (x,y), compute which grid posn is nearest.
* Add that grid posn to the front of the model (list of depots).

### Computer to grid

In order to determine the grid posn that corresponds to a click, you will want a helper
function `cp->gp` that changes computer posns to grid posns.

Recommendation: just make a table of values of x and y and the nearest grid posns. Use
your algebra skills to find an equation that will change the computer coordinates to the
grid coordinates.

I suggest first changing just the x-coordinate until you are confident that you have the
right formula.

Include at least three check-expects showing how your formula is correct!

```racket
;; skeleton
(define (cp->gp pt)
  (make-posn 0 0))
```
