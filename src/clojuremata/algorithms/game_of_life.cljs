(ns clojuremata.algorithms.game_of_life)

(defn alive? [cell]
  (= cell 1))

(defn run [grid]
  (into []
    (map-indexed
      (fn [row-index row]
	(into []
	  (map-indexed
	    (fn [col-index cell]
	      (if (alive? cell)
		0
		cell))
	    row)))
      grid)))
