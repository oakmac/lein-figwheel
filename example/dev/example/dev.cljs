(ns example.dev
  (:require
   [figwheel.client :as fw]
   [example.core :as core])
  (:require-macros
   [figwheel.client.utils :refer [enable-dev-blocks!]]))

(enable-console-print!)

(enable-dev-blocks!)

(fw/start {
           :websocket-url "ws://localhost:3449/figwheel-ws"
           :build-id "example"
           ;; :autoload false
           ;; :debug true
           :on-jsload (fn []

                        ;; this is a better way to reload the cube example
                        ;; which will reload even for non-local changes
                        ;; (example.cube/stop-and-start-ex3)
                        )
           })