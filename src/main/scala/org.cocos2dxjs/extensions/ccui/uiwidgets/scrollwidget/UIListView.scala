package org.cocos2dxjs.extensions.ccui.uiwidgets.scrollwidget

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.ccui.baseclasses.{ccuiWidget, t_ccuiWidget}
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.eventmanager.{ccTouch, t_ccTouch}

@js.native
trait t_ccuiListView extends t_ccuiScrollView {
  def setItemModel(model:t_ccuiWidget):Unit = js.native
  def pushBackDefaultItem():Unit = js.native
  def insertDefaultItem(index:Float):Unit = js.native
  def pushBackCustomItem(item:t_ccuiWidget):Unit = js.native
  def removeChild(widget:t_ccNode, cleanup:Boolean):Unit = js.native
  override def removeAllChildren():Unit = js.native
  override def removeAllChildrenWithCleanup(cleanup:Boolean):Unit = js.native
  def insertCustomItem(item:t_ccuiWidget, index:Float):Unit = js.native
  def removeItem(index:Float):Unit = js.native
  def removeLastItem():Unit = js.native
  def removeAllItems():Unit = js.native
  def getItem(index:Float):ccuiWidget = js.native
  def getItems():js.Array[js.Any] = js.native
  def getIndex(item:t_ccuiWidget):Float = js.native
  def setGravity(gravity:Float):Unit = js.native
  def setMagneticType(magneticType:Float):Unit = js.native
  def getMagneticType():Float = js.native
  def setMagneticAllowedOutOfBoundary(magneticAllowedOutOfBoundary:Boolean):Unit = js.native
  def getMagneticAllowedOutOfBoundary():Boolean = js.native
  def setItemsMargin(margin:Float):Unit = js.native
  def getItemsMargin():Float = js.native
  override def setDirection(dir:Float):Unit = js.native
  def getClosestItemToPosition(targetPosition:t_ccPoint, itemAnchorPoint:t_ccPoint):ccuiWidget = js.native
  def getClosestItemToPositionInCurrentView(positionRatioInView:t_ccPoint, itemAnchorPoint:t_ccPoint):ccuiWidget = js.native
  def getCenterItemInCurrentView():ccuiWidget = js.native
  def getLeftmostItemInCurrentView():ccuiWidget = js.native
  def getRightmostItemInCurrentView():ccuiWidget = js.native
  def getTopmostItemInCurrentView():ccuiWidget = js.native
  def getBottommostItemInCurrentView():ccuiWidget = js.native
  def jumpToItem(itemIndex:Float, positionRatioInView:t_ccPoint, itemAnchorPoint:t_ccPoint):Unit = js.native
  def scrollToItem(itemIndex:Float, positionRatioInView:t_ccPoint, itemAnchorPoint:t_ccPoint, timeInSec:Float):Unit = js.native
  def doLayout():Unit = js.native
  override def addEventListener(selector:js.Function):Unit = js.native
  override def interceptTouchEvent(eventType:Float, sender:t_ccuiWidget, touch:t_ccTouch):Unit = js.native
  def getCurSelectedIndex():Float = js.native
  override def getDescription():String = js.native
}

@js.native
trait ts_ccuiListView extends ts_ccuiScrollView {
}

@js.native
@JSGlobal("ccui.ListView")
class ccuiListView() extends t_ccuiListView {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.ListView")
object ccuiListView extends ts_ccuiListView {
  val EVENT_SELECTED_ITEM: Float = js.native
  val ON_SELECTED_ITEM_START: Float = js.native
  val ON_SELECTED_ITEM_END: Float = js.native
  val GRAVITY_LEFT: Float = js.native
  val GRAVITY_RIGHT: Float = js.native
  val GRAVITY_CENTER_HORIZONTAL: Float = js.native
  val GRAVITY_TOP: Float = js.native
  val GRAVITY_BOTTOM: Float = js.native
  val GRAVITY_CENTER_VERTICAL: Float = js.native
  val MAGNETIC_NONE: Float = js.native
  val MAGNETIC_CENTER: Float = js.native
  val MAGNETIC_BOTH_END: Float = js.native
  val MAGNETIC_LEFT: Float = js.native
  val MAGNETIC_RIGHT: Float = js.native
  val MAGNETIC_TOP: Float = js.native
  val MAGNETIC_BOTTOM: Float = js.native
}


