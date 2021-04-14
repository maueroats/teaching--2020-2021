---
title: "Parcels"
date: 2021-04-13T22:11:42-05:00
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


## More Parts of the Project

{{% children description = "true" %}}
