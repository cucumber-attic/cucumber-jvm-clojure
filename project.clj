(defproject org.clojars.matthiasmargush/cucumber-clojure "2.0.3-SNAPSHOT"
  :description "Cucumber implementation for clojure"
  :url "https://github.com/cucumber/cucumber-jvm-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-junit "1.1.8"]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [io.cucumber/cucumber-core "2.0.1"]
                 [io.cucumber/cucumber-junit "2.0.1"]
                 [io.cucumber/cucumber-clojure "2.0.1"]
                 [junit/junit "4.12"]]
  :source-paths ["clojure/src/main/clojure"]
  :java-source-paths ["clojure/src/main/java"
                      "clojure/src/test/java"]
  :test-paths ["clojure/src/test/java"]
  :resource-paths ["clojure/src/test/resources"]
  :junit ["clojure/src/test/java"]
  #_:profiles #_{:dev {:source-paths ["clojure/src/test/java"]
                   :dependencies [[junit/junit "4.12"]
                                  [io.cucumber/cucumber-junit "2.0.1"]]}})
