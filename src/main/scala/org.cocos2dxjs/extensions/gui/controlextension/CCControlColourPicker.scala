package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.sprites.{ccSprite, t_ccSprite}

@js.native
trait t_ccControlColourPicker extends t_ccControl {
  val background: ccSprite = js.native
}

@js.native
trait ts_ccControlColourPicker extends ts_ccControl {
}

@js.native
@JSGlobal("cc.ControlColourPicker")
class ccControlColourPicker() extends t_ccControlColourPicker {
  var _state: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.ControlColourPicker")
object ccControlColourPicker extends ts_ccControlColourPicker {
}


