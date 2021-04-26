---
title: "22b. List Exercises 3"
date: 2018-04-06T08:20:03-05:00
weight: 51
draft: false
#type: slide
#theme: white
description: "Randomly generate points on a parabola and graph them in people coordinates."
---
{{< use-mathjax >}}

Note: This page uses MathJax to show fancy formulas.

1. `random-gen`: number(`N`) -> list of numbers. Generate `N` random
   numbers, each one in the interval $ -150 \le x \le 150 $. Example (random so numbers will be different each time):

        (random-gen 5) => (list -75 100 -30 50 21)

2. `parabola-it`: list of numbers -> list of posn. Use the numbers as the x-coordinates of function

    $$  f(x) = 0.01 * x^2 - 50 $$

        (parabola-it (list 5 10)) => (list (make-posn 5 -49.75) (make-posn 10 -49))

3. `people-graph`: list of posn -> image. Place the posns in people coordinates on a 300x200 rectangle with origin at the center.

    {{% figure src="parabola-demo.png" %}}

A quick check to make sure everything is in order is to run all of the functions together:

    (people-graph (parabola-it (random-gen 50)))
    
