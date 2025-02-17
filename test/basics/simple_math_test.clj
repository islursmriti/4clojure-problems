(ns basics.simple-math-test
  (:require [clojure.test :refer :all]
            [basics.simple_math :as sm]))


(deftest test-problem-2
  (testing "Problem 2- Simple Math"
    (is (= (sm/problem-2 4)
           true))))
