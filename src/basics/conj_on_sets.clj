(ns basics.conj-on-sets
  (:gen-class))


(defn problem-9
  "demonstrates conj on sets
   ref: https://4clojure.oxal.org/#/problem/9"
  [value]
  (= #{1 2 3 4}
     (conj #{1 4 3} value)))
