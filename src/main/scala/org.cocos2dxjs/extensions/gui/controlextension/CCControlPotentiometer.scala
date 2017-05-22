package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.progresstimer.ccProgressTimer
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint

@js.native
trait t_ccControlPotentiometer extends t_ccControl {
  var value: Float = js.native
  var minValue: Float = js.native
  var maxValue: Float = js.native
  var progressTimer: ccProgressTimer = js.native
  var thumbSprite: ccSprite = js.native
  var prevLocation: ccPoint = js.native
  def initWithTrackSprite_ProgressTimer_ThumbSprite(trackSprite:ccSprite, progressTimer:ccProgressTimer, thumbSprite:ccSprite):Boolean = js.native
  def distanceBetweenPointAndPoint(point1:ccPoint, point2:ccPoint):Float = js.native
  def angleInDegreesBetweenLineFromPoint_toPoint_toLineFromPoint_toPoint(beginLineA:ccPoint, endLineA:ccPoint, beginLineB:ccPoint, endLineB:ccPoint):Float = js.native
}

@js.native
trait ts_ccControlPotentiometer extends ts_ccControl {
}

@js.native
@JSGlobal("cc.ControlPotentiometer")
class ccControlPotentiometer extends t_ccControlPotentiometer {
  var _value: js.Dynamic = js.native
  var _minimumValue: js.Dynamic = js.native
  var _maximumValue: js.Dynamic = js.native
  var _state: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.ControlPotentiometer")
object ccControlPotentiometer extends ts_ccControlPotentiometer {
}


