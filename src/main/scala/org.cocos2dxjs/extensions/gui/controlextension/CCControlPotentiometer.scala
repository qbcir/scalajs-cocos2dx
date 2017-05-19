package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.progresstimer.ccProgressTimer
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint

@js.native
@JSGlobal("cc.ControlPotentiometer")
class ccControlPotentiometer extends ccControl {
  def initWithTrackSprite_ProgressTimer_ThumbSprite(trackSprite:ccSprite, progressTimer:ccProgressTimer, thumbSprite:ccSprite):Boolean = js.native
  def distanceBetweenPointAndPoint(point1:ccPoint, point2:ccPoint):Float = js.native
  def angleInDegreesBetweenLineFromPoint_toPoint_toLineFromPoint_toPoint(beginLineA:ccPoint, endLineA:ccPoint, beginLineB:ccPoint, endLineB:ccPoint):Float = js.native
}
