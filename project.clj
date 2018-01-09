(defproject modern-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.946"]
                 [compojure "1.6.0"]]
  :source-paths ["src/clj" "src/cljs"]
  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-ring "0.12.3"]]
  :jvm-opts ["--add-modules" "java.xml.bind"]
  :cljsbuild {:builds
              [{;; CLJS source code path
                :source-paths ["src/cljs"]
                ;; Google Closure (CLS) options configuration
                :compiler {;; CLS generated JS script filename
                           :output-to "resources/public/js/modern.js"
                           ;; minimal JS optimization directive
                           :optimizations :whitespace
                           ;; generated JS code prettyfication
                           :pretty-print true}}]}
  :ring {:handler modern-cljs.core/handler}
  :clean-targets ^{:protect false} [:target-path "resources/public/js/"])