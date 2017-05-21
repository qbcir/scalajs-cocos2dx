package org.cocos2dxjs.extensions.cocostudio.trigger

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass

@js.native
trait t_ccsBaseTriggerCondition extends t_ccsClass {
  def init:Boolean = js.native
  def detect:Boolean = js.native
  def serialize(jsonVal:js.Any):Unit = js.native
  def removeAll():Unit = js.native
}

@js.native
@JSGlobal("ccs.BaseTriggerCondition")
class ccsBaseTriggerCondition extends t_ccsBaseTriggerCondition {
}

@js.native
@JSGlobal("ccs.BaseTriggerCondition")
object ccsBaseTriggerCondition extends js.Object {
}

@js.native
trait t_ccsBaseTriggerAction extends t_ccsClass {
  def init:Boolean = js.native
  def done():Unit = js.native
  def serialize(jsonVal:js.Any):Unit = js.native
  def removeAll():Unit = js.native
}

@js.native
@JSGlobal("ccs.BaseTriggerAction")
class ccsBaseTriggerAction extends t_ccsBaseTriggerAction {
}

@js.native
@JSGlobal("ccs.BaseTriggerAction")
object ccsBaseTriggerAction extends js.Object {
}

@js.native
trait t_ccsTriggerObj extends t_ccsClass {
  def init:Boolean = js.native
  def detect:Boolean = js.native
  def done():Unit = js.native
  def removeAll():Unit = js.native
  def serialize(jsonVal:js.Any):Unit = js.native
  def getId:Float = js.native
  def setEnable(enable:Boolean):Unit = js.native
  def getEvents:js.Any = js.native
}

@js.native
@JSGlobal("ccs.TriggerObj")
class ccsTriggerObj extends t_ccsTriggerObj {
}

@js.native
@JSGlobal("ccs.TriggerObj")
object ccsTriggerObj extends js.Object {
}



