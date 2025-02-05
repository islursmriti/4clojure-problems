(ns basics.map
  (:gen-class))


(defn problem-17
  "demonstrates how map function works
  ref: https://4clojure.oxal.org/#/problem/17"
  [value]
  (= value (map #(+ % 5)
                '(1 2 3))))
