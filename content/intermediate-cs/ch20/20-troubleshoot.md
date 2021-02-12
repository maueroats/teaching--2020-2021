---
title: "20. Troubleshoot"
date: 2021-02-11T22:03:59-06:00
weight: 14
draft: false
#type: slide
#theme: white
description: "Things that can go wrong using libraries."
---

This troubleshooting guide is focused on using `posn-util.rkt`.

### Problems

#### Save your posn-util in your CS folder

{{% notice warning %}}
You need to save your work in the same folder as your "posn-util.rkt" file, since Racket only looks in the current folder for other files.
{{% /notice %}}

This has been the source of a lot of issues:

* Verify that the folder you save in is "Documents" and not "Downloads".
* If you are not asked where to save, the file probably ended up in
  Downloads. Go there and drag the file to where you actually want it.

#### Name the file carefully

Downloading the Racket file, one can end up with a file that has two
suffixes (one of them is invisible). If `(require "posn-util.rkt")`
does not work, try `(require "posn-util.rkt.rkt")`. If that works,
delete the extra `.rkt`.

Sometime people have `posn.util.rkt` instead. Use the official filename.

#### Download the file!

You need to actually download the code for `posn-util`. If you get the
error below, you should open up your `posn-util.rkt` file and check to
make sure that it has several hundred lines of code in it.

    standard-module-name-resolver: cycle in loading

#### Save your work first

Racket will not find your posn-util until you save your work in the
same folder as the `posn-util.rkt` file. If you work is "Untitled", it
is not saved and `require` will not find the library.

#### Provide error

When `(require picturing-programs)` is commented out on the first
line, you get this error:

    provide: this function is not defined
    
Fix: uncomment the first line.
