---
title: "OOP Vocab" 
date: 2021-05-10T22:09:19-05:00
weight: 30
draft: false
#type: slide
#theme: white
description: "Vocabulary for object oriented programming."
---

Note: on this page I use "method" and "function" to mean the same
thing. 

* instantiate: do `new Thing()`
* `implements SomeInterface`
    + all of the methods in `SomeInterface` are defined
    + the class says "implements SomeInterface"
* `extends SomeClass`
    + makes a subclass
    + remember to call the superclass constructor immediately
    + (unless there is a no-arguments constructor, unlikely on the AP
      test)

## Polymorphism

* Subclasses can be used anywhere the superclass can be used. 
* Methods of the subclass are used automatically.

Example, assuming
[Chihuahua](https://en.wikipedia.org/wiki/Chihuahua_(dog)) is a
subclass of Dog. 

* `Chihuahua c = new Chihuahua(); Dog d = c;`
* `c` can be used anywhere a `Dog` can be used
* `d.bark()` calls a Chihuahua-specific bark method

## Overload

Multiple methods with the same name but different signatures.
(In Java the signature is not considered to include the output type.)

```java
public void f(int n);
public void f(String s, double d);
```

## Override

A method with the exact same name and signature (of inputs) as a
method in a superclass replaces all uses of the old (superclass)
function.

Overriding is used to create a subclass where some specific behavior
is changed from the parent. In the example below, the `finalBill`
method of a `GenerousTipper` includes a 20% gratuity (=tip).

```java
class Tipper { 
  public double computeTip(double bill) { return 0.15 * bill; }
  public double finalBill(double bill) { 
      return bill + computeTip(bill); 
  }
}
class GenerousTipper extends Tipper {
  public double computeTip(double bill) { return 0.20 * bill; }
}
```

## Encapsulation

* No details about _how_ the functions work are provided. 
* Usually involves: 
   + private instance variables
   + accessor functions (getter / setter)
* Purpose: lets you change how a class does its job without changing
the classes that use it.

Example: originally a class uses an ArrayList to remember playing
cards. When writing "Go Fish", it turns out to be very slow to look
through all of the cards in the ArrayList. Changing to a TreeSet of
cards is quick and easy if no other classes know how the cards are
rememebered.

