(ns basics.rest
  (:gen-class))


(defn problem-13
  "Demonstrates rest functionality
   ref: https://4clojure.oxal.org/#/problem/13"
  [rest_result]
  (= rest_result
     (rest [10 20 30
            40])))
