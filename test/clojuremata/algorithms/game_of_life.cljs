(ns clojuremata.algorithms.game_of_life.test
  (:require-macros [cemerick.cljs.test
                    :refer (is deftest with-test run-tests testing test-var)])
  (:require [cemerick.cljs.test :as t]
	    [clojuremata.algorithms.game_of_life :refer (run)]))

(deftest empty-grid
  (let [grid [[0 0 0]
	      [0 0 0]
	      [0 0 0]]]
    (is (= grid (run grid)))))

(deftest too-few-neighbors
  (let [grid [[0 0 0]
	      [0 1 0]
	      [0 0 0]]]
    (is (= [[0 0 0]
	    [0 0 0]
	    [0 0 0]] (run grid)))))

