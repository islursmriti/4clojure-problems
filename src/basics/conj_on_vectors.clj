(ns basics.conj_on_vectors
  (:gen-class))


(defn problem-7
  "demonstrates conj on vectors
   ref: https://4clojure.oxal.org/#/problem/7"
  [vector_value]
  (= vector_value
     (conj [1 2 3] 4)
     (conj [1 2] 3 4)))
