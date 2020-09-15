---
title: "Source Code Files (ghci)"
date: 2017-09-11T10:12:55-05:00
tags:
  - haskell
categories:
  - ap-cs
draft: false
---

Writing a file is different from typing in an interpreter like repl.it or ghci. 
<!--more-->

The differences include no `let` statements at
the top level and no automatic printing of results.

## Interpreter vs file

An interpreter is what the "interactions pane" is called. In DrRacket, the interactions pane is the one on the bottom. In repl.it, the interactions pane is on the right side. Interactions with an interpreter can not be saved. There is a command line interpeter in the Haskell Platform called `ghci`.

A file is equivalent to the "definitions pane" in DrRacket. In repl.it, the left hand side of the window is a file. Files can be saved. You need to load (or "play") a file to see the results.

## No let statements needed to make variables or functions

Writing a file is different than typing in an interpreter. 
The whole file is loaded and (usually)
the `main` function is run. When defining functions and variables a
file, the word `let` is not used and the results are not immediately printed. 
A file equivalent might be written:

    w = "Cat"
    wlen = length w
    main = do putStrLn (show wlen)

Typing in an interpreter, every statement gives an immediate result, so the following is similar code for comparison:

    Prelude> let w = "Cat"
    Prelude> length w
    3

## Output to screen when running a file

Loading or running a file will not automatically cause results to print.

{{% notice info %}} 
Use the `putStrLn` function to output a string. 
{{% /notice %}}

    w = "Cat"
	main = do
	    putStrLn w

Printing items that are not strings requires the use of `show` to make 
the string that is printed.

    Prelude> let w = ["list","of","big words"]
	Prelude> putStrLn (show w)
	["list","of","big words"]

Omitting the `show` will produce an error message:

	Prelude> putStrLn w
	<interactive>:7:10: error:
    • Couldn't match type ‘[Char]’ with ‘Char’
      Expected type: String
        Actual type: [[Char]]
    • In the first argument of ‘putStrLn’, namely ‘w’
      In the expression: putStrLn w
      In an equation for ‘it’: it = putStrLn w

