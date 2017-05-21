package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.textures.ccTexture2D
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite
import org.cocos2dxjs.cocos2d.core.labelttf.ccLabelTTF
import org.cocos2dxjs.cocos2d.core.sprites.t_ccSprite

@js.native
trait t_ccControlSwitch extends t_ccControl {
  def initWithMaskSprite():Unit = js.native
}

@js.native
@JSGlobal("cc.ControlSwitch")
class ccControlSwitch extends t_ccControlSwitch {
}

@js.native
@JSGlobal("cc.ControlSwitch")
object ccControlSwitch extends js.Object {
}

@js.native
trait t_ccControlSwitchSprite extends t_ccSprite {
}

@js.native
@JSGlobal("cc.ControlSwitchSprite")
class ccControlSwitchSprite extends t_ccControlSwitchSprite {
}

@js.native
@JSGlobal("cc.ControlSwitchSprite")
object ccControlSwitchSprite extends js.Object {
}

