package org.cocos2dxjs.extensions.ccui.baseclasses

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.eventmanager.ccTouch
import org.cocos2dxjs.cocos2d.core.eventmanager.ccEvent
import org.cocos2dxjs.extensions.ccui.layouts.ccuiLayoutParameter
import org.cocos2dxjs.extensions.ccui.system.t_ccuiProtectedNode
import org.cocos2dxjs.extensions.ccui.system.ts_ccuiProtectedNode

@js.native
trait t_ccuiWidget extends t_ccuiProtectedNode {
  var xPercent: Float = js.native
  var yPercent: Float = js.native
  var widthPercent: Float = js.native
  var heightPercent: Float = js.native
  val widgetParent: ccuiWidget = js.native
  var enabled: Boolean = js.native
  var focused: Boolean = js.native
  var sizeType: Float | Float = js.native
  val widgetType: Float | Float = js.native
  var touchEnabled: Boolean = js.native
  var updateEnabled: Boolean = js.native
  var bright: Boolean = js.native
  var name: String = js.native
  var actionTag: Float = js.native
  def init:Boolean = js.native
  def onEnter():Unit = js.native
  def onExit():Unit = js.native
  def getWidgetParent:ccuiWidget | js.Dynamic = js.native
  def setPropagateTouchEvents(isPropagate:Boolean):Unit = js.native
  def isPropagateTouchEvents:Boolean = js.native
  def setSwallowTouches(swallow:Boolean):Unit = js.native
  def isSwallowTouches:Boolean = js.native
  def setEnabled(enabled:Boolean):Unit = js.native
  def _initRenderer():Unit = js.native
  def setContentSize(contentSize:ccSize | Float, height:Float):Unit = js.native
  def setSizePercent(percent:ccPoint):Unit = js.native
  def updateSizeAndPosition(parentSize:ccSize):Unit = js.native
  def setSizeType(_type:Float | Float):Unit = js.native
  def getSizeType:Float | Float = js.native
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
  def setHighlighted(highlight:js.Dynamic):Unit = js.native
  def isFocused:Boolean = js.native
  def setFocused(focus:Boolean):Unit = js.native
  def isFocusEnabled:Boolean = js.native
  def setFocusEnabled(enable:Boolean):Unit = js.native
  def findNextFocusedWidget(direction:js.Dynamic, current:js.Dynamic):Unit = js.native
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
  def onTouchEnded(touch:js.Dynamic, event:js.Dynamic):Unit = js.native
  def onTouchCancelled(touchPoint:ccPoint):Unit = js.native
  def onTouchLongClicked(touchPoint:ccPoint):Unit = js.native
  def addTouchEventListener(selector:js.Function, target:types.DynObject):Unit = js.native
  def hitTest(pt:ccPoint):Boolean = js.native
  def isClippingParentContainsPoint(pt:ccPoint):Boolean = js.native
  def checkChildInfo(handleState:Float, sender:ccuiWidget, touchPoint:ccPoint):Unit = js.native
  def setPosition(pos:ccPoint | Float, posY:Float):Unit = js.native
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
  def getWidgetType:Float | Float = js.native
  def setLayoutParameter(parameter:ccuiLayoutParameter):Unit = js.native
  def getLayoutParameter(_type:Float | Float | Float):ccuiLayoutParameter = js.native
  def getDescription:String = js.native
  override def clone:ccuiWidget = js.native
  def isUnifySizeEnabled:Boolean = js.native
  def setUnifySizeEnabled(enable:Boolean):Unit = js.native
  def addCCSEventListener(callback:js.Function):Unit = js.native
  def setCallbackName(callbackName:String):Unit = js.native
  def getCallbackName:String | js.Dynamic = js.native
  def setCallbackType(callbackType:String):Unit = js.native
  def getCallbackType:String | js.Dynamic = js.native
  def setLayoutComponentEnabled(enable:Boolean):Unit = js.native
  def isLayoutComponentEnabled:Boolean = js.native
}

@js.native
trait ts_ccuiWidget extends ts_ccuiProtectedNode {
  def enableDpadNavigation(enable:Boolean):Unit = js.native
  def getCurrentFocusedWidget():Unit = js.native
}

@js.native
@JSGlobal("ccui.Widget")
class ccuiWidget extends t_ccuiWidget {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.Widget")
object ccuiWidget extends ts_ccuiWidget {
  val BRIGHT_STYLE_NONE: Float = js.native
  val BRIGHT_STYLE_NORMAL: Float = js.native
  val BRIGHT_STYLE_HIGH_LIGHT: Float = js.native
  val TYPE_WIDGET: Float = js.native
  val TYPE_CONTAINER: Float = js.native
  val LEFT: Float = js.native
  val RIGHT: Float = js.native
  val UP: Float = js.native
  val DOWN: Float = js.native
  val LOCAL_TEXTURE: Float = js.native
  val PLIST_TEXTURE: Float = js.native
  val TOUCH_BEGAN: Float = js.native
  val TOUCH_MOVED: Float = js.native
  val TOUCH_ENDED: Float = js.native
  val TOUCH_CANCELED: Float = js.native
  val SIZE_ABSOLUTE: Float = js.native
  val SIZE_PERCENT: Float = js.native
  val POSITION_ABSOLUTE: Float = js.native
  val POSITION_PERCENT: Float = js.native
}


