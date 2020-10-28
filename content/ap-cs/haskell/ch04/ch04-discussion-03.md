---
title: "Chapter 4 Problem Set I"
date: 2018-09-23T11:47:31-05:00
weight: 35
draft: false
#type: slide
#theme: white
description: "Lots of problems so you can practice writing Haskell."
---
(Formerly called "Chapter 4 Discussion III".)

All of these problems are stolen from
[CodingBat](https://codingbat.com).
Write function signatures as well as the actual function.

Make sure to write a list of test cases so you have thought through
what every part of the problem description means before you start
coding. 

Some test cases [as a haskell file](ch04disc03tests.hs) or [as a web
page](ch04disc03tests)

1. ([`makeLast`](https://codingbat.com/prob/p137188)): Given a list of `Int`, return a new list twice the
   length of the original. The last element of the result is
   the same as the last element of the original list, and all
   other elements are 0.
   
   
2. (`swapEnds`) Given a list, return a new list with the first and last elements
   exchanged.
   
3. (`unluckyOne`) Say that a 1 immediately followed by a 3 in a list
   is an "unlucky" 1. Return true if the given list contains an
   unlucky 1 in the first 2 or last 2 positions in the list.

5. `withoutDoubles:: Int -> Int -> Bool -> Int`. The first two inputs
   represent rolls of six-sided dice ([1..6]). Return the sum of the
   inputs. If the boolean is true, if the dice show the same value,
   increment one die to the next value, wrapping around to a 1 if the
   value was a six.
   
     Examples:

        withoutDoubles 2 3 True == 5
        withoutDoubles 3 3 True == 7
        withoutDoubles 3 3 False == 6


6. (`teenSum`) Given 2 ints, return their sum. However, "teen" values
   in the range 13..19 inclusive, are extra lucky. So if either value
   is a teen, just return 19.

7. (`teaParty`) We are having a party with amounts of tea and
   candy. Return the int outcome of the party encoded as 0=bad,
   1=good, or 2=great. A party is good (1) if both tea and candy are
   at least 5. However, if either tea or candy is at least double the
   amount of the other one, the party is great (2). However, in all
   cases, if either tea or candy is less than 5, the party is always
   bad (0).
   
8. (`xyBalance`) We'll say that a String is xy-balanced if for all the
   'x' chars in the string, there exists a 'y' char somewhere later in
   the string. So "xxy" is balanced, but "xyx" is not. One 'y' can
   balance multiple 'x's. Return true if the given string is
   xy-balanced. 
      Examples:
     
         xyBalance "pixxa" == False
         xyBalance "pixely art" == True
         xyBalance "xay anythxng" == False

4. (`unluckyOne2`) Continuing the `unluckyOne` problem, return true if a
   list contains an unlucky 1 in any position.
   
