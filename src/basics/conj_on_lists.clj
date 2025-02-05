(ns basics.conj-on-lists
  (:gen-class))


(defn problem-5
  "Demonstrates conj on lists
   ref: https://4clojure.oxal.org/#/problem/5"
  [list_value]
  (= list_value
     (conj '(2 3 4) 1)
     (conj '(3 4) 2 1)))
