package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget
import org.cocos2dxjs.cocos2d.core.labelttf.ccLabelTTF
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget

@js.native
trait t_ccuiButton extends t_ccuiWidget {
  def setScale9Enabled(able:Boolean):Unit = js.native
  def isScale9Enabled:Boolean = js.native
  override def ignoreContentAdaptWithSize(ignore:Boolean):Unit = js.native
  override def getVirtualRendererSize:ccSize = js.native
  def loadTextures(normal:String, selected:String, disabled:String, texType:Float):Unit = js.native
  def loadTextureNormal(normal:String, texType:Float):Unit = js.native
  def loadTexturePressed(selected:String, texType:Float):Unit = js.native
  def loadTextureDisabled(disabled:String, texType:Float):Unit = js.native
  def setCapInsets(capInsets:ccRect):Unit = js.native
  def setCapInsetsNormalRenderer(capInsets:ccRect):Unit = js.native
  def getCapInsetsNormalRenderer:ccRect = js.native
  def setCapInsetsPressedRenderer(capInsets:ccRect):Unit = js.native
  def getCapInsetsPressedRenderer:ccRect = js.native
  def setCapInsetsDisabledRenderer(capInsets:ccRect):Unit = js.native
  def getCapInsetsDisabledRenderer:ccRect = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  def setPressedActionEnabled(enabled:Boolean):Unit = js.native
  def setTitleText(text:String):Unit = js.native
  def getTitleText:String = js.native
  def setTitleColor(color:ccColor):Unit = js.native
  def getTitleColor:ccColor = js.native
  def setTitleFontSize(size:ccSize):Unit = js.native
  def getTitleFontSize:Float = js.native
  def setZoomScale(scale:js.Any):Unit = js.native
  def getZoomScale:Float = js.native
  def getNormalTextureSize:ccSize = js.native
  def setTitleFontName(fontName:String):Unit = js.native
  def getTitleRenderer:ccLabelTTF = js.native
  def getTitleFontName:String = js.native
  override def getDescription:String = js.native
}

@js.native
@JSGlobal("ccui.Button")
class ccuiButton(normalImage:String, selectedImage:String, disableImage:String, texType:Float) extends t_ccuiButton {
}

@js.native
@JSGlobal("ccui.Button")
object ccuiButton extends js.Object {
}

