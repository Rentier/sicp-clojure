(ns sicp.chapter1-test.exercise7_test
  (:require
   [clojure.test :refer :all]
   [sicp.chapter1.exercise7 :refer :all]))

(deftest test-sqrt
  (testing "Test sqrt result"
    (is true (good-enough? 1.41 (sqrt 2)))))

(deftest test-sqrt-bad-for-small-numbers
  (testing "Show good-enough? error"
    (is (not= 0.00001 (sqrt 0.0000000001)))))

(deftest test-sqrt-bad-for-large-numbers
  (testing "Show good-enough? error"
    (is (not= 10000. (sqrt 100000000.)))))

(deftest test-sqrt-rel-works-for-small-numbers
  (testing "Show good-enough? error"
    (is (= 0.00001 (sqrt-rel 0.0000000001)))))

(deftest test-sqrt-rel-works-for-large-numbers
  (testing "Show good-enough? error"
    (is (= 10000. (sqrt-rel 100000000.)))))