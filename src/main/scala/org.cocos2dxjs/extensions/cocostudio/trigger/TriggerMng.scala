package org.cocos2dxjs.extensions.cocostudio.trigger

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.armature.{ccsArmature, t_ccsArmature}
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass
import org.cocos2dxjs.extensions.cocostudio.ts_ccsClass

@js.native
trait t_ccstriggerManager extends js.Object {
}

@js.native
trait ts_ccstriggerManager extends js.Object {
  def parse(triggers:js.Array[js.Any]):Unit = js.native
  def get(event:Float):js.Array[js.Any] = js.native
  def getTriggerObj(id:Float):ccsTriggerObj = js.native
  def add(event:js.Dynamic, triggerObj:js.Dynamic):Unit = js.native
  def removeAll():Unit = js.native
  def remove(event:js.Dynamic, Obj:js.Dynamic):Boolean = js.native
  def removeTriggerObj(id:Float):Boolean = js.native
  def isEmpty:Boolean = js.native
  def addArmatureMovementCallBack(armature:t_ccsArmature, callFunc:js.Function, target:types.DynObject):Unit = js.native
  def removeArmatureMovementCallBack(armature:t_ccsArmature, target:types.DynObject, callFunc:js.Function):Unit = js.native
  def removeArmatureAllMovementCallBack(armature:t_ccsArmature):Unit = js.native
  def removeAllArmatureMovementCallBack():Unit = js.native
  def version:String = js.native
}

@js.native
@JSGlobal("ccs.triggerManager")
class ccstriggerManager extends t_ccstriggerManager {
}

@js.native
@JSGlobal("ccs.triggerManager")
object ccstriggerManager extends ts_ccstriggerManager {
}

@js.native
trait t_ccsArmatureMovementDispatcher extends t_ccsClass {
  def animationEvent(armature:t_ccsArmature, movementType:Float, movementID:String):Unit = js.native
  def addAnimationEventCallBack(callFunc:js.Function, target:Null|types.DynObject):Unit = js.native
  def removeAnimationEventCallBack(callFunc:js.Function, target:Null|types.DynObject):Unit = js.native
}

@js.native
trait ts_ccsArmatureMovementDispatcher extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.ArmatureMovementDispatcher")
class ccsArmatureMovementDispatcher extends t_ccsArmatureMovementDispatcher {
}

@js.native
@JSGlobal("ccs.ArmatureMovementDispatcher")
object ccsArmatureMovementDispatcher extends ts_ccsArmatureMovementDispatcher {
}


