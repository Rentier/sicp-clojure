(ns sicp.chapter1.exercise4)

; The if expression returns the '+' function when b is greater than 0,
; else it returns the '-' operator
(defn a-plus-abs-b [a b]
  ((if (> b 0) + -) a b))
