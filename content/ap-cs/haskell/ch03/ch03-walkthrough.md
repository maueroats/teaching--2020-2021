---
title: "Chapter 3 Walkthrough"
date: 2018-09-18T11:14:50-05:00
weight: 40
draft: false
type: slide
theme: white
---

# Cubes

* List: all perfect cubes divisible by 16 and less than N.
* Write signature.

```haskell
cubes 100 == [64]
cubes 600 == [64, 512]
```

---

# Partial Average

* Average first N items of a list.
* Write signature.

```haskell
partAvg 3 [10,15,50,10000] == 25
```

---

# Say GPA

* Make a string "My GPA is 3.10".
* Number is parameter.
* Write signature.

```haskell
sayGPA 3.10 == "My GPA is 3.10"
```

---

# Count Up I

* Given start and end numbers, print a string.
* Usage: `countUp 3 7`
* Result:  "I can count from 3 to 7: [3, 4, 5, 6, 7]"

```haskell
countUp 3 7 == "I can count from 3 to 7: [3, 4, 5, 6, 7]"
```

---
# Count Up II

* Given strings containing start and end numbers, as if typed.
* Same as Count Up I.

```haskell
countUpII "3" "7" == "I can count from 3 to 7: [3, 4, 5, 6, 7]"
```

--- 

# Need `read`? 

Use type signatures and helper functions.

---

# Sample Standard Deviation

Input a list of numbers, say there are n of them.

1. Find the average (called "xbar").
2. Find the sum of (x-xbar)^2 for each x in the list.
3. Divide by n-1.
4. Take the square root.

