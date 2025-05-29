// This file is generated.

package com.mapbox.maps.extension.compose.style.layers.generated

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.mapbox.maps.MapboxExperimental
import com.mapbox.maps.extension.compose.style.ActionWhenNotInitial
import com.mapbox.maps.extension.compose.style.AddImageWhenNotInitial
import com.mapbox.maps.extension.compose.style.BooleanValue
import com.mapbox.maps.extension.compose.style.ColorValue
import com.mapbox.maps.extension.compose.style.DoubleListValue
import com.mapbox.maps.extension.compose.style.DoubleValue
import com.mapbox.maps.extension.compose.style.LongValue
import com.mapbox.maps.extension.compose.style.StringValue
import com.mapbox.maps.extension.compose.style.Transition
import com.mapbox.maps.extension.compose.style.layers.Filter
import com.mapbox.maps.extension.compose.style.layers.ImageValue
import com.mapbox.maps.extension.compose.style.layers.LayerInteractionsState
import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode

/**
 * The state holder for [FillLayer]'s layer properties.
 *
 * @see [The online documentation](https://docs.mapbox.com/style-spec/reference/layers#fill)
 */
@Stable
@OptIn(MapboxExperimental::class)
public class FillLayerState
@OptIn(MapboxExperimental::class)
private constructor(
  initialFillConstructBridgeGuardRail: BooleanValue,
  initialFillElevationReference: FillElevationReferenceValue,
  initialFillSortKey: DoubleValue,
  initialFillAntialias: BooleanValue,
  initialFillBridgeGuardRailColor: ColorValue,
  initialFillBridgeGuardRailColorUseTheme: StringValue,
  initialFillBridgeGuardRailColorTransition: Transition,
  initialFillColor: ColorValue,
  initialFillColorUseTheme: StringValue,
  initialFillColorTransition: Transition,
  initialFillEmissiveStrength: DoubleValue,
  initialFillEmissiveStrengthTransition: Transition,
  initialFillOpacity: DoubleValue,
  initialFillOpacityTransition: Transition,
  initialFillOutlineColor: ColorValue,
  initialFillOutlineColorUseTheme: StringValue,
  initialFillOutlineColorTransition: Transition,
  initialFillPattern: ImageValue,
  initialFillPatternCrossFade: DoubleValue,
  initialFillTranslate: DoubleListValue,
  initialFillTranslateTransition: Transition,
  initialFillTranslateAnchor: FillTranslateAnchorValue,
  initialFillTunnelStructureColor: ColorValue,
  initialFillTunnelStructureColorUseTheme: StringValue,
  initialFillTunnelStructureColorTransition: Transition,
  initialFillZOffset: DoubleValue,
  initialFillZOffsetTransition: Transition,
  initialVisibility: VisibilityValue,
  initialMinZoom: LongValue,
  initialMaxZoom: LongValue,
  initialSourceLayer: StringValue,
  initialFilter: Filter,
  initialInteractionsState: LayerInteractionsState,
) {
  /**
   * Construct an default [FillLayerState].
   */
  @OptIn(MapboxExperimental::class)
  public constructor() : this(
    initialFillConstructBridgeGuardRail = BooleanValue.INITIAL,
    initialFillElevationReference = FillElevationReferenceValue.INITIAL,
    initialFillSortKey = DoubleValue.INITIAL,
    initialFillAntialias = BooleanValue.INITIAL,
    initialFillBridgeGuardRailColor = ColorValue.INITIAL,
    initialFillBridgeGuardRailColorUseTheme = StringValue.INITIAL,
    initialFillBridgeGuardRailColorTransition = Transition.INITIAL,
    initialFillColor = ColorValue.INITIAL,
    initialFillColorUseTheme = StringValue.INITIAL,
    initialFillColorTransition = Transition.INITIAL,
    initialFillEmissiveStrength = DoubleValue.INITIAL,
    initialFillEmissiveStrengthTransition = Transition.INITIAL,
    initialFillOpacity = DoubleValue.INITIAL,
    initialFillOpacityTransition = Transition.INITIAL,
    initialFillOutlineColor = ColorValue.INITIAL,
    initialFillOutlineColorUseTheme = StringValue.INITIAL,
    initialFillOutlineColorTransition = Transition.INITIAL,
    initialFillPattern = ImageValue.INITIAL,
    initialFillPatternCrossFade = DoubleValue.INITIAL,
    initialFillTranslate = DoubleListValue.INITIAL,
    initialFillTranslateTransition = Transition.INITIAL,
    initialFillTranslateAnchor = FillTranslateAnchorValue.INITIAL,
    initialFillTunnelStructureColor = ColorValue.INITIAL,
    initialFillTunnelStructureColorUseTheme = StringValue.INITIAL,
    initialFillTunnelStructureColorTransition = Transition.INITIAL,
    initialFillZOffset = DoubleValue.INITIAL,
    initialFillZOffsetTransition = Transition.INITIAL,
    initialVisibility = VisibilityValue.INITIAL,
    initialMinZoom = LongValue.INITIAL,
    initialMaxZoom = LongValue.INITIAL,
    initialSourceLayer = StringValue.INITIAL,
    initialFilter = Filter.INITIAL,
    initialInteractionsState = LayerInteractionsState(),
  )

  /**
   * The interactions associated with this layer.
   */
  @MapboxExperimental
  public var interactionsState: LayerInteractionsState by mutableStateOf(initialInteractionsState)

  @MapboxExperimental
  private val fillConstructBridgeGuardRailState: MutableState<BooleanValue> = mutableStateOf(initialFillConstructBridgeGuardRail)
  /**
   *  Determines whether bridge guard rails are added for elevated roads. Default value: "true".
   */
  @MapboxExperimental
  public var fillConstructBridgeGuardRail: BooleanValue by fillConstructBridgeGuardRailState

  @MapboxExperimental
  private val fillElevationReferenceState: MutableState<FillElevationReferenceValue> = mutableStateOf(initialFillElevationReference)
  /**
   *  Selects the base of fill-elevation. Some modes might require precomputed elevation data in the tileset. Default value: "none".
   */
  @MapboxExperimental
  public var fillElevationReference: FillElevationReferenceValue by fillElevationReferenceState

  private val fillSortKeyState: MutableState<DoubleValue> = mutableStateOf(initialFillSortKey)
  /**
   *  Sorts features in ascending order based on this value. Features with a higher sort key will appear above features with a lower sort key.
   */
  public var fillSortKey: DoubleValue by fillSortKeyState

  private val fillAntialiasState: MutableState<BooleanValue> = mutableStateOf(initialFillAntialias)
  /**
   *  Whether or not the fill should be antialiased. Default value: true.
   */
  public var fillAntialias: BooleanValue by fillAntialiasState

  @MapboxExperimental
  private val fillBridgeGuardRailColorState: MutableState<ColorValue> = mutableStateOf(initialFillBridgeGuardRailColor)
  /**
   *  The color of bridge guard rail. Default value: "rgba(241, 236, 225, 255)".
   */
  @MapboxExperimental
  public var fillBridgeGuardRailColor: ColorValue by fillBridgeGuardRailColorState

  @MapboxExperimental
  private val fillBridgeGuardRailColorUseThemeState: MutableState<StringValue> = mutableStateOf(initialFillBridgeGuardRailColorUseTheme)
  /**
   *  Overrides applying of color theme for [fillBridgeGuardRailColor] if "none" is set. To follow default theme "default" should be set. Default value: "default".
   */
  @MapboxExperimental
  public var fillBridgeGuardRailColorUseTheme: StringValue by fillBridgeGuardRailColorUseThemeState

  @MapboxExperimental
  private val fillBridgeGuardRailColorTransitionState: MutableState<Transition> = mutableStateOf(initialFillBridgeGuardRailColorTransition)
  /**
   *  Defines the transition of [fillBridgeGuardRailColor].
   */
  @MapboxExperimental
  public var fillBridgeGuardRailColorTransition: Transition by fillBridgeGuardRailColorTransitionState

  private val fillColorState: MutableState<ColorValue> = mutableStateOf(initialFillColor)
  /**
   *  The color of the filled part of this layer. This color can be specified as `rgba` with an alpha component and the color's opacity will not affect the opacity of the 1px stroke, if it is used. Default value: "#000000".
   */
  public var fillColor: ColorValue by fillColorState

  @MapboxExperimental
  private val fillColorUseThemeState: MutableState<StringValue> = mutableStateOf(initialFillColorUseTheme)
  /**
   *  Overrides applying of color theme for [fillColor] if "none" is set. To follow default theme "default" should be set. Default value: "default".
   */
  @MapboxExperimental
  public var fillColorUseTheme: StringValue by fillColorUseThemeState

  private val fillColorTransitionState: MutableState<Transition> = mutableStateOf(initialFillColorTransition)
  /**
   *  Defines the transition of [fillColor].
   */
  public var fillColorTransition: Transition by fillColorTransitionState

  private val fillEmissiveStrengthState: MutableState<DoubleValue> = mutableStateOf(initialFillEmissiveStrength)
  /**
   *  Controls the intensity of light emitted on the source features. Default value: 0. Minimum value: 0. The unit of fillEmissiveStrength is in intensity.
   */
  public var fillEmissiveStrength: DoubleValue by fillEmissiveStrengthState

  private val fillEmissiveStrengthTransitionState: MutableState<Transition> = mutableStateOf(initialFillEmissiveStrengthTransition)
  /**
   *  Defines the transition of [fillEmissiveStrength].
   */
  public var fillEmissiveStrengthTransition: Transition by fillEmissiveStrengthTransitionState

  private val fillOpacityState: MutableState<DoubleValue> = mutableStateOf(initialFillOpacity)
  /**
   *  The opacity of the entire fill layer. In contrast to the `fill-color`, this value will also affect the 1px stroke around the fill, if the stroke is used. Default value: 1. Value range: [0, 1]
   */
  public var fillOpacity: DoubleValue by fillOpacityState

  private val fillOpacityTransitionState: MutableState<Transition> = mutableStateOf(initialFillOpacityTransition)
  /**
   *  Defines the transition of [fillOpacity].
   */
  public var fillOpacityTransition: Transition by fillOpacityTransitionState

  private val fillOutlineColorState: MutableState<ColorValue> = mutableStateOf(initialFillOutlineColor)
  /**
   *  The outline color of the fill. Matches the value of `fill-color` if unspecified.
   */
  public var fillOutlineColor: ColorValue by fillOutlineColorState

  @MapboxExperimental
  private val fillOutlineColorUseThemeState: MutableState<StringValue> = mutableStateOf(initialFillOutlineColorUseTheme)
  /**
   *  Overrides applying of color theme for [fillOutlineColor] if "none" is set. To follow default theme "default" should be set. Default value: "default".
   */
  @MapboxExperimental
  public var fillOutlineColorUseTheme: StringValue by fillOutlineColorUseThemeState

  private val fillOutlineColorTransitionState: MutableState<Transition> = mutableStateOf(initialFillOutlineColorTransition)
  /**
   *  Defines the transition of [fillOutlineColor].
   */
  public var fillOutlineColorTransition: Transition by fillOutlineColorTransitionState

  private val fillPatternState: MutableState<ImageValue> = mutableStateOf(initialFillPattern)
  /**
   *  Name of image in sprite to use for drawing image fills. For seamless patterns, image width and height must be a factor of two (2, 4, 8, ..., 512). Note that zoom-dependent expressions will be evaluated only at integer zoom levels.
   */
  public var fillPattern: ImageValue by fillPatternState

  private val fillPatternCrossFadeState: MutableState<DoubleValue> = mutableStateOf(initialFillPatternCrossFade)
  /**
   *  Controls the transition progress between the image variants of fill-pattern. Zero means the first variant is used, one is the second, and in between they are blended together. Both images should be the same size and have the same type (either raster or vector). Default value: 0. Value range: [0, 1]
   */
  public var fillPatternCrossFade: DoubleValue by fillPatternCrossFadeState

  private val fillTranslateState: MutableState<DoubleListValue> = mutableStateOf(initialFillTranslate)
  /**
   *  The geometry's offset. Values are [x, y] where negatives indicate left and up, respectively. Default value: [0,0]. The unit of fillTranslate is in pixels.
   */
  public var fillTranslate: DoubleListValue by fillTranslateState

  private val fillTranslateTransitionState: MutableState<Transition> = mutableStateOf(initialFillTranslateTransition)
  /**
   *  Defines the transition of [fillTranslate].
   */
  public var fillTranslateTransition: Transition by fillTranslateTransitionState

  private val fillTranslateAnchorState: MutableState<FillTranslateAnchorValue> = mutableStateOf(initialFillTranslateAnchor)
  /**
   *  Controls the frame of reference for `fill-translate`. Default value: "map".
   */
  public var fillTranslateAnchor: FillTranslateAnchorValue by fillTranslateAnchorState

  @MapboxExperimental
  private val fillTunnelStructureColorState: MutableState<ColorValue> = mutableStateOf(initialFillTunnelStructureColor)
  /**
   *  The color of tunnel structures (tunnel entrance and tunnel walls). Default value: "rgba(241, 236, 225, 255)".
   */
  @MapboxExperimental
  public var fillTunnelStructureColor: ColorValue by fillTunnelStructureColorState

  @MapboxExperimental
  private val fillTunnelStructureColorUseThemeState: MutableState<StringValue> = mutableStateOf(initialFillTunnelStructureColorUseTheme)
  /**
   *  Overrides applying of color theme for [fillTunnelStructureColor] if "none" is set. To follow default theme "default" should be set. Default value: "default".
   */
  @MapboxExperimental
  public var fillTunnelStructureColorUseTheme: StringValue by fillTunnelStructureColorUseThemeState

  @MapboxExperimental
  private val fillTunnelStructureColorTransitionState: MutableState<Transition> = mutableStateOf(initialFillTunnelStructureColorTransition)
  /**
   *  Defines the transition of [fillTunnelStructureColor].
   */
  @MapboxExperimental
  public var fillTunnelStructureColorTransition: Transition by fillTunnelStructureColorTransitionState

  @MapboxExperimental
  private val fillZOffsetState: MutableState<DoubleValue> = mutableStateOf(initialFillZOffset)
  /**
   *  Specifies an uniform elevation in meters. Note: If the value is zero, the layer will be rendered on the ground. Non-zero values will elevate the layer from the sea level, which can cause it to be rendered below the terrain. Default value: 0. Minimum value: 0.
   */
  @MapboxExperimental
  public var fillZOffset: DoubleValue by fillZOffsetState

  @MapboxExperimental
  private val fillZOffsetTransitionState: MutableState<Transition> = mutableStateOf(initialFillZOffsetTransition)
  /**
   *  Defines the transition of [fillZOffset].
   */
  @MapboxExperimental
  public var fillZOffsetTransition: Transition by fillZOffsetTransitionState

  private val visibilityState: MutableState<VisibilityValue> = mutableStateOf(initialVisibility)
  /**
   *  Whether this layer is displayed. Default value: "visible".
   */
  public var visibility: VisibilityValue by visibilityState

  private val minZoomState: MutableState<LongValue> = mutableStateOf(initialMinZoom)
  /**
   *  The minimum zoom level for the layer. At zoom levels less than the minzoom, the layer will be hidden. Value range: [0, 24]
   */
  public var minZoom: LongValue by minZoomState

  private val maxZoomState: MutableState<LongValue> = mutableStateOf(initialMaxZoom)
  /**
   *  The maximum zoom level for the layer. At zoom levels equal to or greater than the maxzoom, the layer will be hidden. Value range: [0, 24]
   */
  public var maxZoom: LongValue by maxZoomState

  private val sourceLayerState: MutableState<StringValue> = mutableStateOf(initialSourceLayer)
  /**
   *  Layer to use from a vector tile source. Required for vector tile sources; prohibited for all other source types, including GeoJSON sources.
   */
  public var sourceLayer: StringValue by sourceLayerState

  private val filterState: MutableState<Filter> = mutableStateOf(initialFilter)
  /**
   *  An expression specifying conditions on source features. Only features that match the filter are displayed. Zoom expressions in filters are only evaluated at integer zoom levels. The `["feature-state", ...]` expression is not supported in filter expressions. The `["pitch"]` and `["distance-from-center"]` expressions are supported only for filter expressions on the symbol layer.
   */
  public var filter: Filter by filterState

  @Composable
  @OptIn(MapboxExperimental::class)
  internal fun UpdateProperties(layerNode: LayerNode) {
    ActionWhenNotInitial(layerNode.setPropertyAction, fillConstructBridgeGuardRailState, "fill-construct-bridge-guard-rail")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillElevationReferenceState, "fill-elevation-reference")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillSortKeyState, "fill-sort-key")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillAntialiasState, "fill-antialias")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillBridgeGuardRailColorState, "fill-bridge-guard-rail-color")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillBridgeGuardRailColorUseThemeState, "fill-bridge-guard-rail-color-use-theme")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillBridgeGuardRailColorTransitionState, "fill-bridge-guard-rail-color-transition")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillColorState, "fill-color")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillColorUseThemeState, "fill-color-use-theme")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillColorTransitionState, "fill-color-transition")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillEmissiveStrengthState, "fill-emissive-strength")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillEmissiveStrengthTransitionState, "fill-emissive-strength-transition")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillOpacityState, "fill-opacity")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillOpacityTransitionState, "fill-opacity-transition")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillOutlineColorState, "fill-outline-color")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillOutlineColorUseThemeState, "fill-outline-color-use-theme")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillOutlineColorTransitionState, "fill-outline-color-transition")
    AddImageWhenNotInitial(layerNode, fillPatternState, "fill-pattern")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillPatternCrossFadeState, "fill-pattern-cross-fade")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillTranslateState, "fill-translate")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillTranslateTransitionState, "fill-translate-transition")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillTranslateAnchorState, "fill-translate-anchor")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillTunnelStructureColorState, "fill-tunnel-structure-color")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillTunnelStructureColorUseThemeState, "fill-tunnel-structure-color-use-theme")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillTunnelStructureColorTransitionState, "fill-tunnel-structure-color-transition")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillZOffsetState, "fill-z-offset")
    ActionWhenNotInitial(layerNode.setPropertyAction, fillZOffsetTransitionState, "fill-z-offset-transition")
    ActionWhenNotInitial(layerNode.setPropertyAction, visibilityState, "visibility")
    ActionWhenNotInitial(layerNode.setPropertyAction, minZoomState, "minzoom")
    ActionWhenNotInitial(layerNode.setPropertyAction, maxZoomState, "maxzoom")
    ActionWhenNotInitial(layerNode.setPropertyAction, sourceLayerState, "source-layer")
    ActionWhenNotInitial(layerNode.setPropertyAction, filterState, "filter")
  }
}
// End of generated file.