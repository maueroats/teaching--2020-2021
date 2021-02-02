---
title: "Sem.1 Final"
date: 2021-02-02T11:12:01-06:00
#weight: 
draft: false
#type: slide
#theme: white
description: "Final exam for semester 1, pandemic edition."
---

You are allowed to use general [online Java
documentation](https://docs.oracle.com/javase/8/docs/api/) or even the
official [Java tutorials](https://docs.oracle.com/javase/tutorial/).
It is not permitted to search for solutions to particular problems
(for example on Stack Overflow).

Information: A standard deck of playing cards has 4 suits (Club, Diamond, Heart,
Spade) and 13 ranks in each suit (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack,
Queen, King). Traditionally aces can be valued either low (1) or high
(above king). 

## Problem Solving

### Average Saddle

A 2d array of numbers represents heights of the ground. A hilltop is
greater than any of its up to 4 neighbors (changing only one coordinate
by one). A saddle is greater than two neighbors in opposite directions
and less than two neighbors in the other directions.

Examples of a saddle:

      xx 20 xx          yy 100 yy
      90 60 80          -8  90 40
      xx 40 xx          yy 240 yy 

Find the average height of all of the saddles in an array.

    public static int avg_saddle(int[][] nums)


      
## Cards

A hand of playing cards is represented by a string. 

Example: a hand contains a 2 of hearts, 6 of diamonds, 4 of clubs,
jack of spades, and ace of diamonds. This would be represented by
the string "2H 6D 4C JS AD".

You will use the Card class already partially written for you.

```java
public class Card {
  private int suit, rank;
  public static final int CLUB=1, DIAMOND=2, HEART=3, SPADE=4;
  // you write the constructor, which should take in two numbers
  public int getRank() { return rank; }
  public int getSuit() { return suit; }
  public String toString() { return "TODO"; }
  public static Card parse_one(String str) { return null; }
  public static Card[] parse_hand(String str) { return null; }

  // we have not learned how to write equals yet, so this is given
  public boolean equals(Object other) {
    if (other instanceof Card ) {
      Card o = (Card) other; 
      return suit==o.suit && rank==o.rank;
    } else {
      return false;
    }
  }
}
```

1. Write the `Card` constructor.
2. Write the `toString` method which return a String representing the
   rank of the card followed by its suit.
3. Write the `parse_one` function. Example: `Card.parse_one("JH")`
    should return a `new Card(11, 3)` because jack has a rank of 11
    and hearts is suit 3.
4. Write `parse_hand` which should take a space-separated string of
   cards and produce an array of Cards.

        String hand1 = "2H 6C";
        Card[] expected_ans1 = {new Card(2,3), new Card(6,1)};

