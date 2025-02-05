(ns basics.3
  (:gen-class))


(defn problem-3
  [string_value]
  (= string_value
     (.toUpperCase "hello world")))
