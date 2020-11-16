---
title: "Exercises 5"
date: 2020-11-16T13:53:05-06:00
weight: 50
draft: false
#type: slide
#theme: white
---

## Helper functions 1

Look for ways you can use these later.

* (`dot-on: image -> image`): Place a radius 5 solid red circle on the
  lower right corner of an image.

* (`at-least-10: number -> number)`: Take in any number, put out a
  number that is at least 10.
  
        (check-expect (at-least-10 75) 75)
        (check-expect (at-least-10 3) 10)       


## Limiting values

Restricting values to an allowable range is useful all of the
time. Learn to do it proficiently.

* (`limit`) Make a function called `limit` that takes in an integer and puts out
  an integer between 0 and 255. Numbers below 0 should become 0, and
  numbers above 255 should become 255.

        (check-expect (limit -8) 0)
        (check-expect (limit 900) 255)

* (`dot-leash`): This function takes in a number (`y`) and puts out a
  radius 5 solid red circle on the lower right hand corner of a
  rectangle that is 2y wide and y tall. 
  
  Restrictions on individual sides (these do not restrict `y`, just
  the way the answer looks):
  
  * the width will not grow over 300
  * the height is at most 200 and at least 10

        (check-expect (dot-leash 3) (dot-on (rectangle 6 10))


## Helper functions 2
Re-use functions you have already written.
This is shown a lot in the chapter (exercises 7.8-7.10, or 7.15-7.17, or 7.18-7.19).
You should also be seeing it in this worksheet.


## Random numbers

* `random-tenth: number(top) -> number`. Put out a random real number
  of the form `xy.z`, between 10.0 and `top`. Assume the number `top`
  is at least 10.0. 
  
* `four-up: integer -> number`. Round an integer up to the nearest
  multiple of 4. 
  
        (check-expect (four-up 9) 12)
        (check-expect (four-up 99) 100)
        (check-expect (four-up 400) 400)
  
## Distance formula

* The distance between (x0,y0) and (x1,y1) is `(distance x0 y0 x1 y1)`.
  Write the distance function and two good tests to make sure it works
  correctly. (This function is important, make sure you know how to do
  it without thinking too hard.)
      
      * One test should be when the answer is an integer. 
      * Another test should be when the answer is a square root.

* `make-circ: number(x) number(y) -> image`. Produce a solid maroon
  circle sized so that you
  could place its center at (150,100) and the point (x,y) would be
  just on the edge.
  
* `test-circ number(x) number(y) -> image`. Draw a radius 4 solid brown
  circle centered at `(x,y)` and a solid maroon circle centered at
  `(150,100)` with `(x,y)` just on its edge.

## Animation Fun

Make a red dot follow the graph of `y=x` until it gets to `y=150`,
then move along `y=150` as `x` increases.

Note: in the computer coordinate system, the red dot will appear to
move down and to the right as it follows `y=x`.

