(ns basics.intro_to_destructuring_test
  (:require [clojure.test :refer :all]
            [basics.intro_to_destructuring :as itd]))


(deftest test-problem-52
  (testing "Problem 52- Intro to Destructuring"
    (is (= (itd/problem-52 [2 4])
           true))))
