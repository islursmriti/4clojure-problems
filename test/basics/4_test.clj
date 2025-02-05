(ns basics.4_test
  (:require [clojure.test :refer :all]
            [basics.4 :refer :all]))


(deftest test-problem-4
  (testing "Problem 4- Lists"
    (is (= (problem-4 :a :b :c)
           true))))
