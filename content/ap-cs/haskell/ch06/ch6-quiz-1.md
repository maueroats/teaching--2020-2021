---
title: "Ch6 Quiz"
date: 2019-11-26T09:28:00-06:00
weight: 264
draft: false
#type: slide
#theme: white
---

Please write your answers on paper and turn in the paper.

1. Explain in your own words what `foldl` is good for. 
   
2. Use `foldl` to remove duplicates from a list. Write your own fold
   function. Example:
   
        undup [1,1,1,2,3,2] == [1,2,3] 

3. You are going to hide a secret message inside a public message by
   inserting the letters of the secret message every given number (n)
   of the public message letters. If there are not enough letters in
   the public message, just put the unused part of the secret message
   at the end. Begin the output with part of the public message.

        steg "Whitney Young" "ABC" 4
          == "WhitAney BYounCg"
        
        steg "Whitney Young" "Long Message" 5
          == "WhitnLey Yooungng Message"

4. Write a decoder for messages like the first one, which are able to
   fit completely inside the second. Take in the number of letters
   between each secret letter.
   
        unsteg 4 "WhitAney BYounCg" == "ABC"

