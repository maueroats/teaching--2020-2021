---
title: "Connect Four UI"
date: 2017-10-12T09:54:31-05:00
weight: 50
draft: false
---

The [user interface code](ui-connect-four.hs) for Connect Four is a little clunky. (Repl.it [shared code](https://repl.it/Marn/0).)
You may use the linked code. You do not have to learn this part of writing Haskell programs (yet).

## Code Outline

main: just make board and call event loop

event loop:

* draw board
* is it won?
    - print the win message
* not won? 
    - get a move
    - recursive call to event loop with updated board, next player

## Code

All of the [user interface code](ui-connect-four.hs) is linked separately (open in WordPad if necessary). 

The setup of the code, which you should change to match your own functions is below. You need: `drawBoard`, `is_won`, `is_move_legal`, and `make_move`.

```haskell
type Board = [[Int]]

drawBoard :: Board -> String
drawBoard board = show $ simplify board

is_won :: Board -> Bool
is_won board = False

is_move_legal :: Board -> Int -> Bool
is_move_legal board col = (col == 0)

make_move :: Board -> Int -> Int -> Board
make_move board col player = [[player]]

-- Just for the demo: force the board to be 1x1.
simplify board = [[board!!0!!0]]
```

The essentials of the code are an event loop function, which draws the
board, checks to see if it is won, gets the next move, and then calls
a sepeate function to handle the move.
```haskell
event_loop :: Board -> Int -> IO()
event_loop board player = do
  putStrLn $ drawBoard board

  if is_won board then do
    win_message board player
    return ()
  else do
    col <- get_move player
    handle_move board player col
```

The handle move function recursively calls the event loop with an
improved board and sets the next player. If the attempted move is
illegal, then the recursive call to event loop does not update the
board or player, so the same player moves again.
```haskell
handle_move :: Board -> Int -> Int -> IO ()
handle_move board player col
    | col == -99              = goodbye
    | is_move_legal board col = event_loop new_board (next_ player)
    | otherwise = complain_and_restart
    where complain_and_restart = do
              putStrLn "ERROR: That is not a legal move."
              event_loop board player
          new_board = make_move board col player
          goodbye = do putStrLn "You quit"
```

## Example run

```
*Main> main
        
        
        
        
        
        
(Enter -99 to quit.)
Player 1 moves.
Column [0-7]? 5
        
        
        
        
        
     X  
(Enter -99 to quit.)
Player 2 moves.
Column [0-7]? 2
        
        
        
        
        
  O  X  
(Enter -99 to quit.)
Player 1 moves.
Column [0-7]? 5
        
        
        
        
     X  
  O  X  
(Enter -99 to quit.)
Player 2 moves.
Column [0-7]? 3
        
        
        
        
     X  
  OO X  
(Enter -99 to quit.)
Player 1 moves.
Column [0-7]? 5
        
        
        
     X  
     X  
  OO X  
(Enter -99 to quit.)
Player 2 moves.
Column [0-7]? 4
        
        
        
     X  
     X  
  OOOX  
(Enter -99 to quit.)
Player 1 moves.
Column [0-7]?   5
        
        
     X  
     X  
     X  
  OOOX  
The game is over
Player 1 won!
```
