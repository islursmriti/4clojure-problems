(ns basics.hello-world
  (:gen-class))


(defn problem-16
  "Checks function which will give a personalized greeting
   ref: https://4clojure.oxal.org/#/problem/16"
  [function]
    (every? identity [(=(function "Dave")
                       "Hello, Dave!")
                      (=(function "Jenn")
                       "Hello, Jenn!")
                      (=(function "Rhea")
                       "Hello, Rhea!")]))
