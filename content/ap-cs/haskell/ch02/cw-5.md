---
title: "Haskell CW II.5"
date: 2020-09-18T12:06:24-05:00
weight: 18
draft: false
#type: slide
#theme: white
---
{{% use-mathjax %}}

## Opener

The `removeOne` function takes in a single number and a list of numbers.
It removes one copy of the number from the list of numbers.

```
roce = [
  removeOne 5 [1,2,3] == [1,2,3]
  ,removeOne 5 [1,2,5,4] == [1,2,4]
  ,removeOne 9 [9,1,9,2,9] == [1,9,2,9]
  ]
```

* Write the type signature for `removeOne`.
* Write the function.

## removeAll

Write a function that removes all of the copies of a given number from
a list.

```
race = [
  removeAll 5 [1,2,5,4] == [1,2,4]
  ,removeAll 9 [9,1,9,2,9] == [1,2]
  ,removeAll 9 [9] == []
  ]
```




## Homework 1

The count doubles function takes in a list of Integers and puts out a
count of the number of times a x in the original list appears
adjacent to another x.

Examples:
```
cdce = [
   countDouble [1,1,2,2,3,3] == 3
  ,countDouble [4,4,4] == 2
  ,countDouble [0,0,0,0,0,10,10,10] == 6
  ]
```

* Write a type signature for `countDouble`. 
* Write the function.

