(ns clojuremata.core
  (:require [clojure.browser.repl :as repl]))

(repl/connect "http://localhost:9000/repl")

(enable-console-print!)

(def global-board
  [
    [0 0 0]
    [1 1 1]
    [0 0 0]
  ]
)
