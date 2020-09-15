---
title: "Chapter 4 Quiz B"
date: 2018-10-04T23:05:31-05:00
weight: 50
draft: true
#type: slide
#theme: white
description: "Another quiz on Haskell and problem-solving."
---

You may look up Haskell commands online.
No notes allowed.
No help from anyone except the teacher.
Paper-only solutions are OK.

1. `zeroFront :: [Int] -> [Int]`. Return the same list you get, except
  rearranged so that all of the zeros are in the front. Example:
  [1,0,0,1] becomes [0,0,1,1].
  
2. `has77:: [Int] -> Bool`. Given a list of Int, give True if the array
  contains two 7's next to each other, or there are two 7's separated
  by one element, such as with `[7, 1, 7]`.

3. (**Signatures and tests required**.) `tripleUp:: [Int] -> Bool`. True if there are three increasing
  adjacent numbers. Examples of true: `[1,2,6,7,8,10]`,
  `[11,12,13,20]`, and `[3,6,99,100,101]`. The three increasing
  numbers must be adjacent integers on the number line.
  
## Alternative

Instead of the three questions above, you may do the [Don't be
last](http://usaco.org/index.php?page=viewproblem2&cpid=687)
problem. You will need to read the problem description.

The input for `dontBeLast` is an integer (the number of cows),
followed by a  list of pairs: name of cow, amount of milk produced in
a single milking session.

The output is the name of the cow with the second-least milk produced,
total over all sessions. If more than one cow fit this description,
output "Tie".

Here is a signature to get you started:

```haskell
dontBeLast :: Int -> [(String,Int)] -> String
dontBeLast nCows cowMilkList = "Tie"
```
