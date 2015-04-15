(ns clojuremata.algorithms.game_of_life)

(defn run [grid]
  (into []
    (for [row grid]
      (for [cell row]
       	(if (= cell 1)
	  0
	  cell)))))
