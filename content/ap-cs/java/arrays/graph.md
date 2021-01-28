---
title: "Graphs"
date: 2021-01-26T12:05:34-06:00
weight: 10
draft: false
#type: slide
#theme: white
description: "Represent a web of connections with an adjacency matrix."
---

## Introduction

* Example of a graph.
* Write the adjacency matrix for this graph.
* Write the graph from this adjacency matrix.

## Java Programming

* `public class Graph` with a constructor that can take in a number of
  vertices (`int size`) and an adjacency matrix (`int [][] adj`).
* `public int count_connected(int vertex)`: How many other vertices
  are connected to the given vertex?
* `public int[] edges(int vertex)`: An array containing all other
  vertices connected to the given vertex.
* `public String prettyPrint()`: Return a string representation in the
  following form, where the first number in a row is the vertex A, and
  the rest of the numbers B in a row indicate edges exist from A to
  B. 

        NVERTICES 4
        0 1
        1 2 3
        2 3
        3

* `public static int[][] read_graph_raw(Scanner s)`: Given a Scanner,
  read a graph in the form of the output from `prettyPrint` and return
  the adjacency matrix (see tester code).

## Java Tester Code

* [Graph.java](Graph.txt): Skeleton code so the tests can
  compile. Search for "FIXME".
* [GraphTest.java](GraphTest.txt)

## Dangers and Annoyances

* The current design of the `prettyPrint` output is kind of hard for a
  beginner to parse. Break it down into steps: get a single line into
  a `String`, then figure out how to change that `String` into an
  integer array. Your choices would be: `Scanner` or use both `split`
  and `Integer.parseInt`. 

* Many people do not remember how to use classes. It was a problem to
  run the `count_connected` method on a `Graph` object. Alternative
  design for another year: make the functions take in the adjacency matrix.


  
