(ns basics.palindrome_detector
  (:gen-class))


(defn problem-27
  "Checks if the function can detect a palindrome
   ref: https://4clojure.oxal.org/#/problem/27"
  [function]
  (every? identity [(false? (function '(1 2 3 4 5)))
                    (true? (function "racecar"))
                    (true? (function [:foo :bar :foo]))
                    (true? (function '(1 1 3 3 1 1)))
                    (false? (function '(:a :b :c)))]))
