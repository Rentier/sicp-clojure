(ns sicp.chapter1-test.exercise2_test
  (:require
   [clojure.test :refer :all]
   [sicp.chapter1.exercise2 :refer :all]))

(deftest result-test
  (testing "Quotient result"
    (is (= (- (/ 37 150)) result))))