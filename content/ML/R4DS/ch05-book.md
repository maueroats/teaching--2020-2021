---
title: "Ch05 Book"
date: 2020-09-23T21:16:28-05:00
weight: 50
draft: false
#type: slide
#theme: white
description: "A digest of some information from Chapter 5."
---

Note: three assignments are recommended: 5.3-5.5, 5.6,
5.7. Combining the last two was too much work.

## General

Many summary functions do not work if the data contains `NA`. 
The `na.rm` option causes them to be ignored, or `drop_na()` gets rid
of them in the pipe. There are other methods we will learn later.


## Summarizing Functions (5.6)

* mean
* median
* sd = standard deviation (will learn later if you do not know)
* n(): how many values are in the group
* n_distinct: how many distinct values
* sum
* min, max
* quantile(data,0.25): produces a single number, a value that
  is greater than 25% of the data values at less than the remaining 75%.
  Read
  `?quantile` for a surprising amount of technical information.
* ntile(data,n): produces a column of numbers giving which of the n
  bins the input numbers fall into. Outputs number from 1 to n inclusive.
* mad = median absolute deviation
* IQR = interquartile range (Q3-Q1)

Detail Notes: a boolean TRUE counts as the number 1 and FALSE counts
as 0. Summing booleans gives how many trues. Finding the mean of
booleans gives the proportion that are true.

Boolean `is.na` is used to find out how many NAs are in the data.

## Window functions

Source: [window-functions vignette](https://cran.r-project.org/web/packages/dplyr/vignettes/window-functions.html).

These functions are normally used only on grouped data.

### Common accumulating functions

* cumsum: the cumulative sum
* cummean: the cumulative mean
* cummin: least value so far
* cummax: greatest value so far
* cumall: boolean, true if every value so far is true (like and; once false it
  stays false)
* cumany: boolean, true if any value so far is true (like "or"; once true it
  stays true)

### Common other functions

* min_rank: order within the window
* lag: the previous item in the vector
* lead: the next item in the vector

### Uncommon: Ranking Functions

There are a ton of ranking functions because:
1. there are many ways ties can be broken
2. everybody wants to rank everything

* row_number
* min_rank
* dense_rank
* cume_dist: proportion of values <= current value
* percent_rank: proportion of values < current value

Example from source that shows the difference between these functions.
```
x <- c(1, 1, 2, 2, 2)
row_number(x)
#> [1] 1 2 3 4 5
min_rank(x)
#> [1] 1 1 3 3 3
dense_rank(x)
#> [1] 1 1 2 2 2
cume_dist(x)
#> [1] 0.4 0.4 1.0 1.0 1.0
percent_rank(x)
#> [1] 0.0 0.0 0.5 0.5 0.5
```
