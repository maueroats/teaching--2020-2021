---
title: "Chapter 3 Daily 06"
date: 2019-10-06T07:24:08-05:00
weight: 106
draft: false
#type: slide
#theme: white
---
Write the type signature and function for each problem.

1. Add a 3 to the front of a list of numbers.
2. Add a 4 to the back of a list of numbers.
3. Add a 5 in the middle of a list of numbers. If possible, insert the
   5 so there are exactly the same number of numbers before and after
   it, otherwise put the extra number after it. 
4. Switch the front and back number in a list of numbers. Leave the
   others the same.
5. Delete the middle number of a list of numbers. Assume the length is odd.
6. `delRange start end numList`: Remove items from index `start`
   through index `end` from the numbers list.

        delRange 1 4 [10,11,12,13,14,15] == [10,15]
        delRange 3 7 "PlatypusFiesta" == "PlaFiesta"
        
        Work:
        PlatypusFiesta
        01234567Fiesta

7. (`moveOdd`) Move any add numbers from the start of a list to the end. Stop
   moving when you find an even number. If there are no even numbers,
   the list does not change.
   
        moveOdd [1,3,4,5,6] == [4,5,6,1,3]
        moveOdd [2,3,5,7,9] == [2,3,5,7,9]
8. (`vDub`) Double all of the vowels in a word.

        vDub "Alligator" == "AAlliigaatoor"

