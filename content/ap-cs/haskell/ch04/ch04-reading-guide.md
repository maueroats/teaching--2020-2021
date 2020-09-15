---
title: "Chapter 4 Reading Guide"
date: 2017-09-17T20:47:05-05:00
tags: 
 - haskell
 - reading-guide
draft: false
weight: 10
description: Questions to help you understand Chapter 4.
---

## Sections 4.1--4.3

1. A pattern starts out with "dog","cat", "cat dog", "cat dog cat",
   "cat dog cat cat dog", "cat dog cat cat dog cat dog cat" and so on - each new string is created by appending the previous two with a space in between them. Write a function that takes in the number of the word in the sequence and returns the word, starting with 1 is "dog".

2. Write the function `scalar_mult :: (Num a) => a -> (a,a) -> (a,a)` that multiplies each number in a coordinate pair by the same number, so `scalar_mult 5 (1,3) == (5,15)`.

3. Write a signature and function body for `pair_prod` that takes in a list of ordered pairs of numbers and returns a list of the products of the pairs, so `pair_prod [(3,5), (10,0), (7,3)]===[15,0,21]`.

4. What pattern do you use to recursively process the first item in a list and the rest of the list?

6. Are parentheses necessary when writing a function using the pattern from the previous question? Explain why or why not.

5. What Haskell function is used to indicate that the user is asking the program to do something impossible?

7. A function `two_of` takes in a list of showable numbers and puts out a String that says "__ is item 2 of __". For example `two_of [10,25,50] == "25 is item 2 of [10,25,50]". Write the signature and function definition for `two_of`.

7. Write the type signature and function definition for `double_double` which takes in any list and produces the same kind of list. The `double_double` function makes a list where the first term of the input appears twice, follwed by the whole input twice, so 
```haskell
    double_double [5,10,15] == [5,5,5,10,15,5,10,15]
```
8. Write a function that takes in a number and returns "small" if the number is below 10, "medium" if the number is between 10 and 20 (inclusive), and "large" if the number is larger than 20. Do not use the `if...then...else` construct.

9. Define the function `burgers_of` using an infix definition so that
```haskell
    3 `burgers_of` "beef" == "Three hamburgers"
    5 `burgers_of` "soy"  == "Five tofu burgers"
    any other set of inputs gives "No thanks, not hungry"
```
10. Repeating yourself.
    1. What code segment do you see repeated in the version of the `bmi` function that includes the bmi calculating code? 
    2. What experience does the author compare writing to writing this code?
    3. What does the book suggest that you should do instead of this coding style?

## Sections 4.4--4.5

11. _Visibility_. What is the difference between where you can see terms from `let` bindings and `where` bindings?

12. The book says `let` bindings are expressions. What does this mean? Even if you don't know, at least give one consequence of that fact.

13. List five different ways to use `let` bindings:

14. You want to define two different variables in one let binding. Give two ways you can separate those definitions.

16. Are patterns in function definitions and the "case" statement interchangeable? Give one way they are and one way they are not.

<!-- 15. Write a function that takes in a string and puts out a string
"localhost" should produce "127.0.0.1"
"(anything).cps.k12.il.us" should produce "wyoung.org"
-->

