---
title: "Haskell HW 2"
date: 2019-09-13T15:59:25-05:00
weight: 20
tags: 
  - homework
  - hw
  - haskell
  - ap-cs
description: "Graph a function, is a point on a line, get the numbers more than 100, break up a list, find the nearest point."
---

All of the points you should work with have `Int` coordinates. So far
you only know `Int`, `String`, and lists of each of those.

1. Write a function `onLine` that takes in a slope `m`, a y-intercept `b`, and a point `(x0,y0)` and gives back True if the point is on the line `y=m*x+b` and false otherwise.

6. Write a function `moreThan100` that takes in a list of numbers and puts out a list of numbers. The output is the same as the input with all of the numbers less than or equal to 100 removed.

1. Write the "grapher" function whose inputs are (i) a function f that takes in a number and puts out a number, (ii) a lower bound, and (iii) an upper bound.  The grapher function should return a list of coordinates `(x,y)` where `y=f(x)` and `x` goes from the lower bound to the upper bound increasing by 1 each time.

8. _Target Practice 1_. Given a point `(x0,y0)` and a list of ordered
   pairs, return the square of the smallest distance from `(x0,y0)` to
   a point on the list. (Working with the squared distance means you
   can keep using `Int` for the type of your result.)
   
   Example: `targetPractice1 (0,1) [(10,20),(3,5),(7,-1)] == 25`

7. _Break It Up_. (*Challenge*) Given a list of numbers, create a list containing every sequence of four numbers in a row. Example: 

        breakItUp [5,10,20,3,8,9] = [ [5,10,20,3], [10,20,3,8], [20,3,8,9] ]

8. _Target Practice 2_. (*Challenge*) Given a point `(x0,y0)` and a list of ordered pairs, return the point in the list that is closest to the given point.

       Example: `targetPractice2 (0,1) [(10,20),(3,5),(7,-1)] == (3,5)`

## OMIT

9. Write a function `addp` that adds two ordered pairs.

10. (*Bonus*) The function `nextInDirection` takes in start point `(x0,y0)`, a direction `(dx,dy)`, and a list of ordered pairs. The function returns the point in the list that is closest to the start point and can be reached by beginning at the start and going in the given direction.
