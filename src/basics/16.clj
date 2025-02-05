(ns basics.16
  (:gen-class))


(defn problem-16
  [function]
    (every? identity [(=(function "Dave")
                       "Hello, Dave!")
                      (=(function "Jenn")
                       "Hello, Jenn!")
                      (=(function "Rhea")
                       "Hello, Rhea!")]))
