---
title: "Chapter 4 Problem Set"
date: 2017-09-20T20:32:15-05:00
tags:
 - haskell
 - homework
draft: false
weight: 40
description: Exercises to improve your Haskell programming.
---

Key new concepts: patterns, guards, where, let, case.

{{% notice note %}}
Please write function signatures for every solution.
{{% /notice %}}

Some of these problems are classical exercises with solutions
online. Please do not search for them or read them before turning in
your work. 
(See [_Academic Integrity_]({{% relref "resources/Academic-Integrity.md" %}}).)

## Exercises

1. _First Third_. Return the sum of the first and third elements in the list. Example: `firstThird [10,30,50,90] == 60`.

2. Take a list of items that can be compared for equality `(Eq a)` and 
   reduce repeats to a single element. Only reduce repeats that are next to each other in the list.
```haskell
     noTwins [1,1,5,1,2,2,2] == [1,5,1,2]
```
3. ([CodingBat sum67.](http://codingbat.com/prob/p111327))
Return the sum of the integers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
```haskell
sum67 [1, 2, 2] == 5
sum67 [1, 2, 2, 6, 99, 99, 7] == 5
sum67 [1, 1, 6, 7, 2] == 4
```
4. (Discuss!) Make a `newFibonacci` function that takes in the two starting values for the Fibonacci sequence (usually 1 and 1) and then the term in the sequence that you want, and computes that term in the sequence.
```haskell
      newFibonacci 1 1 10 == 55
      newFibonacci 5 8 9 == 233
```
Hint: Get the standard Fibonacci `fib` function working, then move it completely inside a `l
et` binding so you can alter the starting values.

## Block Game

[Block Game](http://usaco.org/index.php?page=viewproblem2&cpid=664). Do this bronze level USA Computing Olympiad problem. (You should start with a list of pairs of words, that is `[(String,String)]`; you do not have to read them from a file.)

## Laser Tag

We discussed these in class. You should be able to do them. If you missed class, talk to someone who was there.

5. _Laser Tag I_. You are playing laser tag on the integer coordinate plane. You stand at `(x0,y0)` and fire your laser parallel to one of the axes. We will write the direction using unit coordinates, so `(1,0)` will be the positive x-direction. The coordinates of the other players are in a list. Assuming that you hit a player, report the coordinates of the player who is hit.
```haskell
      laserTag (1,2) (0,1) 
               [(5,2), (1,-4), (1,50), (1,25), (1,30)]
               == (1,25)
```

6. _Laser Tag II_. (Save for later if needed.) We continue to play the
laser tag game, except now there are both people and double-sided
mirrors oriented at 45 degrees to the coordinate axes. Represent the
objects by triples `(x,y,c)` where c is a character `*` for a person,
`/` or `\` for a mirror (depending on the orientation). Assume that
eventually the laser will hit someone (maybe you?!). Find the
coordinates of the person who gets hit.
```haskell
     laserTagMirrors (1,2) (0,1) 
                     [(1,2,'*'), (5,2,'*'), (1,5,'/'), (4,5,'*'), (-3,5,'*')]
                     == (4,5)
```

 Flipping the mirror at (1,5) should make the answer (-3,5). 
 You should draw some test cases and make a tester function to verify your code is correct when there are more mirrors.

## Dangers and Annoyances

The `\` character is an "escape character", so to include it in a
string, you need to write `'\\'` (a Char) or `"\\"` (a String).

