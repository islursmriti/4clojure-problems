(ns basics.simple_math
  (:gen-class))


(defn problem-2
  "Simple Math Problem
   ref: https://4clojure.oxal.org/#/problem/2"
  [value]
  (= (- 10 (* 2 3))
     value))
