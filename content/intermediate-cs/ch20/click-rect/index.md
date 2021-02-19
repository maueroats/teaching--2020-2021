---
title: "20. Click Rectangle"
date: 2021-02-18T22:00:37-06:00
weight: 43
draft: false
#type: slide
#theme: white
description: "Click on the rectangle and it moves to a new position."
---

This animation uses a posn to give the location of the _lower left
corner_ of a 60x40 rectangle on a 300x200 background. There is a red
dot drawn to show the location of the "anchor" in the lower left
corner of the rectangle.

{{% figure src="click-rect-1.png" %}} 

## Aside: Why the lower left?

We are using the lower left corner so we can get practice dealing with
anchor points that are not the center. For a rectangle working with
the lower left makes it a little bit harder, but for a triangle
working with the center is a _lot_ harder than working with the lower
left corner. We practice slightly unusual situations to make sure we
have a good understanding of _why_ we do each part of the program.

## Helper function 1: placer

There is a helper function you should make.

Write the function `place-image/posn/LL`, which places an image so the
lower left corner is on the given posn.

    place-image/posn/LL : image(img) posn image(bg) -> image

## Helper function 2: random-posn

Our rectangle jumps to random positions, so we use a function for
that. We are going to make it so that the whole rectangle is visible
on the scree. (You don't want just a tiny strip showing; that looks
weird and can be annoying to click on.)

When you want to keep the entire rectangle on the screen, what
coordinates can you use for the lower left corner? If you are not
sure, go through the checklist:

### Extreme: small
* What is the smallest possible x? 
* What is the smallest possible y?

Draw a rectangle in this lower left position and label the coordinates.

### Extreme: large
* What is the largest possible x?
* What is the largest possible y?

Draw a rectangle with this lower left position and label the coordinates.

### Main function

After you have worked out the extremes, writing the `random-posn`
function should be straightforward - just pick numbers between the
allowed extremes. 

    random-posn : any (ignore) -> posn


## Draw Handler

Draw a 60x40 rectangle so the model posn is in the lower left corner of the rectangle.
Draw small a red dot exactly centered on the model posn.
A 300x200 background works pretty well.

## Coordinates and helper function 2

As always, you have the choice of people coordinates (origin in the
lower left) or computer coordinates (origin in the upper
right). Neither one is 100% straightforward. 

* Computer coordinates: make sure you carefully work out an example
  and then write check-expects for functions that use coordinates.
  
* People coordinates: there are two places the switch between people
  and computer coordinates needs to occur - in the draw handler
  (people to computer) and in the mouse handler (computer to people).
  
These instructions will use computer coordinates.

Use the figure below to write a check-expect for `in-rectangle?` that
shows that point P is inside the rectangle anchored by point A.

{{% figure src="Rectangle-Example-2.jpg" width="500" %}}

    ; in-rectangle? : posn(anchorA) posn(pt) -> boolean
    (check-expect (in-rectangle? ...finish...) true)
    
Finish writing the check-expect and the `in-rectangle?` function.

## Mouse Handler

The purpose of the mouse handler is to cause the rectangle to jump to
a new location when it is clicked on. The function does this by giving
a new random position for the model in that case.

## Final Check

Run your animation. Click around in random places both on and off
the rectangle to make sure it works.

