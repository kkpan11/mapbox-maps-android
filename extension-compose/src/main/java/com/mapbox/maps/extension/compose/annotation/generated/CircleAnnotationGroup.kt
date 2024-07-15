// This file is generated.

package com.mapbox.maps.extension.compose.annotation.generated

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeNode
import androidx.compose.runtime.currentComposer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.mapbox.maps.extension.compose.MapboxMapComposable
import com.mapbox.maps.extension.compose.annotation.internal.generated.CircleAnnotationManagerNode
import com.mapbox.maps.extension.compose.internal.MapApplier
import com.mapbox.maps.plugin.annotation.AnnotationConfig
import com.mapbox.maps.plugin.annotation.annotations
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotation
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationManager
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationOptions
import com.mapbox.maps.plugin.annotation.generated.createCircleAnnotationManager

/**
 * Composable function to add a [CircleAnnotationGroup] to the Map. For convenience, if there's
 * no need to hoist the [circleAnnotationGroupState], use `CircleAnnotationGroup(annotations, annotationConfig, onClick, init)` with trailing lambda instead.
 *
 * The [CircleAnnotationGroup] is more performant than adding multiple [CircleAnnotation] individually,
 * because the [CircleAnnotationGroup] is added to the map as a single layer.
 *
 * [PointAnnotationGroup] and [CircleAnnotationGroup] can also be clustered based on the configuration, see [AnnotationConfig.annotationSourceOptions] and [ClusterOptions] for more details.
 *
 * @param annotations List of [CircleAnnotationOptions] to be added to the group.
 * @param annotationConfig Configuration for [CircleAnnotationGroup].
 * @param onClick Callback to be invoked when one of the [CircleAnnotation] in the cluster is clicked. The clicked [CircleAnnotation] will be passed as parameter.
 * @param circleAnnotationGroupState The state holder for [CircleAnnotation]Group properties.
 */
@Composable
@MapboxMapComposable
public fun CircleAnnotationGroup(
  annotations: List<CircleAnnotationOptions>,
  annotationConfig: AnnotationConfig? = null,
  onClick: (CircleAnnotation) -> Boolean = { false },
  circleAnnotationGroupState: CircleAnnotationGroupState = remember { CircleAnnotationGroupState() }
) {

  val mapApplier = currentComposer.applier as? MapApplier
    ?: throw IllegalStateException("Illegal use of CircleAnnotationCluster inside unsupported composable function")

  var annotationManager by remember {
    mutableStateOf<CircleAnnotationManager?>(null)
  }

  ComposeNode<CircleAnnotationManagerNode, MapApplier>(
    factory = {
      CircleAnnotationManagerNode(
        mapApplier.mapView.mapboxMap,
        mapApplier.mapView.annotations.createCircleAnnotationManager(annotationConfig).also { annotationManager = it },
        onClick
      )
    },
    update = {
      set(annotations) {
        annotationClusterItems = it
      }
      update(onClick) {
        onClicked = it
      }
    }
  ) {
    key(circleAnnotationGroupState) {
      annotationManager?.let {
        circleAnnotationGroupState.UpdateProperties(it)
      }
    }
  }
}

/**
 * Composable function to add a [CircleAnnotationGroup] to the Map.
 *
 * The [CircleAnnotationGroup] is more performant than adding multiple [CircleAnnotation] individually,
 * because the [CircleAnnotationGroup] is added to the map as a single layer.
 *
 * [PointAnnotationGroup] and [CircleAnnotationGroup] can also be clustered based on the configuration, see [AnnotationConfig.annotationSourceOptions] and [ClusterOptions] for more details.
 *
 * @param annotations List of [CircleAnnotationOptions] to be added to the group.
 * @param annotationConfig Configuration for [CircleAnnotationGroup].
 * @param onClick Callback to be invoked when one of the [CircleAnnotation] in the cluster is clicked. The clicked [CircleAnnotation] will be passed as parameter.
 * @param init the lambda that will be applied to the remembered [CircleAnnotationGroupState].
 */
@Composable
@MapboxMapComposable
public inline fun CircleAnnotationGroup(
  annotations: List<CircleAnnotationOptions>,
  annotationConfig: AnnotationConfig? = null,
  noinline onClick: (CircleAnnotation) -> Boolean = { false },
  crossinline init: CircleAnnotationGroupState.() -> Unit
) {
  CircleAnnotationGroup(
    annotations = annotations,
    annotationConfig = annotationConfig,
    onClick = onClick,
    circleAnnotationGroupState = remember { CircleAnnotationGroupState() }.apply(init)
  )
}
// End of generated file.