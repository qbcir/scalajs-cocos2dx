package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget

@js.native
trait t_ccuiText extends t_ccuiWidget {
  var boundingWidth: Float = js.native
  var boundingHeight: Float = js.native
  var string: String = js.native
  val stringLength: Float = js.native
  var font: String = js.native
  var fontName: String = js.native
  var fontSize: Float = js.native
  var textAlign: Float = js.native
  var verticalAlign: Float = js.native
  var touchScaleEnabled: Boolean = js.native
  def setString(text:String):Unit = js.native
  def getString:String = js.native
  def getStringLength:Float = js.native
  def setFontSize(size:Float):Unit = js.native
  def getFontSize:Float = js.native
  def setFontName:String = js.native
  def getFontName:String = js.native
  def getType:js.Any = js.native
  def setTextAreaSize(size:ccSize):Unit = js.native
  def getTextAreaSize:ccSize = js.native
  def setTextHorizontalAlignment(alignment:Float):Unit = js.native
  def getTextHorizontalAlignment:js.Any = js.native
  def setTextVerticalAlignment(alignment:Float):Unit = js.native
  def getTextVerticalAlignment:js.Any = js.native
  def setTouchScaleChangeEnabled(enable:Boolean):Unit = js.native
  def isTouchScaleChangeEnabled:Boolean = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  override def getDescription:String = js.native
  def enableShadow(shadowColor:ccColor, offset:ccSize, blurRadius:Float):Unit = js.native
  def enableOutline(outlineColor:ccColor, outlineSize:ccSize):Unit = js.native
  def enableGlow(glowColor:js.Any):Unit = js.native
  def disableEffect():Unit = js.native
}

@js.native
@JSGlobal("ccui.Text")
class ccuiText(textContent:String, fontName:String, fontSize:Float) extends t_ccuiText {
  var onFocusChanged: js.Any = js.native
  var onNextFocusedWidget: js.Any = js.native
}

@js.native
@JSGlobal("ccui.Text")
object ccuiText extends js.Object {
  val RENDERER_ZORDER: Float = js.native
  var Type: js.Any = js.native
}


