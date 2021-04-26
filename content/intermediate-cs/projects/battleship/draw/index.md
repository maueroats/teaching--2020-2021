---
title: "Battleship Action" 
date: 2021-04-26T13:24:51-05:00
weight: 50
draft: false
#type: slide
#theme: white
description: "Warm-ups for the draw and mouse handler."
---

## Grid Drawing System

We are going to set up a system to draw on a grid where each square is
50x50. You have probably done this before. 

We want to take the list

    (list (make-posn 5 2) (make-posn 4 3) (make-posn 3 2))
and draw it as

{{% figure src="greysquares.png" width="150px" %}}

Ingredients:

* `gp->cp`: posn -> posn. A function that takes grid coordinates and
  puts out the computer coordinates of the center of the grid
  square. 
  
* `draw-squares`: list-of-posn(grid-posns) image -> image. Draw grey squares at
  every grid posn.

* `draw-h`: list-of-posn(grid-posns) -> image. Same as `draw-squares`,
  but pick a specific background.
  
## Interactive Clicking

Now we want to place a grey square every time we click inside the grid
box. The center of the square we place should be in the center of the
grid square, regardless of whether we click in the middle or on the
edge of the grid square.

Ingredients:
* `cp->gp`: posn -> posn. A function to translate computer coordinates
  to grid coordinates.
  
        (check-expect (cp->gp (make-posn 28 57) (make-posn 1 2)))

* `mouse-h`: A mouse handler using a list of posns for the model. Add
  the grid posn when you click.

```racket
(check-expect (mouse-h empty 28 57 "button-down")
              (list (make-posn 25 75))
```

## Combining

Put your functions together and make sure they work before you try to
do something more complex.
```
(big-bang empty
  (on-draw draw-h)
  (on-mouse mouse-h))
```


## Bonus

Add a key handler so that hitting backspace (key is `"\b"`) removes
the most recently placed square.

