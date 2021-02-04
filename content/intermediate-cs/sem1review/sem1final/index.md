---
title: "Sem.1 Final"
date: 2021-02-02T08:08:28-06:00
#weight: 
draft: false
#type: slide
#theme: white
description: "Final exam, Parts A and B."
---

{{% use-mathjax %}}
{{% use-goodlists %}}

## Part A

You are working in people coordinates to determine if a point is
inside this 200x100 shape. 
People coordinates in this problem means $(0,0)$ in the lower left.
The rounded corners are quarters of radius
50 circles. There is an animation to demonstrate, but you do _not_
need to write the animation!

{{% figure src="final-bread-1.png" %}}

1. Create this shape in DrRacket.
1. The purpose of `in-shape?: number(x) number(y) -> boolean` is to
return true if the point (x,y) is inside this shape. Write:
     1. Write a check-expect that returns true.
     2. Write a check-expect that returns false even though the point
        (x,y) is inside the rectangle with $0\le x \le 200$ and $0 \le
        y \le 100$.
3. Write the `in-shape?` function.

## Part B

1. Simplify as much as possible.

```
(define (clean-teeth? minutes-brushing toothbrush? sugar-toothpaste?)
  (and (boolean=? true toothbrush?)
       (and (boolean=? sugar-toothpaste? false)
            (boolean=? (not (< minutes-brushing 2))
                        true))))
```

2. Identify the type of model and write the draw handler (only!). A
   radius 10 solid red circle rotates around just inside the perimeter
   of a solid yellow circle of radius 100. The red circle should be
   able to follow the mouse around the circle.

<table>
<tr>
<td> {{% figure src="final-red-1.png" width="100" %}}  </td>
<td> {{% figure src="final-red-2.png" width="100" %}} </td>
</tr>
</table>
   
3. Make an animation that will show a given word until you click
 again. 
 
 * The background is 300x200. 
 * Clicking on a 50x50 square the
 lower right corner shows "woof". 
 * Clicking on the same sized square in
 the lower left corner shows "rowr". 
 * Clicking anywhere else shows nothing (blank).
 
 The red dots below show where the clicks occurred.

<table>
<tr>
<td> {{% figure src="final-speak-0.png" width="100" %}} </td>
<td> {{% figure src="final-speak-1.png" width="100" %}} </td> 
<td> {{% figure src="final-speak-2.png" width="100" %}} </td>
</tr>
</table>


