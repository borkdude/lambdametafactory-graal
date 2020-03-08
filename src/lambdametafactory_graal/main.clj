(ns lambdametafactory-graal.main
  (:gen-class))

(defn -main [& _args]
  (println (-> (java.util.stream.Stream/of (to-array ["Kyle" "Amy" "Dan" "Jenn"]))
               (.filter (comp boolean #{4} count))
               (.map keyword)
               (.collect (java.util.stream.Collector/of
                          #(java.util.TreeSet.)
                          #(.add ^java.util.TreeSet %1 %2)
                          #(do (.addAll ^java.util.TreeSet %1 %2) %1)
                          (make-array java.util.stream.Collector$Characteristics 0)))))
  (println (vec (.listFiles (java.io.File. ".") ^java.io.FileFilter #(.isDirectory ^java.io.File %)))))
