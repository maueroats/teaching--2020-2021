---
title: "Testing"
date: 2020-10-25T15:18:43-05:00
weight: 45
draft: false
#type: slide
#theme: white
description: "Writing tests for complicated functions helps you understand them better and makes them more likely to be correct."
---

<style> .unicodeart { line-height: 100%; }</style>

Make sure you test each function as you go, so you are sure it works
correctly. This document includes some tests for the `distribute`
function.

```haskell
test_board_1 :: Board
test_board_1 = [100,  0,102,103,104,105,  106,
                107,108,109,110,111,112,  113]
```

Rendered, the board for testing looks like this:
```
+-----++-----++-----++-----++-----++-----++-----++-----+
|     ||     ||     ||     ||     ||     ||     ||     |
|     || 112 || 111 || 110 || 109 || 108 || 107 ||     |
|     ||     ||     ||     ||     ||     ||     ||     |
|     |+-----++-----++-----++-----++-----++-----+|     |
| 113 |+-----++-----++-----++-----++-----++-----+| 106 |
|     ||     ||     ||     ||     ||     ||     ||     |
|     || 100 ||  0  || 102 || 103 || 104 || 105 ||     |
|     ||     ||     ||     ||     ||     ||     ||     |
+-----++-----++-----++-----++-----++-----++-----++-----+
```

## Capture Stones

Looking at the test board, player 0 landing in square 1 should capture
the 111 pieces on square 11 and put them in player 0's mancala, giving
106+111 = 217 stones in square 6. Notice: capture stones by itself
does not place the capturing piece.

```haskell
test_capture_stones = 
    capture_stones test_board_1 0 1 ==
      [100,  0,102,103,104,105,  106+111,
       107,108,109,110,  0,112,  113] 
    
```

Fancy rendering of the board after the `capture_stones` above has run:
<pre class="unicodeart">
┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓
┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃
┃     ┃┃ 112 ┃┃  0  ┃┃ 110 ┃┃ 109 ┃┃ 108 ┃┃ 107 ┃┃     ┃
┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃
┃     ┃┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┃     ┃
┃ 113 ┃┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┃ 217 ┃
┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃
┃     ┃┃ 100 ┃┃  0  ┃┃ 102 ┃┃ 103 ┃┃ 104 ┃┃ 105 ┃┃     ┃
┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃
┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛
</pre>

## Advance to the next square

A player can move into their own mancala, but not the opponent's
mancala.

```haskell
-- player 0 on square 5 with 9 stones in hand
check_1 = distribute test_board_1 0 5 9 == 
              ([100,0,102,103,104,106,  106,
                107,108,109,110,111,112,  113],
                0,
                6, -- this is player 1 mancala
                8, -- eight stones left
                "")
-- player 0 on square 12 with 9 stones in hand
check_3 = distribute test_board_1 0 12 9 == 
              ([100,0,102,103,104,105,  106,
                107,108,109,110,111,113,  113],
                0,
                0, -- advanced to square 0 not square 13
                8, 
                "")
```

## Stone in the mancala

A player can place a stone in their own mancala, but not the
opponent's mancala. A player should never have their "square" equal to
the opponent's mancala. (That was tested above in "advance to the next square".)

```haskell
-- player 0 on square 6 (their mancala) with 9 stones in hand
check_2 = distribute test_board_1 0 6 9 == 
              ([100,0,102,103,104,105,  107,
                107,108,109,110,111,112,  113],
                0,
                7,
                8, 
                "")

```

## Move again

Move again when you play your last stone in your own mancala.

```haskell
-- move again
check_5 = distribute test_board_1 0 6 1 ==
              ([100,0,102,103,104,105,  107,
                107,108,109,110,111,112,  113],
                0, -- indicates it is still the turn of player 0
                0,
                0, 
                "Last stone in your mancala. Play again.")
```

## Capturing stones

Land your last stone in an empty square and you capture the stones in
the opposite square. This test shows player 1 capturing the stones in
square 11 by playing their last stone in square 1.

```haskell
-- player 0 on square 3 with 1 stone left
check_4 = distribute test_board_2 0 3 1 == 
              ([100,101,102,  1,104,105,   215, -- note now 215 in the mancala
                107,108,  0,110,111,112,   113], 
                1, -- indicates turn changed from player 0 to player 1
                0, -- square 0, value does not matter
                0, -- no stones, the will be asked where to start
                "Last stone in empty space. Pick up the stones in the opposite square.")
```

The resulting board is drawn here:
<pre class="unicodeart">
┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓
┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃
┃     ┃┃ 112 ┃┃ 111 ┃┃ 110 ┃┃  0  ┃┃ 108 ┃┃ 107 ┃┃     ┃
┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃
┃     ┃┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┃     ┃
┃ 222 ┃┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┃ 106 ┃
┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃
┃     ┃┃ 100 ┃┃ 101 ┃┃ 102 ┃┃  1  ┃┃ 104 ┃┃ 105 ┃┃     ┃
┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃
┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛
</pre>

## End of turn

A player's turn ends when they run out of stones.
  
```haskell
-- player 0 square 8 with 1 stone in hand
check_6 = distribute test_board_1 0 8 1 ==
              ([100,0,102,103,104,105,  106,
                107,109,109,110,111,112,  113],
                1, -- indicates it is now the turn of player 1
                0,
                0, 
                "Out of stones. Next player's turn.")
```

## Summary checks

```haskell
check_distribute = [ check_1, check_2, check_3, check_4, check_5, check_6 ]

test_mancala = do putStrLn $ show test_capture_stones
                  putStrLn $ show check_distribute
```
