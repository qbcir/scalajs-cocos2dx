package org.cocos2dxjs.extensions.cocostudio.trigger

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass
import org.cocos2dxjs.extensions.cocostudio.ts_ccsClass

@js.native
trait t_ccsBaseTriggerCondition extends t_ccsClass {
  def init:Boolean = js.native
  def detect:Boolean = js.native
  def serialize(jsonVal:js.Dynamic):Unit = js.native
  def removeAll():Unit = js.native
}

@js.native
trait ts_ccsBaseTriggerCondition extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.BaseTriggerCondition")
class ccsBaseTriggerCondition extends t_ccsBaseTriggerCondition {
}

@js.native
@JSGlobal("ccs.BaseTriggerCondition")
object ccsBaseTriggerCondition extends ts_ccsBaseTriggerCondition {
}

@js.native
trait t_ccsBaseTriggerAction extends t_ccsClass {
  def init:Boolean = js.native
  def done():Unit = js.native
  def serialize(jsonVal:js.Dynamic):Unit = js.native
  def removeAll():Unit = js.native
}

@js.native
trait ts_ccsBaseTriggerAction extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.BaseTriggerAction")
class ccsBaseTriggerAction extends t_ccsBaseTriggerAction {
}

@js.native
@JSGlobal("ccs.BaseTriggerAction")
object ccsBaseTriggerAction extends ts_ccsBaseTriggerAction {
}

@js.native
trait t_ccsTriggerObj extends t_ccsClass {
  def init:Boolean = js.native
  def detect:Boolean = js.native
  def done():Unit = js.native
  def removeAll():Unit = js.native
  def serialize(jsonVal:js.Dynamic):Unit = js.native
  def getId:Float = js.native
  def setEnable(enable:Boolean):Unit = js.native
  def getEvents:Null|js.Array[js.Any] = js.native
}

@js.native
trait ts_ccsTriggerObj extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.TriggerObj")
class ccsTriggerObj extends t_ccsTriggerObj {
}

@js.native
@JSGlobal("ccs.TriggerObj")
object ccsTriggerObj extends ts_ccsTriggerObj {
}


