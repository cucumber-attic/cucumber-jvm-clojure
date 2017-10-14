(defproject clojure_cukes "1.0.X"
  :description "A demo of Cucumber with Clojure and Leiningen"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :plugins [[com.siili/lein-cucumber "1.0.7"]]
  :cucumber-feature-paths ["test/features/"]
  :profiles
  {:dev
   {:dependencies [[com.siili/lein-cucumber "1.0.7"]]}}
)
