package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
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
trait ts_ccControlSaturationBrightnessPicker extends ts_ccControl {
  def create(target:ccNode, pos:ccPoint):js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.ControlSaturationBrightnessPicker")
class ccControlSaturationBrightnessPicker(target:ccNode, pos:ccPoint) extends t_ccControlSaturationBrightnessPicker {
  var _state: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.ControlSaturationBrightnessPicker")
object ccControlSaturationBrightnessPicker extends ts_ccControlSaturationBrightnessPicker {
}


