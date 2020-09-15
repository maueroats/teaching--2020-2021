---
title: "Chapter 3 Test Retake"
date: 2018-09-23T17:18:23-05:00
weight: 360
draft: true
#type: slide
#theme: white
discussion: "Retake focusing on questions most people missed."
---

1. Use class constraints to write a general signature for the function below.

     ```haskell
     demo x y z = 
       "The answer to " ++ (show x) ++ " + " ++ y ++ " is " ++
         show(sqrt(z))
     ```

2. What class constraint allows you to take the logarithm of a
   variable?
   
   
3. (**Aim for a Length**). Given a list of strings ("words") and a
   list of integers (the lengths), return true if every second string in
   the list has a length in the list of lengths. Otherwise return
   false.
   
   Start by checking the very first word in the list.
   
   ```haskell
   aimForLength ["a","quick","brown","fox","jumps!"] [1,5,6] == True
   aimForLength ["a","quick","brown","fox","jumps!"] [5,6,1] == True
   aimForLength ["a","quick","brown","fox","jumps!"] [5,6,1] == True
   aimForLength ["a","quick","brown","fox","jumps!"] [5,3,1] == False
   ```
