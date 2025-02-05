(ns basics.3_test
  (:require [clojure.test :refer :all]
            [basics.3 :refer :all]))


(deftest test-problem-3
  (testing "Problem 3- Strings"
    (is (= (problem-3 "HELLO WORLD")
           true))))
