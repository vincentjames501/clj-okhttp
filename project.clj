(defproject clj-http-next/clj-http-next "0.0.1-SNAPSHOT"
  :description "A fast and lightweight clojure http client constructed on top of OkHttp."
  :url "https://github.com/vincentjames501/clj-http-next"
  :license {:name "MIT License" :url "http://opensource.org/licenses/MIT" :year 2022 :key "mit"}
  :scm {:name "git" :url "https://github.com/vincentjames501/clj-http-next"}
  :pom-addition [:developers
                 [:developer
                  [:name "Vincent Pizzo"]
                  [:url "https://github.com/vincentjames501"]
                  [:email "vincentjames501@gmail.com"]
                  [:timezone "-5"]]]
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [metosin/muuntaja "0.6.8"]
                 [metosin/jsonista "0.3.5"]
                 [com.squareup.okhttp3/okhttp "4.9.3"]]
  :profiles {:test {:dependencies [[clj-http "3.12.3"]
                                   [cheshire "5.10.2"]
                                   [criterium "0.4.6"]
                                   [org.slf4j/slf4j-simple "1.7.36"]
                                   [org.testcontainers/testcontainers "1.16.3"]]}}
  :cloverage {:selector [:coverage]}
  :test-selectors {:coverage (complement :performance)}
  :plugins [[lein-cloverage "1.1.2"]]
  :repl-options {:init-ns clj-okhttp.core}
  :global-vars {*warn-on-reflection* true})
