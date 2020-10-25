---
title: "Utilities"
date: 2020-10-25T15:10:17-05:00
weight: 25
draft: false
#type: slide
#theme: white
---

There are a few simple utility functions that make working with the
board a lot easier.

* `get1k :: Board -> Square -> Int`: Get the number at a certain
location on the board. 

        get1k [100..113] 5 == 105

* `zero1k :: Board -> Square -> Board`: Set a certain square to zero,
leaving the others alone.
        
        zero1k [100..105] 3 == [100,101,102,0,104,105]

* `add1k :: Board -> Square -> Int -> Board` Add a given number to the
value at a given square. Produce the new board.

        add1k [100..105] 3 50 == [100,101,102,153,104,105]
        
