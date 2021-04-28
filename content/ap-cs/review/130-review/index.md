---
title: "130 Maze Review"
date: 2020-04-28T10:50:43-05:00
weight: 130
draft: false
#type: slide
#theme: white
description: "PD and Maze"
---

The class `PD` contains integer `x` and `y` coordinates
and a String direction.

The string can be "up", "down", "left", "right", or "end".

The coordinates are in traditional math coordinates, so "up" means
increase the y coordinate.

```java
public class PD {
   private int x, y; private String d;
   public PD (int x, int y, String d) { 
    this.x = x; this.y = y; this.d = d;
   }
   public int getX() { return x; }
   public int getY() { return y; }
   public String getDir() { return d; }
}
```

## Quiz

A `Maze` is an `ArrayList<PD>`. Write the following methods for the
Maze class.

1. `public void clean()` method in `Maze`: removes any `PD` that has
   "end" as its direction.
   
2. `public PD next(PD pos)`: follow the directions given in `pos` to
   find the next spot PD in the maze. If there is none, return
   `null`. You may assume there is at most 1 point in the maze in the
   direction you are going (but it is more interesting to find the
   closest one).
   
   Example: Maze has only A = (5,2,"up") and B = (5,9,"right") then
   calling `next(A)` gives `B`. So go in the "up" direction from A
   until you hit another "PD" in the maze. Calling `next(B)` would
   return null, since there is no point to the right of B in the maze.

    Check the whole maze list before giving up. 
    
    Plan: go through the list of PD in the maze, find the next one in
    the given direction that is closest.

3. `public ArrayList<PD> solve(int startx, int starty)`:
   give the sequence of all PD's from
   (startx,starty) to "end". You are guaranteed there is a PD at the
   starting coordinates. If
   the maze is not solvable, return as far as you get (so it will not
   end at the "end").

    This is a Maze:
    
        PD(x=8, y=-2, d="left")
        PD(x=5, y=3, d="right")
        PD(x=1, y=-1, d="end")
        PD(x=8, y=3, d="down")
    
    and a solution to the maze:

        PD(x=5, y=3, d="right")
        PD(x=8, y=3, d="down")
        PD(x=8, y=-2, d="left")
        PD(x=1, y=-1, d="end")

## Example

Maze:

    PD(15,-9,left)
    PD(9,-9,end)
    PD(10,-2,up)
    PD(5,-2,right)
    PD(15,1,down)
    PD(10,1,right)
    PD(5,3,down)

{{% figure src="maze.png" title="Maze Illustration" %}}


    
`solve(5,3)` gives

    PD(5,3,down)
    PD(5,-2,right)
    PD(10,-2,up)
    PD(10,1,right)
    PD(15,1,down)
    PD(15,-9,left)
    PD(9,-9,end)

