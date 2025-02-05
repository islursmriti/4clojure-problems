(ns basics.20
  (:gen-class))


(defn problem-20
  [function]
  (every? identity [(=(function (list 1 2 3 4 5))
                       4)
                      (=(function ["a" "b" "c"])
                       "b")
                      (=(function [[1 2] [3 4]])
                       [1 2])]))
