---
title: "Overview"
date: 2020-11-04T13:19:24-06:00
weight: 15
draft: false
#type: slide
#theme: white
description: "An overview of how to fit your program into the UI framework."
---

The [UI code]({{% relref "./ui" %}}) take care of
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
  stones from a new square. Whichever player is returned is asked, so
  this can be used for getting an extra turn by playing your last
  stone in your own mancala as well as passing the turn ordinarily -
  it just depends on what value your `distribute` function returns.
* If the number of stones is not 0, the next thing that will happen
  will be a play in the returned square. That means you should return
  the next square for the person to play on. (This could be handled in
  the skeleton provided
