---
title: "Sem1revA"
date: 2021-01-29T14:04:04-06:00
#weight: 
draft: false
#type: slide
#theme: white
description: "Misc review problems."
---

{{% use-mathjax %}}


Reminder: the first three rows of [CodingBat
AP-1](https://codingbat.com/prob/p146974) problems are homework.


1. (partialPalindrome)
`public static boolean partialPalindrome (String s, int n)`
is true if the first n letters math the last n in the opposite order.
The number n will be less than `s.length`.

```
partialPalindrome("abcaesqueacba", 3) => true
partialPalindrome("abcaesqueacba", 4) => true
partialPalindrome("abcaesqueacba", 5) => false
partialPalindrome("wow",3) => true
```

2. (Mixer)
`public static int[] mixer (int[] nums)` two indices correspond when
they differ by half of the length of the array (rounded up). Replace
elements in the first half of the array with the sum of the element
and its corresponding element. Except if the number is 99 do not alter it.

```
mixer({13,23,33}) = {46,23,33}
mixer({99,17,20,30}) = {99, 47, 20, 30}
mixer({10,20,50,13,17}) = {23, 37, 50, 13, 17}
```

3. We are going to combine rows in a 2D array.
The operations are going to be like row operations on a matrix in math class.

        10  20  30  40 
        21  37  57  96

Add $-2$ times the first row to the second row gives:

    10  20  30  40 
     1  -3  -3  16

This operation will be called `(row=1, other=0, mult=-2)` because it
replaces row 1 with row 1 plus -2 times row0.

```
public static int[][]arop (int[][] nums, int row, int other, int mult)
```

