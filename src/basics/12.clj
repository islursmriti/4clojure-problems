(ns basics.12
  (:gen-class))


(defn problem-12
  [value]
  (= value
     (first '(3 2 1))
     (second [2 3 4])
     (last (list 1 2 3))))
