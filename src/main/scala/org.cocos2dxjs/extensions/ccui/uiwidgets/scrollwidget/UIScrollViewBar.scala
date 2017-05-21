package org.cocos2dxjs.extensions.ccui.uiwidgets.scrollwidget

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.extensions.ccui.system.t_ccuiProtectedNode

@js.native
trait t_ccuiScrollViewBar extends t_ccuiProtectedNode {
  var opacity: Float = js.native
  var autoHideEnabled: Boolean = js.native
  var autoHideTime: Float = js.native
  def init:Boolean = js.native
  def setPositionFromCorner(positionFromCorner:ccPoint):Unit = js.native
  def getPositionFromCorner:ccPoint = js.native
  def setWidth(width:Float):Unit = js.native
  def getWidth:Float = js.native
  def setAutoHideEnabled(autoHideEnabled:Boolean):Unit = js.native
  def isAutoHideEnabled:Boolean = js.native
  def setOpacity(opacity:Float):Unit = js.native
  def getOpacity:Float = js.native
  def onTouchBegan():Unit = js.native
  def onTouchEnded():Unit = js.native
  def onScrolled(outOfBoundary:ccPoint):Unit = js.native
}

@js.native
@JSGlobal("ccui.ScrollViewBar")
class ccuiScrollViewBar(parent:ccuiScrollView, direction:Float) extends t_ccuiScrollViewBar {
}

@js.native
@JSGlobal("ccui.ScrollViewBar")
object ccuiScrollViewBar extends js.Object {
  var DEFAULT_COLOR: js.Any = js.native
}


