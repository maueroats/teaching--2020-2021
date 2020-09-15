---
title: "Ch6 Discussion 03"
date: 2019-11-19T13:18:07-06:00
weight: 63
draft: false
#type: slide
#theme: white
---

Learn: `filter` and `foldl`. 

I will write `foldL` and `foldR` so it is clear that the last
character is a ell not a one. There are also functions `foldl1` and
`foldr1`.

## Examples

     filter (>=0) [5,-1,3,4,-8]
     filter (0>=) [5,-1,3,4,-8]
     
Find want all numbers x from a list so that `x^2` is less
than 100. 

     filter (\x -> x*x <= 100) [5,90,13,-4]


## Exercises 1

1. Find all of the words of length at most 7.

        words1 = ["cat","wombat","caterpillar","platypus","dog"]
        

## foldL

Use `(++)` to produce a list of all of the numbers in any list, in the
order they appear, and beginning with a 0 (which does not count as an
element from a list).

    foldl (++) [0] [[1,2,3],[4],[5,6,7,8]]
    
## Exercises 2

1. Suppose 999 represents an unavailable score. Find the largest score
   in the list using `foldl`.
   
        scores = [4,70,30,999,80,50]
        
2. Use `foldl` to find the sum of all odd numbers in a list.

3. Multiply all of the numbers in the list, going left to
   right. Except if you find a 0 resert the product to a 1.
