(ns basics.9
  (:gen-class))


(defn problem-9
  [value]
  (= #{1 2 3 4}
     (conj #{1 4 3} value)))
