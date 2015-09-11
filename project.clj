(defproject blueshift "0.1.0-SNAPSHOT"
  :description "Automate importing S3 data into Amazon Redshift"
  :url "https://github.com/uswitch/blueshift"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.logging "0.2.6"]
                 [com.stuartsierra/component "0.2.1"]
                 [org.clojure/core.async "0.1.303.0-886421-alpha"]
                 [org.clojure/tools.cli "0.3.1"]
                 [clj-aws-s3 "0.3.9" :exclusions [commons-logging commons-codec joda-time]]
                 [joda-time "2.6"]
                 [commons-codec "1.3"]
                 [org.slf4j/jcl-over-slf4j "1.7.7"]
                 [cheshire "5.3.1"]
                 [postgresql "8.0-318.jdbc3"]
                 [prismatic/schema "0.2.2"]
                 [metrics-clojure "2.0.2"]
                 [com.codahale.metrics/metrics-jvm "3.0.2"]]
  :main uswitch.blueshift.main)
