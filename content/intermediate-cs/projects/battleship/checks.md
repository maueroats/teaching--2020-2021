---
title: "Battleship Checks" 
date: 2021-04-26T12:35:37-05:00
weight: 40
draft: false
#type: slide
#theme: white
description: "Check-expects for the tricker functions in battleship."
---

The ability to write checks independently is important! These checks
are written to help people know when they are off track, but if you
are doing top-level work, you should be analyzing and writing your own
functions (including checks). Check in here when you think your
function works. 

## Basic definitions

```racket
(define-struct ship (name posns))
(define ex-ship-1
  (make-ship "Betty"
             (list (make-posn 5 1)
                   (make-posn 5 2))))
(define ex-ship-2
  (make-ship "Charlie"
             (list (make-posn 3 4))))
```

## shot-hit-any-ship?

A shot is colored a "hit" if it hits any ship on the board. The only
way to know a shot is a "miss" is by checking that it misses every
ship. Any ship you do not check could be placed at the spot where the
shot hits.

```racket
;; one ship, one shot, shot hits ship
(check-expect (shot-hit-any-ship? (make-posn 5 1)
                                  (list ex-ship-1))
              true)
;; one ship, one shot, shot misses ship
(check-expect (shot-hit-any-ship? (make-posn 5 4)
                                  (list ex-ship-1))
              false)
;; two ship, one shot, shot hits ship #2
(check-expect (shot-hit-any-ship? (make-posn 3 4)
                                  (list ex-ship-1
                                        ex-ship-2))
              true)
;; two ship, one shot, shot misses everything
(check-expect (shot-hit-any-ship? (make-posn 9 8)
                                  (list ex-ship-1
                                        ex-ship-2))
              false)
```

## ship-sunk?

{{% notice warning %}}
A very common mistake is to declare a ship sunk once
it is hit by a single shot.
{{% /notice %}}

This discussion will use a helper function. It is not absolutely
necessary to write your functions this way.
```
ship-sunk? : ship list-of-posn(shots) -> boolean
ship-sunk-helper? : list-of-posn(ship-posns)
                    list-of-posn(shots)
                    -> boolean
```

Checks for the helper:
```racket
;; one shot, and it sinks the ship
(check-expect (ship-sunk-helper?
               (ship-posns ex-ship-2)
               (list (make-posn 3 4)))
              true)

;; one shot, and it misses the ship
(check-expect (ship-sunk-helper?
               (ship-posns ex-ship-2)
               (list (make-posn 4 5)))
              false)

;; two shots, and first misses, second sinks
(check-expect (ship-sunk-helper?
               (ship-posns ex-ship-2)
               (list (make-posn 3 8)
                     (make-posn 3 4)))
              true)

;; one shot hits, but ship has 2 posns, not sunk
(check-expect (ship-sunk-helper?
               (ship-posns ex-ship-1)
               (list (make-posn 5 1)))
              false)
 ;; two shots hits, sunk
(check-expect (ship-sunk-helper?
               (ship-posns ex-ship-1)
               (list (make-posn 5 2)
                     (make-posn 5 1)))
              true)
 ;; two shots hits, sunk
(check-expect (ship-sunk-helper?
               (ship-posns ex-ship-1)
               (list  (make-posn 5 1)
                      (make-posn 5 2)))
              true)
```

This function can be written by going through either the list of posns
in the ship or the shots. I prefer to start with the question "is the
first posn in the ship hit by a shot?"

