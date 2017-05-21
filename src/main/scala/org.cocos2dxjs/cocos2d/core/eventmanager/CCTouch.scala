package org.cocos2dxjs.cocos2d.core.eventmanager

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass

@js.native
trait t_ccTouch extends t_ccClass {
  def getLocation:ccPoint = js.native
  def getLocationX:Float = js.native
  def getLocationY:Float = js.native
  def getPreviousLocation:ccPoint = js.native
  def getStartLocation:ccPoint = js.native
  def getDelta:ccPoint = js.native
  def getLocationInView:ccPoint = js.native
  def getPreviousLocationInView:ccPoint = js.native
  def getStartLocationInView:ccPoint = js.native
  def getID:Float = js.native
  def setTouchInfo(id:Float, x:Float, y:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.Touch")
class ccTouch(x:Float, y:Float, id:Float) extends t_ccTouch {
}

@js.native
@JSGlobal("cc.Touch")
object ccTouch extends js.Object {
}


