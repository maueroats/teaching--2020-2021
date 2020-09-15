---
title: "Haskell CW II.3"
date: 2018-09-11T09:15:40-05:00
weight: 16
draft: false
#type: slide
#theme: white
---

This page is full of tiny pieces to help you get better at programming Haskell.

Goals:

* Range notation `[a,b..c]` to make lists of integers.
* Apply a function to everything in a list by using the "list
  comprehension".
* Filter out some elements from an existing list using a list
  comprehension. 


## Micro-projects

1. A list of the first 1000 integers.
2. A list of the first 1000 perfect cubes.
3. Find the sum of the first 100 perfect squares.
4. The type signature for the integer sum above.
4. A list of all of the perfect squares between 90 and 1919.
5. The type signature for a list of integers.
5. The _product_ of the numbers in the list of perfect squares above.
5. A function `sqList` to give all of the perfect squares between `lower` and
   `upper`.
6. The type signature for the function `sqList`. 
6. Use your function to get the first 17 perfect squares between 1500
   and 4500.
6. Write a new function sq25 that will return the first 25 perfect
   squares between `lower` and `upper`. (If there are not 25, the
   function will return however many there are.)
7. A list with every fourth lowercase letter, starting at 'a' then
   'd'. (Hint: letters work the same as numbers.)
8. A string with the last half of the alphabet (beginning with 'n').
9. Write a function that takes in a list and produces a list of
   ordered pairs  `(item, more)`, giving the item and how many more
   items after it are in the list.

## Basic functions

1. The remainder when 921013 is divided by 31.
2. The whole number of times that 23148 is divisible by 17.
3. Find five to the twelfth power.
4. Find seven to the 707 power.

## Medium functions

Write the signature for each.

5. Write a function `mySmall` that takes in four integer inputs and returns the
   smallest.
6. Create a function `myStarts` that takes in two lists and returns a tuple with
   the first element from each list.
7. Write `myMix` that takes in two lists and gives a tuple with the
   first element from the first list and the last element from the
   second list.
   
     ```haskell
     myMix [1,2,3] [10,20,30] == (1,30)
     ```

7. Create `dublr` that takes in one list and returns a new list
   consisting of the same information forward then backward.
   
     ```haskell
     dublr [1,2,3] == [1,2,3,3,2,1]
     ```

## Step up

1. Write a function `sqLast25 lower upper` that will return the last 25 perfect
   squares between lower and upper (inclusive).
   
     ```haskell
     sqLast25 :: Int -> Int -> [Int]
     ```


## Obscure

1. What is the successor of the character 'Z'?
2. How about the [predecessor](http://hackage.haskell.org/package/base-4.11.1.0/docs/Prelude.html#v:pred) of the character 'A'?

## Notes

* There is a small [difference between `div` and
  `quot`](http://hackage.haskell.org/package/base-4.11.1.0/docs/Prelude.html#v:quot)
  although both are the same for positive numbers.
  

