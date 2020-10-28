---
title: "Chapter 4 Quiz"
date: 2017-09-26T08:08:42-05:00
tags:
 - haskell
 - quiz
weight: 60
draft: true
description: "Mountain range."
---

All functions should include appropriate type signatures.

1. Define a function f that takes one number as input. If the number
   is 1 or 100, the answer is 99. If the number is 1000 or 10000, the
   answer is 6. In any other case, the answer is five times the input. 

## Mountain Questions

The questions below all refer to a "mountain range", which is a list
of integers specifying the height in feet above sea level. 

* Base camp is half of the height of the highest mountain.
* New mountains start/end when altitude goes above/below base camp.
* The mountain range data is guaranteed to begin and end with a number
  below the height of base camp.

Example:
```haskell
     mountains = [0, 50, 100, 99, 98, 50, 75, 60, 20, 10, 15, 10, 90, -5]
     highestPeak mountains == 100
     baseCamp mountains == 50
     countPeaks mountains == 3
     tallestWidth mountains == 4
```
In the example above, the three mountains are:

* `[50,100,99,98,50]` with width = 4
* `[50,75,60,20]` with width = 3
* `[10,90,-5]` with width = 2

2. Find the height of the highest mountain..

3. Write a function to find the height of base camp.

4. Write a function to count the number of peaks. 

5. Write a function to estimate the width of the tallest mountain.

