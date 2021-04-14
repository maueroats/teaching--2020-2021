---
title: "Distances"
date: 2021-04-13T21:48:41-05:00
weight: 20
draft: false
#type: slide
#theme: white
description: "Finding distances between depots and points on the grid. Important steps."
---


## Finding Distances I

The most straightforward way to figure out the distance to the closest
warehouse is two steps:

1. (`find-distances`) Given a list of warehouse locations, make a list of distances from
   your location to all of them.
2. (`minimum`) Given a list of distances, find the smallest one.

Start out by writing some test cases, going from one warehouse to many.

```racket
;; find-distances: posn(current) list-of-posn(warehouses) -> list-of-numbers
(define (find-distances current warehouses)
  (list 0))
(check-expect (find-distances (make-posn 5 3) 
                              (list (make-posn 0 2) (make-posn 1 10)))
              (list 6 11))
```


## Finding Distances II

NOTE: While this approach works, students may find it easier just to
take the list of points from [the grid making functions]({{% relref
"grid.md" %}}) and directly plot their distances to depots.

Combine the results of the previous two sections to create a
list of `(list posn number)` where the list records the distance from
the posn to the nearest warehouse.

```racket
;; find-distances-2: list-of-posn(warehouses) list-of-posn(points) -> list of (posn, number)
(define (find-distances-2 warehouses points)
   (list (list (make-posn -1 -2) 5)))
(check-expect (find-distances-2 (list (posn 4 1) (posn 7 8))
                                (list (make-posn 0 0) (make-posn 2 7)))
              (list (5 6)))
```
