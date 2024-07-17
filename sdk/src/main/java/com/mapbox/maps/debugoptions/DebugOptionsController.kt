package com.mapbox.maps.debugoptions

import android.content.Context
import android.widget.FrameLayout
import androidx.annotation.VisibleForTesting
import com.mapbox.common.Cancelable
import com.mapbox.maps.MapboxMap

internal class DebugOptionsController {
  private val mapView: FrameLayout
  private val mapboxMap: MapboxMap
  private val cameraDebugViewProvider: (Context) -> CameraDebugView
  private val paddingDebugViewProvider: (Context) -> PaddingDebugView

  private var cameraDebugView: CameraDebugView? = null
  private var paddingDebugView: PaddingDebugView? = null
  private var cameraSubscriptionCancelable: Cancelable? = null

  var options: Set<MapViewDebugOptions> = setOf()
    set(newValue) {
      field = newValue
      mapboxMap.debugOptions = newValue.nativeDebugOptions
      toggleMapViewDebugOptionsIfNeeded()
    }

  constructor(
    mapView: FrameLayout,
    mapboxMap: MapboxMap,
  ) : this(mapView, mapboxMap, { CameraDebugView(it) }, { PaddingDebugView(it) })

  @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
  constructor(
    mapView: FrameLayout,
    mapboxMap: MapboxMap,
    cameraDebugViewProvider: (Context) -> CameraDebugView,
    paddingDebugViewProvider: (Context) -> PaddingDebugView,
  ) {
    this.mapView = mapView
    this.mapboxMap = mapboxMap
    this.cameraDebugViewProvider = cameraDebugViewProvider
    this.paddingDebugViewProvider = paddingDebugViewProvider
  }

  fun onStart() {
    if (cameraSubscriptionCancelable != null) {
      return
    }
    cameraSubscriptionCancelable = mapboxMap.subscribeCameraChanged {
      cameraDebugView?.update(it.cameraState)
      paddingDebugView?.update(it.cameraState.padding)
    }
  }

  fun onStop() {
    cameraSubscriptionCancelable?.cancel()
    cameraSubscriptionCancelable = null
  }

  private fun toggleMapViewDebugOptionsIfNeeded() {
    if (options.contains(MapViewDebugOptions.CAMERA)) {
      if (cameraDebugView == null) {
        cameraDebugView = cameraDebugViewProvider(mapView.context).also {
          mapView.addView(it)
          it.update(mapboxMap.cameraState)
        }
      }
    } else {
      cameraDebugView?.let {
        mapView.removeView(it)
        cameraDebugView = null
      }
    }

    if (options.contains(MapViewDebugOptions.PADDING)) {
      if (paddingDebugView == null) {
        paddingDebugView = paddingDebugViewProvider(mapView.context).also {
          mapView.addView(it)
          it.update(mapboxMap.cameraState.padding)
        }
      }
    } else {
      paddingDebugView?.let {
        mapView.removeView(it)
        paddingDebugView = null
      }
    }
  }
}