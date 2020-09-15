---
title: "Chapter 5 Quiz"
date: 2019-11-07T13:23:13-06:00
weight: 200
draft: false
#type: slide
#theme: white
---

No notes, no book, do by yourself.

## Stone Age

Write each of the following, using nothing but "stone age" tools:
guards, patterns, `==` (etc), `:`, `++`. No length, head, tail, etc.

1. `myintercalate :: String -> [String] -> String`. Given a separator
   and a list of strings, create a string containing the separator in
   between each of the strings (but not before the first or after the last).
   
        myintercalate ", " ["Witch","Bat","Broom"] == "Witch, Bat, Broom"
        
2. `myfindGE :: Int -> [Int] -> [Int]`.  a list of
   everything greater than or equal to the first argument.
   
        myfindGE 5 [3,13,8,4,9] == [13,8,9]



## Bronze Age

Here you are allowed to use tools.

1. `boxMaker :: Int -> String`. Make a function to create an square.

    Calling `boxMaker 5` gives the string
    
        "xxxxx\nx   x\nx   x\nx   x\nxxxxx"

    to see this more beautifully, print it with `putStrLn` in your
    main method.

        main = do putStrLn $ boxMaker 5 

    (Use `\n` in a string to go to the next line.) The output looks
    like this:
   
        xxxxx
        x   x
        x   x
        x   x
        xxxxx


2. `alphaBox :: String -> String`. Make a square using the letters
   from the word provided. Add extra x's at the end if needed to make
   a square. Omit spaces in the input from your box.
   
        alphaBox "Fox in a Box Rox"
    
    prints out as
    
         Foxi
         x  n
         o  a
         RxoB
