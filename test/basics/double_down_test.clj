(ns basics.double-down-test
  (:require [clojure.test :refer :all]
            [basics.double-down :as dd]))


(deftest test-problem-15
  (testing "Problem 15- Double Down"
    (is (= (dd/problem-15 * 2)
           true))))
