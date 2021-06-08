---
title: "Reversi Count Flips" 
date: 2021-06-03T13:38:55-05:00
weight: 140
draft: false
#type: slide
#theme: white
description: ""
---

The plan is to count how many pieces will flip in a given
direction. The key part of this is a helper function that knows how
many pieces would be flipped so far in the analysis and a location (posn)
the board to continue analyzing.

{{% notice note %}}
{{% attachments-github "*.pdf" %}}
{{% /notice %}}

The attachments are intended to be used to write check-expects for the
`count-flip-help`. 


## Count Flip Outline

Counting how many pieces flip is done by summing the numbers of pieces
that are flipped in each direction. In a given direction, a helper
function examines a line of squares until it has figured out how many
pieces will flip in that sequence.

* `count-flips-all: board player posn(current) -> number`: Considering every
  direction, how many pieces will a particular play flip?
* `count-flips-one: board player posn(current) posn(direction) ->
  number`: Considering only a single direction, how many pieces will
  flip?
* `count-flips-help: board player posn(next) posn(direction)
  number(flip-so-far) -> number`: Given the next square to analyze
  and a count of the number of pieces that would be flipped so far,
  return the total number of pieces that would flip (in that given direction).

The `count-flips-one` is a "wrapper" function that starts with the
current position (and direction), and then calls `count-flips-help`
using zero flips and the next square in that direction.
    

## Count Flip Helper

We will design a helper function to examine a sequence of positions in
a given direction and count how many pieces would flip in that
sequence. Remember: **opponent's pieces only flip if they are "sandwiched"
between the player's pieces**. Review the rules of "true reversi" if
you are confused!

Basic information:

* `board` (list of piece)
* `player`: the current player
* `next` (posn): a square to examine
* `dir` (posn): the direction to continue looking
* `flips-so-far` (number)

<!--The starting piece is the player's, so there is no need to examine
it. In this explanation, we chose to work with the "next" piece in a
particular direction, that is `(posn-add start direction)`.-->

In order to understand how this function works, it is critical to work
through some examples (check-expects) of particular board setups. See
the [Reversi flips
attachment](files/reversi-flip-examples.pdf). Please go write
check-expects for those examples now.

In each of these cases for logic in the `count-flips-help` function,
figure out what the correct response should be:
1. The `next` square is not occupied. <!--The function returns 0.-->
2. A player's own piece occupies the `next` square. 
    This means no more pieces flip. <!--, so return `flips-so-far`.-->
3. The opponent's piece occupies the `next` square. <!--: continue a
   recursive function call, adding one to `flips-so-far` and using the
   next square in the given direction.-->
