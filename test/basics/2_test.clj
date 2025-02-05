(ns basics.2_test
  (:require [clojure.test :refer :all]
            [basics.2 :refer :all]))


(deftest test-problem-2
  (testing "Problem 2- Simple Math"
    (is (= (problem-2 4)
           true))))
