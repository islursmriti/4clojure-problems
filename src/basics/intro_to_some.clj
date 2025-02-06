(ns basics.intro-to-some)


(defn problem-48
  "demonstrates functionality of some function
   ref: https://4clojure.oxal.org/#/problem/48"
  [value]
  (every? identity [(= value
                       (some #{2 7 6} [5 6 7 8]))
                    (= value
                       (some #{2 7 6} [5 6 7 8]))]))
