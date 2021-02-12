---
title: "20. Intro Quiz"
date: 2020-01-24T10:51:44-06:00
#weight: 
draft: false
#type: slide
#theme: white
---

You may use anything from your `posn-util.rkt` without comment.

1. Write `is-box?: posn -> boolean` which returns true when the given
   point is in the illustrated box.
   
   {{% figure src="box-diagram.jpg" width="300" %}}

2. Write `p-circle`. 

        p-circle: posn(center) posn(edge-pt) image(background) 
                  -> image

    Draw a red circle on the given image background. The center of the circle
    should be at the posn `center`. The
    `edge-pt` should be on the perimeter or boundary of the circle.
