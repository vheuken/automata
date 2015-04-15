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
	      (if (alive? cell)
		(if (< (count-neighbors grid col-index row-index) 2)
		  0
		  cell)
		cell))
	    row)))
      grid)))
