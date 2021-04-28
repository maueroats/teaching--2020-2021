---
title: "120 Review"
date: 2020-04-24T10:44:48-05:00
weight: 120
draft: false
#type: slide
#theme: white
description: "Wire class quiz"
---

## Quiz

Define the class `Wire` as outlined below.

* We imagine wires on a number line. 
* A wire connects two end locations.
* Calling `getEnd(0)` and `getEnd(1)` give the two ends.
* Cut returns an array containing two wires, with ends as you would
  imagine (one end to the cut, cut to the other end).
* `solder` connects two wires to return 1 long wire. If you want you
  can make it work with more.

```
public class Wire {
    // instance variables to here
    public Wire (int end1, int end2) { }
    public int getEnd(int n) { return -1;}
    public Wire[] cut(int where) { return null; }
    public Wire solder(Wire[] wires) { return null; }
}
```

