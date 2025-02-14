(ns basics.intro-to-reduce-test
  (:require [clojure.test :refer :all]
            [basics.intro-to-reduce :as itr]))


(deftest test-problem-64
  (testing "Problem 64- Intro to reduce"
    (is (= (itr/problem-64 +)
           true))))
