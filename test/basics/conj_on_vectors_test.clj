(ns basics.conj-on-vectors-test
  (:require [clojure.test :refer :all]
            [basics.conj_on_vectors :as cov]))


(deftest test-problem-7
  (testing "Problem 7- 	conj on vectors"
    (is (= (cov/problem-7 [1 2 3 4])
           true))))
