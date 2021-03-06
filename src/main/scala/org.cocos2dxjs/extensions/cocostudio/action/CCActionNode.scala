package org.cocos2dxjs.extensions.cocostudio.action

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.actions.{ccCallFunc, t_ccCallFunc}
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass
import org.cocos2dxjs.extensions.cocostudio.ts_ccsClass

@js.native
trait t_ccsActionNode extends t_ccsClass {
  def initWithDictionary(dic:types.DynObject, root:types.DynObject):Unit = js.native
  def setUnitTime(time:Float):Unit = js.native
  def getUnitTime():Float = js.native
  def setActionTag(tag:Float):Unit = js.native
  def getActionTag():Float = js.native
  def setObject(node:types.DynObject):Unit = js.native
  def getObject():js.Dynamic = js.native
  def getActionNode():ccNode = js.native
  def insertFrame(index:Float, frame:t_ccsActionFrame):Unit = js.native
  def addFrame(frame:t_ccsActionFrame):Unit = js.native
  def deleteFrame(frame:t_ccsActionFrame):Unit = js.native
  def clearAllFrame():Unit = js.native
  def playAction(fun:t_ccCallFunc):Unit = js.native
  def stopAction():Unit = js.native
  def getFirstFrameIndex():Float = js.native
  def getLastFrameIndex():Float = js.native
  def updateActionToTimeLine(time:Float):Boolean = js.native
  def isActionDoneOnce():Boolean = js.native
}

@js.native
trait ts_ccsActionNode extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.ActionNode")
class ccsActionNode() extends t_ccsActionNode {
}

@js.native
@JSGlobal("ccs.ActionNode")
object ccsActionNode extends ts_ccsActionNode {
}


