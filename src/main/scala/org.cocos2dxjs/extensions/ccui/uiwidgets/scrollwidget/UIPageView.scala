package org.cocos2dxjs.extensions.ccui.uiwidgets.scrollwidget

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.ccui.baseclasses.{ccuiWidget, t_ccuiWidget}
import org.cocos2dxjs.extensions.ccui.layouts.{ccuiLayout, t_ccuiLayout}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}

@js.native
trait t_ccuiPageView extends t_ccuiListView {
  def addPage(page:t_ccuiWidget):Unit = js.native
  def insertPage(page:t_ccuiWidget, idx:Float):Unit = js.native
  def removePage(page:t_ccuiWidget):Unit = js.native
  def removePageAtIndex(index:Float):Unit = js.native
  def removeAllPages():Unit = js.native
  def scrollToItem(idx:Float):Unit = js.native
  def scrollToPage(idx:Float):Unit = js.native
  override def setDirection(direction:Float):Unit = js.native
  def setCurrentPageIndex(index:Float):Unit = js.native
  def getCurrentPageIndex():Float = js.native
  def getPages():js.Array[js.Any] = js.native
  def getPage(index:Float):ccuiLayout = js.native
  override def getDescription():String = js.native
  def setIndicatorEnabled(enabled:Boolean):Unit = js.native
  def getIndicatorEnabled():Boolean = js.native
  def setIndicatorPositionAsAnchorPoint(positionAsAnchorPoint:t_ccPoint):Unit = js.native
  def getIndicatorPositionAsAnchorPoint():ccPoint = js.native
  def setIndicatorPosition(position:t_ccPoint):Unit = js.native
  def getIndicatorPosition():ccPoint = js.native
  def setIndicatorSpaceBetweenIndexNodes(spaceBetweenIndexNodes:Float):Unit = js.native
  def getIndicatorSpaceBetweenIndexNodes():Float = js.native
  def setIndicatorSelectedIndexColor(color:t_ccColor):Unit = js.native
  def getIndicatorSelectedIndexColor():ccColor = js.native
  def setIndicatorIndexNodesColor(color:t_ccColor):Unit = js.native
  def getIndicatorIndexNodesColor():ccColor = js.native
  def setIndicatorIndexNodesScale(scale:Float):Unit = js.native
  def getIndicatorIndexNodesScale():Float = js.native
  def setIndicatorIndexNodesTexture(texName:String, texType:Float):Unit = js.native
}

@js.native
trait ts_ccuiPageView extends ts_ccuiListView {
}

@js.native
@JSGlobal("ccui.PageView")
class ccuiPageView() extends t_ccuiPageView {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.PageView")
object ccuiPageView extends ts_ccuiPageView {
  val EVENT_TURNING: Float = js.native
  val TOUCH_DIR_LEFT: Float = js.native
  val TOUCH_DIR_RIGHT: Float = js.native
  val DIRECTION_LEFT: Float = js.native
  val DIRECTION_RIGHT: Float = js.native
}


