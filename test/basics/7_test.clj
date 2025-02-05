(ns basics.7_test
  (:require [clojure.test :refer :all]
            [basics.7 :refer :all]))


(deftest test-problem-7
  (testing "Problem 7- 	conj on lists"
    (is (= (problem-7 [1 2 3 4])
           true))))
