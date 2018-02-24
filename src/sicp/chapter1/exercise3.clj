(ns sicp.chapter1.exercise3)

(defn square [x] (* x x))

(defn sum-of-squares-of-largest-two [a b c]
  (let [smallest (min a b c)]
    (- (+ (square a) (square b) (square c))
       (square smallest))))

