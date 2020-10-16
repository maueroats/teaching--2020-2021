---
title: "Chapter 4 Discussion V"
date: 2019-11-01T14:16:44-05:00
weight: 37
draft: false
#type: slide
#theme: white
---

1. In the game of Scrabble you try to fit a word into spaces with some
   letters already in place. In this question you will write a
   function to determine if a word fits into a certain space.
   
        wordFits :: String -> String -> Bool
        wordFits "jerk" "_or_" == False
        wordFits "work" "__r_" == True

  Along the way you may want to use a helper function to determine if
  characters from the same place match. 
  
        letterFits :: Char -> Char -> Bool
        letterFits 'j' '_' == True
        letterFits 'e' 'o' == False
        
2. In the game of 24 you are supposed to find a way to combine four
   whole numbers using addition, subtraction, multiplication, and
   division, in order to get 24 as the final answer. In this question
   we do a few steps toward that.
   
   1. pairPossible produces all of the numbers that you can get from a
      single pair of numbers. Omit non-integral results of division.
      
          pairPossible 3 12 == [-9,9,15,36,4]
          pairPossible 3 4 == [-1,1,7,12]
   

   2. allPairs produces a list of all of the possible two number pairs
      given a list of four numbers. 
      
          allPairs :: [Int] -> [(Int,Int)]
          allPairs [1,2,3,4] == [(1,2),(1,3),(1,4),(2,3),(2,4),(3,4)]
          
   3. allPossible1 produces a list of all numbers that could be
      produced by using any pair of numbers from the list. Duplicates
      are ok. 

## Advanced

* Make `allPairs` work for any length input list. 
* Make `choose k nums` that gives all `k` item subsets of `nums`.
