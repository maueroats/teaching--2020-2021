---
title: "Overview"
date: 2020-11-04T13:19:24-06:00
weight: 15
draft: false
#type: slide
#theme: white
description: "An overview of how to fit your program into the UI framework."
---

<style> .unicodeart { line-height: 100%; }</style>

This page is supposed to give you an idea of what you are writing and
how it will all fit together in the end.

The [UI code]({{% relref "./ui" %}}) takes care of:
* ending the game when necessary (you write: `is_game_over`)
* printing out who won (you write: `winner`)
* picking which square to take the pieces from at the start of your
  turn
* printing out messages

You communicate what you want to happen next by the results you return from
`distribute`. As a reminder, the results are a huge tuple, with the
`Int` representing the number of stones.

    (Board, Player, Square, Int, String)

* The String message is always printed out.
* If the number of stones is 0, then the returned player is asked to pick up
  stones from a new square. 
* If the number of stones is not 0, the next thing that will happen
  will be a play in the returned square. The `distribute` function
  should return the next square for the person to play on. 

The 5-tuple is the "game state". It should really be a struct (called
a "record" in Haskell) but we have not learned that yet.

The `distribute` function is kind of like the tick handler. It causes pieces
to move as time passes. Of course the person needs to choose which
pieces to move.

The `distribute` function only puts down one stone at a time. This is
supposed to make it easier for you to write the code, because you only
need to focus on one idea at once.

## Examples

### Returning values

A tuple of values can be returned by just writing it out. I prefer a big where
statement to set all of the values.

```haskell
distribute board player sq stones 
   | stones > 1   =   (newboard, newplayer, newsq, newstones, "Played once.")
      where newstones = stones - 1
            newboard = ..
            newplayer = ...
            newsquare = ...
```

### Play: typical

In this example we will only show `board` squares 5, 6, and 7
to keep writing short.

<pre class="unicodeart">
┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓
┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃
┃     ┃┃  0  ┃┃  0  ┃┃  0  ┃┃  0  ┃┃  0  ┃┃  0  ┃┃     ┃
┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃
┃     ┃┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┃     ┃
┃  0  ┃┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┏━━━━━┓┃  3  ┃
┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃
┃     ┃┃  0  ┃┃  0  ┃┃  0  ┃┃  0  ┃┃  0  ┃┃ 12  ┃┃     ┃
┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃┃     ┃
┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛┗━━━━━┛
</pre>

Starting with player 0 at square 5, with 2 stones, put 1 stone in
square 5 and advance to square 6 with the same player active.

|        | Original | New |
|--------|----------|-----|
| board  | `[...,12,3,0,...]` | `[...,13,3,0,...]` |
| player |   0      | 0   |
| square |   5      | 6   |
| stones |   2      | 1   |


### Exercises

Write the Original/New value table showing what happens when:

1. Player 0 plays on square 6 starting with one stone.
2. Player 1 plays on square 5 starting with two stones.
3. Player 0 plays on square 7 starting with one stone.

