(ns basics.conj-on-maps
  (:gen-class))


(defn problem-11
  "demonstrates conj on maps
   ref: https://4clojure.oxal.org/#/problem/11"
  [key_value_pair]
  (= {:a 1, :b 2, :c 3}
     (conj {:a 1}
           key_value_pair
           [:c 3])))
