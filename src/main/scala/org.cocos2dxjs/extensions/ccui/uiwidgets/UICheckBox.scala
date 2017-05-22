package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.extensions.ccui.baseclasses.{ccuiWidget, t_ccuiWidget}
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.ts_ccuiWidget

@js.native
trait t_ccuiCheckBox extends t_ccuiWidget {
  var selected: Boolean = js.native
  def loadTextures(backGround:String, backGroundSelected:String, cross:String, backGroundDisabled:String, frontCrossDisabled:String, texType:Float | Float):Unit = js.native
  def loadTextureBackGround(backGround:String, texType:Float | Float):Unit = js.native
  def loadTextureBackGroundSelected(backGroundSelected:String, texType:Float | Float):Unit = js.native
  def loadTextureFrontCross(cross:String, texType:Float | Float):Unit = js.native
  def loadTextureBackGroundDisabled(backGroundDisabled:String, texType:Float | Float):Unit = js.native
  def loadTextureFrontCrossDisabled(frontCrossDisabled:String, texType:Float | Float):Unit = js.native
  def setSelected(selected:Boolean):Unit = js.native
  def isSelected:Boolean = js.native
  def addEventListener(selector:js.Function, target:types.DynObject):Unit = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  override def getDescription:String = js.native
}

@js.native
trait ts_ccuiCheckBox extends ts_ccuiWidget {
}

@js.native
@JSGlobal("ccui.CheckBox")
class ccuiCheckBox(backGround:String, backGroundSelected:String, cross:String, backGroundDisabled:String, frontCrossDisabled:String, texType:Float) extends t_ccuiCheckBox {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.CheckBox")
object ccuiCheckBox extends ts_ccuiCheckBox {
  val EVENT_SELECTED: Float = js.native
  val EVENT_UNSELECTED: Float = js.native
  val BOX_RENDERER_ZORDER: Float = js.native
  val BOX_SELECTED_RENDERER_ZORDER: Float = js.native
  val BOX_DISABLED_RENDERER_ZORDER: Float = js.native
  val FRONT_CROSS_RENDERER_ZORDER: Float = js.native
  val FRONT_CROSS_DISABLED_RENDERER_ZORDER: Float = js.native
}


