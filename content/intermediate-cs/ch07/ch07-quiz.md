---
title: "7. Numbers Quiz"
date: 2018-11-15T22:38:57-06:00
weight: 90
draft: false
#type: slide
#theme: white
description: "A reasonable quiz, maybe one half question too long. Extra credit for all homework being turned in."
---

1. Make a function that picks a color that has a random amount of red,
   either 50, 150, 250, and a random amount of green, either 100 or 200. 
   Use it to make six 50x50 squares next to each other.

2. Check if a random integer between 0 and 60 (inclusive) has a square root
between 3.5 and 7.5. Use `check-within`. You can comment out your test
when you know it works.

3. Make a gradient from maroon to olive that takes 500 pixels to go
   all of the way (so it doesn't get to olive before the end). 

4. (`pinkify`) 
Write a function that takes in an image and removes some green from
it according to the directions below:

    * The center of the color change is (100,120).
    * Green within 10 pixels of (100,120) should be untouched. 
    * As you
    get further away, the green should fade to black, so at (365,120)
    there is 0 green left. 
    * There should be some small amount of green left
    until you get all of the way to (365,120), although you will probably
    not be able to see it.

Make sure to include check-expects that demonstrate that green is
untouched in the center area and gone on the edge.
