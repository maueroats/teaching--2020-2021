---
title: "150 ChartMaker"
date: 2020-05-14T10:50:51-05:00
weight: 150
draft: false
#type: slide
#theme: white
description: "Bar chart creator class."
---

The `ChartMaker` class is makes
[histograms](https://en.wikipedia.org/wiki/Histogram). 
When you make a `ChartMaker` object, you provide a list of cut scores
to use for making the bins.

```java
public class ChartMaker {
  // (a) Constructor
  public ChartMaker(List<Integer> cutscores) {...}
  
  // (b) ingest: put data in bins according to cutscores
  public void ingest(int[] data) {...}
  
  // (c) barChart: produce a list of bars "X" based 
  //     maxwidth = 100% of data
  public List<String> barChart(int maxwidth) { ... }
  
  // (d) mergeAdjacent: update all of the counts and cutscores
  //     to join every two "bins" into one
  public void mergeAdjacent() { ... }
}
```

## Examples

```java
{
  List<Integer> cutscores = Arrays.asList(0,10,20,30);
  ChartMaker cm = new ChartMaker(cutscores);
  
  int[] data = {1,2,3,4,3,2,1,11,13,22,23,24,31,50,100};
  cm.ingest(data);
  
  List<String> chart = cm.barChart(80);
  
  cm.mergeAdjacent(); // join cutscores to be {0,20}, counts also updated
}
```


## Helper functions

In writing you may assume the existence of a [String repeating method](https://stackoverflow.com/questions/1235179/simple-way-to-repeat-a-string-in-java).
```java
public static String rep (String x, int times) {
    return x.repeat(times);
}
```
