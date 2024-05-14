// This file is generated.

package com.mapbox.maps.extension.compose.style.terrain.generated

import android.os.Parcelable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import com.mapbox.bindgen.Value
import com.mapbox.maps.MapboxExperimental
import com.mapbox.maps.extension.compose.style.internal.ValueParceler
import com.mapbox.maps.extension.compose.style.sources.SourceState
import com.mapbox.maps.extension.compose.style.sources.generated.RasterDemSourceState
import com.mapbox.maps.extension.compose.style.terrain.TerrainStateApplier
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.TypeParceler

/**
 * Create and [rememberSaveable] a [TerrainState] using [TerrainState.Saver].
 * [init] will be called when the [TerrainState] is first created to configure its
 * initial state.
 *
 * @param rasterDemSourceState Mandatory [RasterDemSourceState] to which terrain will be added.
 * @param key An optional key to be used as a key for the saved value. If not provided we use the
 * automatically generated by the Compose runtime which is unique for the every exact code location
 * in the composition tree.
 * @param init A function initialise this [TerrainState].
 */
@Composable
@MapboxExperimental
public inline fun rememberTerrainState(
  rasterDemSourceState: RasterDemSourceState,
  key: String? = null,
  crossinline init: TerrainState.() -> Unit = {}
): TerrainState = rememberSaveable(key = key, saver = TerrainState.Saver) {
  TerrainState(rasterDemSourceState).apply(init)
}

/**
 * A global modifier that elevates layers and markers based on a DEM data source.
 *
 * @see [The online documentation](https://docs.mapbox.com/mapbox-gl-js/style-spec/terrain/)
 */
@MapboxExperimental
public class TerrainState {

  internal val rasterDemSourceState: RasterDemSourceState?
  internal val applier: TerrainStateApplier

  public constructor(
    /**
     * The [RasterDemSourceState] that drives the terrain.
     */
    rasterDemSourceState: RasterDemSourceState,
    /**
     * The initial mutable properties of the source.
     */
    initialProperties: Map<String, Value> = mapOf()
  ) {
    this.rasterDemSourceState = rasterDemSourceState
    this.applier = TerrainStateApplier(
      rasterDemSourceState = rasterDemSourceState,
      initialProperties = initialProperties,
      initial = false
    )
  }

  internal constructor(initial: Boolean) {
    this.rasterDemSourceState = null
    this.applier = TerrainStateApplier(
      rasterDemSourceState = null,
      initialProperties = emptyMap(),
      initial = initial
    )
  }

  /**
   * Exaggerates the elevation of the terrain by multiplying the data from the DEM with this value.
   */
  public var exaggeration: Exaggeration
    get() = Exaggeration(applier.getProperty(Exaggeration.NAME) ?: Exaggeration.default.value)
    set(value) {
      applier.setProperty(Exaggeration.NAME, value.value)
    }

  /**
   * Terrain Holder class to be used within [Saver].
   */
  @MapboxExperimental
  @Parcelize
  @TypeParceler<Value, ValueParceler>
  public data class Holder(
    /**
     * Cached holder for [RasterDemSourceState].
     */
    val rasterDemSourceStateHolder: SourceState.Holder?,
    /**
     * Cached properties.
     */
    val cachedProperties: Map<String, Value>,
    /**
     * If it is initial value meaning that no runtime terrain was set.
     */
    val initial: Boolean,
  ) : Parcelable

  /**
   * Public companion object.
   */
  public companion object {
    /**
     * The default saver implementation for [TerrainState]
     */
    public val Saver: Saver<TerrainState, Holder> = Saver(
      save = { it.applier.save() },
      restore = {
        it.rasterDemSourceStateHolder?.let { rasterDemSourceState ->
          TerrainState(
            RasterDemSourceState(
              sourceId = rasterDemSourceState.sourcedId,
              initialProperties = rasterDemSourceState.cachedProperties
            ),
            initialProperties = it.cachedProperties,
          )
        } ?: TerrainState(it.initial)
      }
    )

    /**
     * Initial value for [TerrainState], meaning that no terrain is added.
     */
    internal val initial: TerrainState = TerrainState(initial = true)

    /**
     * Disabled value for [TerrainState], setting disabled will result in removing terrain.
     */
    public val disabled: TerrainState = TerrainState(initial = false)
  }
}
// End of generated file.