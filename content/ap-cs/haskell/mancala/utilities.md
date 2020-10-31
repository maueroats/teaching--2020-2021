---
title: "Utilities"
date: 2020-10-25T15:10:17-05:00
weight: 25
draft: false
#type: slide
#theme: white
description: "A few simple utility functions that make working with the board a lot easier."
---

These utility functions are kind of simple. There are a few reasons to
write them separately (see bottom).


* `get1k :: Board -> Square -> Int`: Get the number at a certain
location on the board. 

        get1k [100..113] 5 == 105

* `zero1k :: Board -> Square -> Board`: Set a certain square to zero,
leaving the others alone.
        
        zero1k [100..105] 3 == [100,101,102,0,104,105]

* `add1k :: Board -> Square -> Int -> Board` Add a given number to the
value at a given square. Produce the new board.

        add1k [100..105] 3 50 == [100,101,102,153,104,105]
        

## Why make these functions?

These functions are simple enough that you might wonder why even
bother making them functions. The code could just be "inlined"
(written out) in the few places it is used.

* Functions give "meaning" to formulas. For example, "get the item at
  square k" rather than (`formula_thing!!k`).
* Functions make it easier to change the way you represent the board
  (later). You just edit these few functions instead of finding all of
  the little formulas scattered throughout your code.
* Functions let you isolate the thinking about these small
  cases. Thinking about small jobs by themselves is easier than
  thinking about them in the middle of making a much larger function.
  

## The names stink

Sorry. I agree. Make up your own, or use these:
```
get1k = square_get
zero1k = square_zero
add1k = square_add
```
