---
title: "22. List Intro"
date: 2018-02-23T11:14:59-06:00
weight: 10
draft: false
#type: slide
#theme: white
description: "An introduction to lists in Racket."
---
We started learning about lists. (Chapter 22-23 in Picturing Programs.) Picturing Programs can be kind of long-winded in these chapters.

[Alternative sources]({{% relref "list-resources.md" %}}).

Things to know:

*    Empty lists: `empty` or `(list )` or `'()`
*    `empty?` : list -> boolean
*    (list "a" "b" "c") 
*    `first`: list of Things -> Thing
*    `rest`: list -> list
*    Advanced: `list*` to add to the front of a list
*    Contract example: `(-> (listof number?) number?)`

List processing always begins with a choice (conditional) to see if
the list is empty or not. The else clause almost always contains
(.... (first the-list) ... (rest the-list)...) combined in some way.

## Design process

Simplified design process:

1. Write down lists of length 0, 1, and 2, and their results
2. Write a program to get the correct answer with a list of length 0
3. Modify your program to get the correct answer with a list of length 1 (and still have length 0 correct)
4. Modify that program to keep the correct answers and get the length 2 list to give the right answer. This is the step that will usually involve (rest the-list).

## Skeleton 

The skeleton is very important for list-processing problems. It
usually has a form like this:

    (define (do-something the-list)
      (cond [(empty? the-list) ...]
            [else 
              (... (first the-list) ...
                   (do-something (rest the-list)))]))

Write down a skeleton like that when you are working through a list.
