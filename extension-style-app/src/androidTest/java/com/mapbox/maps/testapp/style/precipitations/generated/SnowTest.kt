// This file is generated.

package com.mapbox.maps.testapp.style.precipitations.generated

import android.graphics.Color
import androidx.test.annotation.UiThreadTest
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mapbox.maps.MapboxExperimental
import com.mapbox.maps.extension.style.expressions.dsl.generated.literal
import com.mapbox.maps.extension.style.expressions.dsl.generated.rgba
import com.mapbox.maps.extension.style.precipitations.generated.snow
import com.mapbox.maps.extension.style.types.transitionOptions
import com.mapbox.maps.testapp.style.BaseStyleTest
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Basic smoke tests for Snow
 */
@OptIn(MapboxExperimental::class)
@RunWith(AndroidJUnit4::class)
class SnowTest : BaseStyleTest() {
  // Add Expression Test
  @Test
  @UiThreadTest
  fun centerThinningAsExpressionTest() {
    val expression = literal(1.0)

    val snow = snow {
      centerThinning(expression)
    }
    setupSnow(snow)
    assertEquals(1.0, snow.centerThinningAsExpression?.contents as Double, 1E-5)
  }

  @Test
  @UiThreadTest
  fun centerThinningTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      centerThinningTransition(transition)
    }
    setupSnow(snow)
    assertEquals(transition, snow.centerThinningTransition)
  }

  @Test
  @UiThreadTest
  fun centerThinningTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      centerThinningTransition {
        duration(100)
        delay(200)
      }
    }
    setupSnow(snow)
    assertEquals(transition, snow.centerThinningTransition)
  }

  @Test
  @UiThreadTest
  fun colorAsColorIntTest() {
    val snow = snow {
      color(Color.CYAN)
    }
    setupSnow(snow)
    assertEquals(Color.CYAN, snow.colorAsColorInt)
  }
  // Add Expression Test
  @Test
  @UiThreadTest
  fun colorAsExpressionTest() {
    val expression = rgba {
      literal(0.0)
      literal(0.0)
      literal(0.0)
      literal(1.0)
    }

    val snow = snow {
      color(expression)
    }
    setupSnow(snow)
    assertEquals(expression.toString(), snow.colorAsExpression.toString())
  }

  @Test
  @UiThreadTest
  fun colorTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      colorTransition(transition)
    }
    setupSnow(snow)
    assertEquals(transition, snow.colorTransition)
  }

  @Test
  @UiThreadTest
  fun colorTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      colorTransition {
        duration(100)
        delay(200)
      }
    }
    setupSnow(snow)
    assertEquals(transition, snow.colorTransition)
  }
  // Add Expression Test
  @Test
  @UiThreadTest
  fun densityAsExpressionTest() {
    val expression = literal(1.0)

    val snow = snow {
      density(expression)
    }
    setupSnow(snow)
    assertEquals(1.0, snow.densityAsExpression?.contents as Double, 1E-5)
  }

  @Test
  @UiThreadTest
  fun densityTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      densityTransition(transition)
    }
    setupSnow(snow)
    assertEquals(transition, snow.densityTransition)
  }

  @Test
  @UiThreadTest
  fun densityTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      densityTransition {
        duration(100)
        delay(200)
      }
    }
    setupSnow(snow)
    assertEquals(transition, snow.densityTransition)
  }
  // Add Expression Test
  @Test
  @UiThreadTest
  fun directionAsExpressionTest() {
    val expression = literal(listOf(0.0, 1.0))

    val snow = snow {
      direction(expression)
    }
    setupSnow(snow)
    assertEquals(expression.toString(), snow.directionAsExpression.toString())
  }

  @Test
  @UiThreadTest
  fun directionTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      directionTransition(transition)
    }
    setupSnow(snow)
    assertEquals(transition, snow.directionTransition)
  }

  @Test
  @UiThreadTest
  fun directionTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      directionTransition {
        duration(100)
        delay(200)
      }
    }
    setupSnow(snow)
    assertEquals(transition, snow.directionTransition)
  }
  // Add Expression Test
  @Test
  @UiThreadTest
  fun flakeSizeAsExpressionTest() {
    val expression = literal(1.0)

    val snow = snow {
      flakeSize(expression)
    }
    setupSnow(snow)
    assertEquals(1.0, snow.flakeSizeAsExpression?.contents as Double, 1E-5)
  }

  @Test
  @UiThreadTest
  fun flakeSizeTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      flakeSizeTransition(transition)
    }
    setupSnow(snow)
    assertEquals(transition, snow.flakeSizeTransition)
  }

  @Test
  @UiThreadTest
  fun flakeSizeTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      flakeSizeTransition {
        duration(100)
        delay(200)
      }
    }
    setupSnow(snow)
    assertEquals(transition, snow.flakeSizeTransition)
  }
  // Add Expression Test
  @Test
  @UiThreadTest
  fun intensityAsExpressionTest() {
    val expression = literal(1.0)

    val snow = snow {
      intensity(expression)
    }
    setupSnow(snow)
    assertEquals(1.0, snow.intensityAsExpression?.contents as Double, 1E-5)
  }

  @Test
  @UiThreadTest
  fun intensityTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      intensityTransition(transition)
    }
    setupSnow(snow)
    assertEquals(transition, snow.intensityTransition)
  }

  @Test
  @UiThreadTest
  fun intensityTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      intensityTransition {
        duration(100)
        delay(200)
      }
    }
    setupSnow(snow)
    assertEquals(transition, snow.intensityTransition)
  }
  // Add Expression Test
  @Test
  @UiThreadTest
  fun opacityAsExpressionTest() {
    val expression = literal(1.0)

    val snow = snow {
      opacity(expression)
    }
    setupSnow(snow)
    assertEquals(1.0, snow.opacityAsExpression?.contents as Double, 1E-5)
  }

  @Test
  @UiThreadTest
  fun opacityTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      opacityTransition(transition)
    }
    setupSnow(snow)
    assertEquals(transition, snow.opacityTransition)
  }

  @Test
  @UiThreadTest
  fun opacityTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      opacityTransition {
        duration(100)
        delay(200)
      }
    }
    setupSnow(snow)
    assertEquals(transition, snow.opacityTransition)
  }
  // Add Expression Test
  @Test
  @UiThreadTest
  fun vignetteAsExpressionTest() {
    val expression = literal(1.0)

    val snow = snow {
      vignette(expression)
    }
    setupSnow(snow)
    assertEquals(1.0, snow.vignetteAsExpression?.contents as Double, 1E-5)
  }

  @Test
  @UiThreadTest
  fun vignetteTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      vignetteTransition(transition)
    }
    setupSnow(snow)
    assertEquals(transition, snow.vignetteTransition)
  }

  @Test
  @UiThreadTest
  fun vignetteTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      vignetteTransition {
        duration(100)
        delay(200)
      }
    }
    setupSnow(snow)
    assertEquals(transition, snow.vignetteTransition)
  }

  @Test
  @UiThreadTest
  fun vignetteColorAsColorIntTest() {
    val snow = snow {
      vignetteColor(Color.CYAN)
    }
    setupSnow(snow)
    assertEquals(Color.CYAN, snow.vignetteColorAsColorInt)
  }
  // Add Expression Test
  @Test
  @UiThreadTest
  fun vignetteColorAsExpressionTest() {
    val expression = rgba {
      literal(0.0)
      literal(0.0)
      literal(0.0)
      literal(1.0)
    }

    val snow = snow {
      vignetteColor(expression)
    }
    setupSnow(snow)
    assertEquals(expression.toString(), snow.vignetteColorAsExpression.toString())
  }

  @Test
  @UiThreadTest
  fun vignetteColorTransitionTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      vignetteColorTransition(transition)
    }
    setupSnow(snow)
    assertEquals(transition, snow.vignetteColorTransition)
  }

  @Test
  @UiThreadTest
  fun vignetteColorTransitionSetDslTest() {
    val transition = transitionOptions {
      duration(100)
      delay(200)
    }
    val snow = snow {
      vignetteColorTransition {
        duration(100)
        delay(200)
      }
    }
    setupSnow(snow)
    assertEquals(transition, snow.vignetteColorTransition)
  }
  // Add Expression Test
  @Test
  @UiThreadTest
  fun colorUseThemeAsExpressionTest() {
    val expression = literal("default")

    val snow = snow {
      colorUseTheme(expression)
    }
    setupSnow(snow)
    assertEquals(expression.toString(), snow.colorUseThemeAsExpression.toString())
  }
  // Add Expression Test
  @Test
  @UiThreadTest
  fun vignetteColorUseThemeAsExpressionTest() {
    val expression = literal("default")

    val snow = snow {
      vignetteColorUseTheme(expression)
    }
    setupSnow(snow)
    assertEquals(expression.toString(), snow.vignetteColorUseThemeAsExpression.toString())
  }
}

// End of generated file.