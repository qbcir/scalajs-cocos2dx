package org.cocos2dxjs.extensions.ccui.layouts

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.ccui.system.ccuiClass

@js.native
@JSGlobal("ccui.Margin")
class ccuiMargin extends ccuiClass {
  def setMargin(l:Float, t:Float, r:Float, b:Float):Unit = js.native
  def equals(target:ccuiMargin):Boolean = js.native
}

@js.native
@JSGlobal("ccui.LayoutParameter")
class ccuiLayoutParameter extends ccuiClass {
  def setMargin(margin:ccuiMargin):Unit = js.native
  def getMargin:ccuiMargin = js.native
  def getLayoutType:Float = js.native
  override def clone:ccuiLayoutParameter = js.native
  def _createCloneInstance:ccuiLayoutParameter = js.native
  def _copyProperties(model:ccuiLayoutParameter):Unit = js.native
  def create():Unit = js.native
}

@js.native
@JSGlobal("ccui.LinearLayoutParameter")
class ccuiLinearLayoutParameter extends ccuiLayoutParameter {
  def setGravity(gravity:Float):Unit = js.native
  def getGravity:Float = js.native
}

@js.native
@JSGlobal("ccui.RelativeLayoutParameter")
class ccuiRelativeLayoutParameter extends ccuiLayoutParameter {
  def setAlign(align:Float):Unit = js.native
  def getAlign:Float = js.native
  def setRelativeToWidgetName(name:String):Unit = js.native
  def getRelativeToWidgetName:String = js.native
  def setRelativeName(name:String):Unit = js.native
  def getRelativeName:String = js.native
}

