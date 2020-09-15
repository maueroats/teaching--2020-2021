---
title: "Connect Four Spoilers"
date: 2017-10-06T22:31:43-05:00
weight: 100
draft: false
---

**These spoilers are obsolete.** You should be representing the board
as a list of pieces. Detecting a win should have mostly been part of a
warm-up in class.

Two problems with connect four: changing an entry in a matrix ([[Int]]) and
seeing if there is a win.

## Changing entries in the board

The biggest problem with the representation of the board as `[[Int]]`
is that it is really hard to change the entries. If you use
[((Int,Int),Player)] then it's lots easier to make moves.

Outline of plan:

1. (`changeCol: [Int] -> Int -> Int -> [Int]`) 
   Change value at index `col` in a single row to
   `newVal`; every other value in the list just output unchanged.
```haskell
    changeCol [10,11,12] 2 99 == [10,11,99]
```
   We have basically written this function as a Coding Bat problem. 
       
2. (`changeRowCol: [[Int]] -> Int -> Int -> Int -> [[Int]]`) 
   Run changeCol only on the index `row` entry, everything else stays the same. 
```haskell
    changeRowCol [[1,2,3,4],[5,6,7,8]] 1 3 99 == [[1,2,3,4],[5,6,7,99]]
```
    
There is actually [spoiler code](change-entry.hs) and [fancy spoiler
code that uses Chapter 6](change-entry-enhanced.hs).

## Detecting a win

Please email me questions. I know this is tricky. My own breakdown was:

1. Generate a list containing four ordered pairs in a row. Input: (x,y) coordinates of the first entry, and (dx,dy) to be added to (x,y) to get the other three pairs needed.

2. Given a board and one list of four ordered pairs, return True if all of the ordered pairs are legal coordinates for that board.

3. Given a board, return a list of all possible lists of four ordered
   pairs in straight lines. For example, if the board is just the flat 5x1 board `[[0,0,0,0,0]]`, then this function should give a list of the two possible 4-in-a-rows: `[[(0,0),(1,0),(2,0),(3,0)], [(1,0),(2,0),(3,0),(4,0)]]`.

4. Given a board and a single ordered pair, get the corresponding value from the board.

5. Given a board and four ordered pairs, return True if all of the corrsponding values are the same. 

6. Do the preceding to a whole list of 4 pairs of coordinates.

7. Given a board, return True if it is won.

8. There are a few more steps but you are almost there!
