(ns basics.conj-on-sets-test
  (:require [clojure.test :refer :all]
            [basics.conj-on-sets :as cos]))


(deftest test-problem-9
  (testing "Problem 9- conj on sets"
    (is (= (cos/problem-9 2) true))))
