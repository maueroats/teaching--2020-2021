---
title: "11. Candy"
date: 2019-02-20T20:35:06-06:00
weight: 30
draft: false
#type: slide
#theme: white
description: "Food interface, Candy class, ComboCandy subclass."
---

The `Food` interface has methods `String getName()` and `String
getTaste()`.

The `Candy` class implements the `Food` interface. When printed out,
it shows the name of the candy and the flavor (as seen below). 

    Candy c = new Candy("Red hots", "cinnamon");
	Candy d = new Candy("Little Mints", "peppermint");
	Candy e = new ComboCandy("swirl", c, d);
	
	System.out.println(c); // "Red hots: cinnamon"
	System.out.println(d); // "Little Mints: peppermint"
	System.out.println(e); // "Combo: swirl of cinnamon and peppermint"

Notice that the combo candy always prints out as "Combo" before the
flavor.

