---
title: "Haskell CW II.4"
date: 2020-09-15T12:23:08-05:00
weight: 17
draft: false
#type: slide
#theme: white
description: "Intro to functions and signatures."
---

{{% use-mathjax %}}

Please write type signatures for all of your functions.

## Introduction

```
demo n xs = [ n*x | x <- xs]
```

1. Write an example of how you would call `demo`.
2. What is the type signature of `demo` assuming we make all numbers
   `Int`.
3. Add an exception so that `demo 0 anything` always returns the empty
   list.

4. We are going to learn about the `(x:xs)` pattern that we use to
   write recursive functions, like `first` and `rest` from Racket.
   Use that method to write a recursive demo function.
   
5. Check for understanding: write `mylength`, a recursive function
   that finds the length of a list of numbers.

## Exercises

1. Write a function that takes in an Int and always returns 5.
2. Change `f` so that when the input is 0 it returns 8, and when the
   input is 1 it returns 13.
3. Change `f` more so that it makes a Fibonacci sequence beginning
   with the 8 and 13 that you already have.
   $$f(n) = f(n-1) + f(n-2).$$
   
4. Write a function `sub5` that takes in a list of integers and puts
   out a list of integers five less than the inputs.
   
5. Write a function `skip13` that takes in a list of integers and puts
   out a list of integers that is the same except excluding any 13s.

6. (`sumByHand`): Write a recursive function that adds all of the
   numbers in a list.
   
7. Write a function `before14` that takes in a list of integers and
   inserts a 13 before every 14 in the list.
   
   
