package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.ccui.system.t_ccuiClass
import org.cocos2dxjs.extensions.ccui.system.ts_ccuiClass
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.platform.{ccFontDefinition, t_ccFontDefinition}
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.ts_ccuiWidget

@js.native
trait t_ccuiRichElement extends t_ccuiClass {
}

@js.native
trait ts_ccuiRichElement extends ts_ccuiClass {
}

@js.native
@JSGlobal("ccui.RichElement")
class ccuiRichElement extends t_ccuiRichElement {
}

@js.native
@JSGlobal("ccui.RichElement")
object ccuiRichElement extends ts_ccuiRichElement {
  val TEXT: Float = js.native
  val IMAGE: Float = js.native
  val CUSTOM: Float = js.native
}

@js.native
trait t_ccuiRichElementText extends t_ccuiRichElement {
}

@js.native
trait ts_ccuiRichElementText extends ts_ccuiRichElement {
}

@js.native
@JSGlobal("ccui.RichElementText")
class ccuiRichElementText(tag:Float, colorOrFontDef:t_ccColor|t_ccFontDefinition, opacity:Float, text:String, fontName:String, fontSize:Float) extends t_ccuiRichElementText {
  var _fontDefinition: ccFontDefinition = js.native
}

@js.native
@JSGlobal("ccui.RichElementText")
object ccuiRichElementText extends ts_ccuiRichElementText {
}

@js.native
trait t_ccuiRichElementImage extends t_ccuiRichElement {
}

@js.native
trait ts_ccuiRichElementImage extends ts_ccuiRichElement {
}

@js.native
@JSGlobal("ccui.RichElementImage")
class ccuiRichElementImage(tag:Float, color:t_ccColor, opacity:Float, filePath:String) extends t_ccuiRichElementImage {
}

@js.native
@JSGlobal("ccui.RichElementImage")
object ccuiRichElementImage extends ts_ccuiRichElementImage {
}

@js.native
trait t_ccuiRichElementCustomNode extends t_ccuiRichElement {
}

@js.native
trait ts_ccuiRichElementCustomNode extends ts_ccuiRichElement {
}

@js.native
@JSGlobal("ccui.RichElementCustomNode")
class ccuiRichElementCustomNode(tag:Float, color:t_ccColor, opacity:Float, customNode:t_ccNode) extends t_ccuiRichElementCustomNode {
}

@js.native
@JSGlobal("ccui.RichElementCustomNode")
object ccuiRichElementCustomNode extends ts_ccuiRichElementCustomNode {
}

@js.native
trait t_ccuiRichText extends t_ccuiWidget {
  def insertElement(element:t_ccuiRichElement, index:Float):Unit = js.native
  def pushBackElement(element:t_ccuiRichElement):Unit = js.native
  def removeElement(element:t_ccuiRichElement):Unit = js.native
  def formatText():Unit = js.native
  def _handleTextRenderer(text:String, fontNameOrFontDef:String|t_ccFontDefinition, fontSize:Float, color:t_ccColor):Unit = js.native
  def formatRenderers():Unit = js.native
  def setVerticalSpace(space:Float):Unit = js.native
  def setAnchorPoint(pt:t_ccPoint):Unit = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def ignoreContentAdaptWithSize(ignore:Boolean):Unit = js.native
  def getContentSize:ccSize = js.native
  override def getDescription:String = js.native
  def setCascadeOpacityEnabled(value:Boolean):Unit = js.native
  def setLineBreakOnSpace(value:js.Dynamic):Unit = js.native
  def setTextHorizontalAlignment(value:Float):Unit = js.native
  def setTextVerticalAlignment(value:Float):Unit = js.native
}

@js.native
trait ts_ccuiRichText extends ts_ccuiWidget {
}

@js.native
@JSGlobal("ccui.RichText")
class ccuiRichText extends t_ccuiRichText {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.RichText")
object ccuiRichText extends ts_ccuiRichText {
}


