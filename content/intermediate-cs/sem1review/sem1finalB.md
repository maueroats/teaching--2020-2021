---
title: "Sem.1 Final B"
date: 2021-02-02T08:08:28-06:00
#weight: 
draft: false
#type: slide
#theme: white
description: "Final exam, Part B." 
---

You should have already completed Part A, programming the `in-shape?`
function.

## Part B

1. Simplify as much as possible.

```
(define (clean-teeth? minutes-brushing toothbrush? sugar-toothpaste?)
  (and (boolean=? true toothbrush?)
       (and (boolean=? sugar-toothpaste? false)
            (booolean=? (not (< minutes-brushing 2))
                        true))))
```

2. Identify the type of model and write the draw handler (only!). A
   radius 10 solid red circle rotates around just inside the perimeter
   of a solid yellow circle of radius 100. The red circle should be
   able to follow the mouse around the circle.
   
3. Make an animation that shows "woof" when you click on a 50x50
   square the lower right corner and "rowr" when you click on the same
   sized square in the lower left corner.

    
