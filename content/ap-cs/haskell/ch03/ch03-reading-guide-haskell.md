---
title: "Chapter 3 Reading Guide"
date: 2017-09-13T13:18:35-05:00
tags:
 - haskell
 - reading-guide
draft: false
weight: 20
description: "We learn about types and typeclasses. Types are familiar. Typeclasses are more abstract - roughly, they specify abilities."
---

You should use valid Haskell types in all of your answers. Unless needed, I stick with Int for the type for integers.

## Basics
5. How do you find the type of an expression (when using the interpreter)?
2. What is the type of a string, written in correct Haskell type syntax?
6. What is the type of the expression (5 == 5)?
7. What is the type signature for a function that takes in an integer and puts out a string?
8. What is the type signature for a function that takes in two integers and multiplies them?
9. What is the type of (factorial 50) from the book? How is that different from an Int?
7. Write the signature of a function `prob7` that takes in a number
   (an integer) and puts out a string.
8. What is the correct way to write the type signature of a function
   `prob8` that take single number (integer) and a list of numbers
   (integers) and puts out a list of numbers (integers)?

10. Find out the difference between Float and Double. Summarize it here.
11. How can you tell whether the text "string" in a program refers to a variable or a type?
12. Write the type signature for:
    1. snd
    2. repeat
    3. init
    
## Class Constraints
13. Where can you find a class constraint?
14. What special symbol separates a class constraint from a function's type?
15. What is the best type to give the function:
    ```
     mystery a b = if ( a < b ) then "A small" else "A large"
    ```

16. What familiar typeclass indicates that something can be written in string form?

## The Read Typeclass
17. What does being in the Read typeclass indicate?
18. How can you convert the string "10230" to an integer?

## Miscellaneous Typeclasses
19. What is the main use of the Enum typeclass?
20. Aside from integers, give two other examples of things in the Enum typeclass.
21. What typeclass tells you that something has a largest and smallest value?
22. How would you find the smallest possible Int in Haskell?

## Math
23. What is the difference between 5 and (5 :: Int)? 
24. Can you do this math? 
    1. 3.2 * (5 :: Int) 
    2. 5.63 * 20
25. What will happen when you use the following function?
    listBigSize aList = 3 * (length aList)

## Integral vs Floating
26. The last function discussed in the chapter is the most important by far. 
    1. Write its name and signature here.
    2. What is it used for?

27. Programming exercise: the quadratic formula. Write and test a function that takes in a,b, and c, and produces the larger root of ax^2+bx+c. (Assume there is at least one real root.)


