---
title: "Chart Demo" 
date: 2021-05-03T08:47:17-05:00
weight: 100
draft: false
#type: slide
#theme: white
description: "ChartMaker demonstration code."
---

The code is:
```java
public static void demo1() {
  int[] data = {-5,0,1,2,3,20,20,20,29,30,100,110}; // 12 items
  int maxwidth = 120;
  demo0(data, maxwidth);
}
```
The `demo0` function is:
```java
public static void demo0(int[] data, maxwidth) {
  List<Integer> cutscores = Arrays.asList(0,10,20,30);
  ChartMaker cm = new ChartMaker(cutscores);
  cm.ingest(data);
  List<String> chart = cm.barChart(maxwidth);
  dumpChart(chart); // see Helper functions
}
```
