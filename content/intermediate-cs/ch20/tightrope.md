---
title: "20. Tightrope"
date: 2017-12-19T08:25:54-06:00
draft: false
#type: slide
#theme: white
description: "A square changes color as you balance between two circles."
weight: 40
---

* There are two unmoving blue circles on the screen.

* You can move a square with the mouse.

* Square color is:
   
    - Green if the distance from the square to circle 1 and the distance from the square to circle 2 are within 20 of each other.
    - Red otherwise.

Some people had trouble understanding this description. In a computer-like language:
```text
a = distance from square to circle 1
b = distance from square to circle 2
green if a and b are within 20 of each other
```
    
Write:

1. Model
2. The function `square-color: model -> color`.

