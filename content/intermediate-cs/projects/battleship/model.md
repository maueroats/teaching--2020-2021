---
title: "Battleship Model"
date: 2019-04-08T08:17:17-05:00
weight: 10
draft: false
#type: slide
#theme: white
description: "Play battleship on paper to develop the model."
---

The process for developing a model is always the same:

1. Background knowledge: understand the rules and decide what you want
   your game to look like when you play it. We will play [Battleship on paper](https://en.wikipedia.org/wiki/File:Battleships_Paper_Game.svg).
2. Draw at least three scenes from different stages of the game. In
   this case, you will want more -- include a win screen, a lose
   screen, and three others.
3. List the information necessary to draw the scenes.
4. Write down the model you will use.

## Step 1: Battleship on paper

* Make two 8x8 grids, one for your ships and one for your attacks on the opponent.

* Number the rows and columns like a computer screen, beginning with
  (0,0) in the upper left.

* Place your ships. Each ship can go either horizontally or vertically. The number and size of ships varies in different versions of the game. Today we will use this list:

    - Aircraft carrier (5 squares) 
    - Battleship (4 squares)
    - Cruiser (3 squares)
    - Destroyer (Two, each 2 squares)
    - Submarine (1 square)

* Play at least ten rounds with a partner. Keep going until at least one ship is sunk.

## Step 2: Develop the model

For developing the model we will think about only two ships. Later you can add the rest.

* Draw five different situations, including a win and lose end game.
* List information you need to draw those situations.
* Discuss what information must be _remembered_ (the "independent variables") and what can be _computed_ (the "dependent variables").
* Write the model that corresponds to each one of your scenes.
* Save this paper! Check in your work and don't lose it.

## Step 3: Check your model

* How do you represent one ship?
* How do you represent one shot fired?

## Interesting variations

You can explore these ideas later in your game.

* Some games allow you to shoot multiple times in one turn: one shot
  for each un-sunk ship you have.
