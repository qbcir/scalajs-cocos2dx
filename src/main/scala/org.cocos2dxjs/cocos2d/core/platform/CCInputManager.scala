package org.cocos2dxjs.cocos2d.core.platform

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.eventmanager.ccTouch
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.eventmanager.ccEventMouse

@js.native
trait t_ccinputManager extends js.Object {
}

@js.native
@JSGlobal("cc.inputManager")
class ccinputManager extends t_ccinputManager {
}

@js.native
@JSGlobal("cc.inputManager")
object ccinputManager extends js.Object {
  def handleTouchesBegin(touches:js.Array[js.Any]):Unit = js.native
  def handleTouchesMove(touches:js.Array[js.Any]):Unit = js.native
  def handleTouchesEnd(touches:js.Array[js.Any]):Unit = js.native
  def handleTouchesCancel(touches:js.Array[js.Any]):Unit = js.native
  def getSetOfTouchesEndOrCancel(touches:js.Array[js.Any]):js.Array[js.Any] = js.native
  def getHTMLElementPosition(element:js.Any):js.Object = js.native
  def getPreTouch(touch:ccTouch):ccTouch = js.native
  def setPreTouch(touch:ccTouch):Unit = js.native
  def getTouchByXY(tx:Float, ty:Float, pos:ccPoint):ccTouch = js.native
  def getMouseEvent(location:ccPoint, pos:ccPoint, eventType:Float):ccEventMouse = js.native
  def getPointByEvent(event:js.Any, pos:ccPoint):ccPoint = js.native
  def getTouchesByEvent(event:js.Any, pos:ccPoint):js.Array[js.Any] = js.native
  def registerSystemEvent(element:js.Any):Unit = js.native
  def update(dt:Float):Unit = js.native
}



