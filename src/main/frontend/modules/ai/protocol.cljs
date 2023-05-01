(ns frontend.modules.ai.protocol)

(defprotocol AI
  (generate-text [this q opts])
  (chat [this conversation opts])
  ;; (index-graph [this repo])
  ;; encode && embedding
  (generate-image [this description opts])
  (speech-to-text [this audio opts])
  (transcription [this audio opts])
  )