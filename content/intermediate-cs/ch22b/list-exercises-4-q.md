---
title: "22b. List Exercises 4"
date: 2018-04-09T08:00:55-05:00
weight: 60
draft: false
#type: slide
#theme: white
description: "Practice quiz on lists."
---

1. `count-down-odd`: number(start) number(end) -> list of numbers. Generate a list of all of the odd numbers from `end` down to `start` (inclusive).

        (count-down-odd 5 10) => (list 9 7 5)
        (count-down-odd 5 5) => (list 5)
        
2. `dinosaur`: list of numbers -> list of strings. Change a list of numbers, all of which will be between 0 and 7 inclusive, into a list of the corresponding letters from the word `dinosaur`. 

        (dinosaur (list 4 5 0)) => (list "s" "a" "d")
        
3. `shaper`: list of numbers -> image. Choose an image based on the number (1=triangle, 2=square, 3=circle; pick colors and sizes you like). Randomly place the image on a 400x300 gray rectangle. 

    Advanced bonus: the list of numbers comes in pairs - the first number selects the shape and the second number selects its size.

        (shaper (list 1 50 3 20)) 

    The call above would place a triangle of side length 50 and a circle of radius 20. 



    
