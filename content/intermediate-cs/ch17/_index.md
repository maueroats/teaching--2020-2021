---
title: "17. Cond Animations"
date: 2021-01-25T13:32:54-06:00
weight: 170
draft: false
#type: slide
#theme: white
description: "Use of conditionals in animations."
---

## Quick Quit

Make a 200x100 colored rectangle in the middle of a 300x200 scene.

When you click on the rectangle:
1) the shape changes to a 200x100 ellipse
2) the animation stops 

Discuss:
* model
* draw handler: how will you show the rectangle? the ellipse?
* mouse handler

Write two check-expects for the mouse-handler:
* click in the rectangle
* click but not in the rectangle

Then we write functions.

## Random Shapes

Write an animation that will show randomly of these images:
* 1 triangle,
* 2 squares,
* 3 circles, or
* the word WIN
They should all be equally likely.

In this part, the word WIN should just appear like the other choices.


## Elementary School Shapes
Modify to your random shapes animation.

When you hit the number key corresponding to the number of shapes you
see on the screen, you win.  Otherwise you lose.

Optional: Hitting a non-numbered key is ignored.

* Winning shows the "win" screen.
* Losing: add some kind of "that's not it" screen.
* When you win or lose, the animation quits.

The "win" screen should not be one of the random choices.

Discussion:
* What model will you use?
* How will you represent the "win" and "lose" states with your model?


