---
title: "Repl.it"
date: 2017-09-13T09:08:09-05:00
draft: false
tags: 
 - haskell
---
A summary of any special problems that have arisen with `repl.it`.
<!--more-->

##  Repl.it requires a main method

The particular interpreter repl.it requires that you have a main method. 
Write a simple one and then type your tests in the interactions pane.

    main = do putStrLn "Loaded"

## Repl.it needs variables

No "top-level" statements are allowed, everything must be assigned to
a variable or in a function.

Example: `[0..100]` on a line by itself should be written `question1 =
[0..100]`.
