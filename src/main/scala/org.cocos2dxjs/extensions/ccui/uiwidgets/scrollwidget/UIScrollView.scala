package org.cocos2dxjs.extensions.ccui.uiwidgets.scrollwidget

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.ccui.baseclasses.{ccuiWidget, t_ccuiWidget}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.core.eventmanager.{ccTouch, t_ccTouch}
import org.cocos2dxjs.cocos2d.core.eventmanager.{ccEvent, t_ccEvent}
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.extensions.ccui.layouts.{ccuiLayout, t_ccuiLayout}
import org.cocos2dxjs.extensions.ccui.layouts.t_ccuiLayout
import org.cocos2dxjs.extensions.ccui.layouts.ts_ccuiLayout

@js.native
trait t_ccuiScrollView extends t_ccuiLayout {
  var innerWidth: Float = js.native
  var innerHeight: Float = js.native
  var direction: Float | Float | Float | Float = js.native
  var bounceEnabled: Boolean = js.native
  var inertiaScrollEnabled: Boolean = js.native
  var touchTotalTimeThreshold: Float = js.native
  override def onEnter():Unit = js.native
  override def findNextFocusedWidget(_direction:Float, current:t_ccuiWidget):ccuiWidget = js.native
  def setInnerContainerSize(size:t_ccSize):Unit = js.native
  def setInnerContainerPosition(position:t_ccPoint):Unit = js.native
  def getInnerContainerPosition():Unit = js.native
  def getInnerContainerSize:ccSize = js.native
  def addChild(widget:t_ccNode, zOrder:Float, tag:Float | String):Boolean = js.native
  def removeAllChildren():Unit = js.native
  override def removeAllChildrenWithCleanup(cleanup:Boolean):Unit = js.native
  override def removeChild(child:t_ccuiWidget, cleanup:Boolean):Unit = js.native
  def getChildren:js.Array[js.Any] = js.native
  def getChildrenCount:Float = js.native
  def getChildByTag(tag:Float):ccuiWidget = js.native
  def getChildByName(name:String):ccuiWidget = js.native
  def setTouchTotalTimeThreshold(touchTotalTimeThreshold:Float):Unit = js.native
  def getTouchTotalTimeThreshold:Float = js.native
  def stopAutoScroll():Unit = js.native
  def scrollToBottom(time:Float, attenuated:Boolean):Unit = js.native
  def scrollToTop(time:Float, attenuated:Boolean):Unit = js.native
  def scrollToLeft(time:Float, attenuated:Boolean):Unit = js.native
  def scrollToRight(time:Float, attenuated:Boolean):Unit = js.native
  def scrollToTopLeft(time:Float, attenuated:Boolean):Unit = js.native
  def scrollToTopRight(time:Float, attenuated:Boolean):Unit = js.native
  def scrollToBottomLeft(time:Float, attenuated:Boolean):Unit = js.native
  def scrollToBottomRight(time:Float, attenuated:Boolean):Unit = js.native
  def scrollToPercentVertical(percent:Float, time:Float, attenuated:Boolean):Unit = js.native
  def scrollToPercentHorizontal(percent:Float, time:Float, attenuated:Boolean):Unit = js.native
  def scrollToPercentBothDirection(percent:t_ccPoint, time:Float, attenuated:Boolean):Unit = js.native
  def jumpToBottom():Unit = js.native
  def jumpToTop():Unit = js.native
  def jumpToLeft():Unit = js.native
  def jumpToRight():Unit = js.native
  def jumpToTopLeft():Unit = js.native
  def jumpToTopRight():Unit = js.native
  def jumpToBottomLeft():Unit = js.native
  def jumpToBottomRight():Unit = js.native
  def jumpToPercentVertical(percent:Float):Unit = js.native
  def jumpToPercentHorizontal(percent:Float):Unit = js.native
  def jumpToPercentBothDirection(percent:t_ccPoint):Unit = js.native
  override def onTouchBegan(touch:t_ccTouch, event:t_ccEvent):Boolean = js.native
  override def onTouchMoved(touch:t_ccTouch, event:t_ccEvent):Unit = js.native
  def onTouchEnded(touch:t_ccTouch, event:t_ccEvent):Unit = js.native
  def onTouchCancelled(touch:t_ccTouch, event:t_ccEvent):Unit = js.native
  def update(dt:Float):Unit = js.native
  override def interceptTouchEvent(event:Float, sender:t_ccuiWidget, touch:t_ccTouch):Unit = js.native
  def addEventListener(selector:js.Function):Unit = js.native
  def setDirection(dir:Float | Float | Float | Float):Unit = js.native
  def getDirection:Float | Float | Float | Float = js.native
  def setBounceEnabled(enabled:Boolean):Unit = js.native
  def isBounceEnabled:Boolean = js.native
  def setInertiaScrollEnabled(enabled:Boolean):Unit = js.native
  def isInertiaScrollEnabled:Boolean = js.native
  def setScrollBarEnabled(enabled:Boolean):Unit = js.native
  def isScrollBarEnabled:Boolean = js.native
  def setScrollBarPositionFromCorner(positionFromCorner:t_ccPoint):Unit = js.native
  def setScrollBarPositionFromCornerForVertical(positionFromCorner:t_ccPoint):Unit = js.native
  def getScrollBarPositionFromCornerForVertical:ccPoint = js.native
  def setScrollBarPositionFromCornerForHorizontal(positionFromCorner:t_ccPoint):Unit = js.native
  def getScrollBarPositionFromCornerForHorizontal:ccPoint = js.native
  def setScrollBarWidth(width:Float):Unit = js.native
  def getScrollBarWidth:Float = js.native
  def setScrollBarColor(color:t_ccColor):Unit = js.native
  def getScrollBarColor:ccColor = js.native
  def setScrollBarOpacity(opacity:Float):Unit = js.native
  def getScrollBarOpacity:Float = js.native
  def setScrollBarAutoHideEnabled(autoHideEnabled:Boolean):Unit = js.native
  def isScrollBarAutoHideEnabled:Boolean = js.native
  def setScrollBarAutoHideTime(autoHideTime:Float):Unit = js.native
  def getScrollBarAutoHideTime:Float = js.native
  def getInnerContainer:ccuiLayout = js.native
  override def setLayoutType(_type:Float | Float | Float | Float):Unit = js.native
  override def getLayoutType:js.Dynamic = js.native
  override def getDescription:String = js.native
}

@js.native
trait ts_ccuiScrollView extends ts_ccuiLayout {
}

@js.native
@JSGlobal("ccui.ScrollView")
class ccuiScrollView extends t_ccuiScrollView {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.ScrollView")
object ccuiScrollView extends ts_ccuiScrollView {
  val DIR_NONE: Float = js.native
  val DIR_VERTICAL: Float = js.native
  val DIR_HORIZONTAL: Float = js.native
  val DIR_BOTH: Float = js.native
  val EVENT_SCROLL_TO_TOP: Float = js.native
  val EVENT_SCROLL_TO_BOTTOM: Float = js.native
  val EVENT_SCROLL_TO_LEFT: Float = js.native
  val EVENT_SCROLL_TO_RIGHT: Float = js.native
  val EVENT_SCROLLING: Float = js.native
  val EVENT_BOUNCE_TOP: Float = js.native
  val EVENT_BOUNCE_BOTTOM: Float = js.native
  val EVENT_BOUNCE_LEFT: Float = js.native
  val EVENT_BOUNCE_RIGHT: Float = js.native
  val EVENT_CONTAINER_MOVED: Float = js.native
  val EVENT_AUTOSCROLL_ENDED: Float = js.native
  var MOVEDIR_TOP: js.Dynamic = js.native
}


