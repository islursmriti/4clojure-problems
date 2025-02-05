(ns basics.functions-test
  (:require [clojure.test :refer :all]
            [basics.functions :as funcs]))


(deftest test-problem-14
  (testing "Problem 14- Functions"
    (is (= (funcs/problem-14 8)
           true))))
