---
title: "Jupyter Graphing"
date: 2020-09-21T11:52:18-05:00
weight: 10
draft: false
#type: slide
#theme: white
description: "Making ggplot work well."
---

This page includes code to make plots more readable and code to update
an internal package.

## More readable plots

I use these options to make my Jupyter notebook plots look good.

```
options(repr.plot.width=10, repr.plot.height=6)
theme_update(text = element_text(size=20))
```

## Repr Update

I have had weird errors (see below) when trying to use fill colors
with a continuous variable. Solution: make
sure you have an up-to-date "repr" package, then choose the menu option
"Runtime -> Restart and run all". No restart is needed if a new
package is not installed (read the output from the `install_github`
command). 

```
devtools::install_github('IRkernel/repr')
## restart runtime if this installs a new package
```

If you can run the code below without errors, you do not need the
`repr` fix.
```
library(tidyverse)
x <- LETTERS[1:20]
y <- paste0("var", seq(1,20))
data <- expand.grid(X=x, Y=y)
data$Z <- runif(400, 0, 5)
ggplot(data, aes(X, Y, fill= Z)) + 
  geom_tile() + coord_fixed() 
```

The error that prompted me to try the fix is below:
```
ERROR while rich displaying an object: Error in farver::decode_colour(colors, alpha = TRUE, to = "lab", na_value = "transparent"): unused argument (na_value = "transparent")
```
