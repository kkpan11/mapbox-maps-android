package com.mapbox.common

import com.mapbox.maps.base.BuildConfig

internal object MapboxMapsAndroidLogger {
  init {
    if (BuildConfig.DEBUG) {
      LogConfiguration.setLoggingLevel(LoggingLevel.DEBUG)
    }
  }

  internal fun internalLogE(tag: String, message: String) =
    Log.error(message, "$SDK_IDENTIFIER\\$tag")

  internal fun internalLogW(tag: String, message: String) =
    Log.warning(message, "$SDK_IDENTIFIER\\$tag")

  internal fun internalLogI(tag: String, message: String) =
    Log.info(message, "$SDK_IDENTIFIER\\$tag")

  internal fun internalLogD(tag: String, message: String) {
    Log.debug(message, "$SDK_IDENTIFIER\\$tag")
  }

  internal const val SDK_IDENTIFIER = "maps-android"
}