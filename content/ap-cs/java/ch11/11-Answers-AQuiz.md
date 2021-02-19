---
title: "11. AQuiz IAnswers"
date: 2019-02-22T09:26:13-06:00
#weight: 
draft: false
#type: slide
#theme: white
description: "A quiz asking you to write an interface, an abstract class, and more."
---

## Interface: IAnswers

The `IAnswers` interface has the methods:

    int numAnswers();
    int getAnswer(int k);

## Class: MCAnswers

The multiple choice answers class `MCAnswers` implements the `IAnswers`
interface. Its constructor is:

    public MCAnswers (int[] answers)
    
## Abstract class: AQuiz

* Constructor takes in an `IAnswers` key of correct answers.
* method `int score(IAnswers student)` gives the score for the
  remembered student answer sheet. 
* abstract method `int scoreOne(int correct, int given)` returns the
  score for a single answer.

## Class: MCQuiz

* Subclass of AQuiz
* Constructor takes in a `IAnswers` key of correct answers.
* Scoring in the `scoreOne` method is 4 points for a correct answer
  and -1 point for a wrong answer. 

## Example

        int[] ans = {2,2,1,3,4};
        int[] student = {2,2,4,3,4};
        IAnswers a = new MCAnswers(ans);
        IAnswers s = new MCAnswers(student);       
        AQuiz b = new MCQuiz(a);
        int result = b.score(s);
        System.out.println(result); // prints 15 = +4 +4 -1 +4 +4

