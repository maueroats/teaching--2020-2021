---
title: "Primer 2"
date: 2019-11-22T14:31:21-06:00
weight: 120
draft: false
#type: slide
#theme: white
---

* `type Posn = (Int, Int)`

* `occupied :: Posn -> [Posn] -> Bool`. True if the first argument
  appears somewhere in the list which is the second argument.

* `allOccupied:: [Posn] -> [Posn] -> Bool`. True if every one of the
  posns in the first list appear somewhere in the second list.
  
        True == allOccupied [(1,5),(2,7)] [(2,7),(1,5),(3,7)]
        False == allOccupied [(1,5),(2,7)] [(2,7),(3,7)]
        False == allOccupied [(1,5),(2,7)] [(2,6),(2,8),(1,5)]

* `dropDown :: Int -> [Posn] -> Int`. The function `dropDown x board`
  gives a number that is one more than the largest y coordinate in the board
  with the same x coordinate. If there are no pieces in the given
  column, return 1 as the answer.

    In the example below, the column with x=4 has points with y=1 and
    y=2, so one more than largest y coordinate is y=3.

        dropDown 4 [(4,2),(1,1),(2,1),(2,2),(4,1),(2,3)] == 3
        dropDown 6 [(4,2),(1,1),(2,1),(2,2),(4,1),(2,3)] == 1
        
