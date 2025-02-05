(ns basics.lists-test
  (:require [clojure.test :refer :all]
            [basics.lists :as lists]))


(deftest test-problem-4
  (testing "Problem 4- Lists"
    (is (= (lists/problem-4 :a :b :c)
           true))))
