(ns basics.last-element-test
  (:require [clojure.test :refer :all]
            [basics.last-element :as le]))


(deftest test-1-problem-19
  (testing "Problem 19- Last Element"
    (is (= (le/problem-19 #(nth %
                             (dec (count %)))) true))))


(deftest test-2-problem-19
  (testing "Problem 19- Last Element"
    (is (= (le/problem-19 #(nth %
                             (- (count %) 1))) true))))


(deftest test-3-problem-19
  (testing "Problem 19- Last Element"
    (is (= (le/problem-19 #(first
                         (reverse %))) true))))
