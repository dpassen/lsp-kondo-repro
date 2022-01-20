(defproject lsp-kondo-repro "0.1.0-SNAPSHOT"
  :description "LSP kondo repro"
  :dependencies
  [[org.clojure/clojure "1.10.3"]]
  :pedantic? true
  :profiles
  {:dev
   {:dependencies
    [[org.clojure/test.check     "1.1.1"]
     [com.gfredericks/test.chuck "0.2.13"]
     [metosin/testit             "0.4.1"]]}
   :uberjar
   {:aot :all}}
  :main lsp-kondo-repro.core)
