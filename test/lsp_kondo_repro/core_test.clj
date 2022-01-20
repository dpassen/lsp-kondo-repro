(ns lsp-kondo-repro.core-test
  (:require
   [clojure.test :refer [deftest]]
   [com.gfredericks.test.chuck.clojure-test :refer [checking]]))

(deftest can-process-charge-commands
  (checking "illegal charges" 100))






