(ns basics.simple_recursion_test
  (:require [clojure.test :refer :all]
            [basics.simple-recursion :as sr]))


(deftest test-problem-57
  (testing "Problem 57- Simple Recursion"
    (is (= (sr/problem-57 [5 4 3 2 1])
           true))))
