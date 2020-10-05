---
title: "Timeseries"
date: 2020-10-05T11:33:06-05:00
#weight: 
draft: false
#type: slide
#theme: white
description: "Convert a time series object to a tibble."
---

You might want to work with a "Time Series" as a tibble. 

## Do you have a time series?

Look for a sign that you are looking at a time series at the start of
its printout:

    A Time Series: 192 × 8

## Simple Conversion

If you want to keep it simple, just use the row number in the table to
keep track of how many months into the time series you are.

```R
seat <- Seatbelts %>% 
  as_tibble(rownames = "monthnum") 
```

## Medium Conversion

You could get actual dates by using the `lubridate` library (Chapter
16 in R4DS).

```R
library(lubridate)
time0 <- make_datetime(1969,01) - months(1)
seat <- Seatbelts %>% 
  as_tibble(rownames = "monthnum") %>%
  mutate (date = time0 + months(as.integer(monthnum)))
```

## Advanced Conversion

You could install the `timetk` package ("time series toolkit"). This
package has functions to convert to and from a time series type.

```R
seat <- timetk::ts_tbl(Seatbelts)
```
