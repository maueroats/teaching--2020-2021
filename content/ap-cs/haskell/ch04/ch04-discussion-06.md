---
title: "Chapter 4 Discussion VI"
date: 2019-11-04T14:30:20-06:00
weight: 38
draft: false
#type: slide
#theme: white
description: "The alternating series."
---

The alternating series is 

    [1, -1/2, +1/3, -1/4, +1/5, -1/6, ...]
    
1. Define `altTerm n` to be the nth term in the sequence.

2. Define `altSeq m` to be the list of the first m terms in the
   sequence. 
   
3. Write a function to find the sum of the first `k` terms of the alternating
   series.
   
4. Write `waltSum`, which takes in a list of numbers, multiplies each
   term by the corresponding term in the alternating series, and then
   adds up the sums.
   
     Example: 
   
        waltSum [5,10,15] == 1*5 + (-1/2)*10 + (1/3)*15


5. The `goalt x` function adds up the terms in the alternating series
   until it comes on a term that is less than `x` in absolute value.
   
     Example:

        goalt 0.21 == 0.5833...
        

Remember: `fromIntegral` when you need to divide something by an
Int.
