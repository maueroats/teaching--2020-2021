---
hidden: true
---
```racket
;;;; WeScheme Starter Code: Chapters 1 and 3

;; Chapter 1 Images
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
;;

;; Chapter 1 Functions: rotate-cw rotate-ccw rotate-180
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

;; Chapter 3 Functions for WeScheme

;; Chapter 3: crop-left crop-right crop-top crop-bottom
(define (crop-left img x)
  (crop x 0 (- (image-width img) x) (image-height img) img))
(define (crop-right img x)
  (crop 0 0 (- (image-width img) x) (image-height img) img))
(define (crop-top img y)
  (crop 0 y (image-width img) (- (image-height img) y) img))
(define (crop-bottom img y)
  (crop 0 0 (image-width img) (- (image-height img) y) img))
;; 


```
