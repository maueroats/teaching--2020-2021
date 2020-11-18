---
title: "7. Summary"
date: 2018-11-20T11:22:54-06:00
weight: 5
draft: false
#type: slide
#theme: white
description: "Everything you should know from Chapter 7."
---

The chapter is about doing math with numbers. 

## Essential summary

* Basic arithmetic
```racket
(+ 5 3)
(/ 13 7) ; thirteen divided by seven
(* 11 2)
(- 9 1) ; nine minus one
(- 8)
(quotient 21912 7)
(remainder 21912 7)
```

* Maximum, minimum, absolute value
```racket
(max 0 -4) ; ==> 0
(min 255 300) ; ==> 255
(abs -10) ; ==> 10
```

* Exponents, square root, squaring:
```racket
(expt 1.01 95) ; 1.01 to the 95 power is about 2.57
(sqrt 9) ; square root of 9 is three
(sqr 1241) ; when you square 1241 you get 1540081
```

* Inexact answers, checking with tolerance
```racket
> (sqrt 5) ; about 2.236
#i2.23606797749979
```
The `#i` at the start of `#i2.236...` means that the number is an "inexact" decimal. 
You should never use check-expect with inexact numbers, because the inexact results can be different on different computers! Instead, use `check-within`.
```racket
(check-within (sqrt 5) 2.236 0.001)
```

* Special numbers: both pi is built in. Your tests should still pass if you use either the buit in value of `pi` or `3.1415`.
```racket
> pi
#i3.141592653589793
```

* Getting rid of fractions. The best generic method to use is `real->int`. Otherwise there are specific functions that will round traditionally, round up (ceiling), and round down (floor). 
```racket
(real->int 0.5)
(real->int 1.5)
(real->int 2.5)
(ceiling 1.2)
(floor 1.7)
(round 1.6)
```

## More Important Ideas

* Inexact numbers and `check-within`
* `build3-image` or `build-image`
* `map3-image` or `map-image`
* `(random 5)` gives 0, 1, 2, 3, or 4.
* How to make a gradient, changing color smoothly from pink to light blue.

