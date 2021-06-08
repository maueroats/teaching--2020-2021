---
title: "Reversi Board" 
date: 2021-06-03T13:38:55-05:00
weight: 135
draft: false
#type: slide
#theme: white
description: ""
---

The first issue in dealing with "true reversi" is getting pieces from
the board.

## Board Access

We will write a function to get the piece at a given location on the
board. This would be simple, except what should we do when that
location is empty? 

### Unoccupied

We will make a special piece that we use to indicate that the location
is empty. You should make your own by filling in `ZZZ` with an
appropriate string or number. 

    (define UNOCCUPIED (make-piece ZZZ (make-posn XXX YYY))

An in-person discussion about how to fill in XXX and YYY would make
sense. Otherwise just pick some huge numbers that are definitely not
on the board.

After those choices, we are ready to write a function that tells if a
posn (location) is occupied.

    unoccupied-piece?: piece -> boolean
    occupied?: list-of-pieces(board) posn(loc) -> boolean
    
### Get Pieces

The `get-piece` function returns the Piece at a given location on the
board, or `UNOCCUPIED` if the location is empty.

    get-piece: list-of-pieces(board) posn(loc) -> piece

Notice the signature! Don't get confused and return "unoccupied" (a
string) instead of the `UNOCCUPIED` Piece defined above.

