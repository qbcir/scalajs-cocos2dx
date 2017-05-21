package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.ccui.system.t_ccuiClass
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget

@js.native
trait t_ccuiRichElement extends t_ccuiClass {
}

@js.native
@JSGlobal("ccui.RichElement")
class ccuiRichElement extends t_ccuiRichElement {
}

@js.native
@JSGlobal("ccui.RichElement")
object ccuiRichElement extends js.Object {
}

@js.native
trait t_ccuiRichElementText extends t_ccuiRichElement {
}

@js.native
@JSGlobal("ccui.RichElementText")
class ccuiRichElementText(tag:Float, colorOrFontDef:ccColor, opacity:Float, text:String, fontName:String, fontSize:Float) extends t_ccuiRichElementText {
}

@js.native
@JSGlobal("ccui.RichElementText")
object ccuiRichElementText extends js.Object {
}

@js.native
trait t_ccuiRichElementImage extends t_ccuiRichElement {
}

@js.native
@JSGlobal("ccui.RichElementImage")
class ccuiRichElementImage(tag:Float, color:ccColor, opacity:Float, filePath:String) extends t_ccuiRichElementImage {
}

@js.native
@JSGlobal("ccui.RichElementImage")
object ccuiRichElementImage extends js.Object {
}

@js.native
trait t_ccuiRichElementCustomNode extends t_ccuiRichElement {
}

@js.native
@JSGlobal("ccui.RichElementCustomNode")
class ccuiRichElementCustomNode(tag:Float, color:ccColor, opacity:Float, customNode:ccNode) extends t_ccuiRichElementCustomNode {
}

@js.native
@JSGlobal("ccui.RichElementCustomNode")
object ccuiRichElementCustomNode extends js.Object {
}

@js.native
trait t_ccuiRichText extends t_ccuiWidget {
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

@js.native
@JSGlobal("ccui.RichText")
class ccuiRichText extends t_ccuiRichText {
}

@js.native
@JSGlobal("ccui.RichText")
object ccuiRichText extends js.Object {
}

