---
title: "Why Racket?"
date: 2018-09-05T20:12:44-05:00
section:
 - intermediate-cs
draft: false
---

> Many people we encounter tell us they wish they knew how to code and then ask which programming language they should learn. Given the press that some programming languages get, this question is not surprising. But it is also wholly inappropriate. Learning to program in a currently fashionable programming language often sets up students for eventual failure. Fashion in this world is extremely short lived. A typical “quick programming in X” book or course fails to teach principles that transfer to the next fashion language. Worse, the language itself often distracts from the acquisition of transferable skills, at the level of both expressing solutions and dealing with programming mistakes.

> -- [Felleison et al, _How to Design Programs_, Second Edition][2].

To understand why Racket is a good language to learn, one need read no further than [Section 0.1][3] of Stephen Bloch's _Picturing Programs_. Please read it now if you have not.

To summarize, here are major arguments for choosing Racket over a more
"popular" programming language:

* Racket's uniform syntax (everything is in parentheses, no order of
  operations, means that everything you do learn is a real
  intellectual concept.
  
* Racket works without any incantations that cannot be understood by a
  beginner. Example: Java's `public static void main (String[] args)`
  incantation.
  
* Racket's language levels protects you from advanced features that
  could be misunderstood at the start, but lets you continue to
  program in the same familiar language with more advanced features
  when you are ready.

* Any language you choose will be obsolete by the time you enter the
  workforce in 4-8 years, so effort spent learning language-specific
  syntax is not productive. Instead, you need to learn how to learn a
  new language. Most programmers find themselves working in a variety
  of languages depending on the requirements of their current task.
  
  
* [Paul Graham's][4] article [_Beating the Averages_][1] explains how they used Lisp to make a very successful business (it was worth almost $50 million when it was purchased by Yahoo!). Lisp is a language very similar to Racket. 

* Racket includes a way to build [web applications][5] as well as a
[graphical user interface builder][6] that works on any kind of computer.

* Nobody should pass judgement on Racket until they understand the
[macro system][7] that it has! Consider that a challenge if you are an advanced student. 


[1]: http://www.paulgraham.com/avg.html
[2]: http://www.ccs.neu.edu/home/matthias/HtDP2e/part_preface.html
[3]: http://www.picturingprograms.com/download/chap00.pdf
[4]: https://en.wikipedia.org/wiki/Paul_Graham_(computer_programmer)
[5]: https://docs.racket-lang.org/continue/index.html?q=web%20applications
[6]: https://docs.racket-lang.org/gui/windowing-overview.html?q=gui
[7]: http://www.greghendershott.com/fear-of-macros/Preface.html
