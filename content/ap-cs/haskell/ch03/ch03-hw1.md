---
title: Chapter 3 Problem Set
date: 2017-09-14T10:00:00-05:00
lastmod: 2017-09-15T14:53:00-05:00
tags:
 - haskell
 - hw
 - homework
draft: false
weight: 30
---

The essentials of the Types and Typeclasses chapter are: writing type
signatures for functions, reading string inputs with the `Read` class,
and dealing with Integral to Fractional conversions when they are needed.
<!--more-->

1. You can explicitly say what type a number is by using two
   colons and the type you want - for example, (5::Int) or
   (5::Float). Find the types of each of the operations below, or say _in English_
   why it does not work. Do not just copy error messages.

    * (/)
    * (5::Int) / (10::Int)
    * (5::Int) / (10::Float)
    * (5::Float) / (10::Float)
    

2. Write a function to find the average of numbers in a list. This
   should bring up the difficulty that you cannot divide an integer by an integer(!).

    Examples: `avg [10,20]` should give `15` or `15.0`, and `avg [3.5, 4.5]` should give `4.0`. 

3. Write a signature and function body for `add10Word` which reads an
   integer from a string and adds 10 to it.

    Example: `add10Word "15"` should produce `25`.

4. Write a signature and function body for `numberInSentence`, which
   takes a number and returns the sentence "I have ___ pounds of flour."

    Example: `numberInSentence 5.5` reports "I have 5.5 pounds of flour."

5. Write a signature and function body for `doubleDebt` which takes a
   String and puts out a Float. The String contains a floating point
   number that represents how much money someone owes, and the Float output
   is twice that much.

    Example: `doubleDebt "50.10"` produces `100.20`.

6. Write a signature and function body for `sampleStdDev` that finds
   the [sample standard deviation]
   (https://en.wikipedia.org/wiki/Standard_deviation) of a list of
   (the right kind of) numbers. Check the type signature for square
   root ([`sqrt`](http://hoogle.haskell.org/?hoogle=sqrt&scope=set%3Ahaskell-platform))! 

    Please do not skip this problem with the excuse that you do not know how to find standard deviation. Look it up or ask someone who knows! 

10. _Possibly Challenging_: Write the function `median` to find the
median of a list of items that can be ordered. (Use the type `Int`, if
you prefer.) Assume the list is sorted.

We will learn how to sort a list later, but it goes like this:

```haskell
    import Data.List
    result = sort xs
```
