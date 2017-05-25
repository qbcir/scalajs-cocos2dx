package org.cocos2dxjs.cocos2d.core.eventmanager

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass

@js.native
trait t_ccEventListener extends t_ccClass {
  def _setPaused(paused:Boolean):Unit = js.native
  def _isPaused():Boolean = js.native
  def _setRegistered(registered:Boolean):Unit = js.native
  def _isRegistered():Boolean = js.native
  def _getType():Float = js.native
  def _getListenerID():String = js.native
  def _setFixedPriority(fixedPriority:Float):Unit = js.native
  def _getFixedPriority():Float = js.native
  def _setSceneGraphPriority(node:t_ccNode):Unit = js.native
  def _getSceneGraphPriority():ccNode = js.native
  def checkAvailable():Boolean = js.native
  override def clone():ccEventListener = js.native
  def setEnabled(enabled:Boolean):Unit = js.native
  def isEnabled():Boolean = js.native
  def retain():Unit = js.native
  def release():Unit = js.native
}

@js.native
trait ts_ccEventListener extends ts_ccClass {
  def create(argObj:types.DynObject):ccEventListener = js.native
}

@js.native
@JSGlobal("cc.EventListener")
class ccEventListener(_type:Float, listenerID:String, callback:js.Function) extends t_ccEventListener {
}

@js.native
@JSGlobal("cc.EventListener")
object ccEventListener extends ts_ccEventListener {
  val UNKNOWN: Float = js.native
  val TOUCH_ONE_BY_ONE: Float = js.native
  val TOUCH_ALL_AT_ONCE: Float = js.native
  val KEYBOARD: Float = js.native
  val MOUSE: Float = js.native
  val ACCELERATION: Float = js.native
  val FOCUS: Float = js.native
  val CUSTOM: Float = js.native
}


