(ns four-clojure.problem-79
  (:require [clojure.test :refer :all]
            [clojure.tools.trace :refer :all]))

(defn min-path
  ([triangle] (min-path triangle 0))
  ([[cur-row & [next-row & _ :as tail]] idx]
   (if (empty? tail)
     (nth cur-row idx)
     (let [cur-el (nth cur-row idx)
           [lhs-idx rhs-idx] [idx (inc idx)]
           lhs-path (min-path tail lhs-idx)
           rhs-path (min-path tail rhs-idx)]
       (+ cur-el (min lhs-path rhs-path))))))

(def __ min-path)

(deftest problem-79-test
  (is (= 7 (__ '([1]
                [2 4]
              [5 1 4]
              [2 3 4 5])))) ; 1->2->1->3

  (is (= 20 (__ '([3]
                 [2 4]
                [1 9 3]
               [9 9 2 4]
              [4 6 6 7 8]
             [5 7 3 5 1 4])))) ; 3->4->3->2->7->1
  )
