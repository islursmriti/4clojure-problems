(ns basics.8
  (:gen-class)
  (:require
   [clojure.set]))


(defn problem-8
  [set_value]
  (= set_value
     (set '(:a :a :b
               :c :c :c
               :c :d :d))
     (clojure.set/union #{:a :b :c}
                        #{:b :c :d})))
