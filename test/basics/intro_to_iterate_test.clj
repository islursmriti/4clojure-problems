(ns basics.intro-to-iterate-test
  (:require [clojure.test :refer :all]
            [basics.intro-to-iterate :as itt]))


(deftest test-problem-45
  (testing "Problem 48- Intro to iterate"
    (is (= (itt/problem-45 [1 4 7 10 13])
           true))))
