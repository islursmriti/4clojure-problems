(ns basics.conj-on-lists-test
  (:require [clojure.test :refer :all]
            [basics.conj-on-lists :as cols]))


(deftest test-problem-5
  (testing "Problem 5- conj on lists"
    (is (= (cols/problem-5 '(1 2 3 4))
           true))))
