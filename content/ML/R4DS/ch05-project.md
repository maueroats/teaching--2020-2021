---
title: "Ch05 Project"
date: 2020-09-28T09:51:08-05:00
weight: 54
draft: false
#type: slide
#theme: white
description: "An open ended data analysis project."
---
Timeline 2020:

* one analysis due Thursday
* second analysis due Monday, plus revisions on the first if required

## Project Description

You will analyze two datasets. One involving mostly categorical data,
another involving time series data.

* _Brainstorm_: List at least 10 questions that you could answer from the data. If
needed, simple extensions of the data available could be added to
generate more questions. 

* Pick at least four to answer. The questions you choose should
  demonstrate a range of graph types and data analysis techniques.
  
  Graph types means bar or column charts, scatterplots, box plots,
  histograms, smooth approximation lines, and more. 

  Data analysis techniques right now means using dplyr functions like
  `filter`, `group_by`, and `mutate`.

* Each question should be answered with data and a written
  interpretation of the data (at least once sentence). The written
  interpretation connects the visualization or R computation to the conclusion.

## Datasets

You do not need to use "external" datasets. Making data "tidy" and
"clean" is not part of this assignment.

* `data()` lists installed datasets
* [R datasets](https://vincentarelbundock.github.io/Rdatasets/) on
  GitHub lists an enormous number of datasets available in R.
* Other datasets are everywhere, but the are not always "clean" and
  easy to work with.
    * [Modeling the
      Future](https://www.mtfchallenge.org/data-sources/) has pointers
      to many large goverment datasets.
    * [Kaggle](https://kaggle.com) hosts many datasets, but focuses on competitions.

Forbidden - we have done too much with these: diamonds, flights. 
  
## Evaluation

* Quantity of questions (8 points)

    + (0,5): Insufficient (0-2 points)
    + [5,10): Low (4-6 points)
    + 10+: Enough (8 points)
    
* Quality of questions (8 points)

    * Leaves obvious questions unasked (0-2 points)
    * All questions are straightforward (4-6 points)
    * Some questions are insightful or interesting (8+ points)

* Breadth of questioning (8 points)
  
    * Two points per geometry / technique.

* Summaries (6 points)

    * Do they accurately summarize and come to a conclusion?
    
* Extra credit
  
    * Data required cleaning:
         + Simple rewriting +2
         + Chapter 12 techniques required +4

    * Multiple data frames used in combination (Chapter 13): (+2 to +4)
      
    
