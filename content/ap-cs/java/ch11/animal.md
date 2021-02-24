---
title: "11. Animal"
date: 2019-02-20T20:40:28-06:00
weight: 20
draft: false
#type: slide
#theme: white
description: "Animal and CarnivoreAnimal."
---

The `Animal` is an abstract class with the following methods:

* `int beEaten()`: returns the number of calories provided 
* `void gainCalories (int amount)`: increases number of calories. 

When you construct an `Animal`, the
constructor needs to know how many calories are in the animal.

`CarnivoreAnimal` is a concrete subclass of `Animal`. It also has a
method `void eat(Animal other)`. This method causes the
`CarnivoreAnimal` to gain the calories provided by the other Animal
(found using the `beEaten()` method).

## Note

This description is kind of fake. This page doesn't really make
sense as an abstract class either. (What is supposed to abstract?)
