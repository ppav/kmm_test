package com.share

class Greeting {
  fun greeting(platform: Platform): String {
    return "Hello! " + platform.platform()
  }
}