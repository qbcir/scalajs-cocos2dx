package org.cocos2dxjs.cocos2d.core.eventmanager

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget

@js.native
trait t_ccEvent extends t_ccClass {
  def getType:Float = js.native
  def stopPropagation():Unit = js.native
  def isStopped:Boolean = js.native
  def getCurrentTarget:ccNode = js.native
}

@js.native
trait ts_ccEvent extends ts_ccClass {
}

@js.native
@JSGlobal("cc.Event")
class ccEvent extends t_ccEvent {
}

@js.native
@JSGlobal("cc.Event")
object ccEvent extends ts_ccEvent {
  val TOUCH: Float = js.native
  val KEYBOARD: Float = js.native
  val ACCELERATION: Float = js.native
  val MOUSE: Float = js.native
  val FOCUS: Float = js.native
  val CUSTOM: Float = js.native
}

@js.native
trait t_ccEventCustom extends t_ccEvent {
  def setUserData(data:js.Dynamic):Unit = js.native
  def getUserData:js.Dynamic = js.native
  def getEventName:String = js.native
}

@js.native
trait ts_ccEventCustom extends ts_ccEvent {
}

@js.native
@JSGlobal("cc.EventCustom")
class ccEventCustom extends t_ccEventCustom {
}

@js.native
@JSGlobal("cc.EventCustom")
object ccEventCustom extends ts_ccEventCustom {
}

@js.native
trait t_ccEventMouse extends t_ccEvent {
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
trait ts_ccEventMouse extends ts_ccEvent {
}

@js.native
@JSGlobal("cc.EventMouse")
class ccEventMouse extends t_ccEventMouse {
}

@js.native
@JSGlobal("cc.EventMouse")
object ccEventMouse extends ts_ccEventMouse {
  val NONE: Float = js.native
  val DOWN: Float = js.native
  val UP: Float = js.native
  val MOVE: Float = js.native
  val SCROLL: Float = js.native
  val BUTTON_LEFT: Float = js.native
  val BUTTON_RIGHT: Float = js.native
  val BUTTON_MIDDLE: Float = js.native
  val BUTTON_4: Float = js.native
  val BUTTON_5: Float = js.native
  val BUTTON_6: Float = js.native
  val BUTTON_7: Float = js.native
  val BUTTON_8: Float = js.native
}

@js.native
trait t_ccEventTouch extends t_ccEvent {
  def getEventCode:Float = js.native
  def getTouches:js.Array[js.Any] = js.native
}

@js.native
trait ts_ccEventTouch extends ts_ccEvent {
}

@js.native
@JSGlobal("cc.EventTouch")
class ccEventTouch(widgetLoseFocus:ccuiWidget, widgetGetFocus:ccuiWidget) extends t_ccEventTouch {
}

@js.native
@JSGlobal("cc.EventTouch")
object ccEventTouch extends ts_ccEventTouch {
  val MAX_TOUCHES: Float = js.native
}

@js.native
trait t_ccEventFocus extends t_ccEvent {
}

@js.native
trait ts_ccEventFocus extends ts_ccEvent {
}

@js.native
@JSGlobal("cc.EventFocus")
class ccEventFocus extends t_ccEventFocus {
}

@js.native
@JSGlobal("cc.EventFocus")
object ccEventFocus extends ts_ccEventFocus {
}


