package org.cocos2dxjs.cocos2d.core.eventmanager

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.ccClass
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint

@js.native
@JSGlobal("cc.Event")
class ccEvent extends ccClass {
  def getType:Float = js.native
  def stopPropagation():Unit = js.native
  def isStopped:Boolean = js.native
  def getCurrentTarget:ccNode = js.native
}

@js.native
@JSGlobal("cc.EventCustom")
class ccEventCustom extends ccEvent {
  def setUserData(data:js.Any):Unit = js.native
  def getUserData:js.Any = js.native
  def getEventName:String = js.native
}

@js.native
@JSGlobal("cc.EventMouse")
class ccEventMouse extends ccEvent {
  def setScrollData(scrollX:Float, scrollY:Float):Unit = js.native
  def getScrollX:Float = js.native
  def getScrollY:Float = js.native
  def setLocation(x:Float, y:Float):Unit = js.native
  def getLocation:ccPoint = js.native
  def getLocationInView:ccPoint = js.native
  def getDelta:ccPoint = js.native
  def getDeltaX:Float = js.native
  def getDeltaY:Float = js.native
  def setButton(button:Float):Unit = js.native
  def getButton:Float = js.native
  def getLocationX:Float = js.native
  def getLocationY:Float = js.native
}

@js.native
@JSGlobal("cc.EventTouch")
class ccEventTouch extends ccEvent {
  def getEventCode:Float = js.native
  def getTouches:js.Array[js.Any] = js.native
}

@js.native
@JSGlobal("cc.EventFocus")
class ccEventFocus extends ccEvent {
}

