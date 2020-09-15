---
title: "3. Types and Typeclasses"
date: 2017-09-12T13:18:35-05:00
tags:
 - haskell
draft: false
weight: 3
description: Typeclasses abstract characteristics of types like String or Int.
---
Types categorize the kinds of data that appear in a program. Typeclasses provide general abilities that different types can have. 
<!--more-->

For example, String is a type which means a list of characters. Show is a typeclass. Every type implementing Show will have a "show" method that converts it to a string (the method does not need to have the same name as the typeclass). 


{{% children %}}
