---
title: "20. Review"
date: 2018-01-10T09:54:08-06:00
draft: false
#type: slide
#theme: white
weight: 70
description: "Review questions on posn and color."
---

Write checks and follow the design process as you write these functions.

1. Move to parabola. Input any point, output a point on the graph of `y=x^2`.
Find the output point by moving vertically up or down from the input point until you reach the graph of `y=x^2`.

    ```text
to-parabola: posn(initial) -> posn
```

    If you have time, make an animation that shows a gray circle where the mouse is and then connects that via a gray line to a blue circle on the parabola. You can use [my 400x400 parabola image](bg-parabola.png) to see the whole parabola. (Read the [code I used to make the parabola](parabola-maker.rkt) if you want.)

     If you want to see an upward facing parabola in people coordinates,
you should use the formula below:

    ```racket
(define (f x)
        (+ 200 (* -1/200 (- x 200) (- x 200))))
```



2. Input a color, output a new color.

    ```text
mix-color: color -> color
```

    * output red is twice the input amount of green
    * output green is the average of the input red, green, and blue
    * output blue is 50 units less than half of the red input

3. **Hot-Cold**. Take in a posn and output a color. The color will depend on the distance of the point from (100,200). 

    * distance < 100: pure red
    * distance > 355: pure yellow
    * in between: red is  255 minus distance, green is distance minus 100, blue is 0
   
    ```text
hot-cold: posn -> color
```

