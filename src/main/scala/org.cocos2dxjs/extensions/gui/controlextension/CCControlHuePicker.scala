package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.sprites.{ccSprite, t_ccSprite}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}

@js.native
trait t_ccControlHuePicker extends t_ccControl {
  var hue: Float = js.native
  var huePercent: Float = js.native
  val background: ccSprite = js.native
  val slider: ccSprite = js.native
  val startPos: ccPoint = js.native
}

@js.native
trait ts_ccControlHuePicker extends ts_ccControl {
}

@js.native
@JSGlobal("cc.ControlHuePicker")
class ccControlHuePicker(target:t_ccNode, pos:t_ccPoint) extends t_ccControlHuePicker {
  var _state: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.ControlHuePicker")
object ccControlHuePicker extends ts_ccControlHuePicker {
}


