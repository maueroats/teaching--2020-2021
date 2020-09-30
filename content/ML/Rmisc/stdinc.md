---
title: "Standard Header"
date: 2020-09-30T13:29:57-05:00
weight: 100
draft: false
#type: slide
#theme: white
description: "Boilerplate for all of my notebooks."
---

There are two: one for Colaboratory and one for local Jupyter
notebooks.

## Colaboratory

```R
install.packages(c("farver"))
library(tidyverse)

options(repr.plot.width=10, repr.plot.height=6)
theme_update(text = element_text(size=20))
```

## Jupyter Notebook

### Linux

```R
library(tidyverse)
options(repr.plot.width=10, repr.plot.height=6)
switch(Sys.info()[['sysname']],
       'Linux' = theme_update(text=element_text(size=16, family="Arial")))
```

### Mac

```
[update]
```
