package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget

@js.native
@JSGlobal("ccui.CheckBox")
class ccuiCheckBox extends ccuiWidget {
  def loadTextures(backGround:String, backGroundSelected:String, cross:String, backGroundDisabled:String, frontCrossDisabled:String, texType:Float):Unit = js.native
  def loadTextureBackGround(backGround:String, texType:Float):Unit = js.native
  def loadTextureBackGroundSelected(backGroundSelected:String, texType:Float):Unit = js.native
  def loadTextureFrontCross(cross:String, texType:Float):Unit = js.native
  def loadTextureBackGroundDisabled(backGroundDisabled:String, texType:Float):Unit = js.native
  def loadTextureFrontCrossDisabled(frontCrossDisabled:String, texType:Float):Unit = js.native
  def setSelected(selected:Boolean):Unit = js.native
  def isSelected:Boolean = js.native
  def addEventListener(selector:js.Function, target:js.Object):Unit = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  override def getDescription:String = js.native
}

