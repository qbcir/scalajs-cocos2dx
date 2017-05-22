package org.cocos2dxjs.extensions.ccui.layouts

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.ccui.system.t_ccuiClass
import org.cocos2dxjs.extensions.ccui.system.ts_ccuiClass

@js.native
trait t_ccuiMargin extends t_ccuiClass {
  var left: Float = js.native
  var top: Float = js.native
  var right: Float = js.native
  var bottom: Float = js.native
  def setMargin(l:Float, t:Float, r:Float, b:Float):Unit = js.native
  def equals(target:ccuiMargin):Boolean = js.native
}

@js.native
trait ts_ccuiMargin extends ts_ccuiClass {
}

@js.native
@JSGlobal("ccui.Margin")
class ccuiMargin(margin:Float | ccuiMargin, top:Float, right:Float, bottom:Float) extends t_ccuiMargin {
}

@js.native
@JSGlobal("ccui.Margin")
object ccuiMargin extends ts_ccuiMargin {
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
trait ts_ccuiLayoutParameter extends ts_ccuiClass {
  def create():Unit = js.native
}

@js.native
@JSGlobal("ccui.LayoutParameter")
class ccuiLayoutParameter extends t_ccuiLayoutParameter {
}

@js.native
@JSGlobal("ccui.LayoutParameter")
object ccuiLayoutParameter extends ts_ccuiLayoutParameter {
  val NONE: Float = js.native
  val LINEAR: Float = js.native
  val RELATIVE: Float = js.native
}

@js.native
trait t_ccuiLinearLayoutParameter extends t_ccuiLayoutParameter {
  def setGravity(gravity:Float):Unit = js.native
  def getGravity:Float = js.native
}

@js.native
trait ts_ccuiLinearLayoutParameter extends ts_ccuiLayoutParameter {
}

@js.native
@JSGlobal("ccui.LinearLayoutParameter")
class ccuiLinearLayoutParameter extends t_ccuiLinearLayoutParameter {
}

@js.native
@JSGlobal("ccui.LinearLayoutParameter")
object ccuiLinearLayoutParameter extends ts_ccuiLinearLayoutParameter {
  val NONE: Float = js.native
  val LEFT: Float = js.native
  val TOP: Float = js.native
  val RIGHT: Float = js.native
  val BOTTOM: Float = js.native
  val CENTER_VERTICAL: Float = js.native
  val CENTER_HORIZONTAL: Float = js.native
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
trait ts_ccuiRelativeLayoutParameter extends ts_ccuiLayoutParameter {
}

@js.native
@JSGlobal("ccui.RelativeLayoutParameter")
class ccuiRelativeLayoutParameter extends t_ccuiRelativeLayoutParameter {
}

@js.native
@JSGlobal("ccui.RelativeLayoutParameter")
object ccuiRelativeLayoutParameter extends ts_ccuiRelativeLayoutParameter {
  val NONE: Float = js.native
  val PARENT_TOP_LEFT: Float = js.native
  val PARENT_TOP_CENTER_HORIZONTAL: Float = js.native
  val PARENT_TOP_RIGHT: Float = js.native
  val PARENT_LEFT_CENTER_VERTICAL: Float = js.native
  val CENTER_IN_PARENT: Float = js.native
  val PARENT_RIGHT_CENTER_VERTICAL: Float = js.native
  val PARENT_LEFT_BOTTOM: Float = js.native
  val PARENT_BOTTOM_CENTER_HORIZONTAL: Float = js.native
  val PARENT_RIGHT_BOTTOM: Float = js.native
  val LOCATION_ABOVE_LEFTALIGN: Float = js.native
  val LOCATION_ABOVE_CENTER: Float = js.native
  val LOCATION_ABOVE_RIGHTALIGN: Float = js.native
  val LOCATION_LEFT_OF_TOPALIGN: Float = js.native
  val LOCATION_LEFT_OF_CENTER: Float = js.native
  val LOCATION_LEFT_OF_BOTTOMALIGN: Float = js.native
  val LOCATION_RIGHT_OF_TOPALIGN: Float = js.native
  val LOCATION_RIGHT_OF_CENTER: Float = js.native
  val LOCATION_RIGHT_OF_BOTTOMALIGN: Float = js.native
  val LOCATION_BELOW_LEFTALIGN: Float = js.native
  val LOCATION_BELOW_CENTER: Float = js.native
  val LOCATION_BELOW_RIGHTALIGN: Float = js.native
}


