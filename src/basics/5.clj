(ns basics.5
  (:gen-class))


(defn problem-5
  [list_value]
  (= list_value
     (conj '(2 3 4) 1)
     (conj '(3 4) 2 1)))
