(ns basics.simple-recursion
  (:gen-class))


(defn problem-57
  "Demonstrates how recursion works
   ref: https://4clojure.oxal.org/#/problem/57"
  [value]
  (= value ((fn foo [x]
              (when (> x 0)
                (conj (foo (dec x)) x))) 5)))
