(ns basics.lists
  (:gen-class))


(defn problem-4
  "Compares two lists
   ref: https://4clojure.oxal.org/#/problem/4"
  [element1 element2 element3]
  (= (list element1 element2 element3)
     '(:a :b :c)))
