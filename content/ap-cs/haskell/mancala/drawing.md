---
title: "Drawing"
date: 2020-10-24T20:53:34-05:00
weight: 20
draft: false
#type: slide
#theme: white
description: "Rendering the board as text."
---

You need to render the board. I suggest that you use the strategy we
began in class with a single box-drawing function and a function to
overlay the number on a single box, then assemble those with "beside"
and "above" functions (that you will also have to write) into an
ASCII-art board. 

This is an example of a board in the middle of a game of Mancala. 

```
+-----++-----++-----++-----++-----++-----++-----++-----+
|     ||     ||     ||     ||     ||     ||     ||     |
|     ||  0  ||  9  ||  0  ||  8  ||  1  ||  1  ||     |
|     ||     ||     ||     ||     ||     ||     ||     |
|     |+-----++-----++-----++-----++-----++-----+|     |
|  5  |+-----++-----++-----++-----++-----++-----+| 20  |
|     ||     ||     ||     ||     ||     ||     ||     |
|     ||  1  ||  0  ||  2  ||  0  ||  0  ||  1  ||     |
|     ||     ||     ||     ||     ||     ||     ||     |
+-----++-----++-----++-----++-----++-----++-----++-----+
```

* `makeBox :: Int -> Int -> [String]`. Given the width and height
  make a simple box. Example:
  
        makeBox 5 7 == ["+---+",
                        "|   |",
                        "|   |",
                        "|   |",
                        "|   |",
                        "|   |",
                        "+---+"]

* `beside :: [String] -> [String] -> [String]`. Combine two boxes
  horizontally. Assume they are the same height.

        beside (makeBox 5 7) (makeBox 3 7) == 
          ["+---++-+",
           "|   || |",
           "|   || |",
           "|   || |",
           "|   || |",
           "|   || |",
           "+---++-+"]

* `above :: [String] -> [String] -> [String]`. Combine two boxes
  vertically. Assume they are the same width.

        above (makeBox 5 4) (makeBox 5 6) == 
           ["+---+",
            "|   |",
            "|   |",
            "+---+",
            "+---+",
            "|   |",
            "|   |",
            "|   |",
            "|   |",
            "+---+"]

* `drawContents1 :: String -> String  -> String`. Attempt to place the
  first string in as close to the middle of the second string as
  possible, overwriting what is there.
      
        drawContents1 "58" "abcdefg" == "ab58efg"
        drawContents1 "13" "abcdefgh" == "abc13fgh"

* `drawContentsOnBox :: String -> [String] -> [String]` The first
  input gives the contents string that is supposed to go on top of the
  box in the second argument. Use the helper function to replace the
  middle line of the box. 

        drawContentsOnBox "13" (makeBox 5 7) ==
          ["+---+",
           "|   |",
           "|   |",
           "|13 |",
           "|   |",
           "|   |",
           "+---+"]

* `drawSquare :: Int -> [String]`. Show the number on a square of a
  fixed size. The basic unit of drawing the game board. Calling this
  function produces the same image as drawing the number on top of a
  standard sized square.

        drawSquare 13

* `drawBoard :: Board -> [String]`. Use the functions above to draw
  the entire board. The board below shows the layout I used (numbers
  shown are the indices in the list).
  
        *Main> render $ drawBoard [0..13]
        +-----++-----++-----++-----++-----++-----++-----++-----+
        |     ||     ||     ||     ||     ||     ||     ||     |
        |     || 12  || 11  || 10  ||  9  ||  8  ||  7  ||     |
        |     ||     ||     ||     ||     ||     ||     ||     |
        |     |+-----++-----++-----++-----++-----++-----+|     |
        | 13  |+-----++-----++-----++-----++-----++-----+|  6  |
        |     ||     ||     ||     ||     ||     ||     ||     |
        |     ||  0  ||  1  ||  2  ||  3  ||  4  ||  5  ||     |
        |     ||     ||     ||     ||     ||     ||     ||     |
        +-----++-----++-----++-----++-----++-----++-----++-----+
