---
title: "22b. List Exercises 1.5"
date: 2019-03-05T13:54:56-06:00
weight: 25
draft: false
#type: slide
#theme: white
description: "Elementary exercises with lists."
---

1. `more-rand: number(x) list of numbers(nums) -> list of numbers`
   Give a new list with x and an additional random number from 0
   through 9 put on the front of the more-rand list.
   
        (check-random (more-rand 5 (list 1 2 3)) 
                      (list 5 (random 10) 1 2 3))

2. `maybe-no-5: list of numbers -> list of numbers`. If the first
   number in the list is a 5, skip it, otherwise return the whole
   list.
   
        (check-expect (maybe-no-5 (list 1 5 51)) (list 1 5 51))
        (check-expect (maybe-no-5 (list 5 9 14 23)) (list 9 14 23))
        
3. `pemo: list of numbers -> number`. Find the sum (plus) all of the
   even numbers in the list and subtract (minus) all of the odd
   numbers in the list.
   
        (check-expect (pemo (list 10 30 5 20 10 11)) 54)
        
4. `cram-small: list of strings(words) -> string`. Take all of the
   words that are less than 5 letters long and combine them all into
   one big string.
   
        (check-expect (cram-small (list "cat" "goose" "bear" "dolphin")) "catbear")

