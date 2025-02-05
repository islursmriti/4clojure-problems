(ns basics.15
  (:gen-class))


(defn problem-15
  [operator value]
  (every? identity [(= (operator value
                         2) 4)
                    (= (operator value
                         3) 6)
                    (= (operator value
                         11) 22)
                    (= (operator value
                         7) 14)]))
