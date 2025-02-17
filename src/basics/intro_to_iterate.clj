(ns basics.intro-to-iterate)


(defn problem-45
  "Demonstrates functionality of iterate function
   ref: https://4clojure.oxal.org/#/problem/45"
  [value]
  (= value (take 5 (iterate #(+ 3 %) 1))))
