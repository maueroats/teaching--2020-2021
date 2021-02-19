---
title: "Abstract Classes"
date: 2019-02-13T09:20:55-06:00
weight: 100
draft: false
#type: slide
#theme: white
description: "When are abstract classes useful? A discussion of a few examples."
---

* AbstractCollection
* JComponent graphical user interface component

## Example: Abstract Collections

[AbstractCollection](http://hg.openjdk.java.net/jdk8u/jdk8u-dev/jdk/file/c5d02f908fb2/src/share/classes/java/util/AbstractCollection.java)
is one of the Java utility classes. Its purpose is to remember items,
so you can add or delete items from the collection. One example of a
subclass would be `ArrayList`, but there are others like
[HashSet](https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html). 

Some of the methods it has are:

* `size()`
* `isEmpty()`

The `AbstractCollection` is "abstract" because it does not specify a
way of remember items. However, once you know the number of items, it
is easy to determine if the collection is empty - it has zero
items. That means some of the code for `AbstractCollection` looks like
this:

```java
public abstract int size();

public boolean isEmpty() { 
  return size() == 0;
}
```

The major use of abstract classes is that it allows you to build lots
of other functions on top of one function that you might not yet
know.

## Example: GUI

The [Java UI
tutorial](https://docs.oracle.com/javase/8/javase-clienttechnologies.htm)
has an example showing abstract classes like
[JComponent](http://developer.classpath.org/doc/javax/swing/JComponent-source.html).

This figure shows (among other things) that everything in the user
interface inherits from an abstract `JComponent` class, and that
all menu items inherit from a `JAbstractButton` class.

{{% figure
src="https://docs.oracle.com/javase/tutorial/figures/uiswing/components/object.gif"
%}}


The `getAccessibleName` method ([line
360](http://developer.classpath.org/doc/javax/swing/JComponent-source.html))
is one example of a non-abstract method in `JComponent`. It sees if
the object has a name, and if it does not, it tries to make one by
looking at other components like the title of the current window. If
that failes, it looks for the `JLabel` property and uses that (if
possible). Nothing in this sequence is abstract, so this method can be
written once in the JComponent class and does not need to be
re-written in subclasses.



