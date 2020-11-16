---
title: "7. Review 2"
date: 2019-11-21T12:57:17-06:00
weight: 81
draft: false
#type: slide
#theme: white
description: "Review of signatures, random numbers, random functions, math."
---
{{% use-mathjax %}}

## Signatures

Remember that when you are describing a model which is a string, you
should write model(string) instead of just model or string. This makes
it clear that you know _exactly_ the role that value plays in the
animation.


### Triangle in the corner

You are making an animation that shows a triangle in the upper left
corner of a 400x200 rectangle, filled in to the location of the mouse.

1. What is a good model?
2. What is the signature for the mouse-handler?
3. What is the signature for the draw-handler?
4. You add a feature so hitting a key resets the animation to show the
   top half of the rectangle shaded. (a) What is the signature for the
   key handler? (b) Write code for the key handler.
   
   
### Countdown

An animation shows a number in the middle of a rectangle. The number
starts at 60 and goes down one every second. 

1. Describe a good choice for a model. (What type?)
2. What is the signature for the tick-handler?
3. What is the signature for the draw-handler?


## Random Numbers

### Choices

1. What expression randomly chooses -1, 0, or 1? (With all equally
   likely.)
2. Write an expression that randomly chooses a number from -18 to 18.
3. Write an expression to create a random multiple of 100, from 2000
   to 3000.
4. Write a function that takes in a number $m$ and puts out a random
   number between 10 and $m$. Bonus: If $m$ is less than 10, always put out
   10.
6. (Harder.) Write a function that gives a random multiple of 3 between 81 and
   228.
5. (This problem was very hard, consider it AP Racket.) Write a
   function that takes in a number $n$ and puts out a random number
   between $-10n$ and $50n$.
   
### Random vs Nonrandom

Create a rectangle with a random width from 100 to 400 and a random
height from 200 to 300. Put a circle in the middle of the rectangle
that has half the height of the rectangle.

{{% figure src="red-sun-random.png" %}}


## Math

1. Write a Racket function to compute $g(x) = \sqrt{7-3x}$.
2. Write a function that takes in a number and puts out a number that
   is between 20 and 200 by taking numbers smaller than 20 and making
   them 20, and numbers bigger than 200 become 200, and numbers in the
   middle do not change.


