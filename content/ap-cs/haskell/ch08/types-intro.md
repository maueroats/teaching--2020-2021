---
title: "Types Intro"
date: 2020-11-05T16:59:02-06:00
weight: 10
draft: false
#type: slide
#theme: white
description: "A one day introduction to Haskell structures."
---

You probably know structures from another programming language, like
`define-struct` in Racket.

* Racket: define-struct 
* C++ / Java : class with no methods, public instance variables
* Haskell: `data` 

A type alias is a word that is a shorthand for another type.
```
type Posn = (Int,Int) 
```

The `data` keyword creates a new type of structure.
```
data Model = Model { model_time :: Int, model_place :: Posn }
```
With these names, the way Haskell works is almost identical to
Racket code which creates `model-time` and `model-place` to get the
components of a model struct.
```
(define-struct model (time place))
```

**Important**: you want to add `deriving (Show, Eq)` in most cases, so you can
automatically print out your structure and compare two of the with
`==`. This is like `#:transparent` in `#lang racket`, if you ever
encountered that.

## Example in action

Let's make a structure to hold time and location information:
```
data Game = Game { time :: Int, place :: Posn }
    deriving (Show, Eq)
```

We will make a function to start a new game where the tine is always
zero but the place can be chosen.
```
new_game :: Posn -> Game
new_game p = Game { time = 0, place = p }
```

Go ahead, try typing a few things to see how it works (interactively):
```
a = new_game (5,12)
time a
place a
```

Now we need to write a "tick handler" that will update the time by
adding one. Its signature will be `time_passes :: Game -> Game`.

There are a few ways to do this. These are _all equivalent_, pick one
that you like and stick with it.

* Write out everything. Works but very verbose.

        time_passes g = Game { time = 1 + time g, place = place g }

* Copy every field that you do not set by writing the name of the
  variable before the braces.

        time_passes g = g {time = 1 + time g}

* Pattern matching on the
  contents of the game lets you explicitly build a new Game
  struct. _Warning_: this makes it difficult to change the contents of
  your Game struct because if you add a field the old pattern needs to
  be changed.

        time_passes (Game t p) = Game (t+1) p

* Capturing the whole game struct with `@` and writing out the one
  field we want to change is tricky but cool. Same disadvantage as above.

        time_passes g@(Game t _) = g{time=t+1}

## Applying what you know

The `MGame` structure could be used to create a minesweeper game.
```haskell
data MGame = MGame { bombs :: [Posn],
                     revealed :: [Posn],
                     playing :: Bool }
    deriving (Show, Eq)
```

Write a `reveal` function that takes in a Game and a Posn, and puts
out a new Game struct that has the Posn added to its `revealed` list.

```haskell
player_reveal :: MGame -> Posn -> MGame
player_reveal g sq = g -- WRONG RIGHT NOW... TRY TO FIX
```

Checks showing how `player_reveal` should work:
```
ck_pr_1 = MGame { bombs = [ (5,12), (8,15), (3,4)],
                  revealed = [(5,11), (4,11)],
                  playing = True }
ck_pr_2 = MGame { bombs = [ (5,12), (8,15), (3,4)],
                  revealed = [(8,14), (5,11), (4,11)],
                  playing = True }
ck_pr = [ ck_pr_2 == player_reveal ck_pr_1 (8,14)
         ]
```


