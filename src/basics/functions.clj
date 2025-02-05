(ns basics.functions
  (:gen-class))


(defn problem-14
  "Demonstrates different ways to create functions
   ref: https://4clojure.oxal.org/#/problem/14"
  [value]
  (= value
     ((fn add-five [x] (+ x 5)) 3)
     ((fn [x] (+ x 5)) 3)
     (#(+ % 5) 3)
     ((partial + 5) 3)))
