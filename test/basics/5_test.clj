(ns basics.5_test
  (:require [clojure.test :refer :all]
            [basics.5 :refer :all]))


(deftest test-problem-5
  (testing "Problem 5- 	conj on lists"
    (is (= (problem-5 '(1 2 3 4))
           true))))
