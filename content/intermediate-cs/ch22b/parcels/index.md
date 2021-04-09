---
title: "Parcels"
date: 2020-03-19T13:13:00-05:00
#weight: 
draft: false
#type: slide
#theme: white
description: "Create an interactive map showing delivery distances from the closest storage depot."
---

In this project we will create an interactive map showing delivery
distances based on locations of storage depots. This project is
inspired by the problem
[parcels](https://codingcompetitions.withgoogle.com/kickstart/round/0000000000050e01/000000000006987d) 
from Google's Kick Start coding competition 2019 Round A.

The CEO of an important delivery company needs your help to decide
where to build new warehouses. You are asked to make an interactive
map showing the distances from every warehouse to every square on a
10x10 grid.  Hopefully, you will be able to easily change it
later to a larger or smaller grid.

We will use a coloring function (see below) to change distances to
color on the red-purple-blue spectrum, so red is close to the warehouse and
blue is far from the warehouse.

As an example, a 10x10 grid with warehouses at (4,1) (7,8) (5,6)
and (0,8) would produce a distance map like this:

   {{% figure src="distmap-1.png" %}}

## Distance

City delivery distance is best measured by just adding the change in x
and y between the two locations (because city streets form a grid;
usually the truck cannot drive "diagonally" through blocks of houses).

```racket
(define (city-distance a b)
  (+ (abs (- (posn-x a) (posn-x b)))
     (abs (- (posn-y a) (posn-y b)))))
```

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

Now we want to create a list of points from which we will find the
distances. 

1. `(gen-col x ymax)`: Create a list of posns with the given x,
   but y from 0 up to `ymax`.
2. `(gen-rows-cols xmax ymax)`: Create a list of posns for x
   between 0 and `xmax`, and also y between 0 and `ymax`.

```racket
(define (gen-rows-cols xmax ymax)
  (list (make-posn -1 -1)))
(check-expect (gen-rows-cols 2 3) 
              (list (make-posn 1 2) (make-posn 1 1) (make-posn 1 0)
                    (make-posn 0 2) (make-posn 0 1) (make-posn 0 0)))
```

## Finding Distances III

NOTE: While this approach works, students may find it easier just to
take the list of points from Finding Distances II and directly plot
their distances.

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

## Coloring

You can choose your own coloring function or use mine. Change this
once you start making images and would like to adjust the way they
look. 

```racket
(define (color-select n)
  (make-color (limit (- 255 (* 50 n)))
              0
              (limit (* 100 n))))
(define (limit n)
  (max 0 (min 255 (real->int n))))
```
