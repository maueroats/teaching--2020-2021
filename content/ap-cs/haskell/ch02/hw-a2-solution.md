---
title: "Haskell HW 2 Solutions"
date: 2018-09-14T10:18:00-05:00
draft: true
weight: 21
tags: 
  - homework
  - solutions
  - haskell
  - ap-cs
---

`breakItUp` plan:

* replicate input list (length - 3) times
* zip with count
* helper function knows count and list, drop & take 

```haskell
breaklicator xs = replicate (length xs - 3) xs
numberIt ys = zip ys [0..]
              
breakItUp' :: ([a],Int) -> [a]
breakItUp' (xs,y) = take 4 $ drop y xs

breakItUp_v2 :: [a] -> [[a]]
breakItUp_v2 xs = [ breakItUp' w | w <- numberIt $ breaklicator xs ]
```

Fancy solution for `breakItUp`, shows power of Haskell pattern matching (Chapter 4):

```haskell
breakItUp :: [a] -> [[a]]
breakItUp [a,b,c,d] = [[a,b,c,d]]
breakItUp (x:xs) = (x:take 3 xs) : breakItUp xs
```

targetPractice plan:

* distance formula
* helper function that remembers the closest point so far
* recursively go through list of all points

```haskell
-- you should just write (Int,Int) everywhere I write Pt
type Pt = (Int,Int)

dist :: Pt -> Pt -> Int
dist (x0,y0) (x1,y1) = (x1-x0)^2 + (y1-y0)^2

targetPractice ::  Pt -> [Pt] -> Pt
targetPractice pt ptList = targetPractice' pt ptList (head ptList)

targetPractice' :: Pt -> [Pt] -> Pt -> Pt 
targetPractice' pt [] closestSoFar = closestSoFar
targetPractice' pt (x:xs) closestSoFar = targetPractice' pt xs newClosest 
    where newClosest = if (dist x pt) < (dist closestSoFar pt) 
                        then x else closestSoFar
```
