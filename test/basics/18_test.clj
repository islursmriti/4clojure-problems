(ns basics.18_test
  (:require [clojure.test :refer :all]
            [basics.18 :refer :all]))


(deftest test-problem-18
  (testing "Problem 18- filter"
    (is (= (problem-18 '(6 7))
           true))))
