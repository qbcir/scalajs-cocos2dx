package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.ccui.system.ccuiClass
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget

@js.native
@JSGlobal("ccui.RichElement")
class ccuiRichElement extends ccuiClass {
}

@js.native
@JSGlobal("ccui.RichElementText")
class ccuiRichElementText extends ccuiRichElement {
}

@js.native
@JSGlobal("ccui.RichElementImage")
class ccuiRichElementImage extends ccuiRichElement {
}

@js.native
@JSGlobal("ccui.RichElementCustomNode")
class ccuiRichElementCustomNode extends ccuiRichElement {
}

@js.native
@JSGlobal("ccui.RichText")
class ccuiRichText extends ccuiWidget {
  def insertElement(element:ccuiRichElement, index:Float):Unit = js.native
  def pushBackElement(element:ccuiRichElement):Unit = js.native
  def removeElement(element:ccuiRichElement):Unit = js.native
  def formatText():Unit = js.native
  def _handleTextRenderer(text:String, fontNameOrFontDef:String, fontSize:Float, color:ccColor):Unit = js.native
  def formatRenderers():Unit = js.native
  def setVerticalSpace(space:Float):Unit = js.native
  def setAnchorPoint(pt:ccPoint):Unit = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def ignoreContentAdaptWithSize(ignore:Boolean):Unit = js.native
  def getContentSize:ccSize = js.native
  override def getDescription:String = js.native
  def setCascadeOpacityEnabled(value:Boolean):Unit = js.native
  def setLineBreakOnSpace(value:js.Any):Unit = js.native
  def setTextHorizontalAlignment(value:Float):Unit = js.native
  def setTextVerticalAlignment(value:Float):Unit = js.native
}

