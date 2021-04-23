package com.spacex

import com.dragon.Dragon
import com.share.Platform

class SpaceXPlatform : Platform {
  override fun platform() = Dragon().name
}