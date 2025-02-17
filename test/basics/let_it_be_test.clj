(ns basics.let_it_be_test
  (:require [clojure.test :refer :all]
            [basics.let_it_be :as lib]))


(deftest test-problem-36
  (testing "Problem 36- Let it be"
    (is (= (lib/problem-36 7 3 1)
           true))))
