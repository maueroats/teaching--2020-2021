---
title: "Grid"
date: 2021-04-13T21:50:03-05:00
weight: 10
draft: false
#type: slide
#theme: white
description: "Functions to create a regular grid of posns."
---

{{% use-mathjax %}}

A grid is a set of evenly spaced points. For example, below is a 4x3
grid.

    (1,1) (2,1) (3,1) (4,1)
    (1,2) (2,2) (3,2) (4,2)
    (1,3) (2,3) (3,3) (4,3)

We would represent this grid as one long list of posns. It is easier
to write the grid-creating functions if we count down, for example
beginning with x=4 and ending with x=1.

    (list (make-posn 4 3) (make-posn 3 3) (make-posn 2 3) (make-posn 1 3)
          (make-posn 4 2) (make-posn 3 2) (make-posn 2 2) (make-posn 1 2)
          (make-posn 4 1) (make-posn 3 1) (make-posn 2 1) (make-posn 1 1))
  
You see the natural "count down" way to program this in Racket ends up with the
x and y both reversed. If you don't like this, add an extra argument
to your functions to remember the start as well as the end of your range.

One row of this grid is made by `gen-row` and the whole grid is made
by `gen-rows-cols`.

## Warmup: Joining Rows

When you want a single list of posns, you need to join together each
row. We will write a helper function, `join-rows`, to combine two rows.

```racket
;; join-rows: list(xs) list(ys) -> list
(define (join-rows xs ys)
  empty)
(check-expect (join-rows (list 1) (list 4 5 6)) (list 1 4 5 6))
(check-expect (join-rows (list 1 2 3) (list 4 5 6)) (list 1 2 3 4 5 6))
```

There is a built-in function called `append` that does this, but you
should practice creating your own. It gives you more practice writing
recursive functions on lists.

## Making the Grid

We want to create a grid (list) of points from which we will find the distances. 

### One Row

First we make a function to make a single row of the grid.

`(gen-row xmax y)`: Create a list of posns with the given `y`,
   but x-coordinates going from `xmax` down to 1 (inclusive). This is a single row
   a grid.

```racket
(define (gen-row x ymax)
  (list (make-posn -1 -1)))
(check-expect (gen-row 5 3)
              (list (make-posn 5 3) (make-posn 4 3) (make-posn 3 3) (make-posn 2 3) (make-posn 1 3)))
```

### Many Rows

Now we make the whole grid by repeating the row repetition for each row.

`(gen-rows-cols xmax ymax)`: Create a list of posns for x
   from `xmax` down to 1, and also for y from `ymax` down to 1 (both inclusive).
   The idea is that this function will call itself recursively, using `gen-col` to produce a
   single column.

```racket
(define (gen-rows-cols xmax ymax)
  (list (make-posn -1 -1)))
(check-expect (gen-rows-cols 2 3) 
              (list (make-posn 2 3) (make-posn 1 3)
                    (make-posn 2 2) (make-posn 1 2)
                    (make-posn 2 1) (make-posn 1 1)))
```

## Notes

Usually computers make an $M\times N$ grid by using $0\le x < M$ and
$0\le y < N$. The method on this page was chosen because
it seemed easier for beginners to think about.


