(ns sicp.chapter1-test.exercise10_test
  (:require
   [clojure.test :refer :all]
   [sicp.test-util :refer :all]
   [sicp.chapter1.exercise10 :refer :all]))

(deftest test-ackermann
  (testing "A(1, 10)"
    (is (= 1024 (A 1 10))))
  (testing "A(2, 4)"
    (is (= 65536 (A 2 4))))
  (testing "A(3, 3)"
    (is (= 65536 (A 3 3)))))