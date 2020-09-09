---
title: "WeScheme"
date: 2017-09-09T07:00:30-05:00
draft: false
description: "Notes on how WeScheme is different from DrRacket."
---

WeScheme is a browser-based version of Racket. It works well for at
least the first semester of Intermediate Computer Science.

## Special notes for WeScheme users

You can use [WeScheme](http://wescheme.org) if you cannot install 
[DrRacket](https://racket-lang.org). 
For example, if you have a Chromebook for your home computer. 

There are a few differences:

* Omit the `(require picturing-programs)` line.

* (**Chapter 1**) See the [WeScheme starter code]({{% relref
  "WeScheme-Ch1" %}}).

* (**Chapter 3**)
Instead of copy and pasting in a picture, you need to copy the link for the image and use `bitmap/url` like this:
```racket
(bitmap/url "https://www.what-dog.net/Images/faces2/main004.jpg")
```

* (**Chapter 6**) Inside `big-bang` you need to use the phrase `to-draw` instead of `on-draw` that we use in DrRacket.
{{< highlight racket "hl_lines=8" >}}
(define (draw-handler model) 
    (overlay model (empty-scene 300 200)))
(define (tick-handler model) 
    (scale 1.01 model))

(big-bang (circle 10 "solid" "green")
          (on-tick tick-handler)
          (to-draw draw-handler))
{{< / highlight >}}

