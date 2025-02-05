(ns basics.6_test
  (:require [clojure.test :refer :all]
            [basics.6 :refer :all]))


(deftest test-problem-6
  (testing "Problem 6- Vectors"
    (is (= (problem-6 :a :b :c)
           true))))
