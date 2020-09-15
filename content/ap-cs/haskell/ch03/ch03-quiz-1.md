---
title: "Chapter 3 Quiz 1"
date: 2017-09-19T08:59:37-05:00
weight: 201
tags: 
 - haskell
 - quiz
draft: true
---

1. Write a good (technically correct) type signature for

    1. `f(x) = x*(x+1)`
    2. `g(xs) = [ x/7 | x <- xs ]`
    3. `h(x) = "You told me "++(show x)`
    4. `k(x,y) = y*x - 5`

2. Write a function to extract an integer from one string and output
   a list containing the second string repeated that many times.
```haskell
    prob2 "5" "dog" == ["dog","dog","dog","dog","dog"]
```
3. Given two strings containing floating point numbers, return the sum
   of those numbers.
```haskell
    prob3 "3.14" "2.81" == 5.95
```
4. The root mean square of a list of numbers is the square root of the
   average of the squares of the numbers. Write a function to find the
   RMS of a list of floating point numbers.
```haskell
     -- results are approximate
     prob4 [1, 10, 100] == 58.0259 
     prob4 [3.14, 2.81] == 2.979
```
5. The mode of a list of integers is the number that appears the most
   often. Write a function to find the mode of a list of integers.
```haskell
     prob5 [1,1,1,2,2,2,2,2,3,3] == 2
     prob5 [1,1,1,2,2,2] == 1 -- any one of the modes is ok
```
