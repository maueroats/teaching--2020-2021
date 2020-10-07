---
title: "Chapter 3 Daily 08"
date: 2020-10-06T11:21:08-05:00
weight: 108
draft: false
#type: slide
#theme: white
description: "Sum by hand."
---

1. Rewrite and simplify this function. At the very least get rid of
the `[0..4]`.

        helper letter = True `elem` [if (vowels !! x) == letter then True else False | x <- [0..4]]


2. Insert a 4 after every 3.

## Sum By Hand

Old-school addition is done in columns.

     5148
    + 927
    =====
     6075
     
We are going to write a Haskell program to add numbers given in lists
of their digits.

### Order Matters

When you put the digit with the greatest place value first, like we do
traditionally, then you can end up with lists where the corresponding
digits do not have the same place value. For example:

    [5,1,4,8]
    [9,2,7]
    
Notice that 5 and 9 are both the first number, but they do not have
the same place value: 5 is thousands and 9 is hundreds.

One way to deal with that problem is to write the digits in "reverse"
order, so the ones digit always comes first. 

    [8,4,1,5]
    [7,2,9]

This makes corresponding digits have the same place value, so it is
easier to add them. Do some examples and think carefully about this
idea to make sure you understand it.

### Outline

1. Write an `adder` function that adds corresponding digits but does
   not regroup.
   
        adder [8,4,1,5] [7,2,9] == [15,6,10,5]

2. Write a `regroup` function that handles regrouping of a single
   number (list of digits).
   
        regroup [15,6,10,5] == [5,7,0,6]


