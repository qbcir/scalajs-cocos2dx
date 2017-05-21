package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget

@js.native
trait t_ccuiLoadingBar extends t_ccuiWidget {
  var direction: Float = js.native
  var percent: Float = js.native
  def setDirection(dir:Float):Unit = js.native
  def getDirection:Float = js.native
  def loadTexture(texture:String, texType:Float):Unit = js.native
  def setScale9Enabled(enabled:Boolean):Unit = js.native
  def isScale9Enabled:Boolean = js.native
  def setCapInsets(capInsets:ccRect):Unit = js.native
  def getCapInsets:ccRect = js.native
  def setPercent(percent:Float):Unit = js.native
  def setContentSize(contentSize:Float, height:Float):Unit = js.native
  def getPercent:Float = js.native
  override def ignoreContentAdaptWithSize(ignore:Boolean):Unit = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  override def getDescription:String = js.native
}

@js.native
@JSGlobal("ccui.LoadingBar")
class ccuiLoadingBar(textureName:String, percentage:Float) extends t_ccuiLoadingBar {
  var onFocusChanged: js.Any = js.native
  var onNextFocusedWidget: js.Any = js.native
}

@js.native
@JSGlobal("ccui.LoadingBar")
object ccuiLoadingBar extends js.Object {
  val TYPE_LEFT: Float = js.native
  val TYPE_RIGHT: Float = js.native
  val RENDERER_ZORDER: Float = js.native
}


