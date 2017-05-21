package org.cocos2dxjs.extensions.cocostudio.trigger

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.cocostudio.armature.ccsArmature
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass

@js.native
trait t_ccstriggerManager extends js.Object {
}

@js.native
@JSGlobal("ccs.triggerManager")
class ccstriggerManager extends t_ccstriggerManager {
}

@js.native
@JSGlobal("ccs.triggerManager")
object ccstriggerManager extends js.Object {
  def parse(triggers:js.Array[js.Any]):Unit = js.native
  def get(event:Float):js.Array[js.Any] = js.native
  def getTriggerObj(id:Float):ccsTriggerObj = js.native
  def add(event:js.Any, triggerObj:js.Any):Unit = js.native
  def removeAll():Unit = js.native
  def remove(event:js.Any, Obj:js.Any):Boolean = js.native
  def removeTriggerObj(id:Float):Boolean = js.native
  def isEmpty:Boolean = js.native
  def addArmatureMovementCallBack(armature:ccsArmature, callFunc:js.Function, target:js.Object):Unit = js.native
  def removeArmatureMovementCallBack(armature:ccsArmature, target:js.Object, callFunc:js.Function):Unit = js.native
  def removeArmatureAllMovementCallBack(armature:ccsArmature):Unit = js.native
  def removeAllArmatureMovementCallBack():Unit = js.native
  def version:String = js.native
}

@js.native
trait t_ccsArmatureMovementDispatcher extends t_ccsClass {
  def animationEvent(armature:ccsArmature, movementType:Float, movementID:String):Unit = js.native
  def addAnimationEventCallBack(callFunc:js.Function, target:js.Object):Unit = js.native
  def removeAnimationEventCallBack(callFunc:js.Function, target:js.Object):Unit = js.native
}

@js.native
@JSGlobal("ccs.ArmatureMovementDispatcher")
class ccsArmatureMovementDispatcher extends t_ccsArmatureMovementDispatcher {
}

@js.native
@JSGlobal("ccs.ArmatureMovementDispatcher")
object ccsArmatureMovementDispatcher extends js.Object {
}

