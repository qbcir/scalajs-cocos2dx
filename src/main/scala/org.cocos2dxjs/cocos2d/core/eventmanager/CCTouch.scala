package org.cocos2dxjs.cocos2d.core.eventmanager

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass

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
trait ts_ccTouch extends ts_ccClass {
}

@js.native
@JSGlobal("cc.Touch")
class ccTouch(x:Float, y:Float, id:Float) extends t_ccTouch {
}

@js.native
@JSGlobal("cc.Touch")
object ccTouch extends ts_ccTouch {
}


