package org.cocos2dxjs.extensions.cocostudio.action

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.actions.ccCallFunc

@js.native
trait t_ccsactionManager extends js.Object {
}

@js.native
@JSGlobal("ccs.actionManager")
class ccsactionManager extends t_ccsactionManager {
}

@js.native
@JSGlobal("ccs.actionManager")
object ccsactionManager extends js.Object {
  def initWithDictionary(jsonName:String, dic:js.Object, root:js.Object):Unit = js.native
  def getActionByName(jsonName:String, actionName:String):ccsActionObject = js.native
  def playActionByName(jsonName:String, actionName:String, fun:ccCallFunc):Unit = js.native
  def stopActionByName(jsonName:String, actionName:String):Unit = js.native
  def releaseActions():Unit = js.native
  def clear():Unit = js.native
}

