package com.mapbox.maps.extension.compose.style.internal

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeNode
import androidx.compose.runtime.currentComposer
import com.mapbox.maps.extension.compose.MapboxMapComposable
import com.mapbox.maps.extension.compose.internal.MapApplier
import com.mapbox.maps.extension.compose.internal.MapNode
import com.mapbox.maps.extension.compose.style.MapboxStyleComposable

internal class StyleSlotNode(
  internal val slotName: String,
) : StyleAwareNode() {
  override lateinit var mapStyleNode: MapStyleNode
  override fun onAttached(parent: MapNode) {
    mapStyleNode = parent as MapStyleNode
  }

  override fun onRemoved(parent: MapNode) {
    cleanUp()
  }

  override fun onClear() {
    cleanUp()
  }

  private fun cleanUp() {
    this.children.forEach { it.onClear() }
  }

  override fun toString(): String {
    return "StyleSlotNode(slotName=$slotName)"
  }
}

/**
 * This is a internal composable function because we only want to expose it through Style with hashmap.
 * As it's bound with the slots available in the style JSON, and we also don't want multiple Slot declaration
 * with the same name, as it will mess up with our layer ordering.
 */
@Composable
@MapboxStyleComposable
internal fun StyleSlot(
  name: String,
  content: (@Composable @MapboxMapComposable () -> Unit)? = null
) {
  val applier = currentComposer.applier as? MapApplier
  applier?.let {
    // Insert a MapNode to the MapApplier node tree
    ComposeNode<StyleSlotNode, MapApplier>(
      factory = {
        StyleSlotNode(name)
      },
      update = {}
    ) {
      content?.invoke()
    }
  }
    ?: throw IllegalStateException("Illegal use of StyleSlot composable outside of MapboxMapComposable")
}