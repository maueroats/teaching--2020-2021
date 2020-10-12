---
title: "Ch6 Discussion 01"
date: 2019-11-12T15:13:20-06:00
weight: 61
draft: false
# type: slide
# theme: white
---

## Partial Evaluation


### P1

Given 

    f x y = 2*x+3*y
    moo = f
    
What kind of thing is `moo`? A number? A function? An error? 

    moo 10 1 == f 10 1
             == 23

### P2

Continuing:

    oom = f 100 10

What kind of thing is `oom`? A number? A function? An error? 

### P3 

Continuing:

    oof = f 10
    
What kind of thing is `oof`? A number? A function? An error?

## P4

What if you want to fill in `y` not `x`?

    f x y = 2*x+3*y
    
Options:

1. Named function: `g x = f x 1`
2. Unnamed function ("lambda"): `\x -> f x 1`
3. Flip: `(flip f) 1`

What's flip? It exchanges two inputs, like this:

    flip f x y = f y x

## Map

List comprehensions apply a function to everything in a list:

    [ f x | x <- xs ]

The map function does the same thing:

    map f xs
    
## Exercises

Try using some of the methods above (under P4 and map) to do these two
exercises several different ways.

1. Given input `[3,1,8]` produce the output `["abc", "a",
   "abcdefgh"]`. That is, give the first num letters of the alphabet.
   
2. Input: a list of points. Output: the greatest distance any of those
   points is from `(2,7)`.

