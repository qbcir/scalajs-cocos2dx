package org.cocos2dxjs.extensions.cocostudio.trigger

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget

@js.native
trait t_ccsobjectFactory extends js.Object {
}

@js.native
@JSGlobal("ccs.objectFactory")
class ccsobjectFactory extends t_ccsobjectFactory {
}

@js.native
@JSGlobal("ccs.objectFactory")
object ccsobjectFactory extends js.Object {
  def createObject(className:String):js.Any = js.native
  def registerType(t:ccsTInfo):Unit = js.native
  def createGUI(name:String):ccuiWidget = js.native
}

@js.native
trait t_ccsTInfo extends js.Object {
}

@js.native
@JSGlobal("ccs.TInfo")
class ccsTInfo extends t_ccsTInfo {
}

@js.native
@JSGlobal("ccs.TInfo")
object ccsTInfo extends js.Object {
}


