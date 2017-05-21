package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.sprites.ccSprite
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode

@js.native
trait t_ccControlSaturationBrightnessPicker extends t_ccControl {
  val saturation: Float = js.native
  val brightness: Float = js.native
  val background: ccSprite = js.native
  val overlay: ccSprite = js.native
  val shadow: ccSprite = js.native
  val slider: ccSprite = js.native
  val startPos: ccPoint = js.native
}

@js.native
@JSGlobal("cc.ControlSaturationBrightnessPicker")
class ccControlSaturationBrightnessPicker(target:ccNode, pos:ccPoint) extends t_ccControlSaturationBrightnessPicker {
  var _state: js.Any = js.native
}

@js.native
@JSGlobal("cc.ControlSaturationBrightnessPicker")
object ccControlSaturationBrightnessPicker extends js.Object {
  def create(target:ccNode, pos:ccPoint):js.Any = js.native
}


