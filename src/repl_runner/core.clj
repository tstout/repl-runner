(ns repl-runner.core
  (:require [clojure.tools.cli :refer [parse-opts]])
  (:gen-class))

(defn -main [& args] (println "hello world"))