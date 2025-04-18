package com.mapbox.maps.plugin.delegates

import androidx.annotation.RestrictTo
import com.mapbox.maps.*

/**
 * Definition of a map transform delegate.
 */
interface MapTransformDelegate {
  /**
   * Tells the map rendering engine that there is currently a gesture in progress. This
   * affects how the map renders labels, as it will use different texture filters if a gesture
   * is ongoing.
   *
   * @param inProgress The `boolean` value representing if a gesture is in progress.
   */
  fun setGestureInProgress(inProgress: Boolean)

  /**
   * Returns if a gesture is in progress.
   *
   * @return Returns if a gesture is in progress
   */
  fun isGestureInProgress(): Boolean

  /**
   * Set the map north orientation
   *
   * @param northOrientation The map north orientation to set
   */
  fun setNorthOrientation(northOrientation: NorthOrientation)

  /**
   * Set the map constrain mode
   *
   * @param constrainMode The map constraint mode to set
   */
  fun setConstrainMode(constrainMode: ConstrainMode)

  /**
   * Set the map viewport mode
   *
   * @param viewportMode The map viewport mode to set
   */
  fun setViewportMode(viewportMode: ViewportMode)

  /**
   * Tells the map rendering engine that the animation is currently performed by the
   * user (e.g. with a `setCamera()` calls series). It adjusts the engine for the animation use case.
   * In particular, it brings more stability to symbol placement and rendering.
   *
   * @param inProgress Bool representing if user animation is in progress
   */
  fun setUserAnimationInProgress(inProgress: Boolean)

  /**
   * This method provides hints for animations, enabling the rendering engine to pre-process animation
   * frames and apply performance optimizations.
   *
   * The provided data is taken into action on the next
   * [setUserAnimationInProgress(true)][setUserAnimationInProgress] call.
   *
   * @param cameraAnimationHint the camera animation hint
   */
  @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP_PREFIX)
  @MapboxExperimental
  fun setCameraAnimationHint(cameraAnimationHint: CameraAnimationHint)

  /**
   * Returns if user animation is currently in progress.
   *
   * @return Return true if a user animation is in progress.
   */
  fun isUserAnimationInProgress(): Boolean

  /**
   * Get map options.
   *
   * @return Returns map options
   */
  fun getMapOptions(): MapOptions

  /**
   * Gets the size of the map.
   *
   * @return size The size of the map in MapOptions#size platform pixels
   */
  fun getSize(): Size
}