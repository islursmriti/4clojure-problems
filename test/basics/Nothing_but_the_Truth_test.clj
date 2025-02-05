(ns basics.Nothing-but-the-Truth-test
  (:require [clojure.test :refer :all]
            [basics.Nothing-but-the-Truth :as nbtt]))


(deftest test-problem-1
  (testing "Problem 1- Nothing but the Truth"
    (is (= (nbtt/problem-1 true)
           true))))
