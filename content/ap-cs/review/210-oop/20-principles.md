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

The _declared type_ of a variable is, like it sounds, the class the
variable is declared to have. 

The code below shows variables `x1` and `x2` both with declred type
`M`. 
```java
M x1;
public static String more(M x2);
```

* Declared type restricts the methods you are allowed to call.
(Above, you can only call methods of `x1` that an object of type `M`
would have.)
