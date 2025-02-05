(ns basics.vectors-test
  (:require [clojure.test :refer :all]
            [basics.vectors :as vectors]))


(deftest test-problem-6
  (testing "Problem 6- Vectors"
    (is (= (vectors/problem-6 :a :b :c)
           true))))
