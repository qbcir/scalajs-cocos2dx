package org.cocos2dxjs.cocos2d.core.eventmanager

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}

@js.native
trait t_cceventManager extends js.Object {
}

@js.native
trait ts_cceventManager extends js.Object {
  def pauseTarget(node:t_ccNode, recursive:Boolean):Unit = js.native
  def resumeTarget(node:t_ccNode, recursive:Boolean):Unit = js.native
  def addListener(listener:t_ccEventListener|types.DynObject, nodeOrPriority:Float|t_ccNode):ccEventListener = js.native
  def addCustomListener(eventName:String, callback:js.Function):ccEventListener = js.native
  def removeListener(listener:t_ccEventListener):Unit = js.native
  def removeListeners(listenerType:Float|t_ccNode, recursive:Boolean):Unit = js.native
  def removeCustomListeners(customEventName:String):Unit = js.native
  def removeAllListeners():Unit = js.native
  def setPriority(listener:t_ccEventListener, fixedPriority:Float):Unit = js.native
  def setEnabled(enabled:Boolean):Unit = js.native
  def isEnabled():Boolean = js.native
  def dispatchEvent(event:t_ccEvent):Unit = js.native
  def dispatchCustomEvent(eventName:String, optionalUserData:js.Dynamic):Unit = js.native
}

@js.native
@JSGlobal("cc.eventManager")
class cceventManager() extends t_cceventManager {
}

@js.native
@JSGlobal("cc.eventManager")
object cceventManager extends ts_cceventManager {
}


