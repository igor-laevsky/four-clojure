(defproject four-clojure "0.1.0-SNAPSHOT"
  :description "Solutions for some of the 4clojure.com tasks"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :target-path "target/%s"
  :test-paths ["src"],
  :profiles {:uberjar {:aot :all}})
