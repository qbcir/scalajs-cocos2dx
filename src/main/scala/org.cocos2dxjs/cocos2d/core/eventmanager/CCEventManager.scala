package org.cocos2dxjs.cocos2d.core.eventmanager

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode

@js.native
trait t_cceventManager extends js.Object {
}

@js.native
trait ts_cceventManager extends js.Object {
  def pauseTarget(node:ccNode, recursive:Boolean):Unit = js.native
  def resumeTarget(node:ccNode, recursive:Boolean):Unit = js.native
  def addListener(listener:ccEventListener | types.DynObject, nodeOrPriority:ccNode | Float):ccEventListener = js.native
  def addCustomListener(eventName:String, callback:js.Function):ccEventListener = js.native
  def removeListener(listener:ccEventListener):Unit = js.native
  def removeListeners(listenerType:Float | ccNode, recursive:Boolean):Unit = js.native
  def removeCustomListeners(customEventName:String):Unit = js.native
  def removeAllListeners():Unit = js.native
  def setPriority(listener:ccEventListener, fixedPriority:Float):Unit = js.native
  def setEnabled(enabled:Boolean):Unit = js.native
  def isEnabled:Boolean = js.native
  def dispatchEvent(event:ccEvent):Unit = js.native
  def dispatchCustomEvent(eventName:String, optionalUserData:js.Dynamic):Unit = js.native
}

@js.native
@JSGlobal("cc.eventManager")
class cceventManager extends t_cceventManager {
}

@js.native
@JSGlobal("cc.eventManager")
object cceventManager extends ts_cceventManager {
}


