---
title: "Mancala Outline"
date: 2020-10-24T19:59:13-05:00
weight: 10
draft: false
#type: slide
#theme: white
description: "Steps to making a mancala game"
---

Play [mancala
online](https://fundecade.com/mancala)
to get familiar with the rules of the game.

This document breaks the game of
[mancala](https://ringoffirerules.com/mancala-rules/) down into small
pieces. You do not have to follow this outline. 

## Rules

* Only move pieces on your half of the board.
* Extra move if your last piece lands in your "goal" (mancala) at the
  end.
* Capture opposite pieces if your last piece lands in an empty space.


## Overview

Watch the video. I decided that it would be easier to understand if
you had to interact with the game at every move, so I made it so that
every time a piece is going to be put down, you have to hit enter. 

## Data Structures

The whole board, including the mancalas at each end, will be
represented by a list with 14 elements ([0..13]). One player will have
indices `[0..5]` with their mancala at `6`. The other player will have
indices `[7..12]` with their mancala at `13`. 

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

For the main functions, will need to keep track of the board, the
player, and the square that is being played in. While we put down stones,
we also keep track of how many stones are in the player's hand.


## Game Logic

(See separate document.)

## Drawing

(See separate document.)
