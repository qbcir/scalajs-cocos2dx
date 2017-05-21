package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget

@js.native
trait t_ccuiSlider extends t_ccuiWidget {
  def loadBarTexture(fileName:String, texType:Float):Unit = js.native
  def loadProgressBarTexture(fileName:String, texType:Float):Unit = js.native
  def setScale9Enabled(able:Boolean):Unit = js.native
  def isScale9Enabled:Boolean = js.native
  override def ignoreContentAdaptWithSize(ignore:Boolean):Unit = js.native
  def setCapInsets(capInsets:ccRect):Unit = js.native
  def setCapInsetsBarRenderer(capInsets:ccRect):Unit = js.native
  def getCapInsetsBarRenderer:ccRect = js.native
  def setCapInsetProgressBarRenderer(capInsets:ccRect):Unit = js.native
  def getCapInsetsProgressBarRenderer:ccRect = js.native
  def loadSlidBallTextures(normal:String, pressed:String, disabled:String, texType:Float):Unit = js.native
  def loadSlidBallTextureNormal(normal:String, texType:Float):Unit = js.native
  def loadSlidBallTexturePressed(pressed:String, texType:Float):Unit = js.native
  def loadSlidBallTextureDisabled(disabled:String, texType:Float):Unit = js.native
  def setPercent(percent:Float):Unit = js.native
  override def hitTest(pt:ccPoint):Boolean = js.native
  def _getPercentWithBallPos(px:ccPoint):Float = js.native
  def addEventListener(selector:js.Function, target:js.Object):Unit = js.native
  def getPercent:Float = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  override def getDescription:String = js.native
}

@js.native
@JSGlobal("ccui.Slider")
class ccuiSlider extends t_ccuiSlider {
  var onFocusChanged: js.Any = js.native
  var onNextFocusedWidget: js.Any = js.native
}

@js.native
@JSGlobal("ccui.Slider")
object ccuiSlider extends js.Object {
}



