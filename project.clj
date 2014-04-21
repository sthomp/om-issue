(defproject om-issue "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2156"]
                 [om "0.6.0"]]
  :source-paths ["src"]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :cljsbuild {
    :builds [{:id "main"
              :source-paths ["src"]
              :compiler {
                :output-to "examples/bootstrap/omissue.js"
                :output-dir "examples/bootstrap/out"
                :optimizations :none
                :source-map true}}]})
