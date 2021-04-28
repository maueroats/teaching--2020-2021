---
title: "140 Farm"
date: 2020-04-30T11:56:24-05:00
weight: 140
draft: false
#type: slide
#theme: white
description: "Farm class: grow plants, harvest them."
---

A `Farm` contains a list of crops. 

* You can add crops to the farm by
calling the `void plant(String crop)` method. 
* You can harvest a lot of
crops at once by calling the `int harvest(List<String> wanted)`
method - this method returns the number of individual crops
harvested. 
* When you `void fertilize(String crop)`, the crop grows more ---
represent that by putting another one of the same crop next to every
crop you find in the current list of crops.

[Skeleton Farm.java code](Farm.txt) to help you test.

## Example

A Farm has corn, corn, corn, soybeans, soybeans, and green
beans.

* Calling the `plant("wheat")` method adds wheat to the list of
crops. 
* Calling the `harvest(["corn","soybeans"])` method removes corn
and soybeans from the list of crops and returns 5, since 5 items were
harvested. The farm now has: green beans.
* Using the original example farm, `fertilize("soybeans")` makes the
    farm have corn, corn, corn, soybean, soybeans, soybeans, soybeans, and
    green beans. 

