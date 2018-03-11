(ns sicp.chapter1.exercise5)

(def (new-if predicate then-clause else-clause)
  (cond predicate then-clause
        :else else-clause))

; Stack overflow in languages with applicative-order,
; as the else clause is executed when calling new-if
(defn sqrt-iter [guess x]
  (new-if (good-enough? guess x)
          guess
          (sqrt-iter (improve guess x) x)))
