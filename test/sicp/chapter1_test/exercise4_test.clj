(ns sicp.chapter1-test.exercise4_test
  (:require
   [clojure.test :refer :all]
   [sicp.chapter1.exercise4 :refer :all]))

(deftest test-a-plus-abs-b-positive
  (testing "a + abs(b) 1"
    (is (= 7 (a-plus-abs-b 5 2)))))

(deftest test-a-plus-abs-b-negative
  (testing "a + abs(b) 2"
    (is (= 7 (a-plus-abs-b 5 -2)))))