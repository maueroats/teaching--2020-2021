---
title: "20. Intro Ex 1"
date: 2020-01-23T09:21:34-06:00
#weight: 
draft: false
#type: slide
#theme: white
---

1. Write a function `slope-posn` that takes in a posn and 
   gives the slope of
   the line through (0,0) and the posn.
 
        slope-posn : posn -> number
 
2. Write a function `perp?` that takes in two posns each being 
   (change in x,
   change in y) - like above - and returns true if they represent
   slopes of perpendicular lines.
        
        perp? : posn posn -> boolean
        
3. Write `on-line?` that determines if a posn is on a line given in
   `y=mx+b` form. 
   
        on-line?: number(m) number(b) posn -> boolean
        
4. Write a function `unit` that takes in a posn and puts out
   the posn with each coordinate divided by the distance the input
   posn is from the origin. For example, the point (3,4) is 5 units
   from the origin, so the output should be (3/5,4/5).
   
        unit : posn -> posn
        
You should write your own check-expects, but there are a few to [test
your code](20-intro-checkexpect). 
