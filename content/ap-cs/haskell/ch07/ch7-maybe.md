---
title: "7. Maybe"
date: 2019-12-12T16:27:36-06:00
weight: 20
draft: false
#type: slide
#theme: white
description: "Ordering lists items. The Maybe typeclass."
---

The `Maybe` class is built into the standard prelude, so you will only
need to `import Data.Maybe` if you want some of the more [advanced
functions](http://hackage.haskell.org/package/base-4.12.0.0/docs/Data-Maybe.html). 

Info: when you sort a tuple, Haskell sorts based on the first item in
the tuple, then the second item to break ties in the first, etc. 

    sort [(3,4),(5,1),(3,1),(1,2)]==[(1,2),(3,1),(3,4),(5,1)]


## Top Lists 

* `top3list :: [Int] -> [Int]`: Give the three greatest integers, in
decreasing order. 

* `toplist` gives the `n` greatest items, in decreasing order.

        toplist :: (Ord a) => Int -> [a] -> [a]

* `top3By` gives the top 3 items organized according to the resuts
from a function.

        top3By :: (Ord a) => (a -> Int) -> [a] -> [a]



### Testing code

Signatures and tests.

```haskell
top3list xs = xs
-- gives a list of the greatest 10 integers
-- in the input, in decreasing order
numlist = [99,30,40,100,80,5]
ce1 = [
  [100, 99, 80] == top3list numlist
  , [100,99,80,40] == toplist 4 numlist
  , [-90,80,-60]==top3By (abs) [-90,80,-60,30,40]
  , ["Jaylin","Matt","Kid"]==top3By (length) ["KJ","Kid","OK","Matt","Ji","Jaylin"]
  ]
-- 2. 
-- 3. try sort on a tuple
top3By :: (Ord a) => (a -> Int) -> [a] -> [a]
top3By f xs = xs
```

## Maybe

* Write a function that takes in a number and produces `Just` that
  number when the number is at most 80, otherwise `Nothing`.
  

## Word Counter

Produce a count of how many times each word appears in a list of words
(`wc2` below). 

## Testing code

Signatures and tests.

```haskell
wordCounter :: [(String,Int)] -> String -> [(String,Int)]
wordCounter _ _ = []
-- if word is not seen, add (word,1) to list
-- if word is already seen, add 1 to its count
ce2 = [wordCounter [("Not",4)] "Good" == [("Good",1),("Not",4)]
      ,wordCounter [("Not",4)] "Not" == [("Not",5)]         
      ]
-- wc2 :: [String] -> [(String,Int)] -- you could just jump to your end goal
```
