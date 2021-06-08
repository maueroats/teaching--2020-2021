---
title: "Reversi Flip Plan" 
date: 2021-06-03T13:38:55-05:00
weight: 137
draft: false
#type: slide
#theme: white
description: ""
---

In "true reversi", a play is required to flip one of the opponent's
pieces. There are multiple sensible ways for you to program piece
flipping, one is explained here.

This outline is just for context; there is nothing to write (yet)
using the information on this page. 

## Flipping Plan 

* Determine how many steps in a given direction should be
  flipped. In this plan, this is the most important step. It is
  described below.
* Use `ray-one` to generate a list of all of the posns of pieces that
  should be flipped.
* Write a helper function (`board-flip-some`) to update the board by
 flipping all of the pieces in a given list. The signature in this
 case would be
 
        board-flip-some: list-of-piece(board) list-of-posn -> list-of-piece

## Upcoming

The next section explains how to create a function that will find how
many pieces are flipped by a certain play.

