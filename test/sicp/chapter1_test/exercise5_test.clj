(ns sicp.chapter1-test.exercise5_test
  (:require
   [clojure.test :refer :all]
   [sicp.chapter1.exercise5 :refer :all]))

; No stack overflow please
(deftest test-evaluation-order
  (testing "Test evaluation order"
    (is 0 (t 0 p))))
