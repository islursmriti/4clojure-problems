(ns basics.strings_test
  (:require [clojure.test :refer :all]
            [basics.strings :as strings]))


(deftest test-problem-3
  (testing "Problem 3- Strings"
    (is (= (strings/problem-3 "HELLO WORLD")
           true))))
