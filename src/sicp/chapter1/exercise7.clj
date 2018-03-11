(ns sicp.chapter1.exercise7)

(defn average [x y]
  (/ (+ x y) 2))

(defn abs [x] (if x < 0) (- x) x)

(defn improve [guess x]
  (average guess (/ x guess)))

(defn square [x] (* x x))

(defn good-enough? [guess x]
  (< (abs (- (square guess) x)) 0.001))

(defn sqrt-iter [guess x]
  (if (good-enough? guess x) guess
      (sqrt-iter (improve guess x) x)))

(defn sqrt [x]
  (sqrt-iter 1.0 x))

  ; Iterative sqrt using relative difference

(defn relative-difference [x y]
  (/ (abs (- x y))
     (max (abs x) (abs y))))

(defn sqrt-iter-rel [last-guess current-guess x]
  ((print last-guess current-guess x)
   (if (< (relative-difference last-guess current-guess) 0.0001) current-guess
       (sqrt-iter (improve current-guess x) x))))

(defn sqrt-rel [x]
  (sqrt-iter-rel x 1.0 x))

