(ns sicp.chapter1.exercise7)

(defn average [x y]
  (/ (+ x y) 2))

(defn abs [x] (if (< x 0.) (- x) x))

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

(defn good-enough-rel? [guess x]
  (< (abs (/ (- x (square guess)) x)) 0.0000001))

(defn sqrt-iter-rel [guess x]
  (if (good-enough-rel? guess x) guess
      (sqrt-iter-rel (improve guess x) x)))

(defn sqrt-rel [x]
  (sqrt-iter-rel 1.0 x))

