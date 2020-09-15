---
title: "Chapter 3 Daily 01"
date: 2019-09-23T16:28:54-05:00
weight: 101
draft: false
#type: slide
#theme: white
---

Design process:

* examples which turn into checkExpects
* signatures
* break down into simple pieces

The checks that you write should go from simple to complicated, giving
you a road map for how to build the function.

1. `ct`: Convert a list of base 2 digits into an integer. 

        46 == ct [1,0,1,1,1,0] 
        
2. `tobin`: Convert an integer into a list of base 2 digits.

        [1,0,1,1,1,0] == tobin 46

