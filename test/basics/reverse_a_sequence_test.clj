(ns basics.reverse-a-sequence-test
  (:require [clojure.test :refer :all]
            [basics.reverse_a_sequence :as ras]))


(deftest test-problem-23
  (testing "Problem 23- Reverse a Sequence"
    (is (= (ras/problem-23 #(reduce conj '() %))
           true))))
