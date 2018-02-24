(ns sicp.chapter1-test.exercise3_test
  (:require
   [clojure.test :refer :all]
   [sicp.chapter1.exercise3 :refer :all]))

(deftest squaring-test-1
  (testing "Squaring test 1"
    (is (= 13 (sum-of-squares-of-largest-two 1 2 3)))))

(deftest squaring-test-2
  (testing "Squaring test 2"
    (is (= 13 (sum-of-squares-of-largest-two 3 1 2)))))

(deftest squaring-test-3
  (testing "Squaring test 3"
    (is (= 18 (sum-of-squares-of-largest-two 3 3 2)))))

(deftest squaring-test-4
  (testing "Squaring test 4"
    (is (= 5 (sum-of-squares-of-largest-two -1 2 -3)))))
