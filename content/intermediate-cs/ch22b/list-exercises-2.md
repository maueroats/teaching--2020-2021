---
title: "22b. List Exercises 2"
date: 2018-04-04T21:37:45-05:00
weight: 30
draft: false
#type: slide
#theme: white
description: "Vocabulary for list functions. More practice problems."
---

## Vocabulary

There are four major kinds of functions on lists that we will learn to write. They are: reduce, create, map, and filter.

* reduce: Any function that takes a list of things and produces a single thing. For example: `add-them`, which adds all of the numbers in a list of numbers. Functions like `sea-of-stars` that take a list of posns and produce an image also fall in this category.

* create: A function that creates a list from something that is not a list. Example: `multiples-of-7`, which takes a number N and produces a list of the first N multiples of 7.

* map: A function that performs the same action on every thing in a list of things, giving a list of things as its answer. Example: `double-all` which doubles every number in a list.

* filter: A function which removes some items from a list of items, leaving a list of items. Example: `remove-small` which removes every number less than 20 from a list of numbers.


## Practice Problems

1. `my-range`: number(start) number(end) -> list of numbers. Create a list containing all of the numbers from start to end, inclusive. Example: `(my-range 5 11) => (list 5 6 7 8 9 10 11)`.

2. `two-power`: number(n) -> list of numbers. Create a list of powers of two, starting with 2^n and ending with 2^0. Example: `(two-power 5) => (list 32 16 8 4 2 1)`.

3. `double-all`: list of numbers -> list of numbers. Double each number in the list. Example `(double-all (list 1 30)) => (list 2 60)`.

4. `remove-small`: list of numbers -> list of numbers. Create a list that excludes numbers smaller than 20 from the original list.


