(ns basics.19
  (:gen-class))


(defn problem-19
  [function]
  (every? identity [(= (function [1 2 3
                                  4 5]) 5)
                    (= (function '(5 4 3))
                       3)
                    (= (function ["b" "c" "d"])
                       "d")]))
