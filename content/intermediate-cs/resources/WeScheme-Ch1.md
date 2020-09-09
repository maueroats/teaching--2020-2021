---
hidden: true
---
```racket
;; This code makes variables for each of the images from the book.
;;
;; pic:bloch
;; pic:hieroglyphics
;; pic:hacker
;; pic:book
;; pic:stick-figure
;; pic:scheme-logo
;; pic:calendar
;; pic:train-engine  ; not a variable in DrRacket
;; pic:train-car     ; not a variable in DrRacket

(define pic:bloch 
  (bitmap/url "http://picturingprograms.com/pictures/bloch.jpg"))
(define pic:hieroglyphics
  (bitmap/url "http://picturingprograms.com/pictures/hieroglyphics.png"))
(define pic:hacker
  (bitmap/url "http://picturingprograms.com/pictures/mad_hacker.png"))
(define pic:book
  (bitmap/url "http://picturingprograms.com/pictures/qbook.png"))
(define pic:stick-figure
  (bitmap/url "http://picturingprograms.com/pictures/stick-figure.png"))
(define pic:scheme-logo
  (bitmap/url "http://picturingprograms.com/pictures/schemelogo.png"))
(define pic:calendar
  (bitmap/url "http://picturingprograms.com/pictures/calendar.png"))
(define pic:train-engine
  (bitmap/url "http://picturingprograms.com/pictures/train_engine.png"))
(define pic:train-car
  (bitmap/url "http://picturingprograms.com/pictures/train_car.png"))

;; This section defines simple functions used in Chapter 1
;; rotate-cw 
;; rotate-ccw
;; rotate-180

(define (rotate-cw x) 
  (rotate 90 x))
(define (rotate-ccw x)
  (rotate -90 x))
(define (rotate-180 x)
  (rotate 180 x))

;; Now you are ready to write your programs from Chapter 1 and beyond.


```
