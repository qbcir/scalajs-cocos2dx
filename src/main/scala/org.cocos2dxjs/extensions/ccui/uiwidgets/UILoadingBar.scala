package org.cocos2dxjs.extensions.ccui.uiwidgets

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.ts_ccuiWidget

@js.native
trait t_ccuiLoadingBar extends t_ccuiWidget {
  var direction: Float | Float = js.native
  var percent: Float = js.native
  def setDirection(dir:Float | Float):Unit = js.native
  def getDirection:Float | Float = js.native
  def loadTexture(texture:String, texType:Float | Float):Unit = js.native
  def setScale9Enabled(enabled:Boolean):Unit = js.native
  def isScale9Enabled:Boolean = js.native
  def setCapInsets(capInsets:ccRect):Unit = js.native
  def getCapInsets:ccRect = js.native
  def setPercent(percent:Float):Unit = js.native
  //def setContentSize(contentSize:Float | ccSize, height:Float):Unit = js.native
  def getPercent:Float = js.native
  override def ignoreContentAdaptWithSize(ignore:Boolean):Unit = js.native
  override def getVirtualRendererSize:ccSize = js.native
  override def getVirtualRenderer:ccuiWidget = js.native
  override def getDescription:String = js.native
}

@js.native
trait ts_ccuiLoadingBar extends ts_ccuiWidget {
}

@js.native
@JSGlobal("ccui.LoadingBar")
class ccuiLoadingBar(textureName:String, percentage:Float) extends t_ccuiLoadingBar {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.LoadingBar")
object ccuiLoadingBar extends ts_ccuiLoadingBar {
  val TYPE_LEFT: Float = js.native
  val TYPE_RIGHT: Float = js.native
  val RENDERER_ZORDER: Float = js.native
}


