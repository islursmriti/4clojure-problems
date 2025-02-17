(ns basics.filter-test
  (:require [clojure.test :refer :all]
            [basics.filter :as filter]))


(deftest test-problem-18
  (testing "Problem 18- filter"
    (is (= (filter/problem-18 '(6 7))
           true))))
