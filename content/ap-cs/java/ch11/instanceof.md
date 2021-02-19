---
title: "11. Instanceof"
date: 2019-02-21T11:19:17-06:00
#weight: 
draft: false
#type: slide
#theme: white
---

The `instanceof` operator tells you if a variable is an "instance of"
(made from a subclass of) a given class. Example: `if (x instanceof
Cat) { ... }`.

Casting looks like this: `(Cat) x`. Casting can fail (with a "runtime
exception") if `x` is not really a Cat. This can happen inside
functions that do not know where their inputs are coming from.

Frequently you check to see if something is the right class before
using a cast to "convert it" to that class. The quotes are around
"convert" because casting just reveals a relationship that is already
true, it does not create a new relationship or change the object in
any way.

Fuller example:

     Object x = new Cat()
     Cat y = x; // fails
     Cat w = (Cat) x; // ok
     if ( x instanceof Cat ) { 
         Cat z = (Cat) x; // ok
         System.out.println("Really a cat"); 
     }

## Practice

1. Create an `public static boolean isCat(Object x)` function that
   will tell if you an object is a cat.
   
2. Create a `public static void petIt(Object x)` function that prints
the noise the Cat makes if x is a Cat. Otherwise it should print "No
way!"


## Notes

Notice that the line marked below is useless. It converts to a Cat and
then back to an Object.

     public static void useless(Object x) {
         x = (Cat) x;  // <---
         // still cannot use x.noise();
     }
     
