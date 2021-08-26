---
title: "Reversi Stack" 
date: 2021-06-15T21:30:45-05:00
weight: 150
draft: true
#type: slide
#theme: white
description: ""
---

This page describes a variation called "Reversi Stack". 

## Big Picture

* A Piece now includes a stack field to count how many pieces are
  stacked up at that location.
  
        (define-struct piece-stack (team loc stack))

* Playing on your own stack increases the number of
  pieces in your stack by one.
* Playing on an empty square makes a stack of one of your own pieces.
* Playing on an opponent's stack decreases the size of the stack by
  one, leaving the square empty if there are zero pieces in the stack.
* The draw handler puts a number on each piece drawn, showing how
  many pieces in the stack.

