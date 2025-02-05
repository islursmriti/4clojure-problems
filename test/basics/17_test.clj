(ns basics.17_test
  (:require [clojure.test :refer :all]
            [basics.17 :refer :all]))


(deftest test-problem-17
  (testing "Problem 17- map"
    (is (= (problem-17 '(6 7 8))
           true))))
