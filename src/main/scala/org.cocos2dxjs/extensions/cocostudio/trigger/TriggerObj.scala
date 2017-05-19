package org.cocos2dxjs.extensions.cocostudio.trigger

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.cocostudio.ccsClass

@js.native
@JSGlobal("ccs.BaseTriggerCondition")
class ccsBaseTriggerCondition extends ccsClass {
  def init:Boolean = js.native
  def detect:Boolean = js.native
  def serialize(jsonVal:js.Any):Unit = js.native
  def removeAll():Unit = js.native
}

@js.native
@JSGlobal("ccs.BaseTriggerAction")
class ccsBaseTriggerAction extends ccsClass {
  def init:Boolean = js.native
  def done():Unit = js.native
  def serialize(jsonVal:js.Any):Unit = js.native
  def removeAll():Unit = js.native
}

@js.native
@JSGlobal("ccs.TriggerObj")
class ccsTriggerObj extends ccsClass {
  def init:Boolean = js.native
  def detect:Boolean = js.native
  def done():Unit = js.native
  def removeAll():Unit = js.native
  def serialize(jsonVal:js.Any):Unit = js.native
  def getId:Float = js.native
  def setEnable(enable:Boolean):Unit = js.native
  def getEvents:js.Any = js.native
}

