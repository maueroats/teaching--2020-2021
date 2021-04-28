---
title: "110 Review"
date: 2020-04-16T10:53:40-05:00
weight: 110
draft: false
#type: slide
#theme: white
description: "Dog class, working with a List of Dog."
---

* Writing classes review: `Dog`
* ArrayList review: traversing and modifying a list.

## Writing a Class

Write the Dog class so the demo code below works as described.

* Constructor takes in a name and an age.
  
        Dog d = new Dog("Fido",7);
* When you print out a `Dog`, it should look work like this:

        System.out.println(d);
        // prints: [Dog Fido (age=7)]
* Include getter and setter methods like a "real class" would have.

        public String getName() { ... }
        public int getAge() { ... } 
        public void setAge(int n) { ... }

[Solution code](DogSolution.txt).

## List Processing

Given a `List` of `Dog`, modify the list so that:

* dogs whose name begin with A through M should get 1 year older
* dogs with names beginning with N or later are removed from the list
* dogs that are at least 25 years old are removed from the list

```java
public static void updateDogList(ArrayList<Dog> dogs) { ... }
```

You may assume that all dog names start with capital letters.


## Skeleton
Put your solution in [this skeleton](DogListTest.txt) so you can run it to see if it works.
