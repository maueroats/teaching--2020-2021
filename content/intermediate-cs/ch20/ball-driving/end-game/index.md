---
title: "5. End Game"
date: 2021-02-23T08:45:28-06:00
weight: 50
draft: false
#type: slide
#theme: white
description: "The game ends when the ball is completely inside the target."
---

You win the game by moving your ball completely inside the white part
 of the target.

<table>
<tr>
<td style="text-align: center">
{{% figure src="not-win.png" caption="This game is not won yet." %}}
</td>
<td style="text-align: center">
{{% figure src="yes-win.png" caption="Winning position." %}}
</td>
</table>

### 5a. Win-help?
Signature: `win-help? : posn(ball-pos) posn(target-pos) -> boolean` 

This function is testable. Ideally you would write tests for it... but
here are some.

```racket
;; ball radius 5, target inner radius 15
(check-expect (win-help? (make-posn 15 0) (make-posn 0 0)) false)
(check-expect (win-help? (make-posn 0 9) (make-posn 0 0)) true)
(check-expect (win-help? (make-posn 103 129) (make-posn 100 124)) true)
```

### 5b. Win?
Signature: `win? : posn(ball-pos) -> boolean` 

The work for the `win?` function is already done, you just need to 


### 5c. Win Screen

Signature: `win-screen: posn(ball-posn) -> image`

Adding a win screen is optional. You would only do this after you
finished the draw handler.
