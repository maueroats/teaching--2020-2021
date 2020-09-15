---
title: "Chapter 3 Daily 02"
date: 2019-09-24T15:16:52-05:00
weight: 102
draft: false
#type: slide
#theme: white
---

1. (`hd`) Write a helper function take in a single integer between 0
   and 15 (inclusive) and return a string containing the corresponding
   hexadecimal digit. The digits are 10="A", 11="B", etc.
       
        "B" == hd 11

2. (`hexShow`) Take in a list of values of hexadecimal digits (so
   integers, like `[10,11]`. Output a string with the hex number
   "AB". 

        "F00D" == hexShow [15,0,0,13]
   
3. (`hexDec`) Input a list of values of hexadecimal digits, like
   `[15,0,0,13]` and output the value of the actual number. 
   
        61453 == hexDec [15,0,0,13]

    Each number represents the decimal value of a base 16
    digit:

        15*16^3 + 0*16^2 + 0*16^1 + 13*16^0
        

4. Later we will write `hexParse :: String -> [Int]` to produce a the
   list of values of hexadecimal digits.
   
        [15,0,0,13] == hexParse "F00D"

