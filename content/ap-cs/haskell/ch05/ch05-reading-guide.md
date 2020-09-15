---
title: "Chapter 5 Reading Guide"
date: 2017-09-24T13:52:19-05:00
tags:
 - reading-guide
draft: false
---

The purpose of reading this section is to see how an experienced
author writes functions that work on lists.
<!--more-->

Functions:

* `maximum`: Two different versions.
* `replicate`
* `take`
* `reverse`
* `repeat`
* `zip`
* `elem`
* `quicksort`: This one takes some thinking to understand.

After you have read the chapter, write answers to these questions:

1. What is the main idea behind the `quicksort` function?

2. Write the `insertBefore` function that places an element before the current item with the given index in a list. Use as few built-in functions as you can. This is a thinking exercise not a practical exercise -- figure out how to do it without `take`, `drop` or `splitAt`.
{{< highlight haskell >}}
    insertBefore :: Int -> a -> [a] -> [a]
    insertBefore n item xs = undefined
    -- Examples:
    insertBefore 0 3 [5,7] == [3,5,7]
    insertBefore 1 6 [5,7] == [5,6,7]
    insertBefore 2 9 [5,7] == [5,7,9]
{{< /highlight >}}

3. The `allPermutations` function takes in a list and returns a list
   of lists. The output contains every permutation of the input list
   exactly once. (Treat all of the input list elements as
   distinguishable; see last test case.) The permutations do not have
   to appear in the order given below.
```haskell 
    allPermutations [1,2] == [[1,2],[2,1]]
    allPermutations [1,2,3] == [ [1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    allPermutations [1,1] == [[1,1],[1,1]] -- do not try to see the items are the same
```

4. Write the `combinations` function that takes in a number k and a list, and returns a list of lists. The output contains every distinct k item subset of the list (keep the items in the order they appear in the original list).
```haskell
    combinations 2 [1,2,3] == [[1,2],[1,3],[2,3]]
    combinations 3 [1..5] == [[1,2,3],[1,2,4],[1,2,5],[1,3,4],[1,3,5],
                              [1,4,5],[2,3,4],[2,3,5],[2,4,5],[3,4,5]]
```

5. Write the `grouper` function that takes in a list and produces a list of lists. Each sublist should have all of the elements in order.
```haskell
    grouper [1,1,1,2,3,3,2] = [[1,1,1],[2],[3,3],[2]]
```

