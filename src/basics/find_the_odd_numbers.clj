(ns basics.find_the_odd_numbers
  (:gen-class))


(defn problem-25
  "Checks whether the function returns only odd numbers from the sequence
   ref: https://4clojure.oxal.org/#/problem/25"
  [function]
  (every? identity [(= (function #{1 2 3 4 5}) '(1 3 5))
                    (= (function [4 2 1 6]) '(1))
                    (= (function [2 2 4 6]) '())
                    (= (function [1 1 1 3]) '(1 1 1 3))]))
