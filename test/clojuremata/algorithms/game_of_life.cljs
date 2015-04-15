(ns clojuremata.algorithms.game_of_life.test
  (:require-macros [cemerick.cljs.test
                    :refer (is deftest with-test run-tests testing test-var)])
  (:require [cemerick.cljs.test :as t]
	    [clojuremata.algorithms.game_of_life :refer (run)]))

(deftest empty-grid-remains-unchanged
  (let [grid [[0 0 0]
	      [0 0 0]
	      [0 0 0]]]
    (is (= grid (run grid)))))

(deftest cell-with-no-neighbors-dies
  (let [grid [[0 0 0]
	      [0 1 0]
	      [0 0 0]]]
    (is (= [[0 0 0]
	    [0 0 0]
	    [0 0 0]] (run grid)))))

(deftest cell-with-one-neighbors-dies
  (let [grid [[0 1 0]
	      [0 1 0]
	      [0 0 0]]]
    (is (= [[0 0 0]
	    [0 0 0]
	    [0 0 0]] (run grid)))))
