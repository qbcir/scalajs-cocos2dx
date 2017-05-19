package org.cocos2dxjs.extensions.cocostudio.trigger

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget

@js.native
@JSGlobal("ccs.objectFactory")
class ccsobjectFactory extends js.Object {
  def createObject(className:String):js.Any = js.native
  def registerType(t:ccsTInfo):Unit = js.native
  def createGUI(name:String):ccuiWidget = js.native
}

@js.native
@JSGlobal("ccs.TInfo")
class ccsTInfo extends js.Object {
}

