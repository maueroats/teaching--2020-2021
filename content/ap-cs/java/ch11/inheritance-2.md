---
title: "11. Inheritance 2"
date: 2019-02-20T20:44:41-06:00
weight: 50
draft: false
#type: slide
#theme: white
description: "Noisy, Colorable, Cat, RandomCat. Practice with classes, abstract classes, and interfaces."
---

## Noisy

It takes 0.2 seconds per letter for an animal to make a noise, so
"meow" takes 0.8 seconds and "meeeou" is 1.2 seconds. There are two
methods to think about:

* public String noise(): the noise that something `Noisy` makes; and
* public double timeNoise(): the number of seconds it takes to produce
  that noise.
  
1. Is this best as an interface or an abstract class? Explain your
   answer.
2. Write the `Noisy` thing in Java.
3. Make a `Dolphin` class that makes the "click" noise.

## Colorable

A class is `Colorable` if it has the methods `void setColor(int c)`
and `int getColor()`. 

1. Is this best as an interface or an abstract class? Explain your choice.
2. Add the `Colorable` abilities to your `Dolphin`.

## Cats

A `Cat` is a `Noisy` thing that makes one of three noises: "meow",
"purr", or "rrrrrrr". When you construct a cat it should get a number
0, 1, or 2 that it uses to choose which noise to make.

A `RandomCat` is a kind of `Cat` that makes an unspecified random
noise. Each random cat could make a different noise, but a given
random cat will always make the same noise.

A `VeryRandomCat` makes a different random noise every time it makes a
noise. Figure out a way to create this class without duplicating code
from other classes, possibly by going back to rewrite what you have in
a different way.

