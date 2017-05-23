package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.extensions.ccui.baseclasses.{ccuiWidget, t_ccuiWidget}
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.ts_ccuiWidget

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
  def getType:Null = js.native
  def setTextAreaSize(size:t_ccSize):Unit = js.native
  def getTextAreaSize:ccSize = js.native
  def setTextHorizontalAlignment(alignment:Float):Unit = js.native
  def getTextHorizontalAlignment:js.Dynamic = js.native
  def setTextVerticalAlignment(alignment:Float):Unit = js.native
  def getTextVerticalAlignment:js.Dynamic = js.native
  def setTouchScaleChangeEnabled(enable:Boolean):Unit = js.native
  def isTouchScaleChangeEnabled:Boolean = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  override def getDescription:String = js.native
  def enableShadow(shadowColor:t_ccColor, offset:t_ccSize, blurRadius:Float):Unit = js.native
  def enableOutline(outlineColor:t_ccColor, outlineSize:t_ccSize):Unit = js.native
  def enableGlow(glowColor:js.Dynamic):Unit = js.native
  def disableEffect():Unit = js.native
}

@js.native
trait ts_ccuiText extends ts_ccuiWidget {
}

@js.native
@JSGlobal("ccui.Text")
class ccuiText(textContent:String, fontName:String, fontSize:Float) extends t_ccuiText {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.Text")
object ccuiText extends ts_ccuiText {
  val RENDERER_ZORDER: Float = js.native
  var Type: js.Dynamic = js.native
}


