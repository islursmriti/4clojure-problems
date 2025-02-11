(ns basics.set-intersection-test
    (:require [clojure.test :refer :all]
              [basics.set_intersection :as si]))


(deftest test-1-problem-81
  (testing "Problem 81- Set Intersection"
    (is (= (si/problem-81 (comp set filter))
           true))))


(deftest test-2-problem-81
  (testing "Problem 81- Set Intersection"
    (is (= (si/problem-81 #(set(filter %1 %2)))
           true))))
