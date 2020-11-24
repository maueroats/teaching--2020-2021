---
title: "Unit Testing Level I"
date: 2018-01-19T10:23:21-06:00
draft: false
weight: 10
#type: slide
#theme: white
description: "An introduction to using the JUnit test system."
---

Start testing little pieces of your code so it is not so hard for you
to figure out what goes wrong. In Racket, we used the `check-expect`
system.  In Java there is a similar system called JUnit. This page
explains how to use the old [JUnit 4](http://junit.org/junit4/) system
that is built into DrJava.

## Basic Testing
(Include the boilerplate code from the next section!)

* `@Test`
* `assertEquals(correct, actual)`
* `assertEquals(correct, actual, close_enough)`: Like `check-within`, this is for comparing floating point values (`double`). Test succeeds if `|correct - actual| < close_enough`. 
* `assertArrayEquals(correct, actual)`: Compare arrays.

Example:
```java
@Test
public void test_math() {
    assertEquals(5, 2+3);
    assertEquals(.66, 2.0/3, 0.01);
}
```

Example for arrays (Chapter 12):
```java
@Test
public void test_always_ok() {
    int[] correct = {1,2,3};
    int[] actual = {1,2,3};
    assertArrayEquals(correct, actual);
}
```

Example for ArrayList (Chapter 13):
```java
@Test
public void test_arraylist() {
  ArrayList<Integer> n = new ArrayList<>();
  n.add(5); n.add(25); n.add(100);

  List<Integer> correct = Arrays.asList(5,25,100);
   
  assertEquals(correct, n);
} 
```


## Testing Boilerplate

At the start of your code, include the following boilerplate:
```java
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;
```

## DrJava

1. "Compile"
2. "Test Project"

Green tests pass, red tests fail. A list of all errors follows the summarizing colored results.

## Repl.it

1. You should be using "Project Mode" and have multiple files open with names like "HospitalTest.java". Capital letters matter, so match the name of the class.

2. There is no "Test Project" button on Repl.it, but you can arrange for the main method
to run your tests by using the code fragment below. (See the [working main method](Main.java).) 

        org.junit.runner.JUnitCore.main("Test_Class_Name_MUST_CHANGE");

3. Output should look like `..E.E...E.E.E.E....E`, where the `.` indicates the test has begun running and the `E` indicates that it ended in an error. Notice there is no separate indication for a test passing.

