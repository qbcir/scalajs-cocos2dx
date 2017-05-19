package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite
import org.cocos2dxjs.cocos2d.core.labelttf.ccLabelTTF

@js.native
@JSGlobal("cc.ControlStepper")
class ccControlStepper extends ccControl {
  def stopAutorepeat():Unit = js.native
  def create(minusSprite:ccSprite, plusSprite:ccSprite):js.Any = js.native
}

