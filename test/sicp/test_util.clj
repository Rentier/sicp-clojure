(ns sicp.test-util
  (:require [clojure.test :refer :all]))

(defn absolute-difference ^double [^double x ^double y]
  (Math/abs (double (- x y))))

(defn close? [tolerance x y]
  (< (absolute-difference x y) tolerance))