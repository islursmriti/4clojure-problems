(ns basics.conj-on-maps-test
  (:require [clojure.test :refer :all]
            [basics.conj-on-maps :as coms]))


(deftest test-problem-11
  (testing "Problem 11- conj on maps"
    (is (= (coms/problem-11 {:b 2})
           true))))
