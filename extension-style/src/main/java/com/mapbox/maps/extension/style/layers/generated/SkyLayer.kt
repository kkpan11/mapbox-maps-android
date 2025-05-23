// This file is generated.

package com.mapbox.maps.extension.style.layers.generated

import androidx.annotation.ColorInt
import androidx.annotation.UiThread
import com.mapbox.maps.MapboxExperimental
import com.mapbox.maps.StyleManager
import com.mapbox.maps.extension.style.atmosphere.generated.Atmosphere
import com.mapbox.maps.extension.style.expressions.generated.Expression
import com.mapbox.maps.extension.style.layers.Layer
import com.mapbox.maps.extension.style.layers.properties.*
import com.mapbox.maps.extension.style.layers.properties.generated.*
import com.mapbox.maps.extension.style.types.*
import com.mapbox.maps.extension.style.utils.ColorUtils.colorIntToRgbaExpression
import com.mapbox.maps.extension.style.utils.ColorUtils.rgbaExpressionToColorInt
import com.mapbox.maps.extension.style.utils.ColorUtils.rgbaExpressionToColorString
import com.mapbox.maps.extension.style.utils.silentUnwrap
import java.util.*

/**
 * A spherical dome around the map that is always rendered behind all other layers.
 *
 * **Warning**: As of v10.6.0, [Atmosphere] is the preferred method for atmospheric styling.
 * Sky layer is not supported by the globe projection, and will be phased out in future major release.
 *
 * @see [The online documentation](https://docs.mapbox.com/style-spec/reference/layers/#sky)
 *
 * @param layerId the ID of the layer
 */
@UiThread
class SkyLayer(override val layerId: String) : SkyLayerDsl, Layer() {

  /**
   * The slot this layer is assigned to. If specified, and a slot with that name exists,
   * it will be placed at that position in the layer order.
   *
   * @param slot value of slot. Setting it to empty string removes the slot.
   */
  override fun slot(slot: String): SkyLayer = apply {
    val param = PropertyValue("slot", slot)
    setProperty(param)
  }

  /**
   * The slot this layer is assigned to. If specified, and a slot with that name exists,
   * it will be placed at that position in the layer order.
   */
  override val slot: String?
    /**
     * Get the slot property
     *
     * @return slot
     */
    get() = getPropertyValue("slot")

  /**
   * A filter is a property at the layer level that determines which features should be rendered in a style layer.
   *
   * Filters are written as expressions, which give you fine-grained control over which features to include: the
   * style layer only displays the features that match the filter condition that you define.
   *
   * Note: Zoom expressions in filters are only evaluated at integer zoom levels. The `feature-state` expression
   * is not supported in filter expressions.
   *
   * @param filter the expression filter to set
   */
  override fun filter(filter: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("filter", filter)
    setProperty(propertyValue)
  }

  /**
   * A filter is a property at the layer level that determines which features should be rendered in a style layer.
   *
   * Filters are written as expressions, which give you fine-grained control over which features to include: the
   * style layer only displays the features that match the filter condition that you define.
   *
   * Note: Zoom expressions in filters are only evaluated at integer zoom levels. The `feature-state` expression
   * is not supported in filter expressions.
   */
  val filter: Expression?
    /**
     * Get the filter property
     *
     * @return filter
     */
    get() = getPropertyValue("filter")

  /**
   * Whether this layer is displayed.
   */
  override val visibility: Visibility?
    /**
     * Whether this layer is displayed.
     *
     * Use static method [SkyLayer.defaultVisibility] to get the default property value.
     *
     * @return VISIBILITY
     */
    get() {
      val property: String? = getPropertyValue("visibility")
      property?.let {
        return Visibility.valueOf(it.uppercase(Locale.US).replace('-', '_'))
      }
      return null
    }

  /**
   * Whether this layer is displayed.
   */
  override val visibilityAsExpression: Expression?
    /**
     * Whether this layer is displayed.
     *
     * Use static method [SkyLayer.defaultVisibility] to get the default property value.
     *
     * @return VISIBILITY as expression
     */
    get() = getPropertyValue("visibility")

  /**
   * Whether this layer is displayed.
   *
   * Use static method [SkyLayer.defaultVisibility] to get the default property value.
   *
   * @param visibility value of Visibility
   */
  override fun visibility(visibility: Visibility): SkyLayer = apply {
    val propertyValue = PropertyValue("visibility", visibility)
    setProperty(propertyValue)
  }

  /**
   * Whether this layer is displayed.
   *
   * Use static method [[SkyLayer.defaultVisibility] to get the default property value.
   *
   * @param visibility value of Visibility
   */
  override fun visibility(visibility: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("visibility", visibility)
    setProperty(propertyValue)
  }

  /**
   * The minimum zoom level for the layer. At zoom levels less than the minzoom, the layer will be hidden.
   *
   * Range:
   *       minimum: 0
   *       maximum: 24
   */
  override val minZoom: Double?
    /**
     * Get the minzoom property
     *
     * Use static method [SkyLayer.defaultMinZoom] to get the default property value.
     *
     * @return minzoom
     */
    get() = getPropertyValue("minzoom")

  /**
   * The minimum zoom level for the layer. At zoom levels less than the minzoom, the layer will be hidden.
   *
   * Range:
   *       minimum: 0
   *       maximum: 24
   *
   * Use static method [SkyLayer.defaultMinZoom] to get the default property value.
   *
   * @param minZoom value of minzoom
   */
  override fun minZoom(minZoom: Double): SkyLayer = apply {
    val param = PropertyValue("minzoom", minZoom)
    setProperty(param)
  }

  /**
   * The maximum zoom level for the layer. At zoom levels equal to or greater than the maxzoom, the layer will be hidden.
   *
   * Range:
   *       minimum: 0
   *       maximum: 24
   */
  override val maxZoom: Double?
    /**
     * Get the maxzoom property
     *
     * Use static method [SkyLayer.defaultMaxZoom] to get the default property value.
     *
     * @return maxzoom
     */
    get() = getPropertyValue("maxzoom")

  /**
   * The maximum zoom level for the layer. At zoom levels equal to or greater than the maxzoom, the layer will be hidden.
   *
   * Range:
   *       minimum: 0
   *       maximum: 24
   *
   * Use static method [SkyLayer.defaultMaxZoom] to get the default property value.
   *
   * @param maxZoom value of maxzoom
   */
  override fun maxZoom(maxZoom: Double): SkyLayer = apply {
    val param = PropertyValue("maxzoom", maxZoom)
    setProperty(param)
  }

  // Property getters and setters

  /**
   * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
   */
  val skyAtmosphereColor: String?
    /**
     * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereColor] to get the default property.
     *
     * @return String
     */
    get() {
      skyAtmosphereColorAsExpression?.let {
        return rgbaExpressionToColorString(it)
      }
      return null
    }

  /**
   * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereColor] to set the default property.
   *
   * @param skyAtmosphereColor value of skyAtmosphereColor
   */
  override fun skyAtmosphereColor(skyAtmosphereColor: String): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-color", skyAtmosphereColor)
    setProperty(propertyValue)
  }

  /**
   * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
   *
   * This is an Expression representation of "sky-atmosphere-color".
   *
   */
  val skyAtmosphereColorAsExpression: Expression?
    /**
     * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
     *
     * Get the SkyAtmosphereColor property as an Expression
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereColorAsExpression] to get the default property.
     */
    get() =
      getPropertyValue("sky-atmosphere-color")

  /**
   * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereColorAsExpression] to set the default property.
   *
   * @param skyAtmosphereColor value of skyAtmosphereColor as Expression
   */
  override fun skyAtmosphereColor(skyAtmosphereColor: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-color", skyAtmosphereColor)
    setProperty(propertyValue)
  }

  /**
   * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
   */
  val skyAtmosphereColorAsColorInt: Int?
    /**
     * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereColorAsColorInt] to get the default property.
     *
     * @return int representation of a rgba string color
     */
    @ColorInt
    get() {
      skyAtmosphereColorAsExpression?.let {
        return rgbaExpressionToColorInt(it)
      }
      return null
    }

  /**
   * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereColorAsColorInt] to set the default property.
   *
   * @param skyAtmosphereColor value of skyAtmosphereColor
   */
  override fun skyAtmosphereColor(@ColorInt skyAtmosphereColor: Int): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-color", colorIntToRgbaExpression(skyAtmosphereColor))
    setProperty(propertyValue)
  }

  /**
   * Сolor theme override for [skyAtmosphereColor].
   */
  @MapboxExperimental
  val skyAtmosphereColorUseTheme: String?
    /**
     * Get the SkyAtmosphereColorUseTheme property
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereColorUseTheme] to get the default property.
     *
     * @return current SkyAtmosphereColorUseTheme property as String
     */
    get() {
      return getPropertyValue("sky-atmosphere-color-use-theme")
    }

  /**
   * Set the SkyAtmosphereColorUseTheme as String
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereColorUseTheme] to get the default property.
   *
   * @param skyAtmosphereColorUseTheme theme value for color. Overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  override fun skyAtmosphereColorUseTheme(skyAtmosphereColorUseTheme: String): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-color-use-theme", skyAtmosphereColorUseTheme)
    setProperty(propertyValue)
  }

  /**
   * Сolor theme override for [skyAtmosphereColor].
   */
  @MapboxExperimental
  val skyAtmosphereColorUseThemeAsExpression: Expression?
    /**
     * Get the SkyAtmosphereColorUseTheme property
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereColorUseTheme] to get the default property.
     *
     * @return current SkyAtmosphereColorUseTheme property as String
     */
    get() = getPropertyValueAsExpressionOrLiteralExpression("sky-atmosphere-color-use-theme")

  /**
   * Set the SkyAtmosphereColorUseTheme as Expression
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereColorUseTheme] to get the default property.
   *
   * @param skyAtmosphereColorUseTheme theme value for color. Overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  override fun skyAtmosphereColorUseTheme(skyAtmosphereColorUseTheme: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-color-use-theme", skyAtmosphereColorUseTheme)
    setProperty(propertyValue)
  }

  /**
   * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
   */
  val skyAtmosphereHaloColor: String?
    /**
     * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereHaloColor] to get the default property.
     *
     * @return String
     */
    get() {
      skyAtmosphereHaloColorAsExpression?.let {
        return rgbaExpressionToColorString(it)
      }
      return null
    }

  /**
   * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereHaloColor] to set the default property.
   *
   * @param skyAtmosphereHaloColor value of skyAtmosphereHaloColor
   */
  override fun skyAtmosphereHaloColor(skyAtmosphereHaloColor: String): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-halo-color", skyAtmosphereHaloColor)
    setProperty(propertyValue)
  }

  /**
   * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
   *
   * This is an Expression representation of "sky-atmosphere-halo-color".
   *
   */
  val skyAtmosphereHaloColorAsExpression: Expression?
    /**
     * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
     *
     * Get the SkyAtmosphereHaloColor property as an Expression
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereHaloColorAsExpression] to get the default property.
     */
    get() =
      getPropertyValue("sky-atmosphere-halo-color")

  /**
   * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereHaloColorAsExpression] to set the default property.
   *
   * @param skyAtmosphereHaloColor value of skyAtmosphereHaloColor as Expression
   */
  override fun skyAtmosphereHaloColor(skyAtmosphereHaloColor: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-halo-color", skyAtmosphereHaloColor)
    setProperty(propertyValue)
  }

  /**
   * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
   */
  val skyAtmosphereHaloColorAsColorInt: Int?
    /**
     * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereHaloColorAsColorInt] to get the default property.
     *
     * @return int representation of a rgba string color
     */
    @ColorInt
    get() {
      skyAtmosphereHaloColorAsExpression?.let {
        return rgbaExpressionToColorInt(it)
      }
      return null
    }

  /**
   * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereHaloColorAsColorInt] to set the default property.
   *
   * @param skyAtmosphereHaloColor value of skyAtmosphereHaloColor
   */
  override fun skyAtmosphereHaloColor(@ColorInt skyAtmosphereHaloColor: Int): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-halo-color", colorIntToRgbaExpression(skyAtmosphereHaloColor))
    setProperty(propertyValue)
  }

  /**
   * Сolor theme override for [skyAtmosphereHaloColor].
   */
  @MapboxExperimental
  val skyAtmosphereHaloColorUseTheme: String?
    /**
     * Get the SkyAtmosphereHaloColorUseTheme property
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereHaloColorUseTheme] to get the default property.
     *
     * @return current SkyAtmosphereHaloColorUseTheme property as String
     */
    get() {
      return getPropertyValue("sky-atmosphere-halo-color-use-theme")
    }

  /**
   * Set the SkyAtmosphereHaloColorUseTheme as String
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereHaloColorUseTheme] to get the default property.
   *
   * @param skyAtmosphereHaloColorUseTheme theme value for color. Overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  override fun skyAtmosphereHaloColorUseTheme(skyAtmosphereHaloColorUseTheme: String): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-halo-color-use-theme", skyAtmosphereHaloColorUseTheme)
    setProperty(propertyValue)
  }

  /**
   * Сolor theme override for [skyAtmosphereHaloColor].
   */
  @MapboxExperimental
  val skyAtmosphereHaloColorUseThemeAsExpression: Expression?
    /**
     * Get the SkyAtmosphereHaloColorUseTheme property
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereHaloColorUseTheme] to get the default property.
     *
     * @return current SkyAtmosphereHaloColorUseTheme property as String
     */
    get() = getPropertyValueAsExpressionOrLiteralExpression("sky-atmosphere-halo-color-use-theme")

  /**
   * Set the SkyAtmosphereHaloColorUseTheme as Expression
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereHaloColorUseTheme] to get the default property.
   *
   * @param skyAtmosphereHaloColorUseTheme theme value for color. Overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  override fun skyAtmosphereHaloColorUseTheme(skyAtmosphereHaloColorUseTheme: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-halo-color-use-theme", skyAtmosphereHaloColorUseTheme)
    setProperty(propertyValue)
  }

  /**
   * Position of the sun center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the sun relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the sun, where 0 degree is directly above, at zenith, and 90 degree at the horizon. When this property is ommitted, the sun center is directly inherited from the light position. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyAtmosphereSun is in degrees.
   */
  val skyAtmosphereSun: List<Double>?
    /**
     * Position of the sun center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the sun relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the sun, where 0 degree is directly above, at zenith, and 90 degree at the horizon. When this property is ommitted, the sun center is directly inherited from the light position. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyAtmosphereSun is in degrees.
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereSun] to get the default property.
     *
     * @return List<Double>
     */
    get() {
      return getPropertyValue("sky-atmosphere-sun")
    }

  /**
   * Position of the sun center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the sun relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the sun, where 0 degree is directly above, at zenith, and 90 degree at the horizon. When this property is ommitted, the sun center is directly inherited from the light position. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyAtmosphereSun is in degrees.
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereSun] to set the default property.
   *
   * @param skyAtmosphereSun value of skyAtmosphereSun
   */
  override fun skyAtmosphereSun(skyAtmosphereSun: List<Double>): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-sun", skyAtmosphereSun)
    setProperty(propertyValue)
  }

  /**
   * Position of the sun center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the sun relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the sun, where 0 degree is directly above, at zenith, and 90 degree at the horizon. When this property is ommitted, the sun center is directly inherited from the light position. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyAtmosphereSun is in degrees.
   *
   * This is an Expression representation of "sky-atmosphere-sun".
   *
   */
  val skyAtmosphereSunAsExpression: Expression?
    /**
     * Position of the sun center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the sun relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the sun, where 0 degree is directly above, at zenith, and 90 degree at the horizon. When this property is ommitted, the sun center is directly inherited from the light position. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyAtmosphereSun is in degrees.
     *
     * Get the SkyAtmosphereSun property as an Expression
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereSunAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("sky-atmosphere-sun")

  /**
   * Position of the sun center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the sun relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the sun, where 0 degree is directly above, at zenith, and 90 degree at the horizon. When this property is ommitted, the sun center is directly inherited from the light position. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyAtmosphereSun is in degrees.
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereSunAsExpression] to set the default property.
   *
   * @param skyAtmosphereSun value of skyAtmosphereSun as Expression
   */
  override fun skyAtmosphereSun(skyAtmosphereSun: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-sun", skyAtmosphereSun)
    setProperty(propertyValue)
  }

  /**
   * Intensity of the sun as a light source in the atmosphere (on a scale from 0 to a 100). Setting higher values will brighten up the sky. Default value: 10. Value range: [0, 100]
   */
  val skyAtmosphereSunIntensity: Double?
    /**
     * Intensity of the sun as a light source in the atmosphere (on a scale from 0 to a 100). Setting higher values will brighten up the sky. Default value: 10. Value range: [0, 100]
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereSunIntensity] to get the default property.
     *
     * @return Double
     */
    get() {
      return getPropertyValue("sky-atmosphere-sun-intensity")
    }

  /**
   * Intensity of the sun as a light source in the atmosphere (on a scale from 0 to a 100). Setting higher values will brighten up the sky. Default value: 10. Value range: [0, 100]
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereSunIntensity] to set the default property.
   *
   * @param skyAtmosphereSunIntensity value of skyAtmosphereSunIntensity
   */
  override fun skyAtmosphereSunIntensity(skyAtmosphereSunIntensity: Double): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-sun-intensity", skyAtmosphereSunIntensity)
    setProperty(propertyValue)
  }

  /**
   * Intensity of the sun as a light source in the atmosphere (on a scale from 0 to a 100). Setting higher values will brighten up the sky. Default value: 10. Value range: [0, 100]
   *
   * This is an Expression representation of "sky-atmosphere-sun-intensity".
   *
   */
  val skyAtmosphereSunIntensityAsExpression: Expression?
    /**
     * Intensity of the sun as a light source in the atmosphere (on a scale from 0 to a 100). Setting higher values will brighten up the sky. Default value: 10. Value range: [0, 100]
     *
     * Get the SkyAtmosphereSunIntensity property as an Expression
     *
     * Use static method [SkyLayer.defaultSkyAtmosphereSunIntensityAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("sky-atmosphere-sun-intensity")

  /**
   * Intensity of the sun as a light source in the atmosphere (on a scale from 0 to a 100). Setting higher values will brighten up the sky. Default value: 10. Value range: [0, 100]
   *
   * Use static method [SkyLayer.defaultSkyAtmosphereSunIntensityAsExpression] to set the default property.
   *
   * @param skyAtmosphereSunIntensity value of skyAtmosphereSunIntensity as Expression
   */
  override fun skyAtmosphereSunIntensity(skyAtmosphereSunIntensity: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-atmosphere-sun-intensity", skyAtmosphereSunIntensity)
    setProperty(propertyValue)
  }

  /**
   * Defines a radial color gradient with which to color the sky. The color values can be interpolated with an expression using `sky-radial-progress`. The range [0, 1] for the interpolant covers a radial distance (in degrees) of [0, `sky-gradient-radius`] centered at the position specified by `sky-gradient-center`. Default value: ["interpolate",["linear"],["sky-radial-progress"],0.8,"#87ceeb",1,"white"].
   */
  val skyGradient: Expression?
    /**
     * Defines a radial color gradient with which to color the sky. The color values can be interpolated with an expression using `sky-radial-progress`. The range [0, 1] for the interpolant covers a radial distance (in degrees) of [0, `sky-gradient-radius`] centered at the position specified by `sky-gradient-center`. Default value: ["interpolate",["linear"],["sky-radial-progress"],0.8,"#87ceeb",1,"white"].
     *
     * Use static method [SkyLayer.defaultSkyGradient] to get the default property.
     *
     * @return Expression
     */
    get() {
      return getPropertyValue("sky-gradient")
    }

  /**
   * Defines a radial color gradient with which to color the sky. The color values can be interpolated with an expression using `sky-radial-progress`. The range [0, 1] for the interpolant covers a radial distance (in degrees) of [0, `sky-gradient-radius`] centered at the position specified by `sky-gradient-center`. Default value: ["interpolate",["linear"],["sky-radial-progress"],0.8,"#87ceeb",1,"white"].
   *
   * Use static method [SkyLayer.defaultSkyGradient] to set the default property.
   *
   * @param skyGradient value of skyGradient
   */
  override fun skyGradient(skyGradient: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-gradient", skyGradient)
    setProperty(propertyValue)
  }

  /**
   * Сolor theme override for [skyGradient].
   */
  @MapboxExperimental
  val skyGradientUseTheme: String?
    /**
     * Get the SkyGradientUseTheme property
     *
     * Use static method [SkyLayer.defaultSkyGradientUseTheme] to get the default property.
     *
     * @return current SkyGradientUseTheme property as Expression
     */
    get() {
      return getPropertyValue("sky-gradient-use-theme")
    }

  /**
   * Set the SkyGradientUseTheme as String
   *
   * Use static method [SkyLayer.defaultSkyGradientUseTheme] to get the default property.
   *
   * @param skyGradientUseTheme theme value for color. Overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  override fun skyGradientUseTheme(skyGradientUseTheme: String): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-gradient-use-theme", skyGradientUseTheme)
    setProperty(propertyValue)
  }

  /**
   * Сolor theme override for [skyGradient].
   */
  @MapboxExperimental
  val skyGradientUseThemeAsExpression: Expression?
    /**
     * Get the SkyGradientUseTheme property
     *
     * Use static method [SkyLayer.defaultSkyGradientUseTheme] to get the default property.
     *
     * @return current SkyGradientUseTheme property as Expression
     */
    get() = getPropertyValueAsExpressionOrLiteralExpression("sky-gradient-use-theme")

  /**
   * Set the SkyGradientUseTheme as Expression
   *
   * Use static method [SkyLayer.defaultSkyGradientUseTheme] to get the default property.
   *
   * @param skyGradientUseTheme theme value for color. Overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  override fun skyGradientUseTheme(skyGradientUseTheme: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-gradient-use-theme", skyGradientUseTheme)
    setProperty(propertyValue)
  }

  /**
   * Position of the gradient center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the gradient center relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the gradient center, where 0 degree is directly above, at zenith, and 90 degree at the horizon. Default value: [0,0]. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyGradientCenter is in degrees.
   */
  val skyGradientCenter: List<Double>?
    /**
     * Position of the gradient center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the gradient center relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the gradient center, where 0 degree is directly above, at zenith, and 90 degree at the horizon. Default value: [0,0]. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyGradientCenter is in degrees.
     *
     * Use static method [SkyLayer.defaultSkyGradientCenter] to get the default property.
     *
     * @return List<Double>
     */
    get() {
      return getPropertyValue("sky-gradient-center")
    }

  /**
   * Position of the gradient center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the gradient center relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the gradient center, where 0 degree is directly above, at zenith, and 90 degree at the horizon. Default value: [0,0]. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyGradientCenter is in degrees.
   *
   * Use static method [SkyLayer.defaultSkyGradientCenter] to set the default property.
   *
   * @param skyGradientCenter value of skyGradientCenter
   */
  override fun skyGradientCenter(skyGradientCenter: List<Double>): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-gradient-center", skyGradientCenter)
    setProperty(propertyValue)
  }

  /**
   * Position of the gradient center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the gradient center relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the gradient center, where 0 degree is directly above, at zenith, and 90 degree at the horizon. Default value: [0,0]. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyGradientCenter is in degrees.
   *
   * This is an Expression representation of "sky-gradient-center".
   *
   */
  val skyGradientCenterAsExpression: Expression?
    /**
     * Position of the gradient center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the gradient center relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the gradient center, where 0 degree is directly above, at zenith, and 90 degree at the horizon. Default value: [0,0]. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyGradientCenter is in degrees.
     *
     * Get the SkyGradientCenter property as an Expression
     *
     * Use static method [SkyLayer.defaultSkyGradientCenterAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("sky-gradient-center")

  /**
   * Position of the gradient center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the gradient center relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the gradient center, where 0 degree is directly above, at zenith, and 90 degree at the horizon. Default value: [0,0]. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyGradientCenter is in degrees.
   *
   * Use static method [SkyLayer.defaultSkyGradientCenterAsExpression] to set the default property.
   *
   * @param skyGradientCenter value of skyGradientCenter as Expression
   */
  override fun skyGradientCenter(skyGradientCenter: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-gradient-center", skyGradientCenter)
    setProperty(propertyValue)
  }

  /**
   * The angular distance (measured in degrees) from `sky-gradient-center` up to which the gradient extends. A value of 180 causes the gradient to wrap around to the opposite direction from `sky-gradient-center`. Default value: 90. Value range: [0, 180]
   */
  val skyGradientRadius: Double?
    /**
     * The angular distance (measured in degrees) from `sky-gradient-center` up to which the gradient extends. A value of 180 causes the gradient to wrap around to the opposite direction from `sky-gradient-center`. Default value: 90. Value range: [0, 180]
     *
     * Use static method [SkyLayer.defaultSkyGradientRadius] to get the default property.
     *
     * @return Double
     */
    get() {
      return getPropertyValue("sky-gradient-radius")
    }

  /**
   * The angular distance (measured in degrees) from `sky-gradient-center` up to which the gradient extends. A value of 180 causes the gradient to wrap around to the opposite direction from `sky-gradient-center`. Default value: 90. Value range: [0, 180]
   *
   * Use static method [SkyLayer.defaultSkyGradientRadius] to set the default property.
   *
   * @param skyGradientRadius value of skyGradientRadius
   */
  override fun skyGradientRadius(skyGradientRadius: Double): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-gradient-radius", skyGradientRadius)
    setProperty(propertyValue)
  }

  /**
   * The angular distance (measured in degrees) from `sky-gradient-center` up to which the gradient extends. A value of 180 causes the gradient to wrap around to the opposite direction from `sky-gradient-center`. Default value: 90. Value range: [0, 180]
   *
   * This is an Expression representation of "sky-gradient-radius".
   *
   */
  val skyGradientRadiusAsExpression: Expression?
    /**
     * The angular distance (measured in degrees) from `sky-gradient-center` up to which the gradient extends. A value of 180 causes the gradient to wrap around to the opposite direction from `sky-gradient-center`. Default value: 90. Value range: [0, 180]
     *
     * Get the SkyGradientRadius property as an Expression
     *
     * Use static method [SkyLayer.defaultSkyGradientRadiusAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("sky-gradient-radius")

  /**
   * The angular distance (measured in degrees) from `sky-gradient-center` up to which the gradient extends. A value of 180 causes the gradient to wrap around to the opposite direction from `sky-gradient-center`. Default value: 90. Value range: [0, 180]
   *
   * Use static method [SkyLayer.defaultSkyGradientRadiusAsExpression] to set the default property.
   *
   * @param skyGradientRadius value of skyGradientRadius as Expression
   */
  override fun skyGradientRadius(skyGradientRadius: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-gradient-radius", skyGradientRadius)
    setProperty(propertyValue)
  }

  /**
   * The opacity of the entire sky layer. Default value: 1. Value range: [0, 1]
   */
  val skyOpacity: Double?
    /**
     * The opacity of the entire sky layer. Default value: 1. Value range: [0, 1]
     *
     * Use static method [SkyLayer.defaultSkyOpacity] to get the default property.
     *
     * @return Double
     */
    get() {
      return getPropertyValue("sky-opacity")
    }

  /**
   * The opacity of the entire sky layer. Default value: 1. Value range: [0, 1]
   *
   * Use static method [SkyLayer.defaultSkyOpacity] to set the default property.
   *
   * @param skyOpacity value of skyOpacity
   */
  override fun skyOpacity(skyOpacity: Double): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-opacity", skyOpacity)
    setProperty(propertyValue)
  }

  /**
   * The opacity of the entire sky layer. Default value: 1. Value range: [0, 1]
   *
   * This is an Expression representation of "sky-opacity".
   *
   */
  val skyOpacityAsExpression: Expression?
    /**
     * The opacity of the entire sky layer. Default value: 1. Value range: [0, 1]
     *
     * Get the SkyOpacity property as an Expression
     *
     * Use static method [SkyLayer.defaultSkyOpacityAsExpression] to get the default property.
     */
    get() =
      getPropertyValueAsExpressionOrLiteralExpression("sky-opacity")

  /**
   * The opacity of the entire sky layer. Default value: 1. Value range: [0, 1]
   *
   * Use static method [SkyLayer.defaultSkyOpacityAsExpression] to set the default property.
   *
   * @param skyOpacity value of skyOpacity as Expression
   */
  override fun skyOpacity(skyOpacity: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-opacity", skyOpacity)
    setProperty(propertyValue)
  }

  /**
   * Transition options for SkyOpacity.
   */
  val skyOpacityTransition: StyleTransition?
    /**
     * Get the SkyOpacity property transition options
     *
     * Use static method [SkyLayer.defaultSkyOpacityTransition] to get the default property.
     *
     * @return transition options for Double
     */
    get() {
      return getPropertyValue("sky-opacity-transition")
    }

  /**
   * Set the SkyOpacity property transition options
   *
   * Use static method [SkyLayer.defaultSkyOpacityTransition] to set the default property.
   *
   * @param options transition options for Double
   */
  override fun skyOpacityTransition(options: StyleTransition): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-opacity-transition", options)
    setProperty(propertyValue)
  }

  /**
   * DSL for [skyOpacityTransition].
   */
  override fun skyOpacityTransition(block: StyleTransition.Builder.() -> Unit): SkyLayer = apply {
    skyOpacityTransition(StyleTransition.Builder().apply(block).build())
  }

  /**
   * The type of the sky Default value: "atmosphere".
   */
  val skyType: SkyType?
    /**
     * The type of the sky Default value: "atmosphere".
     *
     * Use static method [SkyLayer.defaultSkyType] to get the default property.
     *
     * @return SkyType
     */
    get() {
      getPropertyValue<String?>("sky-type")?.let {
        return SkyType.valueOf(it.uppercase(Locale.US).replace('-', '_'))
      }
      return null
    }

  /**
   * The type of the sky Default value: "atmosphere".
   *
   * Use static method [SkyLayer.defaultSkyType] to set the default property.
   *
   * @param skyType value of skyType
   */
  override fun skyType(skyType: SkyType): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-type", skyType)
    setProperty(propertyValue)
  }

  /**
   * The type of the sky Default value: "atmosphere".
   *
   * This is an Expression representation of "sky-type".
   *
   */
  val skyTypeAsExpression: Expression?
    /**
     * The type of the sky Default value: "atmosphere".
     *
     * Get the SkyType property as an Expression
     *
     * Use static method [SkyLayer.defaultSkyTypeAsExpression] to get the default property.
     */
    get() =
      getPropertyValue("sky-type")
        ?: skyType?.let {
          Expression.literal(it.value)
        }

  /**
   * The type of the sky Default value: "atmosphere".
   *
   * Use static method [SkyLayer.defaultSkyTypeAsExpression] to set the default property.
   *
   * @param skyType value of skyType as Expression
   */
  override fun skyType(skyType: Expression): SkyLayer = apply {
    val propertyValue = PropertyValue("sky-type", skyType)
    setProperty(propertyValue)
  }

  /**
   * Get the type of this layer
   *
   * @return Type of the layer as [String]
   */
  override fun getType(): String {
    return "sky"
  }
  /**
   * Static variables and methods.
   */
  companion object {
    // Default values for layer properties
    /**
     * Visibility of the layer.
     */
    val defaultVisibility: Visibility?
      /**
       * Get the default Visibility property
       *
       * @return VISIBILITY
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("sky", "visibility").silentUnwrap<String>()?.let {
          return Visibility.valueOf(it.uppercase(Locale.US).replace('-', '_'))
        }
        return null
      }

    /**
     * The minimum zoom level for the layer. At zoom levels less than the minzoom, the layer will be hidden.
     *
     * Range:
     *       minimum: 0
     *       maximum: 24
     */
    val defaultMinZoom: Double?
      /**
       * Get the minzoom property
       *
       * @return minzoom
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("sky", "minzoom").silentUnwrap()

    /**
     * The maximum zoom level for the layer. At zoom levels equal to or greater than the maxzoom, the layer will be hidden.
     *
     * Range:
     *       minimum: 0
     *       maximum: 24
     */
    val defaultMaxZoom: Double?
      /**
       * Get the maxzoom property
       *
       * @return maxzoom
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("sky", "maxzoom").silentUnwrap()

    /**
     * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
     */
    val defaultSkyAtmosphereColor: String?
      /**
       * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
       *
       * Get the default value of SkyAtmosphereColor property
       *
       * @return String
       */
      get() {
        defaultSkyAtmosphereColorAsExpression?.let {
          return rgbaExpressionToColorString(it)
        }
        return null
      }

    /**
     * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
     *
     * This is an Expression representation of "sky-atmosphere-color".
     *
     */
    val defaultSkyAtmosphereColorAsExpression: Expression?
      /**
       * Get default value of the SkyAtmosphereColor property as an Expression
       *
       * @return String
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-color").silentUnwrap<Expression>()?.let {
          return it
        }
        return null
      }

    /**
     * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
     */
    val defaultSkyAtmosphereColorAsColorInt: Int?
      /**
       * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
       *
       * Get the default value of SkyAtmosphereColor property as color int.
       *
       * @return int representation of a rgba string color
       */
      @ColorInt
      get() {
        defaultSkyAtmosphereColorAsExpression?.let {
          return rgbaExpressionToColorInt(it)
        }
        return null
      }

    /**
     * Default color theme for [skyAtmosphereColor].
     */
    @MapboxExperimental
    val defaultSkyAtmosphereColorUseTheme: String?
      /**
       * Get default value of the SkyAtmosphereColor property as String
       *
       * @return String
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-color-use-theme").silentUnwrap()

    /**
     * Default color theme for [skyAtmosphereColor].
     */
    @MapboxExperimental
    val defaultSkyAtmosphereColorUseThemeAsExpression: Expression?
      /**
       * Get default value of the SkyAtmosphereColor property as Expression
       *
       * @return String
       */
      get() {
        return StyleManager
          .getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-color-use-theme")
          .silentUnwrap<Expression>() ?: defaultSkyAtmosphereColorUseTheme?.let { Expression.literal(it) }
      }

    /**
     * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
     */
    val defaultSkyAtmosphereHaloColor: String?
      /**
       * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
       *
       * Get the default value of SkyAtmosphereHaloColor property
       *
       * @return String
       */
      get() {
        defaultSkyAtmosphereHaloColorAsExpression?.let {
          return rgbaExpressionToColorString(it)
        }
        return null
      }

    /**
     * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
     *
     * This is an Expression representation of "sky-atmosphere-halo-color".
     *
     */
    val defaultSkyAtmosphereHaloColorAsExpression: Expression?
      /**
       * Get default value of the SkyAtmosphereHaloColor property as an Expression
       *
       * @return String
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-halo-color").silentUnwrap<Expression>()?.let {
          return it
        }
        return null
      }

    /**
     * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
     */
    val defaultSkyAtmosphereHaloColorAsColorInt: Int?
      /**
       * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
       *
       * Get the default value of SkyAtmosphereHaloColor property as color int.
       *
       * @return int representation of a rgba string color
       */
      @ColorInt
      get() {
        defaultSkyAtmosphereHaloColorAsExpression?.let {
          return rgbaExpressionToColorInt(it)
        }
        return null
      }

    /**
     * Default color theme for [skyAtmosphereHaloColor].
     */
    @MapboxExperimental
    val defaultSkyAtmosphereHaloColorUseTheme: String?
      /**
       * Get default value of the SkyAtmosphereHaloColor property as String
       *
       * @return String
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-halo-color-use-theme").silentUnwrap()

    /**
     * Default color theme for [skyAtmosphereHaloColor].
     */
    @MapboxExperimental
    val defaultSkyAtmosphereHaloColorUseThemeAsExpression: Expression?
      /**
       * Get default value of the SkyAtmosphereHaloColor property as Expression
       *
       * @return String
       */
      get() {
        return StyleManager
          .getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-halo-color-use-theme")
          .silentUnwrap<Expression>() ?: defaultSkyAtmosphereHaloColorUseTheme?.let { Expression.literal(it) }
      }

    /**
     * Position of the sun center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the sun relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the sun, where 0 degree is directly above, at zenith, and 90 degree at the horizon. When this property is ommitted, the sun center is directly inherited from the light position. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyAtmosphereSun is in degrees.
     */
    val defaultSkyAtmosphereSun: List<Double>?
      /**
       * Position of the sun center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the sun relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the sun, where 0 degree is directly above, at zenith, and 90 degree at the horizon. When this property is ommitted, the sun center is directly inherited from the light position. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyAtmosphereSun is in degrees.
       *
       * Get the default value of SkyAtmosphereSun property
       *
       * @return List<Double>
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-sun").silentUnwrap()
      }

    /**
     * Position of the sun center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the sun relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the sun, where 0 degree is directly above, at zenith, and 90 degree at the horizon. When this property is ommitted, the sun center is directly inherited from the light position. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyAtmosphereSun is in degrees.
     *
     * This is an Expression representation of "sky-atmosphere-sun".
     *
     */
    val defaultSkyAtmosphereSunAsExpression: Expression?
      /**
       * Get default value of the SkyAtmosphereSun property as an Expression
       *
       * @return List<Double>
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-sun").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultSkyAtmosphereSun?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Intensity of the sun as a light source in the atmosphere (on a scale from 0 to a 100). Setting higher values will brighten up the sky. Default value: 10. Value range: [0, 100]
     */
    val defaultSkyAtmosphereSunIntensity: Double?
      /**
       * Intensity of the sun as a light source in the atmosphere (on a scale from 0 to a 100). Setting higher values will brighten up the sky. Default value: 10. Value range: [0, 100]
       *
       * Get the default value of SkyAtmosphereSunIntensity property
       *
       * @return Double
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-sun-intensity").silentUnwrap()
      }

    /**
     * Intensity of the sun as a light source in the atmosphere (on a scale from 0 to a 100). Setting higher values will brighten up the sky. Default value: 10. Value range: [0, 100]
     *
     * This is an Expression representation of "sky-atmosphere-sun-intensity".
     *
     */
    val defaultSkyAtmosphereSunIntensityAsExpression: Expression?
      /**
       * Get default value of the SkyAtmosphereSunIntensity property as an Expression
       *
       * @return Double
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-atmosphere-sun-intensity").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultSkyAtmosphereSunIntensity?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Defines a radial color gradient with which to color the sky. The color values can be interpolated with an expression using `sky-radial-progress`. The range [0, 1] for the interpolant covers a radial distance (in degrees) of [0, `sky-gradient-radius`] centered at the position specified by `sky-gradient-center`. Default value: ["interpolate",["linear"],["sky-radial-progress"],0.8,"#87ceeb",1,"white"].
     */
    val defaultSkyGradient: Expression?
      /**
       * Defines a radial color gradient with which to color the sky. The color values can be interpolated with an expression using `sky-radial-progress`. The range [0, 1] for the interpolant covers a radial distance (in degrees) of [0, `sky-gradient-radius`] centered at the position specified by `sky-gradient-center`. Default value: ["interpolate",["linear"],["sky-radial-progress"],0.8,"#87ceeb",1,"white"].
       *
       * Get the default value of SkyGradient property
       *
       * @return Expression
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient").silentUnwrap()
      }

    /**
     * Default color theme for [skyGradient].
     */
    @MapboxExperimental
    val defaultSkyGradientUseTheme: String?
      /**
       * Get default value of the SkyGradient property as String
       *
       * @return Expression
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-use-theme").silentUnwrap()

    /**
     * Default color theme for [skyGradient].
     */
    @MapboxExperimental
    val defaultSkyGradientUseThemeAsExpression: Expression?
      /**
       * Get default value of the SkyGradient property as Expression
       *
       * @return Expression
       */
      get() {
        return StyleManager
          .getStyleLayerPropertyDefaultValue("sky", "sky-gradient-use-theme")
          .silentUnwrap<Expression>() ?: defaultSkyGradientUseTheme?.let { Expression.literal(it) }
      }

    /**
     * Position of the gradient center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the gradient center relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the gradient center, where 0 degree is directly above, at zenith, and 90 degree at the horizon. Default value: [0,0]. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyGradientCenter is in degrees.
     */
    val defaultSkyGradientCenter: List<Double>?
      /**
       * Position of the gradient center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the gradient center relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the gradient center, where 0 degree is directly above, at zenith, and 90 degree at the horizon. Default value: [0,0]. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyGradientCenter is in degrees.
       *
       * Get the default value of SkyGradientCenter property
       *
       * @return List<Double>
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-center").silentUnwrap()
      }

    /**
     * Position of the gradient center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the gradient center relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the gradient center, where 0 degree is directly above, at zenith, and 90 degree at the horizon. Default value: [0,0]. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyGradientCenter is in degrees.
     *
     * This is an Expression representation of "sky-gradient-center".
     *
     */
    val defaultSkyGradientCenterAsExpression: Expression?
      /**
       * Get default value of the SkyGradientCenter property as an Expression
       *
       * @return List<Double>
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-center").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultSkyGradientCenter?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * The angular distance (measured in degrees) from `sky-gradient-center` up to which the gradient extends. A value of 180 causes the gradient to wrap around to the opposite direction from `sky-gradient-center`. Default value: 90. Value range: [0, 180]
     */
    val defaultSkyGradientRadius: Double?
      /**
       * The angular distance (measured in degrees) from `sky-gradient-center` up to which the gradient extends. A value of 180 causes the gradient to wrap around to the opposite direction from `sky-gradient-center`. Default value: 90. Value range: [0, 180]
       *
       * Get the default value of SkyGradientRadius property
       *
       * @return Double
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-radius").silentUnwrap()
      }

    /**
     * The angular distance (measured in degrees) from `sky-gradient-center` up to which the gradient extends. A value of 180 causes the gradient to wrap around to the opposite direction from `sky-gradient-center`. Default value: 90. Value range: [0, 180]
     *
     * This is an Expression representation of "sky-gradient-radius".
     *
     */
    val defaultSkyGradientRadiusAsExpression: Expression?
      /**
       * Get default value of the SkyGradientRadius property as an Expression
       *
       * @return Double
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-gradient-radius").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultSkyGradientRadius?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * The opacity of the entire sky layer. Default value: 1. Value range: [0, 1]
     */
    val defaultSkyOpacity: Double?
      /**
       * The opacity of the entire sky layer. Default value: 1. Value range: [0, 1]
       *
       * Get the default value of SkyOpacity property
       *
       * @return Double
       */
      get() {
        return StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-opacity").silentUnwrap()
      }

    /**
     * The opacity of the entire sky layer. Default value: 1. Value range: [0, 1]
     *
     * This is an Expression representation of "sky-opacity".
     *
     */
    val defaultSkyOpacityAsExpression: Expression?
      /**
       * Get default value of the SkyOpacity property as an Expression
       *
       * @return Double
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-opacity").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultSkyOpacity?.let {
          return Expression.literal(it)
        }
        return null
      }

    /**
     * Transition options for SkyOpacity.
     */
    val defaultSkyOpacityTransition: StyleTransition?
      /**
       * Get the SkyOpacity property transition options
       *
       * @return transition options for Double
       */
      get() = StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-opacity-transition").silentUnwrap()

    /**
     * The type of the sky Default value: "atmosphere".
     */
    val defaultSkyType: SkyType?
      /**
       * The type of the sky Default value: "atmosphere".
       *
       * Get the default value of SkyType property
       *
       * @return SkyType
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-type").silentUnwrap<String>()?.let {
          return SkyType.valueOf(it.uppercase(Locale.US).replace('-', '_'))
        }
        return null
      }

    /**
     * The type of the sky Default value: "atmosphere".
     *
     * This is an Expression representation of "sky-type".
     *
     */
    val defaultSkyTypeAsExpression: Expression?
      /**
       * Get default value of the SkyType property as an Expression
       *
       * @return SkyType
       */
      get() {
        StyleManager.getStyleLayerPropertyDefaultValue("sky", "sky-type").silentUnwrap<Expression>()?.let {
          return it
        }
        defaultSkyType?.let {
          return Expression.literal(it.value)
        }
        return null
      }
  }
}

/**
 * This Interface contains all the functions that will be exposed to Koltin DSL.
 *
 * Separated the DSL receiver class to this interface to avoid IDE code suggestion for
 * property getters.
 */
@LayersDsl
interface SkyLayerDsl {

  /**
   * The slot this layer is assigned to. If specified, and a slot with that name exists,
   * it will be placed at that position in the layer order.
   *
   * @param slot value of slot. Setting it to empty string removes the slot.
   */
  fun slot(slot: String): SkyLayer

  /**
   * A filter is a property at the layer level that determines which features should be rendered in a style layer.
   *
   * Filters are written as expressions, which give you fine-grained control over which features to include: the
   * style layer only displays the features that match the filter condition that you define.
   *
   * Note: Zoom expressions in filters are only evaluated at integer zoom levels. The `feature-state` expression
   * is not supported in filter expressions.
   *
   * @param filter the expression filter to set
   */
  fun filter(filter: Expression): SkyLayer

  /**
   * Whether this layer is displayed.
   *
   * @param visibility value of Visibility
   */
  fun visibility(visibility: Visibility): SkyLayer

  /**
   * Whether this layer is displayed.
   *
   * @param visibility value of Visibility as Expression
   */
  fun visibility(visibility: Expression): SkyLayer

  /**
   * The minimum zoom level for the layer. At zoom levels less than the minzoom, the layer will be hidden.
   *
   * Range:
   *       minimum: 0
   *       maximum: 24
   *
   * @param minZoom value of minzoom
   */
  fun minZoom(minZoom: Double): SkyLayer

  /**
   * The maximum zoom level for the layer. At zoom levels equal to or greater than the maxzoom, the layer will be hidden.
   *
   * Range:
   *       minimum: 0
   *       maximum: 24
   *
   * @param maxZoom value of maxzoom
   */
  fun maxZoom(maxZoom: Double): SkyLayer

  // Property getters and setters

  /**
   * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
   *
   * @param skyAtmosphereColor value of skyAtmosphereColor
   */
  fun skyAtmosphereColor(skyAtmosphereColor: String = "white"): SkyLayer

  /**
   * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
   *
   * @param skyAtmosphereColor value of skyAtmosphereColor as Expression
   */
  fun skyAtmosphereColor(skyAtmosphereColor: Expression): SkyLayer

  /**
   * A color used to tweak the main atmospheric scattering coefficients. Using white applies the default coefficients giving the natural blue color to the atmosphere. This color affects how heavily the corresponding wavelength is represented during scattering. The alpha channel describes the density of the atmosphere, with 1 maximum density and 0 no density. Default value: "white".
   *
   * @param skyAtmosphereColor value of skyAtmosphereColor
   */
  fun skyAtmosphereColor(@ColorInt skyAtmosphereColor: Int): SkyLayer

  /**
   * Set the skyAtmosphereColorUseTheme as String for [skyAtmosphereColor].
   *
   * @param skyAtmosphereColorUseTheme overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  fun skyAtmosphereColorUseTheme(skyAtmosphereColorUseTheme: String): SkyLayer

  /**
   * Set the skyAtmosphereColorUseTheme as Expression for [skyAtmosphereColor].
   *
   * @param skyAtmosphereColorUseTheme overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  fun skyAtmosphereColorUseTheme(skyAtmosphereColorUseTheme: Expression): SkyLayer

  /**
   * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
   *
   * @param skyAtmosphereHaloColor value of skyAtmosphereHaloColor
   */
  fun skyAtmosphereHaloColor(skyAtmosphereHaloColor: String = "white"): SkyLayer

  /**
   * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
   *
   * @param skyAtmosphereHaloColor value of skyAtmosphereHaloColor as Expression
   */
  fun skyAtmosphereHaloColor(skyAtmosphereHaloColor: Expression): SkyLayer

  /**
   * A color applied to the atmosphere sun halo. The alpha channel describes how strongly the sun halo is represented in an atmosphere sky layer. Default value: "white".
   *
   * @param skyAtmosphereHaloColor value of skyAtmosphereHaloColor
   */
  fun skyAtmosphereHaloColor(@ColorInt skyAtmosphereHaloColor: Int): SkyLayer

  /**
   * Set the skyAtmosphereHaloColorUseTheme as String for [skyAtmosphereHaloColor].
   *
   * @param skyAtmosphereHaloColorUseTheme overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  fun skyAtmosphereHaloColorUseTheme(skyAtmosphereHaloColorUseTheme: String): SkyLayer

  /**
   * Set the skyAtmosphereHaloColorUseTheme as Expression for [skyAtmosphereHaloColor].
   *
   * @param skyAtmosphereHaloColorUseTheme overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  fun skyAtmosphereHaloColorUseTheme(skyAtmosphereHaloColorUseTheme: Expression): SkyLayer

  /**
   * Position of the sun center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the sun relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the sun, where 0 degree is directly above, at zenith, and 90 degree at the horizon. When this property is ommitted, the sun center is directly inherited from the light position. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyAtmosphereSun is in degrees.
   *
   * @param skyAtmosphereSun value of skyAtmosphereSun
   */
  fun skyAtmosphereSun(skyAtmosphereSun: List<Double>): SkyLayer

  /**
   * Position of the sun center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the sun relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the sun, where 0 degree is directly above, at zenith, and 90 degree at the horizon. When this property is ommitted, the sun center is directly inherited from the light position. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyAtmosphereSun is in degrees.
   *
   * @param skyAtmosphereSun value of skyAtmosphereSun as Expression
   */
  fun skyAtmosphereSun(skyAtmosphereSun: Expression): SkyLayer

  /**
   * Intensity of the sun as a light source in the atmosphere (on a scale from 0 to a 100). Setting higher values will brighten up the sky. Default value: 10. Value range: [0, 100]
   *
   * @param skyAtmosphereSunIntensity value of skyAtmosphereSunIntensity
   */
  fun skyAtmosphereSunIntensity(skyAtmosphereSunIntensity: Double = 10.0): SkyLayer

  /**
   * Intensity of the sun as a light source in the atmosphere (on a scale from 0 to a 100). Setting higher values will brighten up the sky. Default value: 10. Value range: [0, 100]
   *
   * @param skyAtmosphereSunIntensity value of skyAtmosphereSunIntensity as Expression
   */
  fun skyAtmosphereSunIntensity(skyAtmosphereSunIntensity: Expression): SkyLayer

  /**
   * Defines a radial color gradient with which to color the sky. The color values can be interpolated with an expression using `sky-radial-progress`. The range [0, 1] for the interpolant covers a radial distance (in degrees) of [0, `sky-gradient-radius`] centered at the position specified by `sky-gradient-center`. Default value: ["interpolate",["linear"],["sky-radial-progress"],0.8,"#87ceeb",1,"white"].
   *
   * @param skyGradient value of skyGradient
   */
  fun skyGradient(skyGradient: Expression): SkyLayer

  /**
   * Set the skyGradientUseTheme as String for [skyGradient].
   *
   * @param skyGradientUseTheme overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  fun skyGradientUseTheme(skyGradientUseTheme: String): SkyLayer

  /**
   * Set the skyGradientUseTheme as Expression for [skyGradient].
   *
   * @param skyGradientUseTheme overrides applying of color theme if "none" string value is set. To follow default theme "default" sting value should be set.
   */
  @MapboxExperimental
  fun skyGradientUseTheme(skyGradientUseTheme: Expression): SkyLayer

  /**
   * Position of the gradient center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the gradient center relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the gradient center, where 0 degree is directly above, at zenith, and 90 degree at the horizon. Default value: [0,0]. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyGradientCenter is in degrees.
   *
   * @param skyGradientCenter value of skyGradientCenter
   */
  fun skyGradientCenter(skyGradientCenter: List<Double> = listOf(0.0, 0.0)): SkyLayer

  /**
   * Position of the gradient center [a azimuthal angle, p polar angle]. The azimuthal angle indicates the position of the gradient center relative to 0 degree north, where degrees proceed clockwise. The polar angle indicates the height of the gradient center, where 0 degree is directly above, at zenith, and 90 degree at the horizon. Default value: [0,0]. Minimum value: [0,0]. Maximum value: [360,180]. The unit of skyGradientCenter is in degrees.
   *
   * @param skyGradientCenter value of skyGradientCenter as Expression
   */
  fun skyGradientCenter(skyGradientCenter: Expression): SkyLayer

  /**
   * The angular distance (measured in degrees) from `sky-gradient-center` up to which the gradient extends. A value of 180 causes the gradient to wrap around to the opposite direction from `sky-gradient-center`. Default value: 90. Value range: [0, 180]
   *
   * @param skyGradientRadius value of skyGradientRadius
   */
  fun skyGradientRadius(skyGradientRadius: Double = 90.0): SkyLayer

  /**
   * The angular distance (measured in degrees) from `sky-gradient-center` up to which the gradient extends. A value of 180 causes the gradient to wrap around to the opposite direction from `sky-gradient-center`. Default value: 90. Value range: [0, 180]
   *
   * @param skyGradientRadius value of skyGradientRadius as Expression
   */
  fun skyGradientRadius(skyGradientRadius: Expression): SkyLayer

  /**
   * The opacity of the entire sky layer. Default value: 1. Value range: [0, 1]
   *
   * @param skyOpacity value of skyOpacity
   */
  fun skyOpacity(skyOpacity: Double = 1.0): SkyLayer

  /**
   * The opacity of the entire sky layer. Default value: 1. Value range: [0, 1]
   *
   * @param skyOpacity value of skyOpacity as Expression
   */
  fun skyOpacity(skyOpacity: Expression): SkyLayer

  /**
   * The opacity of the entire sky layer. Default value: 1. Value range: [0, 1]
   *
   * Set the SkyOpacity property transition options
   *
   * @param options transition options for Double
   */
  fun skyOpacityTransition(options: StyleTransition): SkyLayer

  /**
   * The opacity of the entire sky layer. Default value: 1. Value range: [0, 1]
   *
   * DSL for [skyOpacityTransition].
   */
  fun skyOpacityTransition(block: StyleTransition.Builder.() -> Unit): SkyLayer

  /**
   * The type of the sky Default value: "atmosphere".
   *
   * @param skyType value of skyType
   */
  fun skyType(skyType: SkyType = SkyType.ATMOSPHERE): SkyLayer

  /**
   * The type of the sky Default value: "atmosphere".
   *
   * @param skyType value of skyType as Expression
   */
  fun skyType(skyType: Expression): SkyLayer
}

/**
 * DSL function for creating a [SkyLayer].
 */
fun skyLayer(layerId: String, block: SkyLayerDsl.() -> Unit): SkyLayer = SkyLayer(layerId).apply(block)

// End of generated file.