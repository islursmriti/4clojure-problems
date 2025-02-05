(ns basics.10
  (:gen-class))


(defn problem-10
  [value]
  (= value
     ((hash-map :a 10 :b 20,
                :c 30) :b)
     (:b {:a 10 :b 20,
          :c 30})))
