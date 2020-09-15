---
title: "Check Expects in Haskell"
date: 2018-09-23T12:36:16-05:00
#weight: 
draft: false
#type: slide
#theme: white
description: "Simple testing in Haskell. Usable on repl.it."
---

This page explains how to write `check-expect` in Haskell in a basic
way that can be used on repl.it (or anywhere). This method works for
small numbers of tests. Hopefully it work well enough for now.

If you have your own computer, you can learn to use the
[HUnit](https://hackage.haskell.org/package/HUnit) testing system.

1. Write out tests in a list so each gives True when it passes.
2. Define a testing main function `test_main`.
3. Run the `test_main` yourself. 

## Example of Testing

This program is supposed to give True if every 5 is followed by
a 6. It has a bug in it which we can uncover by testing.

```haskell
-- Is every five followed immediately by a six?
fiveSix :: [Integer] -> Bool
fiveSix [] = True
fiveSix (5:6:xs) = fiveSix xs
fiveSix (5:ys) = False
fiveSix (a:b:xs) = fiveSix xs
fiveSix (a:xs) = fiveSix xs
```

Testing should make sure that the basic situation works, then check
the "edge" cases, usually involving the start and end of the list.

1. Does it work in basic cases?
2. Does it work when there is a 5,6 at the start?
2. Does it work when there is a 5,6 at the end?
3. What if a 5 by itself is at the start?
4. What if a 5 by itself is at the end?

```haskell
test56 = [ True  == fiveSix [5,6,5,6,5,6]
          ,True  == fiveSix [1,2,3,4,5,6,7,8]
          ,False == fiveSix [8,7,6,5,4,3,2,1]
          ,True  == fiveSix [4,6,7,8]  -- end basic
          ,True  == fiveSix [5,6,1,2,4]
          ,True  == fiveSix [1,2,4,5,6]
          ,False == fiveSix [5,1,2,4]
          ,False == fiveSix [1,2,4,5] 
          ]
```

The testing function:

```haskell
testMain :: IO()
testMain = do
  putStr "All tests passed? "
  putStrLn $ case (and test56) of True -> "YES"; False -> "NO";
  putStrLn "Results:"
  print $ map show test56
```

You will see that this method has a lot of repetition. You could make
functions that would handle the repetition for you. That is one of the
things the HUnit package would do.

