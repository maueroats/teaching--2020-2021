---
title: "Chapter 4 Discussion IV"
date: 2018-09-28T11:18:26-05:00
weight: 36
draft: false
#type: slide
#theme: white
description: "A few practice problems from a Thursday review session."
---

1. **Target**. `tgt :: Integer -> [Integer] -> Integer`. Given a target
   number and a list of numbers, find the smallest distance between
   the target number and any number in the list.

     ```haskell
     tgt 5 [3,8,10,4]  == 1
     tgt 6 [10,4,30,50,9]  == 2
     ```

2. Take in an ordered pair (x,y) and a list of floating point xs. Find out if the ordered
   pair is on the graph of y=x^3 corresponding to one of the
   xs. Return true if it is, false if not.

3. **Splash**. Inputs: a list of ordered pairs and a point (one
   ordered pair). Output: All ordered pairs in the list within
   distance 10 of the point.
   
