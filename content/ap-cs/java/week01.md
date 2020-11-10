---
title: "Java 01"
date: 2020-11-10T12:15:10-06:00
weight: 10
draft: false
#type: slide
#theme: white
description: "Starting Java"
---

## Comparison with Haskell


### Haskell

- pure = no side effects for any function
- lazy = we did not encounter this
- functional = functions can be inputs to other functions 
- lots of cool syntax like `[1..10]` or `[x^2 | x <- [1..9]]`
- types were optional (deduced)
- indentation made one thing go inside another (where)
- syntax can be over the top `()-()` could be a function?!
- very crap error messages

### Java

- side effects are the way everything is done (objects change state)
- imperative (say how to do it, not just what to do)
- not using functions as inputs to other functions (changed in Java 8+)
- no cool syntax
- lots of syntax and special "reserved" words
- types are required
- braces `{ ... }` to put things inside each other
- semicolons to end each "line" = statement or group of statements
- consistency is weird sometimes (I will point this out)
- need to understand how the computer sees "memory"
- crap error messages

## Resources

* Cook, [_Blue Pelican Java_](http://www.bluepelicanjava.com/). Free
  online download.
* Litvin, [_Java Methods_](http://www.skylit.com/jm.html). For purchase only.
* [CodingBat](https://codingbat.com)

