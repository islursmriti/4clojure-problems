(ns basics.11
  (:gen-class))


(defn problem-11
  [key_value_pair]
  (= {:a 1, :b 2, :c 3}
     (conj {:a 1}
           key_value_pair
           [:c 3])))
