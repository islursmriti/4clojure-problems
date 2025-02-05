(ns basics.19_test
  (:require [clojure.test :refer :all]
            [basics.19 :refer :all]))


(deftest test-1-problem-19
  (testing "Problem 19- Last Element"
    (is (= (problem-19 #(nth %
                             (dec (count %)))) true))))


(deftest test-2-problem-19
  (testing "Problem 19- Last Element"
    (is (= (problem-19 #(nth %
                             (- (count %) 1))) true))))


(deftest test-3-problem-19
  (testing "Problem 19- Last Element"
    (is (= (problem-19 #(first
                         (reverse %))) true))))
