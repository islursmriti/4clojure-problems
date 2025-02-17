(ns basics.local_bindings_test
  (:require [clojure.test :refer :all]
            [basics.local_bindings :as lb]))


(deftest test-problem-35
  (testing "Problem 35- Local bindings"
    (is (= (lb/problem-35 7)
           true))))
