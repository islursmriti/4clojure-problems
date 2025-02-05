(ns basics.sequences
  (:gen-class))


(defn problem-12
  "demonstrates sequencing in clojure
   ref: https://4clojure.oxal.org/#/problem/12"
  [value]
  (= value
     (first '(3 2 1))
     (second [2 3 4])
     (last (list 1 2 3))))
