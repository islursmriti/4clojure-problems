(ns basics.reverse_a_sequence
  (:gen-class))


(defn problem-23
  "Checks if the function can reverse a sequence without using 'reverse'
   ref: https://4clojure.oxal.org/#/problem/23"
  [function]
  (every? identity [(= (function
                        [1 2 3 4 5]) [5 4 3 2 1])
                    (= (function
                        (sorted-set 5 7 2 7)) '(7 5 2))
                    (= (function
                        [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])]))
