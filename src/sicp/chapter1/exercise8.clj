(ns sicp.chapter1.exercise8)

(defn abs [x] (if (< x 0.) (- x) x))

(defn improve [guess x]
  (/ (+ (/ x (* guess guess)) (* 2 guess)) 3))

(defn cube [x] (* x x x))

(defn good-enough-rel? [guess x]
  (< (abs (/ (- x (cube guess)) x)) 0.0000001))

(defn cube-root-rel-iter [guess x]
  (if (good-enough-rel? guess x) guess
      (cube-root-rel-iter (improve guess x) x)))

(defn cube-root-rel [x]
  (cube-root-rel-iter 1.0 x))

