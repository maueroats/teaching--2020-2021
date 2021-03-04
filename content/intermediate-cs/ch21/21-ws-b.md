---
title: "21. Worksheet B"
date: 2018-01-11T22:09:02-06:00
draft: true
#type: slide
#theme: white
weight: 20
description: "Moving colored dot animation, with a walkthrough including helper functions."
---

{{% notice note %}}
Pay attention to contracts for the functions you are asked to write. When a `full-circle` is mentioned, that means the data type that you defined in question 1 and 2. Both "takes in" and "given" are indications that the parameters to the function are being specified.
{{% /notice %}}

## Animation: Moving Colored Dot

1. Create a data definition for a type "fc" (for full-circle) that is able to store the location of the center, color, and radius of a dot.
2. Write the actual struct definition.
3. Test each feature (center, color, radius).
4. Write a function to create a solid circle of the given color and radius.
5. Design and test a function to draw the circle at the given position on the background.
6. Design and test a function `fc-move` that takes in a full-circle and a position, and returns a new full-circle with the same color and radius, but different position.
7. Write a function `fc-set-color`. Include a sensible purpose and contract.
8. Write a function `fc-change-radius` that takes in a full-circle and an amount to change the radius. Include sensible purpose and contract.
9. Create an animation of a full-circle randomly moving around the screen. 
