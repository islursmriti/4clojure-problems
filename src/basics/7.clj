(ns basics.7
  (:gen-class))


(defn problem-7
  [vector_value]
  (= vector_value
     (conj [1 2 3] 4)
     (conj [1 2] 3 4)))