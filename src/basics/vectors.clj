(ns basics.vectors
  (:gen-class))


(defn problem-6
  "compares vectors
   ref: https://4clojure.oxal.org/#/problem/6"
  [vector_element_1 vector_element_2 vector_element_3]
  (= [vector_element_1 vector_element_2 vector_element_3]
     (list :a :b :c)
     (vec '(:a :b :c))
     (vector :a :b :c)))
