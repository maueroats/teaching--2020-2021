---
title: "2021-06-01 Dogs"
date: 2021-06-01T09:13:56-05:00
weight: 20210601
draft: false
#type: slide
#theme: white
description: "Data on Dogs in Switzerland."
---

The data is from Zurich, Switzerland, courtesy of the internet. The
idea to analyze this dataset comes from a [post on Kaggle](https://www.kaggle.com/kmader/dogs-of-zurich?select=zuordnungstabellehunderassehundetyp.csv).

## Translation

German is the official language of Zurich. Most of the columns
are in German, but the translations to English aren't too tricky. Use
a translator if you find something you do not understand.

* ALTER -> Age
* GESCHLECHT -> Gender (w = weiblich, female; m = männlich, male)
* STADTKREIS -> City Quarter or District
* RASSE1 -> Dog's Primary Breed
* RASSE2 -> Dog's Secondary Breed
* GEBURTSJAHR_HUND -> Dog's Year of Birth
* GESCHLECHT_HUND -> Dog's Gender
* HUNDEFARBE -> Dog's Color

## Data

[Dog data from Zurich]({{% relref "swiss-dog-data" %}}). There should
be a notebook available to load the data and do some initial
cleaning. 

## Questions

We will use 2015 to begin. Later we can combine all of the information
into a single data frame to see if more can be learned by combining
data from multiple years.

* How many dogs are there? 
* How many male vs female dogs?
* Analyze the ages of the owners?
* The birth year of the dog has some obvious errors. Find them and fix
  them. See the fixing code included in the notebook.
* Does `id` uniquely identify the dog registration information?
  Explain your reasoning and give supporting evidence.
