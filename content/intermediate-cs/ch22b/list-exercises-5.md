---
title: "22b. List Exercises 5"
date: 2018-04-25T15:08:51-05:00
weight: 61
draft: true
#type: slide
#theme: white
description: "Further practice, retake quiz."
---

1. `count-by-three`: number(start) number(end) -> list of numbers. Generate a list of all of the multiples of three from `end` down to `start` (inclusive).

        (count-by-three 5 10) => (list 6 9)
        (count-by-three 3 12) => (list 3 6 9 12)
        (count-by-three 4 5)  => (list )
        (count-by-three 3 3)  => (list 3)
        
2. `find-it`: string(word) list of numbers -> list of strings. Change a list of numbers, into a list of the corresponding letters from the word. If the number does not correspond to a letter in the word, use "-".

        (find-it "dinosaur" (list 4 5 0)) => (list "s" "a" "d")
        (find-it "bad" (list 1 90)) => (list "a" "-")
        
3. `shop-for`: string(item) list of strings(names) list of numbers(prices) -> number. 
The lists "store" and "prices" give the costs of items. Find _item_ in the list and return its price.

        (define n (list "carrots" "bananas" "rice"))
        (define p (list 0.99         1.29     1.59))
        (check-expect (shop-for "rice" n p) 1.59)


