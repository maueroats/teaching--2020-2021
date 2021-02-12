---
title: "20. Map Image"
date: 2017-12-20T13:59:24-06:00
draft: false
#type: slide
#theme: white
weight: 50
description: "Changing the colors in a picture, pixel by pixel."
---

The `map-image` command runs a function on every pixel of an image. See the [map-image documentation](https://docs.racket-lang.org/picturing-programs/index.html?q=map-image#%28def._%28%28lib._picturing-programs%2Fprivate%2Fmap-image..rkt%29._map-image%29%29) for the official info.


## Exercises for map-image

1. `blue-only`: Keep only the blue, removing red and green.
2. `black-white`: Turn an image to black and white. You will need to decide how to set the threshold. 
3. `grayscale`: Turn an image to grayscale.
4. `green-to-white`: Change only green pixels to white. 

## Color 

There are several logical ways of combining the red, green, and blue components to get one number. The most common is averaging, but it is not the only way.

1. Average the numbers.
2. Use the maximum of the numbers.
3. Use the minimum of the numbers. (?!)
4. Other unusual math methods like the geometric mean.

## Extras

Make the function `color-distance: color->color`, which measures the distance between two colors in the same way that `distance` measures the distance between two posns. 

The formula for color distance would be:
```math
(square root of (r1-r2)^2 + (g1-g2)^2 + (b1-b2)^2)
```

Your `color-distance` function can be used to change colors _near_ green to white, so you don't have to have perfect green to see it work.
