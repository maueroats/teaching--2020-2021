---
title: "150 ChartMaker"
date: 2021-04-30T15:42:45-05:00
weight: 150
draft: false
#type: slide
#theme: white
description: "Bar chart creator class."
---

{{% use-mathjax %}} 

The `ChartMaker` class is makes
[histograms](https://en.wikipedia.org/wiki/Histogram). 
When you make a `ChartMaker` object, you provide a list of cut scores
to use for making the bins.

## Example

The `demo1()` code below uses cutscores of 0, 10, 20, and 30 with
the data

    {-5,0,1,2,3,20,20,20,29,30,100,110}
The bins used in the case are 
$(-\infty,0)$, $[0,10)$, $[10,20)$, $[20,30)$, and $[30,\infty)$.
<!-- $x<0$, $0\le x <10$, $10\le x < 20$, $20\le x < 30$, and $30 \le x$.-->


The output shows the number of items in each bin, from $(-\infty,0)$
to $[30,\infty)$, in this case using 120 X's to represent the total in
all of the bins.

    XXXXXXXXXX  (10)
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  (40)
      (0)
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  (40)
    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  (30)

The number of X's on a line is determined by the ratio

     (Xs to show) / maxwidth = (number in bin) / (total number)
Showing the number of X's, like (40), is an optional feature. 

Running the `mergeAdjacent()` function should merge bins that are next
to each other. In the example, merging results in using cutscores 0
and 20, and bins $(-\infty,0)$, $[0,20)$, and $[20,\infty)$.

See the [chart demo code]({{% relref "./chart-demo.md" %}}) for details.

## Java Setup

The functions to make are:
* the constructor
* `ingest`, which processes the data and remembers how many are in
  each bin
* `barChart`, which produces a bar chart of the data as shown above
* `mergeAdjacent`, which joins adjacent bins

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



## Helper functions

You can see my [ChartMaker helper functions]({{% relref
"./chart-helper.md" %}}) on a separate page.
