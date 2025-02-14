(ns basics.maps-test
  (:require [clojure.test :refer :all]
            [basics.maps :as maps]))


(deftest test-problem-10
  (testing "Problem 10- Maps"
    (is (= (maps/problem-10 20)
           true))))
