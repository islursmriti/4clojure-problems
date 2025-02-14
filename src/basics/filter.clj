(ns basics.filter
  (:gen-class))


(defn problem-18
  "Demonstrates how filter function works
   ref: https://4clojure.oxal.org/#/problem/18"
  [value]
  (= value (filter #(> % 5)
                   '(3 4 5
                     6 7))))
