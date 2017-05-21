package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite

@js.native
trait t_ccControlSlider extends t_ccControl {
  def initWithSprites(backgroundSprite:ccSprite, progressSprite:ccSprite, thumbSprite:ccSprite):Unit = js.native
  def valueForLocation():Unit = js.native
}

@js.native
@JSGlobal("cc.ControlSlider")
class ccControlSlider extends t_ccControlSlider {
}

@js.native
@JSGlobal("cc.ControlSlider")
object ccControlSlider extends js.Object {
}

