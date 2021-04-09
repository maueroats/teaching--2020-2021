---
title: "Bubble Review"
date: 2019-03-17T22:02:50-05:00
weight: 45
draft: false
#type: slide
#theme: white
description: "Review for upcoming test on bubble wrap and hangman."
---

There will be some program tracing and some problem solving.

## Program 1

Trace the following program to figure out what it does.

    (define (prog1 n)
      (cond [(< n 5) 10]
            [(= 1 (remainder n 2)) (+ 1 (prog1 (- n 1)))]
            [(not (= 1 (remainder n 2))) (+ 3 (prog1 (- n 2)))]
            [else (+ 5 (prog1 (- n 3)))]))

1. `(prog1 2)`
2. `(prog1 5)`
3. `(prog1 6)`
4. `(prog1 8)`

## Program 2

Trace the following program to figure out what it does.

    (define (prog2 s)
      (cond [(< (string-length s) 2) ""]
            [(string=? "a" (substring s 0 1))
             (prog2 (substring s 1))]
            [(string<=? "b" (substring s 2))
             (string-append "x" (prog2 (substring s 1)))]
            [else
             (string-append "y" (prog2 (substring s 2)))]))
             

1. `(prog2 "a")`
2. `(prog2 "ca")`
3. `(prog2 "abcd")`
4. `(prog2 "abbbcd")`
4. `(prog2 "abcdef")`

## Writing 1

A bubble is poison if its color is green and its x and y coordinate
differ by less than 20. 

1. Write a program to identify a poison bubble. Use the struct given 
   for the type of a bubble.

        (define-struct b (center radius color))
        
        
2. In your bubble wrap game, the model is a list of bubbles. Rewrite
   the mouse-handler so that when you click on a poison bubble, one
   additional bubble appears on the screen.
   
