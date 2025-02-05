(ns basics.8_test
  (:require [clojure.test :refer :all]
            [basics.8 :refer :all]
            [clojure.set]))


(deftest test-problem-8
  (testing "Problem 8- Sets"
    (is (= (problem-8 #{:a :b :c :d})
           true))))
