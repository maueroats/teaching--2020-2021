---
title: "Connect Four Rubric"
date: 2017-10-13T10:40:15-05:00
weight: 250
draft: false
---

**DRAFT: MAY CHANGE**

There are four functions that you are expected to design and test:

* `draw_board`: Create a String representation of the board.
* `is_legal_move`: True if the attempted move is legal. Used to prevent players from moving in full columns or playing in column -5.
* `is_won`: True if the game is over (either player has four in a row).
* `make_move`: Gives a new Board with a piece added. Assumes that the move is legal.

To keep scoring straightforward, each function is worth 10 points.

## Draw Board

This should draw with no issues, showing the board each row on its own line.
I do not anticipate problems with this function.

## Make Move

* 5 points: piece falls to the bottom of the row when empty (basic move)
* 5 points: piece falls to the appropriate place (follows all rules)

## Is Legal Move

* 5 points: moves outside of board are not allowed (column negative or too large)
* 5 points: moves not permitted in full column

## Is Won

* 5 points: horizontal and vertical wins detected
* 5 points: diagonal wins detected 

## Deductions

* Brute force instead of a thoughtful approach (-4)


