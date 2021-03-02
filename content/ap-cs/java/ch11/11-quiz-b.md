---
title: "11. Quiz B"
date: 2019-02-25T08:50:40-06:00
#weight: 
draft: false
#type: slide
#theme: white
description: "Clothes interface, BigFashionPerson class, and others."
---
{{% use-goodlists %}}

* `Clothes` interface has `int fashion()` and `int warmth()`.

* `HeadCovering` is a class that implements the `Clothes` interface. Its constructor
  sets fashion and warmth, in that order.

* `WoolClothes` is a class that implements the `Clothes` interface. It
  takes in a `Clothes` object in its constructor. It adds 5 to 
  the warmth provided by the Clothes because they are made of wool.

* `Person` is an abstract class with a `String name` field and a
  `String getName()` function, as well as abstract methods `int
  getWarmth()` and `int getFashion()`. Constructor sets the name.
  
* `PlainPerson` is a subclass of `Person` with a warmth of 90 and a
  fashion of 50, always.
  
* `BigFashionPerson` is a subclass of `Person` that has an
  `ArrayList<Clothes>`. 
  
     * Constructor takes in a name and an arraylist of clothes.
     * Their warmth is the sum of the warmth of their clothes. 
     * Their fashion is the *minimum* of the fashion of their clothes. 

## Example

* Full [TestClothes](TestClothes.java) code.
* Add the [repl.it testing code starter](ReplItTest.java) to get the
test going on Repl.it.

```java
    // copy and paste? define public static void aassert(bool b)...true=ok, false=fail
    public static void main(String[] args) {
        Clothes hat = new HeadCovering(20, 105);
        Clothes underArmor = new WoolClothes (hat);
        Clothes denim = new HeadCovering(95,40);
        ArrayList<Clothes> w = new ArrayList<>();
        w.add(hat);
        w.add(underArmor);
        w.add(denim);

        Person p1 = new PlainPerson("Jane");
        aassert(50 == p1.getFashion());
        aassert(90 == p1.getWarmth());
        aassert("Jane".equals(p1.getName()));

        Person p2 = new BigFashionPerson("Sanjana", w);
        aassert("Sanjana".equals(p2.getName()));
        aassert(105+110+40 == p2.getWarmth());
        aassert(20 == p2.getFashion());
    }
```

## Pedantic

An object that implements the `Clothes` interface has an integer value
for its fashion level and its warmth rating. The methods in the
`Clothes` interface are accessor methods that return those values.

