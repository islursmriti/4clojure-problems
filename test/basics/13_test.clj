(ns basics.13_test
  (:require [clojure.test :refer :all]
            [basics.13 :refer :all]))


(deftest test-problem-13
  (testing "Problem 13- Rest"
    (is (= (problem-13 [20 30 40])
           true))))
