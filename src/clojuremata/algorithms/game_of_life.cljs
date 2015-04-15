(ns clojuremata.algorithms.game_of_life)

(defn alive? [cell]
  (= cell 1))

(defn count-neighbors [grid x y]
  (reduce +
    (map
      (fn [x-offset y-offset]
	(if (alive? (get (get grid (+ y y-offset)) (+ x x-offset)))
	  1
	  0))
      [1 0 1 -1  0 -1 -1  1]
      [0 1 1 -1 -1  0  1 -1])))

(defn run [grid]
  (into []
    (map-indexed
      (fn [row-index row]
	(into []
	  (map-indexed
	    (fn [col-index cell]
	      (let [neighbors (count-neighbors grid col-index row-index)]
		(if (alive? cell)
		  (if (< neighbors 2)
		    0
		    (if (> neighbors 3)
		      0
		      1))
		  (if (= neighbors 3)
		    1
		    0))))
	    row)))
      grid)))
