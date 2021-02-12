---
hidden: true
---
```racket
(check-expect (slope-posn (make-posn 8 15)) 8/15)
(check-expect (perp? (make-posn 3 4) (make-posn 4 -3)) true)
(check-expect (perp? (make-posn 3 4) (make-posn 6 8)) false)
(check-expect (on-line? 5 3 (make-posn 4 23)) true)
(check-expect (on-line? 2 10 (make-posn 5 21)) false)
(check-expect (unitv (make-posn 3 4)) (make-posn 3/5 4/5))
(check-expect (unitv (make-posn 5 12)) (make-posn 5/13 12/13))
```
