(ns repro
  (:require [clj-http.client :as http]))

(defn -main [& args]
  (let [url "https://github.com/uscensusbureau/citysdk/archive/bc93425d47508741c8fa8131ac09a53372e1e088.zip"
        response (http/request {:url url
                                :method :get
                                :as :stream})]
    (prn (:body response))
    ;; will hang indefinitely 
    (.close (:body response))))
