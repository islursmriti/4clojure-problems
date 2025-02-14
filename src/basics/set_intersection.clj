(ns basics.set_intersection
  (:gen-class))


(defn problem-81
  "Checks if the function made is same as the working of set intersection function
   ref: https://4clojure.oxal.org/#/problem/81"
  [function]
  (every? identity [(= (function
                        #{0 1 2 3} #{2 3 4 5}) #{2 3})
                    (= (function
                        #{0 1 2} #{3 4 5}) #{})
                    (= (function
                        #{:a :b :c :d}
                        #{:c :e :a :f :d}) #{:a :c :d})]))
