package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.sprites.ccSprite

@js.native
trait t_ccControlColourPicker extends t_ccControl {
  val background: ccSprite = js.native
}

@js.native
@JSGlobal("cc.ControlColourPicker")
class ccControlColourPicker extends t_ccControlColourPicker {
  var _state: js.Any = js.native
}

@js.native
@JSGlobal("cc.ControlColourPicker")
object ccControlColourPicker extends js.Object {
}


