(ns basics.map-test
  (:require [clojure.test :refer :all]
            [basics.map :as map]))


(deftest test-problem-17
  (testing "Problem 17- map"
    (is (= (map/problem-17 '(6 7 8))
           true))))
