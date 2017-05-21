package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.sprites.ccSprite
import org.cocos2dxjs.cocos2d.core.labelttf.ccLabelTTF

@js.native
trait t_ccControlStepper extends t_ccControl {
  var wraps: Boolean = js.native
  var value: Float = js.native
  var minValue: Float = js.native
  var maxValue: Float = js.native
  var stepValue: Float = js.native
  val continuous: Boolean = js.native
  var minusSprite: ccSprite = js.native
  var plusSprite: ccSprite = js.native
  var minusLabel: ccLabelTTF = js.native
  var plusSLabel: ccLabelTTF = js.native
  def stopAutorepeat():Unit = js.native
}

@js.native
@JSGlobal("cc.ControlStepper")
class ccControlStepper extends t_ccControlStepper {
  var _state: js.Any = js.native
}

@js.native
@JSGlobal("cc.ControlStepper")
object ccControlStepper extends js.Object {
  def create(minusSprite:ccSprite, plusSprite:ccSprite):js.Any = js.native
}


