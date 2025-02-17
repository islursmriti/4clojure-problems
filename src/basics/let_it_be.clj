(ns basics.let_it_be
  (:gen-class))


(defn problem-36
  "Demonstrates how let works
   ref: https://4clojure.oxal.org/#/problem/36"
  [x_value y_value z_value]
  (every? identity [(= 10 (let[x x_value,
                               y y_value,
                               z z_value]
                           (+ x y)))
                    (= 4 (let [x x_value,
                               y y_value,
                               z z_value]
                           (+ y z)))
                    (= 1 (let [x x_value,
                               y y_value,
                               z z_value]
                           z))]))
