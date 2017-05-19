package org.cocos2dxjs.extensions.ccui.baseclasses

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.eventmanager.ccTouch
import org.cocos2dxjs.cocos2d.core.eventmanager.ccEvent
import org.cocos2dxjs.extensions.ccui.layouts.ccuiLayoutParameter
import org.cocos2dxjs.extensions.ccui.system.ccuiProtectedNode

@js.native
@JSGlobal("ccui.Widget")
class ccuiWidget extends ccuiProtectedNode {
  def init:Boolean = js.native
  def onEnter():Unit = js.native
  def onExit():Unit = js.native
  def getWidgetParent:ccuiWidget = js.native
  def setPropagateTouchEvents(isPropagate:Boolean):Unit = js.native
  def isPropagateTouchEvents:Boolean = js.native
  def setSwallowTouches(swallow:Boolean):Unit = js.native
  def isSwallowTouches:Boolean = js.native
  def setEnabled(enabled:Boolean):Unit = js.native
  def _initRenderer():Unit = js.native
  def setContentSize(contentSize:ccSize, height:Float):Unit = js.native
  def setSizePercent(percent:ccPoint):Unit = js.native
  def updateSizeAndPosition(parentSize:ccSize):Unit = js.native
  def setSizeType(_type:Float):Unit = js.native
  def getSizeType:Float = js.native
  def ignoreContentAdaptWithSize(ignore:Boolean):Unit = js.native
  def isIgnoreContentAdaptWithSize:Boolean = js.native
  def getCustomSize:ccSize = js.native
  def getLayoutSize:ccSize = js.native
  def getSizePercent:ccPoint = js.native
  def getWorldPosition:ccPoint = js.native
  def getVirtualRenderer:ccuiWidget = js.native
  def getVirtualRendererSize:ccSize = js.native
  def _onSizeChanged():Unit = js.native
  def setTouchEnabled(enable:Boolean):Unit = js.native
  def isTouchEnabled:Boolean = js.native
  def isHighlighted:Boolean = js.native
  def setHighlighted(highlight:js.Any):Unit = js.native
  def isFocused:Boolean = js.native
  def setFocused(focus:Boolean):Unit = js.native
  def isFocusEnabled:Boolean = js.native
  def setFocusEnabled(enable:Boolean):Unit = js.native
  def findNextFocusedWidget(direction:js.Any, current:js.Any):Unit = js.native
  def requestFocus():Unit = js.native
  def getCurrentFocusedWidget():Unit = js.native
  def interceptTouchEvent(eventType:Float, sender:ccuiWidget, touch:ccTouch):Unit = js.native
  def onFocusChange(widgetLostFocus:ccuiWidget, widgetGetFocus:ccuiWidget):Unit = js.native
  def dispatchFocusEvent(widgetLostFocus:ccuiWidget, widgetGetFocus:ccuiWidget):Unit = js.native
  def setBright(bright:Boolean):Unit = js.native
  def setBrightStyle(style:Float):Unit = js.native
  def didNotSelectSelf():Unit = js.native
  def onTouchBegan(touch:ccTouch, event:ccEvent):Boolean = js.native
  def onTouchMoved(touch:ccTouch, event:ccEvent):Unit = js.native
  def onTouchEnded(touch:js.Any, event:js.Any):Unit = js.native
  def onTouchCancelled(touchPoint:ccPoint):Unit = js.native
  def onTouchLongClicked(touchPoint:ccPoint):Unit = js.native
  def addTouchEventListener(selector:js.Function, target:js.Object):Unit = js.native
  def hitTest(pt:ccPoint):Boolean = js.native
  def isClippingParentContainsPoint(pt:ccPoint):Boolean = js.native
  def checkChildInfo(handleState:Float, sender:ccuiWidget, touchPoint:ccPoint):Unit = js.native
  def setPosition(pos:ccPoint, posY:Float):Unit = js.native
  def setPositionPercent(percent:ccPoint):Unit = js.native
  def getPositionPercent:ccPoint = js.native
  def setPositionType(_type:Float):Unit = js.native
  def getPositionType:Float = js.native
  def setFlippedX(flipX:Boolean):Unit = js.native
  def isFlippedX:Boolean = js.native
  def setFlippedY(flipY:Boolean):Unit = js.native
  def isFlippedY:Boolean = js.native
  def isBright:Boolean = js.native
  def isEnabled:Boolean = js.native
  def getLeftBoundary:Float = js.native
  def getBottomBoundary:Float = js.native
  def getRightBoundary:Float = js.native
  def getTopBoundary:Float = js.native
  def getTouchBeganPosition:ccPoint = js.native
  def getTouchMovePosition:ccPoint = js.native
  def getTouchEndPosition:ccPoint = js.native
  def getWidgetType:Float = js.native
  def setLayoutParameter(parameter:ccuiLayoutParameter):Unit = js.native
  def getLayoutParameter(_type:Float):ccuiLayoutParameter = js.native
  def getDescription:String = js.native
  override def clone:ccuiWidget = js.native
  def isUnifySizeEnabled:Boolean = js.native
  def setUnifySizeEnabled(enable:Boolean):Unit = js.native
  def addCCSEventListener(callback:js.Function):Unit = js.native
  def setCallbackName(callbackName:String):Unit = js.native
  def getCallbackName:String = js.native
  def setCallbackType(callbackType:String):Unit = js.native
  def getCallbackType:String = js.native
  def setLayoutComponentEnabled(enable:Boolean):Unit = js.native
  def isLayoutComponentEnabled:Boolean = js.native
  def enableDpadNavigation(enable:Boolean):Unit = js.native
}

