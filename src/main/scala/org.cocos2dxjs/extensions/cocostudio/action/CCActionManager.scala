package org.cocos2dxjs.extensions.cocostudio.action

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.actions.{ccCallFunc, t_ccCallFunc}

@js.native
trait t_ccsactionManager extends js.Object {
}

@js.native
trait ts_ccsactionManager extends js.Object {
  def initWithDictionary(jsonName:String, dic:types.DynObject, root:types.DynObject):Unit = js.native
  def getActionByName(jsonName:String, actionName:String):ccsActionObject = js.native
  def playActionByName(jsonName:String, actionName:String, fun:t_ccCallFunc):Unit = js.native
  def stopActionByName(jsonName:String, actionName:String):Unit = js.native
  def releaseActions():Unit = js.native
  def clear():Unit = js.native
}

@js.native
@JSGlobal("ccs.actionManager")
class ccsactionManager() extends t_ccsactionManager {
}

@js.native
@JSGlobal("ccs.actionManager")
object ccsactionManager extends ts_ccsactionManager {
}


