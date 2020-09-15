---
title: "Ch6 Misc Ex"
date: 2019-11-21T13:51:41-06:00
weight: 164
draft: false
#type: slide
#theme: white
---

1. `addPosn :: (Num a) => (a,a) -> (a,a) -> (a,a)` Add the
   corresponding x and y coordinates.

2. An arithmetic sequence starts with a number and then increases by a
constant amount. For example, starting at 5 and increasing by 2 gives
[5,7,9,...]. Do the same thing in two dimensions:

        goForever :: (Int,Int) -> (Int,Int) -> [(Int,Int)]
        goForever (1,4) (2,-1) == [(1,4),(3,3),(5,2),(7,1),...] -- infinite

3. Check your work by writing a function that returns the first four
   ordered pairs produced by `goForever`. Call that function `goFour`.
   
4. (allFours) Now you can produce four coordinates in a given
   direction: N, S, E, W, NE, NW, SE, SW. In this setup, NW is the
   direction (-1,1) and E is the direction (1,0).  Make a list
   containing the sequence of points you can reach by going 4 in a row
   in each of these directions. 
   
        allFours (5,8) == 
          [[(5,8),(6,8),(7,8),(8,8)],
           [(5,8),(6,9),(7,10),(8,11)],
           [(5,8),(5,9),(5,10),(5,11)],
           [(5,8),(4,9),(3,10),(2,11)],
           [(5,8),(4,8),(3,8),(2,8)],
           [(5,8),(4,7),(3,6),(2,5)],
           [(5,8),(5,7),(5,6),(5,5)],
           [(5,8),(6,7),(7,6),(8,5)]]

5. (scoreMC) Given a String answer key and a String student response
   input, give 6 points for each correct answer, 2 for each blank
   (`_`) and 0 points for each wrong answer. Assume the key and the
   response are the same length.
   
        scoreMC "ABCD" "AX_D" == 14

6. (pigLatin) Read the rules for the made-up language [Pig
   Latin](https://en.wikipedia.org/wiki/Pig_Latin#Rules). 
   Change each word in the input into Pig Latin.
   
        pigLatin ["I","have","a","phone"] == ["Iway","avehay","away","onephay"]

    Ignore the problem of correct capitalization.
    

