---
title: "20. Libraries"
date: 2021-02-11T22:03:55-06:00
weight: 12
draft: false
#type: slide
#theme: white
description: "How to make a library of functions that you can use in other files."
---

Use `require` and `provide` to make functions from one file available
in another file.

## Require and provide

Require loads functions from another file. Provide makes functions available for other files to load.

### Require

In order to use the functions in another file, you need to `require` that file.
You already know `(require picturing-programs)` but when we use require 
we need to give the whole filename.
```racket
(require "posn-util.rkt")
```

### Provide
The `provide` command makes functions available for other files to use.
One way to use it is to list all of the functions you want to allow
other files to use:
```racket
(provide posn-add posn-sub posn-scale posn-distance)
```
Sometimes you just want to make every function in the file available. 
There is a shortcut to do that:
```racket
(provide (all-defined-out))
```

