(ns sicp.chapter1.exercise5)

; normal-order: returns 0
; applicative-order: infinite recursion
(def p p)
(defn t [x y]
  (if (= x 0) 0 y))
