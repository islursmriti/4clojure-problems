(ns basics.17
  (:gen-class))


(defn problem-17
  [value]
  (= value (map #(+ % 5)
                '(1 2 3))))
