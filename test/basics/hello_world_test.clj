(ns basics.hello-world-test
  (:require [clojure.test :refer :all]
            [basics.hello-world :as hw]))


(deftest test-1-problem-16
  (testing "Problem 16- Hello World"
    (is (= (hw/problem-16 (fn [name]
                         (str "Hello, "
                              name "!"))) true))))


(deftest test-2-problem-16
  (testing "Problem 16- Hello World"
    (is (= (hw/problem-16 #(str "Hello, "
                             % "!")) true))))
