package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.extensions.ccui.baseclasses.{ccuiWidget, t_ccuiWidget}
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.ts_ccuiWidget

@js.native
trait t_ccuiSlider extends t_ccuiWidget {
  var percent: Float = js.native
  def loadBarTexture(fileName:String, texType:Float):Unit = js.native
  def loadProgressBarTexture(fileName:String, texType:Float):Unit = js.native
  def setScale9Enabled(able:Boolean):Unit = js.native
  def isScale9Enabled:Boolean = js.native
  override def ignoreContentAdaptWithSize(ignore:Boolean):Unit = js.native
  def setCapInsets(capInsets:t_ccRect):Unit = js.native
  def setCapInsetsBarRenderer(capInsets:t_ccRect):Unit = js.native
  def getCapInsetsBarRenderer:ccRect = js.native
  def setCapInsetProgressBarRenderer(capInsets:t_ccRect):Unit = js.native
  def getCapInsetsProgressBarRenderer:ccRect = js.native
  def loadSlidBallTextures(normal:String, pressed:String, disabled:String, texType:Float):Unit = js.native
  def loadSlidBallTextureNormal(normal:String, texType:Float):Unit = js.native
  def loadSlidBallTexturePressed(pressed:String, texType:Float):Unit = js.native
  def loadSlidBallTextureDisabled(disabled:String, texType:Float):Unit = js.native
  def setPercent(percent:Float):Unit = js.native
  override def hitTest(pt:t_ccPoint):Boolean = js.native
  def _getPercentWithBallPos(px:t_ccPoint):Float = js.native
  def addEventListener(selector:js.Function, target:types.DynObject):Unit = js.native
  def getPercent:Float = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  override def getDescription:String = js.native
}

@js.native
trait ts_ccuiSlider extends ts_ccuiWidget {
}

@js.native
@JSGlobal("ccui.Slider")
class ccuiSlider extends t_ccuiSlider {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.Slider")
object ccuiSlider extends ts_ccuiSlider {
  val EVENT_PERCENT_CHANGED: Float = js.native
  val BASEBAR_RENDERER_ZORDER: Float = js.native
  val PROGRESSBAR_RENDERER_ZORDER: Float = js.native
  val BALL_RENDERER_ZORDER: Float = js.native
}


