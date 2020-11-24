---
title: "Unit Testing Level II"
date: 2018-01-19T10:39:50-06:00
draft: false
#type: slide
#theme: white
description: "Slightly more advanced unit testing commands and techniques."
---

You can make common setup code run with `@Before`. Use it to give instance variables
their initial values for each test. This method runs once before **each** test, so it will reset the variables to the values you want them to have at the start.

## Common setup for all tests

`@Before`: Method runs before every test. Used to set up instance variables containing objects to be tested.

        private int maxNum;
        @Before
        public void set_max() {
            maxNum = 4;
        }
        @Test
        public void test_max() {
            assertEquals(maxNum,4);
        }

## Many tests with the same setup

I use [parameterized tests](https://github.com/junit-team/junit4/wiki/Parameterized-tests). 
They may be to complex for beginners, but see [my HospitalTest code on GitHub](https://github.com/2017-2018-wy-ap-cs/java-rotary-phone/blob/master/ch10q2/HospitalTest.java) or [the raw file](HospitalTest.java).



