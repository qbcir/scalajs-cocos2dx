package org.cocos2dxjs.extensions.ccui.uiwidgets.scrollwidget

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.ccui.baseclasses.ccuiWidget
import org.cocos2dxjs.extensions.ccui.layouts.ccuiLayout
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.platform.ccColor

@js.native
@JSGlobal("ccui.PageView")
class ccuiPageView extends ccuiListView {
  def addPage(page:ccuiWidget):Unit = js.native
  def insertPage(page:ccuiWidget, idx:Float):Unit = js.native
  def removePage(page:ccuiWidget):Unit = js.native
  def removePageAtIndex(index:Float):Unit = js.native
  def removeAllPages():Unit = js.native
  def scrollToItem(idx:Float):Unit = js.native
  def scrollToPage(idx:Float):Unit = js.native
  override def setDirection(direction:Float):Unit = js.native
  def setCurrentPageIndex(index:Float):Unit = js.native
  def getCurrentPageIndex:Float = js.native
  def getPages:js.Array[js.Any] = js.native
  def getPage(index:Float):ccuiLayout = js.native
  override def getDescription:String = js.native
  def setIndicatorEnabled(enabled:Boolean):Unit = js.native
  def getIndicatorEnabled:Boolean = js.native
  def setIndicatorPositionAsAnchorPoint(positionAsAnchorPoint:ccPoint):Unit = js.native
  def getIndicatorPositionAsAnchorPoint:ccPoint = js.native
  def setIndicatorPosition(position:ccPoint):Unit = js.native
  def getIndicatorPosition:ccPoint = js.native
  def setIndicatorSpaceBetweenIndexNodes(spaceBetweenIndexNodes:Float):Unit = js.native
  def getIndicatorSpaceBetweenIndexNodes:Float = js.native
  def setIndicatorSelectedIndexColor(color:ccColor):Unit = js.native
  def getIndicatorSelectedIndexColor:ccColor = js.native
  def setIndicatorIndexNodesColor(color:ccColor):Unit = js.native
  def getIndicatorIndexNodesColor:ccColor = js.native
  def setIndicatorIndexNodesScale(scale:Float):Unit = js.native
  def getIndicatorIndexNodesScale:Float = js.native
  def setIndicatorIndexNodesTexture(texName:String, texType:Float):Unit = js.native
}
