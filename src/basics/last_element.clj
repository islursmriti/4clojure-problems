(ns basics.last-element
  (:gen-class))


(defn problem-19
  "Checks the function which extracts last element from collection without using 'last'
   ref: https://4clojure.oxal.org/#/problem/19"
  [function]
  (every? identity [(= (function [1 2 3
                                  4 5]) 5)
                    (= (function '(5 4 3))
                       3)
                    (= (function ["b" "c" "d"])
                       "d")]))
