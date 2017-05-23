package org.cocos2dxjs.extensions.cocostudio.trigger

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.ccui.baseclasses.{ccuiWidget, t_ccuiWidget}

@js.native
trait t_ccsobjectFactory extends js.Object {
}

@js.native
trait ts_ccsobjectFactory extends js.Object {
  def createObject(className:String):js.Dynamic = js.native
  def registerType(t:t_ccsTInfo):Unit = js.native
  def createGUI(name:String):Null|ccuiWidget = js.native
}

@js.native
@JSGlobal("ccs.objectFactory")
class ccsobjectFactory extends t_ccsobjectFactory {
}

@js.native
@JSGlobal("ccs.objectFactory")
object ccsobjectFactory extends ts_ccsobjectFactory {
}

@js.native
trait t_ccsTInfo extends js.Object {
}

@js.native
trait ts_ccsTInfo extends js.Object {
}

@js.native
@JSGlobal("ccs.TInfo")
class ccsTInfo extends t_ccsTInfo {
}

@js.native
@JSGlobal("ccs.TInfo")
object ccsTInfo extends ts_ccsTInfo {
}


