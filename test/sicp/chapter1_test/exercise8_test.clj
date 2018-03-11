(ns sicp.chapter1-test.exercise8_test
  (:require
   [clojure.test :refer :all]
   [sicp.test-util :refer :all]
   [sicp.chapter1.exercise8 :refer :all]))

(deftest test-cube-root-rel
  (testing "Works with 8"
    (is (close? 2 (cube-root-rel 8) 0.000001)))
  (testing "Works with 27"
    (is (close? 3 (cube-root-rel 27) 0.000001)))
  (testing "Works with 125"
    (is (close? 5 (cube-root-rel 125) 0.000001)))
  (testing "Works with small numbers"
    (is (close? 1E-3 (cube-root-rel 1E-9) 0.0001)))
  (testing "Works with large numbers"
    (is (close? 1E3 (cube-root-rel 1E9) 0.000001))))