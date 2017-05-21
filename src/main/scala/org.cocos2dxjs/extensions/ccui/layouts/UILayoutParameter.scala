package org.cocos2dxjs.extensions.ccui.layouts

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.ccui.system.t_ccuiClass

@js.native
trait t_ccuiMargin extends t_ccuiClass {
  def setMargin(l:Float, t:Float, r:Float, b:Float):Unit = js.native
  def equals(target:ccuiMargin):Boolean = js.native
}

@js.native
@JSGlobal("ccui.Margin")
class ccuiMargin(margin:Float, top:Float, right:Float, bottom:Float) extends t_ccuiMargin {
}

@js.native
@JSGlobal("ccui.Margin")
object ccuiMargin extends js.Object {
}

@js.native
trait t_ccuiLayoutParameter extends t_ccuiClass {
  def setMargin(margin:ccuiMargin):Unit = js.native
  def getMargin:ccuiMargin = js.native
  def getLayoutType:Float = js.native
  override def clone:ccuiLayoutParameter = js.native
  def _createCloneInstance:ccuiLayoutParameter = js.native
  def _copyProperties(model:ccuiLayoutParameter):Unit = js.native
}

@js.native
@JSGlobal("ccui.LayoutParameter")
class ccuiLayoutParameter extends t_ccuiLayoutParameter {
}

@js.native
@JSGlobal("ccui.LayoutParameter")
object ccuiLayoutParameter extends js.Object {
  def create():Unit = js.native
}

@js.native
trait t_ccuiLinearLayoutParameter extends t_ccuiLayoutParameter {
  def setGravity(gravity:Float):Unit = js.native
  def getGravity:Float = js.native
}

@js.native
@JSGlobal("ccui.LinearLayoutParameter")
class ccuiLinearLayoutParameter extends t_ccuiLinearLayoutParameter {
}

@js.native
@JSGlobal("ccui.LinearLayoutParameter")
object ccuiLinearLayoutParameter extends js.Object {
}

@js.native
trait t_ccuiRelativeLayoutParameter extends t_ccuiLayoutParameter {
  def setAlign(align:Float):Unit = js.native
  def getAlign:Float = js.native
  def setRelativeToWidgetName(name:String):Unit = js.native
  def getRelativeToWidgetName:String = js.native
  def setRelativeName(name:String):Unit = js.native
  def getRelativeName:String = js.native
}

@js.native
@JSGlobal("ccui.RelativeLayoutParameter")
class ccuiRelativeLayoutParameter extends t_ccuiRelativeLayoutParameter {
}

@js.native
@JSGlobal("ccui.RelativeLayoutParameter")
object ccuiRelativeLayoutParameter extends js.Object {
}

