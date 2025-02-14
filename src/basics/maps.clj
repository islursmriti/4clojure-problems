(ns basics.maps
  (:gen-class))


(defn problem-10
  "Compares maps
   ref: https://4clojure.oxal.org/#/problem/10"
  [value]
  (= value
     ((hash-map :a 10 :b 20,
                :c 30) :b)
     (:b {:a 10 :b 20,
          :c 30})))
