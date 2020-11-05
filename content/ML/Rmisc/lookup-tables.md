---
title: "Lookup Tables"
date: 2020-11-05T10:19:50-06:00
weight: 30
draft: false
#type: slide
#theme: white
description: "Replacing values with other values in R."
---

* Remember that if there are NA values, change them with `replace_na`.

## Lookup List

Using a list with names gets the job done, but I do not think it is
very efficient. You can make a function or use list access `[...]`.

```R
how_often_1 = c("A","B","C","Long month","E","F")
how_often_lookup = set_names(seq_along(how_often_1),how_often_1)
```

Examples:
```R
ex= c("E","B","Long month","A","B","B")
how_often_lookup["E"]
how_often_lookup[ex]
often_to_number <- function(x) how_often_lookup[x]
often_to_number(ex)
```

## Lookup Table

Use a left join. You will have to make sure the column names
match. Use `rename` if you want to change the value column name.

```R
gpa_values <- tribble(
    ~grade, ~value,
    "A"   ,  4,
    "B"   ,  3,
    "C"   ,  2,
    "D"   ,  1,
    "F"   ,  0,
    )
```

Example usage:
```R
grades <- tribble(
   ~person, ~science_grade,
   "Amanda", "A",
   "Gunn", "B",
   "Santiago", "A",
   "Carmen", "F",
   "Isabel", "D",
   "Allende","C",
   "Ghost", NA,
)
grades %>% 
  left_join(gpa_values, by=c("science_grade"="grade")) %>%
  rename(science_gp = value)
```
