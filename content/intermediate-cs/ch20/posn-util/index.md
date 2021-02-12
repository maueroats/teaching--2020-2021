---
title: "20. Posn Util"
date: 2019-01-08T08:32:15-06:00
draft: false
#type: slide
#theme: white
weight: 10
description: "Utility functions for posns. Accessing functions defined in other files."
---

The functions in 20.5 are all useful later. When you do them, you should 
save them in a file called `posn-util.rkt`. (Please use that name.)

{{% notice note %}}
You may download [my posn utilities file](posn-util.rkt) if you write
your functions on paper instead of typing them. There is also a
[WeScheme
posn-util](https://www.wescheme.org/view?publicId=MGNsfDhQmk)
published February 2021.
{{% /notice %}}

The following functions should be in `posn-util.rkt`:

* `posn=?`: posn posn -> boolean. Are both positions exactly the same? (Both corresponding coordinates match.)
* `posn-add`: posn posn -> posn. Add corresponding coordinates.
* `posn-sub`: posn posn -> posn. Subtract corresponding
  coordinates. First minus second.
* `posn-scale`: number posn -> posn. Multiply both coordinates by the
  same number.
* `posn-distance`: posn posn -> number. The distance in the plane between
  the points specified by the two posns.
* `place-image/posn`: image posn image(background) -> image. Purpose:
    Place one image at a given set of coordinates on a given background.
* Anything else you want to have available for re-use. (Maybe from
  physics or trig...)

You should write tests for yourself. You are going to use these
functions for a month, so you do not want any mistakes. If you really
need them, you can see [some tests I wrote](posn-tests.rkt).

