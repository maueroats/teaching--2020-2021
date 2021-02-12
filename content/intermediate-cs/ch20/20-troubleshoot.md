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

#### Work in the same folder as your posn-util

{{% notice warning %}}
You need to save your work in the same folder as your "posn-util.rkt" file, since Racket only looks in the current folder for other files.
{{% /notice %}}

#### Save your work first

Racket will not find your posn-util until you save your work in the
same folder as the `posn-util.rkt` file. If you work is "Untitled", it
is not saved and `require` will not find the library.

#### Name the file carefully

Downloading the Racket file, one can end up with a file that has two
suffixes (one of them is invisible). If `(require "posn-util.rkt")`
does not work, try `(require "posn-util.rkt.rkt")`. If that works,
delete the extra `.rkt`.

