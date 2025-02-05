(ns basics.6
  (:gen-class))


(defn problem-6
  [vector_element_1 vector_element_2 vector_element_3]
  (= [vector_element_1 vector_element_2 vector_element_3]
     (list :a :b :c)
     (vec '(:a :b :c))
     (vector :a :b :c)))
