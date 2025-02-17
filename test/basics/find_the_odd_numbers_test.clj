(ns basics.find_the_odd_numbers_test
  (:require [clojure.test :refer :all]
            [basics.find_the_odd_numbers :as fton]))


(deftest test-problem-25
  (testing "Problem 25- Find the odd numbers"
    (is (= (fton/problem-25 #(filter odd? %))
           true))))
