---
title: "Ch6 Discussion 02"
date: 2019-11-15T13:31:01-06:00
weight: 62
draft: false
#type: slide
#theme: white
---

The `cityscape` function takes in a list of integers representing the
heights of buildings and puts out a single string that will show
skyscrapers built of X's in columns whose heights correspond to the
integers.


Example:

    cityscape [4,2,6,1]

Output:
``` 
  x
  x
x x
x x
xxx
xxxx
```

Make sure you test your program to verify that it works with two
skyscrapers of the same height.

## Editing Checklist

* Only uses of `length` are absolutely essential.
* Recursion uses `(x:xs)` not `head` and `tail`.
* Choices are made by patterns and guards, not `if...then...else`.
* Functions have names that indicate what they do.

