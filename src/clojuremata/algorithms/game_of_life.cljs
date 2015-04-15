(ns clojuremata.algorithms.game_of_life)

(defn alive? [cell]
  (= cell 1))

(defn run [grid]
  (into []
    (for [row grid]
      (into []
	(for [cell row]
	  (if (alive? cell)
	    0
	    cell))))))
