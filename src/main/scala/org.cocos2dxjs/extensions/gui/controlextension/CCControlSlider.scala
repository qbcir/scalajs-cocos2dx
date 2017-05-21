package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._

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
@JSGlobal("cc.ControlSlider")
class ccControlSlider extends t_ccControlSlider {
  var _state: js.Any = js.native
}

@js.native
@JSGlobal("cc.ControlSlider")
object ccControlSlider extends js.Object {
}


