(ns basics.16-test
  (:require [clojure.test :refer :all]
            [basics.16 :refer :all]))


(deftest test-1-problem-16
  (testing "Problem 16- Hello World"
    (is (= (problem-16 (fn [name]
                         (str "Hello, "
                              name "!"))) true))))


(deftest test-2-problem-16
  (testing "Problem 16- Hello World"
    (is (= (problem-16 #(str "Hello, "
                             % "!")) true))))
