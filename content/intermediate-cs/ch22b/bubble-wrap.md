---
title: "22b. Bubble Wrap"
date: 2018-04-05T12:43:42-05:00
weight: 40
draft: false
#type: slide
#theme: white
description: "Random size circles all around the screen. Circles disappear when you click on them."
---

* A bunch of circles of random size and color are placed around the screen.
* When you click on a circle, it disappears.
* Only the top circle should disappear if multiple circles are stacked.

## Model

First, think about _one bubble_. How will you represent that? You need to keep track of at least:

* center
* radius
* color

Next, think about _all of the bubbles_. How will you represent a bunch
of bubbles?

## Drawing 

It is good to get your draw handler written early, so you can see what is going on. I recommend that you write one function to draw a single bubble on a background, and another function to draw all of the bubbles.

## Logic

You need to remove the bubble you click on from the game. I think that is best done in two steps:

* `clicked-on-bubble?`: bubble posn(click) -> boolean. True if the
  click is inside the given bubble.
* `remove-clicked`: list of bubbles posn(click) -> list of bubbles

