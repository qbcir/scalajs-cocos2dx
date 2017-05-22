package org.cocos2dxjs.extensions.ccui.system

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.ccui.baseclasses.{ccuiWidget, t_ccuiWidget}
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}

@js.native
trait t_ccuihelper extends js.Object {
}

@js.native
trait ts_ccuihelper extends js.Object {
  def seekWidgetByTag(root:t_ccuiWidget, tag:Float):ccuiWidget = js.native
  def seekWidgetByName(root:t_ccuiWidget, name:String):ccuiWidget = js.native
  def seekWidgetByRelativeName(root:t_ccuiWidget, name:String):ccuiWidget = js.native
  def seekActionWidgetByActionTag(root:t_ccuiWidget, tag:Float):ccuiWidget = js.native
  def doLayout(rootNode:t_ccNode):Unit = js.native
  def restrictCapInsetRect(capInsets:t_ccRect, textureSize:t_ccSize):Unit = js.native
}

@js.native
@JSGlobal("ccui.helper")
class ccuihelper extends t_ccuihelper {
}

@js.native
@JSGlobal("ccui.helper")
object ccuihelper extends ts_ccuihelper {
}


