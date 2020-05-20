(ns konami-cljs.core
    (:require cljsjs.konami)) ; require the konami library

(enable-console-print!)

;; The Konami constructor is used to 'enable' the easter egg. It takes
;; a function as a parameter. This function will be called when the
;; code is entered.
(def easter-egg (js/Konami. (fn [] (js/alert "Hello Konami code!"))))
