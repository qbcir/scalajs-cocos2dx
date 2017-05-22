package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite

@js.native
trait t_ccControlSlider extends t_ccControl {
  var value: Float = js.native
  var minValue: Float = js.native
  var maxValue: Float = js.native
  var minAllowedValue: Float = js.native
  var maxAllowedValue: Float = js.native
  val thumbSprite: Float = js.native
  val progressSprite: ccSprite = js.native
  val backgroundSprite: ccSprite = js.native
  def initWithSprites(backgroundSprite:ccSprite, progressSprite:ccSprite, thumbSprite:ccSprite):Unit = js.native
  def valueForLocation():Unit = js.native
}

@js.native
trait ts_ccControlSlider extends ts_ccControl {
}

@js.native
@JSGlobal("cc.ControlSlider")
class ccControlSlider extends t_ccControlSlider {
  var _state: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.ControlSlider")
object ccControlSlider extends ts_ccControlSlider {
}


