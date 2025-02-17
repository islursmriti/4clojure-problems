(ns basics.local_bindings
  (:gen-class))


(defn problem-35
  "Demonstrates how let works
   ref: https://4clojure.oxal.org/#/problem/35"
  [value]
  (every? identity [(= value (let [x 5] (+ 2 x)))
                    (= value (let [x 3, y 10] (- y x)))
                    (= value (let [x 21] (let [y 3] (/ x y))))]))
