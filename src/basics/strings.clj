(ns basics.strings
  (:gen-class))


(defn problem-3
  "Compares two strings
   ref: https://4clojure.oxal.org/#/problem/3"
  [string_value]
  (= string_value
     (.toUpperCase "hello world")))
