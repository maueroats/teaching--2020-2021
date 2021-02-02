---
title: "Sem1RevA"
date: 2021-01-29T14:04:04-06:00
weight: 10
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

        partialPalindrome("abcaesqueacba", 3) => true
        partialPalindrome("abcaesqueacba", 4) => true
        partialPalindrome("abcaesqueacba", 5) => false
        partialPalindrome("wow",3) => true

2. (Mixer)
`public static int[] mixer (int[] nums)` two indices correspond when
they differ by half of the length of the array (rounded up). Replace
elements in the first half of the array with the sum of the element
and its corresponding element. Except if the number is 99 do not alter it.[^1]

        mixer({13,23,33}) = {46,23,33}
        mixer({99,17,20,30}) = {99, 47, 20, 30}
        mixer({10,20,50,13,17}) = {23, 37, 50, 13, 17}

3. We are going to combine rows in a 2D array.
The operations are going to be like row operations on a matrix in math class.

    \begin{pmatrix}
        10 & 20 & 30 & 40 \\\\
        21 & 37 & 57 & 96
    \end{pmatrix}

     Adding $-2$ times the first row to the second row gives:

    \begin{pmatrix}
        10 & 20 & 30 & 40 \\\\
         1 & -3 & -3 & 16
    \end{pmatrix}

    This operation updates the second row (which is `row=1` in Java counting)
by adding `mult=-2` times the first row (which is `other=0` in java counting).
It could be turned into a call of the function you are asked to write
in this question:

        int[][]xs = {{10,20,30,40},{21,37,57,96}};
        xs = arop(xs, 1, 0, -2);
        // now xs = {{10,20,30,40},{1,-3,-3,16}}

    In other words, `arop(xs, row, other, mult)` replaces `xs[row]` by
`xs[row] + mult * xs[other]` and returns the new result.

    Signature:

        public static int[][]arop (int[][] nums, int row, int other, int mult)

[^1]: This description uses a convention from CodingBat where
    `{13,23}` denotes an array which must 
    really be either defined earlier as `int[] a = {13,23}` or created in place
    by `new int[]{13,23}`.
