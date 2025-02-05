(ns basics.13
  (:gen-class))


(defn problem-13
  [rest_result]
  (= rest_result
     (rest [10 20 30
            40])))
