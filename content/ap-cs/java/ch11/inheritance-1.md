---
title: "11. Inheritance 1"
date: 2019-02-15T13:30:44-06:00
weight: 40
draft: false
#type: slide
#theme: white
description: "Animal. Dog. Cat. Borzoi. Boxer. Abstract example: A, B, C."
---

## Relatively simple

Create the following classes.

* `GrAnimal` is an abstract class
     * `GrAnimal(String kind)` constructor to create an animal of a
       certain kind. 
     * `public String noise()`: an abstract method
     * `public void speak()`: print out "a [kind] says [noise()]."
     
* `Cat` is a subclass of `GrAnimal`. It makes the "miaou" noise.
* `Dog` is a subclass of `GrAnimal`. It makes the "ruff" noise. Dogs can
  also do `public void trick()`, which prints out "shake".
* `Borzoi` is a subclass of `Dog`. The Borzoi does not bark, the only
  noise it makes is a "whine".
* `Boxer` is a subclass of `Dog`. The Boxer knows the "tug of war" trick.

Discuss how they can and cannot be used in a Java program. See
the [testAnimals](animals.java) function (also as [plain text](animals.txt)).

Note: discuss the `Dog` constructor and its relation to the `Borzoi`
constructor. 


## Complexified 

This example is more abstract but reviews the same ideas.

```java
    public class A {
        public void p() { print("hi"); q(); }
        public void q() { print("Sally"); }
    }
    public class B extends A {
        public void p() { super.p(); print("bye"); }
    }
    public class C extends A {
        public void q() { print("Ava"); }
        public void r() { print("$1000"); }
    }
```

[Questions about the code](ABC.java) or as [text](ABC.txt).

  
