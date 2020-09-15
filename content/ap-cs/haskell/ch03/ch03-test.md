---
title: "Chapter 3 Haskell Test"
date: 2018-09-21T07:28:38-05:00
weight: 350
draft: true
#type: slide
#theme: white
description: "Test on LYaH Chapter 3."
---

Unless you are completely confident of your signature-writing skills,
please use "concrete" type classes like `Double` or `Integer` instead
of class constraints like `(Floating a)` or `(Integral a)` everywhere
you write code that will actually run.

{{< use-mathjax >}}

## Part I: No Computer

This is the only part of the test where you should attempt to use
class constraints (if you know them). 
<!--
This part should be done with no
computer (that is, no use of Haskell on the computer).
-->


1. The `whatSig` function takes in an ordered pair, a distance, and
   two strings. If the ordered pair is within the distance of (0,0),
   then the answer is the first string, otherwise the answer is the
   second string. What is an appropriate the _signature_ (only) for
   this function? 

     ```haskell
     whatSig (3,4) 10 "Close" "Far" == "Close"
     ```

2. Give an example of an ability that the  `Fractional` class
   constraint provides that is not available with an `Integral` class
   constraint. 
   
3. Give an example of an ability that the `Floating` class constraint
   provides that is not available with `Fractional`.

4. (`someSqrt`) Write a signature and the function.
   The `someSqrt` function that takes in a list of x values and puts out a
   list of points:
   
       * x values less than 10 are ignored (no corresponding point is
         output)
       * otherwise output a point on the graph of $y=\sqrt{x}$


## Part II: Computer

5. (`midAvg`) Given a list of `Double` numbers with 3 or more
   elements, the `midAvg` function gets rid of the first and the last
   element, then finds the average of the remaining list. Write the
   complete function, including signature.
   
   
6. oddVowels. A word is an odd vowel word if all of the vowels in the
   word appear in odd index positions (remember indexing starts at
   zero).

    * 6o. `odO theWord`: Return all of the odd vowels in the word.
    * 6a. `odA theWord`: Determine if a single word is an odd vowel word.
    * 6b. `odB theList`: Return a list of all of the odd vowel words in theList.

    ```haskell
    odA "xz" == True
    odA "a" == False
    odA "raw fud gg" == True
    odA "pizzza" == True
    odA "cucumber" == False
    ```
