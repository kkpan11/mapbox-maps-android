package com.mapbox.maps.testapp.overlay

import android.view.View
import android.widget.FrameLayout
import androidx.test.filters.LargeTest
import com.mapbox.geojson.Point
import com.mapbox.maps.EdgeInsets
import com.mapbox.maps.plugin.overlay.MapOverlayPlugin
import com.mapbox.maps.plugin.overlay.mapboxOverlay
import com.mapbox.maps.testapp.BaseMapTest
import junit.framework.Assert.*
import org.junit.Before
import org.junit.Ignore
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@LargeTest
class MapOverlayPluginTest : BaseMapTest() {

  private lateinit var mapOverlayPlugin: MapOverlayPlugin

  @Before
  fun setUp() {
    super.before()
    mapOverlayPlugin = mapView.mapboxOverlay
  }

  @Test
  fun setMargins() {
    mapOverlayPlugin.setDisplayingAreaMargins(10, 20, 30, 40)
    val edgeInsets = mapOverlayPlugin.getEdgeInsets()
    assertEquals(
      EdgeInsets(10.0, 20.0, 30.0, 40.0),
      edgeInsets
    )
  }

  @Test
  @Ignore("flaky test, expected:<[top: 50.0, left: 0.0, bottom: 0.0, right: 0.0]> but was:<[top: 0.0, left: 20.0, bottom: 0.0, right: 0.0]>")
  fun registerOverlay() {
    var edgeInsets = mapOverlayPlugin.getEdgeInsets()
    assertEquals(
      EdgeInsets(0.0, 0.0, 0.0, 0.0),
      edgeInsets
    )

    val leftTop = View(context)
    rule.scenario.onActivity {
      it.runOnUiThread {
        mapView.addView(leftTop)
        val leftTopParams = FrameLayout.LayoutParams(leftTop.layoutParams)
        leftTopParams.setMargins(0, 0, 300, (mapView.height - 50.0).toInt())
        leftTop.layoutParams = leftTopParams
      }
    }

    val rightTop = View(context)
    rule.scenario.onActivity {
      it.runOnUiThread {
        mapView.addView(rightTop)
        val rightTopParams = FrameLayout.LayoutParams(rightTop.layoutParams)
        rightTopParams.setMargins(300, 0, 0, (mapView.height - 50.0).toInt())
        rightTop.layoutParams = rightTopParams
      }
    }

    mapOverlayPlugin.registerOverlay(leftTop)
    mapOverlayPlugin.registerOverlay(rightTop)
    edgeInsets = mapOverlayPlugin.getEdgeInsets()
    assertEquals(
      EdgeInsets(50.0, 0.0, 0.0, 0.0),
      edgeInsets
    )

    val leftBottom = View(context)
    rule.scenario.onActivity {
      it.runOnUiThread {
        mapView.addView(leftBottom)
        val leftBottomParams = FrameLayout.LayoutParams(leftBottom.layoutParams)
        leftBottomParams.setMargins(300, (mapView.height - 50.0).toInt(), 300, 0)
        leftBottom.layoutParams = leftBottomParams
      }
    }

    val rightBottom = View(context)
    rule.scenario.onActivity {
      it.runOnUiThread {
        mapView.addView(rightBottom)
        val rightBottomParams = FrameLayout.LayoutParams(rightBottom.layoutParams)
        rightBottomParams.setMargins(300, (mapView.height - 50.0).toInt(), 0, 0)
        rightBottom.layoutParams = rightBottomParams
      }
    }

    mapOverlayPlugin.registerOverlay(leftBottom)
    mapOverlayPlugin.registerOverlay(rightBottom)
    edgeInsets = mapOverlayPlugin.getEdgeInsets()
    assertEquals(
      EdgeInsets(50.0, 0.0, 50.0, 0.0),
      edgeInsets
    )

    mapOverlayPlugin.unregisterOverlay(leftTop)
    mapOverlayPlugin.unregisterOverlay(leftBottom)
    mapOverlayPlugin.unregisterOverlay(rightTop)
    mapOverlayPlugin.unregisterOverlay(rightBottom)
    edgeInsets = mapOverlayPlugin.getEdgeInsets()
    assertEquals(
      EdgeInsets(0.0, 0.0, 0.0, 0.0),
      edgeInsets
    )
  }

  @Test
  fun getReframeCameraOption() {
    rule.scenario.onActivity {
      it.runOnUiThread {
        mapOverlayPlugin.reframe { reframedCamera ->
          assertNull(reframedCamera)
        }
        mapOverlayPlugin.registerMapOverlayCoordinatesProvider {
          listOf(
            Point.fromLngLat(0.0, 0.0),
            Point.fromLngLat(10.0, 20.0)
          )
        }

        mapOverlayPlugin.reframe { reframedCamera ->
          assertNotNull(reframedCamera)
        }
      }
    }
  }

  @Test
  fun reframe() {
    mapOverlayPlugin.registerMapOverlayCoordinatesProvider {
      listOf(
        Point.fromLngLat(0.0, 0.0),
        Point.fromLngLat(10.0, 20.0)
      )
    }
    val leftTop = View(context)
    rule.scenario.onActivity { activity ->
      activity.runOnUiThread {
        mapView.addView(leftTop)
        val leftTopParams = FrameLayout.LayoutParams(leftTop.layoutParams)
        leftTopParams.setMargins(0, 0, 300, (mapView.height - 50.0).toInt())
        leftTop.layoutParams = leftTopParams
      }

      activity.runOnUiThread {
        mapOverlayPlugin.reframe { reframedCamera ->
          assertNotNull(reframedCamera)
          mapboxMap.setCamera(reframedCamera!!)
          val currentCameraOptions = mapboxMap.cameraState
          assertEquals(currentCameraOptions.center.latitude(), reframedCamera.center!!.latitude(), 0.01)
          assertEquals(currentCameraOptions.center.longitude(), reframedCamera.center!!.longitude(), 0.01)
        }
      }
    }
  }
}