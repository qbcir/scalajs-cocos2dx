package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite
import org.cocos2dxjs.cocos2d.core.labelttf.ccLabelTTF

@js.native
trait t_ccControlStepper extends t_ccControl {
  def stopAutorepeat():Unit = js.native
}

@js.native
@JSGlobal("cc.ControlStepper")
class ccControlStepper extends t_ccControlStepper {
}

@js.native
@JSGlobal("cc.ControlStepper")
object ccControlStepper extends js.Object {
  def create(minusSprite:ccSprite, plusSprite:ccSprite):js.Any = js.native
}

