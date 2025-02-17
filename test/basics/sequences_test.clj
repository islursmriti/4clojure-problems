(ns basics.sequences-test
  (:require [clojure.test :refer :all]
            [basics.sequences :as seqs]))


(deftest test-problem-12
  (testing "Problem 12- Sequences"
    (is (= (seqs/problem-12 3)
           true))))
