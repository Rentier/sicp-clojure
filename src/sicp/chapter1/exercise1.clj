(ns sicp.chapter1.exercise1)

(def exp1 10)

(def exp2 (+ 5 3 4))

(def exp3 (- 9 1))

(def exp4 (/ 6 2))

(def exp5 (+ (* 2 4) (- 4 6)))

(def a 3)

(def b (+ a 1))

(def exp6 (+ a b (* a b)))

(def exp7 (= a b))

(def exp8 (if (and (> b a) (< b (* a b)))
            b
            a))

(def exp9 (cond (= a 4) 6
                (= b 4) (+ 6 7 a)
                :else 25))

(def exp10 (+ 2 (if (> b a) b a))
)

(def exp11 (* (cond (> a b) a
                    (< a b) b
                    :else -1)
              (+ a 1)))