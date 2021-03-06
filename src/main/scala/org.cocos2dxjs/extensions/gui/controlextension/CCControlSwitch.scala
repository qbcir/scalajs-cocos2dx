package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.textures.{ccTexture2D, t_ccTexture2D}
import org.cocos2dxjs.cocos2d.core.sprites.{ccSprite, t_ccSprite}
import org.cocos2dxjs.cocos2d.core.labelttf.{ccLabelTTF, t_ccLabelTTF}
import org.cocos2dxjs.cocos2d.core.sprites.t_ccSprite
import org.cocos2dxjs.cocos2d.core.sprites.ts_ccSprite

@js.native
trait t_ccControlSwitch extends t_ccControl {
  def initWithMaskSprite():Unit = js.native
}

@js.native
trait ts_ccControlSwitch extends ts_ccControl {
}

@js.native
@JSGlobal("cc.ControlSwitch")
class ccControlSwitch() extends t_ccControlSwitch {
  var _switchSprite: js.Dynamic = js.native
  var _on: js.Dynamic = js.native
  var _state: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.ControlSwitch")
object ccControlSwitch extends ts_ccControlSwitch {
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
trait ts_ccControlSwitchSprite extends ts_ccSprite {
}

@js.native
@JSGlobal("cc.ControlSwitchSprite")
class ccControlSwitchSprite() extends t_ccControlSwitchSprite {
}

@js.native
@JSGlobal("cc.ControlSwitchSprite")
object ccControlSwitchSprite extends ts_ccControlSwitchSprite {
}


