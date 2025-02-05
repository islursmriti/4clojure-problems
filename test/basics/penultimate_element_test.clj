(ns basics.penultimate-element-test
  (:require [clojure.test :refer :all]
            [basics.penultimate-element :as pe]))


(deftest test-1-problem-20
  (testing "Problem 20- Penultimate Element"
    (is (= (pe/problem-20 #(nth %
                             (- (count %) 2))) true))))


(deftest test-2-problem-20
  (testing "Problem 20- Penultimate Element"
    (is (= (pe/problem-20 #(nth %
                             (dec (- (count %) 1)))) true))))


(deftest test-3-problem-20
  (testing "Problem 20- Penultimate Element"
    (is (= (pe/problem-20 #(second
                         (reverse %))) true))))
