---
title: "Battleship Examples"
date: 2018-04-16T15:05:11-05:00
weight: 20
draft: false
#type: slide
#theme: white
description: "An example of how to use the model you defined."
---

In order for all of us to be working with a similar model, this page
uses the definitions below for `ship` and `game`.

        (define-struct ship (name posns))
        (define-struct game (ships shots))
        
How do we represent one ship, a "Destroyer" that is three squares long?

        (define ex-ship 
                (make-ship "Destroyer" 
                           (list (make-posn 5 1) (make-posn 5 2) (make-posn 5 3))))
                           

How can we represent a game in which two shots have been fired?

        (define ex-shots (list (make-posn 5 0)
                               (make-posn 5 1)))
        (define ex-game 
                (make-game (list ex-ship)
                           shots))
                           

