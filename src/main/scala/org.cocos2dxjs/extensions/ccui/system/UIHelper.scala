package org.cocos2dxjs.extensions.ccui.system

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
trait t_ccuihelper extends js.Object {
}

@js.native
@JSGlobal("ccui.helper")
class ccuihelper extends t_ccuihelper {
}

@js.native
@JSGlobal("ccui.helper")
object ccuihelper extends js.Object {
  def seekWidgetByTag(root:ccuiWidget, tag:Float):ccuiWidget = js.native
  def seekWidgetByName(root:ccuiWidget, name:String):ccuiWidget = js.native
  def seekWidgetByRelativeName(root:ccuiWidget, name:String):ccuiWidget = js.native
  def seekActionWidgetByActionTag(root:ccuiWidget, tag:Float):ccuiWidget = js.native
  def doLayout(rootNode:ccNode):Unit = js.native
  def restrictCapInsetRect(capInsets:ccRect, textureSize:ccSize):Unit = js.native
}



