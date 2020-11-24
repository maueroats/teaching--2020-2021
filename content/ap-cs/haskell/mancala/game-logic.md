---
title: "Game Logic"
date: 2020-10-24T22:40:58-05:00
weight: 30
draft: false
#type: slide
#theme: white
description: "Logic functions that come together to make Mancala (everything except the drawing)."
---

You should be familiar with the data structures from the outline. 

## Simple Game Logic

* `player_next :: Player -> Player`. Give the other player.
* `is_empty :: Board -> Square -> Bool`. True if the given square on
  the board is empty.
* `is_legal_move :: Board -> Player -> Square -> Bool`. True if
  picking up the contents of the given square is a legal move for the
  player. A move is legal if it results in picking up pieces on the
  player's own side of the board.
* `is_game_over :: Board -> Bool`. True if either side has no pieces
  on it. 
* `winner :: Board -> Player`. Return the player who won. Technically,
  the game could be a tie, so give player `-1` in that case. 
* `is_player_goal :: Player -> Square -> Bool`. True if the square is
  the goal (mancala) for the given player.

## More Complex Game Logic

* `capture_stones :: Board -> Player -> Square -> Board`: Take the
  stones from the square opposite the given one and put them in the
  given player's mancala. For tests, see the [separate testing
  page]({{< relref "./testing" >}}).

* `square_next :: Player -> Square -> Square`. Given a player and a
  square, give the next square that a piece should be placed
  in. Remember that a player does not play a piece in their opponent's
  goal (mancala).
  
        square_next 0 3 == 4
        square_next 0 5 == 6
        square_next 1 5 == 7
        square_next 1 12 == 13
        square_next 0 12 == 0

## Most Complex Game Logic Function

The function that distributes the stones is the most complex one. 
There are several variables that need to change while stones are
distributed. I made the `distribute` function return a tuple
containing all of those variables; normally this would be a struct,
Haskell's [data
statement](http://learnyouahaskell.com/making-our-own-types-and-typeclasses),
but we are not that far in the text yet.

The `distribute` function takes in a board, the current player, the square they are
going to play on, and the number of stones they currently have in
their hand. 

The purpose of the `distribute` function is to play _one_ stone and
update everything that changes because of that play.

* Advance to the next player's turn if that is the last stone played.
* Unless the last stone is played in the player's own mancala, in
  which case the current player gets another turn.
* Capture the opponent's stones if the last stone played lands in an
  empty square.
* Advance to the next square that the current player will play
  in. (Zero if the current player's turn is over.)

The function returns: 
* the updated board, 
* the next person who should play,
* the next square that will be played on (zero if not applicable)
* the number of stones remaining in the current player's hand (zero if
  used up)
* a String message to be displayed explaining the action that occurred
  this turn (helps humans follow what happens in the game)
  

The Haskell signature of the distribute function is below.

        distribute :: Board -> Player -> Square -> Int -> (Board, Player, Square, Int, String)

