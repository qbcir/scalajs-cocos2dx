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
  var _switchSprite: js.Any = js.native
  var _on: js.Any = js.native
  var _state: js.Any = js.native
}

@js.native
@JSGlobal("cc.ControlSwitch")
object ccControlSwitch extends js.Object {
}

@js.native
trait t_ccControlSwitchSprite extends t_ccSprite {
  var sliderX: Float = js.native
  var onPos: ccPoint = js.native
  var offPos: ccPoint = js.native
  var maskTexture: ccTexture2D = js.native
  var texturePos: ccPoint = js.native
  var maskPos: ccPoint = js.native
  var onSprite: ccSprite = js.native
  var offSprite: ccSprite = js.native
  var thumbSprite: ccSprite = js.native
  var onLabel: ccLabelTTF = js.native
  var offLabel: ccLabelTTF = js.native
  val onSideWidth: Float = js.native
  val offSideWidth: Float = js.native
}

@js.native
@JSGlobal("cc.ControlSwitchSprite")
class ccControlSwitchSprite extends t_ccControlSwitchSprite {
}

@js.native
@JSGlobal("cc.ControlSwitchSprite")
object ccControlSwitchSprite extends js.Object {
}


