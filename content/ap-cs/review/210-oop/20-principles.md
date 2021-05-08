---
title: "OOP Principles" 
date: 2021-05-07T13:17:45-05:00
weight: 20
draft: true
#type: slide
#theme: white
description: "A view under which Java object oriented programming makes sense."
---

Think of the situation of a class M and a subclass N.

```java
class M {
    public String who() { return "M"; }
}
class N extends M {
    public String who() { return "N"; }
}
```

The statement `M x = new N()` makes sense. It creates an object `x`
with _declared type_ `M` and _actual type `N`.

## Declared type: M

The _declared type_ of a variable is, like it sounds, the type that
appears in the "declaration" of the variable:
* `int a;` declares a variable of type `int`
* `String s;` declares a variable of type `String`
* `Mammal m;` declares a variable of type `Mammal`
In this discussion, declared type also applies to parameters of
functions.
* `public void work(int a, String s, Mammal m) { ... }` declares the
  types of three parameters to the function `work`.

The code below shows variables `x1` and `x2` both with declred type
`M`. 
```java
M x1;
public static String more(M x2);
```

* Declared type restricts the methods you are allowed to call.
(Above, you can only call methods of `x1` that an object of type `M`
would have.)

## Actual ("true") type: N

The _actual type_ or _true type_ of an object is the type it was
created to be. For example `new N()` creates an object of actual type
`N`. I will use the term "true type" or "actual type" as
interchangeably. I would appreciate feedback if either one of these
terms makes more intuitive sense.

* `Mammal m = new Dog();` makes a variable `m` with declared type
  `Mammal` and true type `Dog`.
* `M x1 = new N();` has declared type `M` and actual type `N`.


## Potential confusion: numbers

Do not apply this discussion to plain numbers, like 
`double d = 5`. Compilers do automatic "arithmetic promotion", making the integer
5 on the right side of the equation into a "double" (decimal or
floating point) value automatically.
