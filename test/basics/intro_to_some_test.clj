(ns basics.intro-to-some-test
  (:require [clojure.test :refer :all]
            [basics.intro-to-some :as its]))


(deftest test-problem-48
  (testing "Problem 48- Intro to Some"
    (is (= (its/problem-48 6)
           true))))
