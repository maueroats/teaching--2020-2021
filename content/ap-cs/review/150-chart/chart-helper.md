---
title: "Chart Helper" 
date: 2021-05-03T08:47:37-05:00
weight: 200
draft: false
#type: slide
#theme: white
description: "Helper functions for the ChartMaker."
---
I use a `dumpChart` function to print the chart nicely:
```java
public static void dumpChart(ArrayList<String> chart) {
    for (String xs : chart) {
        System.out.println(String.format("%s  (%d)",xs,xs.length()));
    }
}
```

You will need to make a repeating string of X's. New-ish versions of
Java have a [String repeating method](https://stackoverflow.com/questions/1235179/simple-way-to-repeat-a-string-in-java).
```java
public static String rep (String x, int times) {
    return x.repeat(times);
}
```
