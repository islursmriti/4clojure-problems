(ns basics.intro-to-reduce)


(defn problem-64
  "Demonstrates functionality of reduce function
   ref: https://4clojure.oxal.org/#/problem/64"
  [value]
  (every? identity [(= 15 (reduce value [1 2 3 4 5]))
                    (=  0 (reduce value []))
                    (=  6 (reduce value 1 [2 3]))]))
