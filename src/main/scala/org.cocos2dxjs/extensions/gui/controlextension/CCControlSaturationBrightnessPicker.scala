package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.sprites.{ccSprite, t_ccSprite}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}

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
  def create(target:t_ccNode, pos:t_ccPoint):js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.ControlSaturationBrightnessPicker")
class ccControlSaturationBrightnessPicker(target:t_ccNode, pos:t_ccPoint) extends t_ccControlSaturationBrightnessPicker {
  var _state: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.ControlSaturationBrightnessPicker")
object ccControlSaturationBrightnessPicker extends ts_ccControlSaturationBrightnessPicker {
}


