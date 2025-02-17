(ns basics.rest-test
  (:require [clojure.test :refer :all]
            [basics.rest :as rest]))


(deftest test-problem-13
  (testing "Problem 13- Rest"
    (is (= (rest/problem-13 [20 30 40])
           true))))
