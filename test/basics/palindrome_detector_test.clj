(ns basics.palindrome_detector_test
  (:require [clojure.test :refer :all]
            [basics.palindrome_detector :as pd]))


(deftest test-problem-27
  (testing "Problem 27- Palindrome Detector"
    (is (= (pd/problem-27 #(let [original
                                 (reduce str %)
                                 reversed
                                 (reduce str (reverse %))]
                             (= original reversed)))
           true))))
