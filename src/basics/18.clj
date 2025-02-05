(ns basics.18
  (:gen-class))


(defn problem-18
  [value]
  (= value (filter #(> % 5)
                   '(3 4 5
                     6 7))))
