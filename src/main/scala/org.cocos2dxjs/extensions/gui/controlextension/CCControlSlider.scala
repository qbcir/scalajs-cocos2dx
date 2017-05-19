package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite

@js.native
@JSGlobal("cc.ControlSlider")
class ccControlSlider extends ccControl {
  def initWithSprites(backgroundSprite:ccSprite, progressSprite:ccSprite, thumbSprite:ccSprite):Unit = js.native
  def valueForLocation():Unit = js.native
}

