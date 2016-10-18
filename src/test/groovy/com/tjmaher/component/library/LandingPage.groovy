package com.tjmaher.component.library

import geb.Page
import static com.tjmaher.Config.CONFIG

class LandingPage extends Page {
   static url = "http://${CONFIG.server}"
   static at = { title == "Google" }

   static content = {
      search(wait: true) { $('input[aria-label="Google Search"]') }
   }
}
