---
title: "Reversi Structs" 
date: 2021-06-01T13:29:47-05:00
weight: 105
draft: false
#type: slide
#theme: white
description: "Structures used in reversi."
---

One key question is: how do you want to represent your players? 

A name (string) or a number both work. Discussion about this
choice is good - write a choice and why you think that will be better

Another question is: in your game model, do you want to represent the
pieces of each player in one list for the entire game, or one list for
each player?

Both of those choices work, and discussion is essential if you want to
understand the implications of each choice.

In the writing below I make one choice to make the guide easier; feel
free to choose a different method if you prefer.

## Piece

A piece holds the information of which player controls it ("team") and
the location of the piece on the board.

    (define-struct piece (team loc))
    
* The `team` should be the method you chose, above.
* The `loc` should be a posn in "grid coordinates". 

## Game

You can call your game mode `game` or just `m` for "model".


    (define-struct game (board player mode mouse))

The fields represent:

* `board`: a list of `piece`. In this writeup, both players' pieces
  are stored together in a single list.
* `player`: the current player, should be the same type of object as
  `team` in a `piece`;
* `mode`: a number used to change the way placing pieces behaves - to
  discuss later; 
* `mouse`: the most recent position of the mouse, a posn in grid
  coordinates. 
  
