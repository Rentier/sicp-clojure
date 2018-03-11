(ns sicp.chapter1-test.exercise7_test
  (:require
   [clojure.test :refer :all]
   [sicp.test-util :refer :all]
   [sicp.chapter1.exercise7 :refer :all]))

(deftest test-sqrt
  (testing "Test sqrt result"
    (is true (close? 1.41 (sqrt 2) 0.0001)))
  (testing "Error for small numbers"
    (is (not (close? 0.00001 (sqrt 0.0000000001) 0.000001)))))

(deftest test-sqrt-rel
  (testing "Works with small numbers"
    (is (close? 0.00001 (sqrt-rel 0.0000000001) 0.000001)))
  (testing "Works with large numbers"
    (is (close? 10000. (sqrt-rel 100000000.) 0.000001))))