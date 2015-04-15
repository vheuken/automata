(defproject clojuremata "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2755"]]

  :node-dependencies [[source-map-support "0.2.8"]]

  :plugins [[lein-cljsbuild "1.0.4"]
            [lein-npm "0.4.0"]
	    [com.cemerick/clojurescript.test "0.3.3"]]

  :source-paths ["src" "target/classes"]

  :clean-targets ["out" "out-adv"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src" "test"]
	      :notify-command ["phantomjs" :cljs.test/runner "out/clojuremata.js"]
              :compiler {
                :main clojuremata.core
                :output-to "out/clojuremata.js"
                :output-dir "out"
                :optimizations :whitespace
                :cache-analysis true
                :source-map "out/clojuremata.js.map"}}
             {:id "release"
              :source-paths ["src"]
              :compiler {
                :main clojuremata.core
                :output-to "out-adv/clojuremata.min.js"
                :output-dir "out-adv"
                :optimizations :advanced
                :pretty-print false}}]
    :test-commands {"unit-tests" ["phantomjs" :runner
				  "out/clojuremata.js"]}})
