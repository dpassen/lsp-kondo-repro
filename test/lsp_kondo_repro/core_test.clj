(ns lsp-kondo-repro.core-test
  (:require
   [clojure.test :refer [deftest]]
   [clojure.test.check.generators :as gen]
   [com.gfredericks.test.chuck.clojure-test :refer [checking]]
   [lsp-kondo-repro.core :as lkr]
   [testit.core :refer [fact]]))

(deftest can-process-charge-commands
  (checking "illegal charges" 100
   [amount (gen/fmap bigint (gen/large-integer* {:min (inc limit)}))]
   (fact "silly test"
     (+ 1 1) => 2)))






