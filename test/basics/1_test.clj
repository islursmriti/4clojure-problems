(ns basics.1_test
  (:require [clojure.test :refer :all]
            [basics.1 :refer :all]))


(deftest test-problem-1
  (testing "Problem 1- Nothing but the Truth"
    (is (= (problem-1 true)
           true))))
