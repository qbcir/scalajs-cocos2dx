package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.textures.ccTexture2D
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite
import org.cocos2dxjs.cocos2d.core.labelttf.ccLabelTTF

@js.native
@JSGlobal("cc.ControlSwitch")
class ccControlSwitch extends ccControl {
  def initWithMaskSprite():Unit = js.native
}

@js.native
@JSGlobal("cc.ControlSwitchSprite")
class ccControlSwitchSprite extends ccSprite {
}

