(defproject test-lib-loop "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[lein-cljsbuild "0.3.2"]]
  :cljsbuild {:builds {:dev {:source-paths ["client-src"]
                             :compiler {:output-to "js/dev.js"
                                        :libs [""]}}
                       :production {:source-paths ["client-src"]
                                    :compiler {:output-to "js/prod.js"
                                               :libs [""]}}}})
