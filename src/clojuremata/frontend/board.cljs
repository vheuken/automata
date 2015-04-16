(ns clojuremata.frontend.board)

(defn draw_board [board]
  (let [dom (.getElementById js/document "board")]
    (set! (. dom -innerHTML) "")

    (for [row board]
      (set! (. dom -innerHTML)
	(clojure.string/join [(. dom -innerHTML) row "<br>"])))))
