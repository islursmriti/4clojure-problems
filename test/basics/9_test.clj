(ns basics.9_test
  (:require [clojure.test :refer :all]
            [basics.9 :refer :all]))


(deftest test-problem-9
  (testing "Problem 9- conj on sets"
    (is (= (problem-9 2) true))))
