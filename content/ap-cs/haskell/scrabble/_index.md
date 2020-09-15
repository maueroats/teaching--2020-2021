---
title: "Scrabble"
date: 2019-10-06T13:13:35-05:00
#weight: 
draft: false
#type: slide
#theme: white
description: "A project writing the game of Scrabble."
---

The [Scrabble entry in
Wikipedia](https://en.wikipedia.org/wiki/Scrabble_letter_distributions#English)
gives the point values of each letter in the game.

[{{% figure src="https://static.parade.com/wp-content/uploads/2014/08/scrabble-winning-board.jpg"
width="200" %}}](https://parade.com/327792/scrabble-winning-board/)

Your job is to create the game of Scrabble.
   
{{% figure
src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Scrabble-example.png/594px-Scrabble-example.png" 
width="200" %}}

This page should be broken into multiple pages once we start working
on it.

## Data Structures

We will use the `type` command to create "aliases" - a shorthand ways of
referring to another type.
Advanced students should read about
[Haskell's
structs](http://learnyouahaskell.com/making-our-own-types-and-typeclasses)
and more.

* Represent the state of the board as a list of tuples
   `(Char,(Int,Int))` with the first integer giving the x-coordinate of
   the letter and the second integer the y-coordinate.
   
	    type Place = (Int,Int)
		type PlacedLetter = (Char,Place)
		type Board = [PlacedLetter]

* A play will given by the word, its starting place, and `True` if horizontal. 

		type Play = (String,Place,Bool)

* A particular special letter will denote blank spaces on the board
  when you ask for the contents of a square: `'*'`. 

## Functions

1. Create variable holding the letter-valuations. You could just type everything,
   but instead make a list of `(String,Int)` pairs that lists the
   letters and then the value they have. For example, the entry
   `("BCMP",3)` indicates that each of the letters `'B'`, `'C'`, `'M'`
   and `'P'` are worth 3 points. Use a space for the blank.
   
2. Write a function `valueLetter1 :: Char -> Int` that finds the value
   of a single letter. It should fail with an error when asked about
   an unknown letter.
   
3. Write a function `valueWord :: String -> Int` that finds the
   "simple" value of a word (without considering its placement on the
   board). 
   
4. Write a function `letterPlace :: Play -> [PlacedLetter]` that 
   generates the list of places where the letters are played.

5. The `getLetter :: Board Place -> Char` gets the letter at the given
   place, or `'*'` if the space is empty.

6. Drawing the board happens in several steps: 

	1. Make a string for a single row using `renderRow :: Board Int -> String`.
	2. Make a list of strings, one for each row using `renderBoard1 ::
       Board -> [String]`.
	3. Join everything into one long string using `renderBoard ::
       Board -> String`.

6. The `legalPlay1` function determines whether a single `PlacedLetter`
   conflicts with any letters that are already on the
   board. It is OK if a letter is already in the desired position, but
   not of a different letter is there.

		legalPlay1 :: Board -> PlacedLetter -> Bool

7. The `legalPlay :: Board -> [PlacedLetter] -> Bool` function
   determines whether the result of the `letterPlace` function can
   legally be played (every letter should be ok to play).[^1]

8. The `updateBoard :: Board -> [PlacedLetter] -> Board` function
   creates a new board that includes all of the additional letters from its
   second argument.

9. The `usedLetters :: Board -> [PlacedLetter] -> [Char]` function
   gives a list of the letters actually used to make a given
   play. This may not be every letter in the list because some of them
   may already be on the board.

## User Interface

Eventually, this section will contain code so you can interact with
your game.

## Further Work

That's probably enough work. Continuing to make the whole game
 includes a lot more details:
 
* Create a way of denoting the double and triple letter
score squares as well as the double and triple word squares.
* The `valuePlay :: Board -> [PlacedLetter] -> Int` function
  determines the value of a particular play on the board.
 Note that bonuses (double/triple letter/word score) only count for the first
player to use them.
* Count all of the words formed by a given play - see the "MAR" play
  next to "FLORIGEN" in the example at the top of the page. Four words
  are created by that play: "MAR", "MI", "AG", and "RE". They would
  all be scored. The triple word score counts for both "MAR" and "AG". 
* A dictionary of legal words?! 

[^1]: Ignore the requirement that a word connect somehow with another play on the board. That is quite challenging since the played word can form other words with letters adjacent to the play.

