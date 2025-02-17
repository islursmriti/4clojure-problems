(ns basics.nothing_but_the_truth_test
  (:require [clojure.test :refer :all]
            [basics.nothing-but-the-truth :as nbtt]))


(deftest test-problem-1
  (testing "Problem 1- Nothing but the Truth"
    (is (= (nbtt/problem-1 true)
           true))))
