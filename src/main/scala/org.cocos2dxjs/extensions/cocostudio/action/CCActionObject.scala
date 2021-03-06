package org.cocos2dxjs.extensions.cocostudio.action

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.actions.{ccCallFunc, t_ccCallFunc}
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass
import org.cocos2dxjs.extensions.cocostudio.ts_ccsClass

@js.native
trait t_ccsActionObject extends t_ccsClass {
  def setName(name:String):Unit = js.native
  def getName():String = js.native
  def setLoop(loop:Boolean):Unit = js.native
  def getLoop():Boolean = js.native
  def setUnitTime(time:Float):Unit = js.native
  def getUnitTime():Float = js.native
  def getCurrentTime():Float = js.native
  def setCurrentTime(time:Float):Unit = js.native
  def getTotalTime():Float = js.native
  def isPlaying():Boolean = js.native
  def initWithDictionary(dic:types.DynObject, root:types.DynObject):Unit = js.native
  def addActionNode(node:t_ccsActionNode):Unit = js.native
  def removeActionNode(node:t_ccsActionNode):Unit = js.native
  def play(fun:t_ccCallFunc):Unit = js.native
  def pause():Unit = js.native
  def stop():Unit = js.native
  def updateToFrameByTime():Unit = js.native
  def simulationActionUpdate(dt:Float):Unit = js.native
}

@js.native
trait ts_ccsActionObject extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.ActionObject")
class ccsActionObject() extends t_ccsActionObject {
}

@js.native
@JSGlobal("ccs.ActionObject")
object ccsActionObject extends ts_ccsActionObject {
}


