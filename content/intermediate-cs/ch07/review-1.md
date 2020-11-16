---
title: "7. Review 1"
date: 2018-11-13T07:38:18-06:00
weight: 80
draft: false
#type: slide
#theme: white
description: "Bare-bones review."
---

{{% use-mathjax %}}

1. Write a function `f1` to create a random number between 10 and 50.

2. Write a function `tree` to make a tree given a radius and a
   height. We measure the height of the tree to the center of the
   circle, not the very top. The width of the trunk should be the same
   as the radius. Shown below is `(tree 90 220)`. 

    Force the trunk to be at
   least twice the radius, so `(tree 90 20)` should produce the same
   image as `(tree 90 180)`.

    {{% figure src="tree.png" %}}

## Challenging but reasonable
1. (`rq1`) Write a function that takes in one input `n` and gives
random numbers between 100 and 1000. The first possible random number
is 100, and after that increase 100 by multiples of `n`. Example: When n
is 500, the only possible results are 100 and 600. When n is 7, the
first possible number past 100 is 107.

2. The [Golden Ratio](https://en.wikipedia.org/wiki/Golden_ratio) is
   $(1 + \sqrt{5})/2$. Rectangles whose sides are in the golden ratio
   have been considered aesthetically pleasing since Greek times, and
   are called "golden rectangles". Make
   a function that generates a random golden rectangles with one side
   between 100 and 300 pixels long.
   
   
