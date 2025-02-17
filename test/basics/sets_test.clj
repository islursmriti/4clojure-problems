(ns basics.sets-test
  (:require [clojure.test :refer :all]
            [basics.sets :as sets]
            [clojure.set]))


(deftest test-problem-8
  (testing "Problem 8- Sets"
    (is (= (sets/problem-8 #{:a :b :c :d})
           true))))
