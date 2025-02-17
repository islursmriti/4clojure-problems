(ns basics.intro_to_destructuring
  (:gen-class))


(defn problem-52
  "Demonstrates how destructuring works
   ref: https://4clojure.oxal.org/#/problem/52"
  [value]
  (= value (let [[a b c d e f g] (range)] [c e])))
