package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}
import org.cocos2dxjs.extensions.ccui.baseclasses.{ccuiWidget, t_ccuiWidget}
import org.cocos2dxjs.cocos2d.core.labelttf.{ccLabelTTF, t_ccLabelTTF}
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.ts_ccuiWidget

@js.native
trait t_ccuiButton extends t_ccuiWidget {
  var titleText: String = js.native
  var titleFont: String = js.native
  var titleFontSize: Float = js.native
  var titleFontName: String = js.native
  var titleFontColor: ccColor = js.native
  var pressedActionEnabled: Boolean = js.native
  def setScale9Enabled(able:Boolean):Unit = js.native
  def isScale9Enabled:Boolean = js.native
  override def ignoreContentAdaptWithSize(ignore:Boolean):Unit = js.native
  override def getVirtualRendererSize:ccSize = js.native
  def loadTextures(normal:String, selected:String, disabled:String, texType:Float | Float):Unit = js.native
  def loadTextureNormal(normal:String, texType:Float | Float):Unit = js.native
  def loadTexturePressed(selected:String, texType:Float | Float):Unit = js.native
  def loadTextureDisabled(disabled:String, texType:Float | Float):Unit = js.native
  def setCapInsets(capInsets:t_ccRect):Unit = js.native
  def setCapInsetsNormalRenderer(capInsets:t_ccRect):Unit = js.native
  def getCapInsetsNormalRenderer:ccRect = js.native
  def setCapInsetsPressedRenderer(capInsets:t_ccRect):Unit = js.native
  def getCapInsetsPressedRenderer:ccRect = js.native
  def setCapInsetsDisabledRenderer(capInsets:t_ccRect):Unit = js.native
  def getCapInsetsDisabledRenderer:ccRect = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  def setPressedActionEnabled(enabled:Boolean):Unit = js.native
  def setTitleText(text:String):Unit = js.native
  def getTitleText:String = js.native
  def setTitleColor(color:t_ccColor):Unit = js.native
  def getTitleColor:ccColor = js.native
  def setTitleFontSize(size:t_ccSize):Unit = js.native
  def getTitleFontSize:Float = js.native
  def setZoomScale(scale:js.Dynamic):Unit = js.native
  def getZoomScale:Float = js.native
  def getNormalTextureSize:ccSize = js.native
  def setTitleFontName(fontName:String):Unit = js.native
  def getTitleRenderer:ccLabelTTF = js.native
  def getTitleFontName:String = js.native
  override def getDescription:String = js.native
}

@js.native
trait ts_ccuiButton extends ts_ccuiWidget {
}

@js.native
@JSGlobal("ccui.Button")
class ccuiButton(normalImage:String, selectedImage:String, disableImage:String, texType:Float) extends t_ccuiButton {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.Button")
object ccuiButton extends ts_ccuiButton {
  val NORMAL_RENDERER_ZORDER: Float = js.native
  val PRESSED_RENDERER_ZORDER: Float = js.native
  val DISABLED_RENDERER_ZORDER: Float = js.native
  val TITLE_RENDERER_ZORDER: Float = js.native
  val ZOOM_ACTION_TIME_STEP: Float = js.native
  var SYSTEM: js.Dynamic = js.native
}


