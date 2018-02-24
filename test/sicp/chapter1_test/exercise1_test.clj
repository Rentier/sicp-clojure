(ns sicp.chapter1-test.exercise1_test
  (:require
   [clojure.test :refer :all]
   [sicp.chapter1.exercise1 :refer :all]))

(deftest expression-1-test
  (testing "Expression 1"
    (is (= 10 exp1))))

(deftest expression-2-test
  (testing "Expression 2"
    (is (= 12 exp2))))

(deftest expression-3-test
  (testing "Expression 3"
    (is (= 8 exp3))))

(deftest expression-4-test
  (testing "Expression 4"
    (is (= 3 exp4))))

(deftest expression-5-test
  (testing "Expression 5"
    (is (= 6 exp5))))

(deftest expression-6-test
  (testing "Expression 6"
    (is (= 19 exp6))))

(deftest expression-7-test
  (testing "Expression 7"
    (is (= false exp7))))

(deftest expression-8-test
  (testing "Expression 8"
    (is (= 4 exp8))))

(deftest expression-9-test
  (testing "Expression 9"
    (is (= 16 exp9))))

(deftest expression-10-test
  (testing "Expression 10"
    (is (= 6 exp10))))

(deftest expression-11-test
  (testing "Expression 11"
    (is (= 16 exp11))))