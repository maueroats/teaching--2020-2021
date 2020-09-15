---
title: "Chapter 3 Daily 05 HW"
date: 2019-09-26T21:49:56-05:00
weight: 105
draft: false
#type: slide
#theme: white
---

<!--
2. (SKIP, NO QUESTION) Binary decimals: the binary number 110.101 means 

        2**2 + 2**1 + 2**(-1) + 2**(-3) == 6.625

    Haskell does not believe in negative exponents for integers (using
    `^`), but will happily do them for decimals (`**`). Check the type
    signatures... when the inputs to a function are integers, expect
    the output to be an integer as well.
-->

    {{% note alert %}}
    Updates for txtToBin: put the space first and remove the question mark.
    {{% /note %}}

Some [longer example tests](examples.hs) are available. [Additional
example](read-lyrics.hs) showing how to read a bunch of lyrics from a file (for
a cool thing to encrypt in problem 8). 

1. How many numbers are between two given binary numbers, including
   the start and end number?

        bcount :: [Int] -> [Int] -> Int
        bcount [1,0,0,1,1] [1,1,0,1,0] == 8
        
2. (`ensureLen :: Int -> [Int] -> [Int]`). The call `ensureLen 6 xs`
   add leading zeros to `xs` if necessary to ensure it has a length of at least 6. 
   
        ensureLen 4 [1] == [0,0,0,1]
        ensureLen 3 [1,0,1,0,1] == [1,0,1,0,1]

3. (`and' :: Int -> Int -> Int`). Helper function. Give 1 if both
    inputs are 1, otherwise 0. 
    
3. (`bitwiseAnd`) Given two binary integers `a` and `b` (represented
   as lists of 0 and 1), produce the
   binary number given by lining up the ones places and the then
   "and"-ing the digits of `a` and `b` together. 
   The shorter number should be padded
   with zeros to be the same length as the long number.
   
4. (`bitwise`) Given a binary operation (`op :: Int -> Int -> Int`) and two
   binary integers, create a number by performing the operation bitwise
   as in the previous exercise. The shorter number should be padded
   with zeros to be the same length as the long number.
   
    The type signature for `op` in the big `bitwise` signature is
    `(Int->Int->Int)`.  Example:
   
        xor' :: Int -> Int -> Int
        xor' a b = if a == b then 0 else 1

        bitwise xor' [1,0,1,0] [0,1,1,0] = [1,1,0,0]

5. `txtToBin :: String -> [[Int]]`. Translate a string into a list of
   binary numbers using the location each character is found in the
   (abbreviated) list below. If a character is not found, produce the
   empty list to represent it. 

        [space]A-Za-z0-9.

6. `binToMsg :: [[Int]] -> [Int]`. Make sure each binary number is 6
   digits, and then concatenate all of the binary
   numbers into one long list of integers.

7. `msgDecode :: [Int] -> String`. Now decode the big binary number,
   changing it back into text.

8. `encrypt :: String -> String -> String`. The encrypt function takes
   in a message string and a key string. The encryption lines up the
   letters in the message and the string, changes the characters into
   binary numbers, joins the binary numbers with `xor`, and then
   changes the resulting number back into a string. The string will be
   nonsense.
   
        encrypt "Key" "Secret"
        
    The key is repeated and lined up with the secret message, then
    the values of the binary numbers are combined with `xor`.
    
        "KeyKeyK"
        "Secrets"
        "X tm cl"
   
    Note: this function is likely to require helper functions!
    
9. `decrypt :: String -> String -> String`. Given an encrypted
   message and a key, reverse the encryption process. This is kind of
   tricky without experimentation; try just re-encrypting the message and see if you can figure out a pattern.
