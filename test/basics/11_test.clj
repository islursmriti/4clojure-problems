(ns basics.11_test
  (:require [clojure.test :refer :all]
            [basics.11 :refer :all]))


(deftest test-problem-11
  (testing "Problem 11- conj on maps"
    (is (= (problem-11 {:b 2})
           true))))
