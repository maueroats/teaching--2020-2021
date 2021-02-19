---
title: "11. Treasure Hunt"
date: 2019-02-21T11:19:22-06:00
#weight: 
draft: false
#type: slide
#theme: white
---

Create an interface `Currency` that has a `double getGoldValue()`
method that returns the number of grams of gold that equal the worth
of the item.

Create a `BankNote` class that implements the `Currency` interface. A
`BankNote` should be created in denominations of 1, 2, 5, 10, 20, 50,
or 100, although you need not enforce this. A `BankNote` represents a
single bill, so you might have lots of them. Add a `toString` method
(see example code below).

     BankNote b = new BankNote(100);
     System.out.println(b); // prints "$100"

In your Main class, make a function `public static double loot
(ArrayList<Object> pile)`. This function should find out how much gold
each Currency item in the pile is worth. To make the function more
interesting, we will put not only Currency items but also Cats in
the pile, so your function has to dig through a pile of cats looking
for the currency and then find out how much gold the currency it finds
is worth. 

Testing in Main: create an arraylist of 11 objects. Build it up one by
one. Add a `RandomCat` with probability 40% and a `BankNote`
otherwise. Give the bank note a random value: 100 (20% of the time), 50 (65% of
the time), and 20 the rest of the time.

