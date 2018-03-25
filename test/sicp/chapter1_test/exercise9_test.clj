(ns sicp.chapter1-test.exercise9_test
  (:require
   [clojure.test :refer :all]
   [sicp.test-util :refer :all]
   [sicp.chapter1.exercise9 :refer :all]))

(deftest test-add1
  (testing "Works with 0"
    (is (= 22 (add1 0 22))))
  (testing "Works with positive numbers"
    (is (= 42 (add1 20 22))))
  (testing "Works with negative numbers"
    (is (= 2 (add1 24 -22)))))

(deftest test-add2
  (testing "Works with 0"
    (is (= 22 (add2 0 22))))
  (testing "Works with positive numbers"
    (is (= 42 (add2 20 22))))
  (testing "Works with negative numbers"
    (is (= 2 (add2 24 -22)))))