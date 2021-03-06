package org.cocos2dxjs.extensions.ccui.layouts

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.extensions.ccui.baseclasses.{ccuiWidget, t_ccuiWidget}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.extensions.ccui.baseclasses.t_ccuiWidget
import org.cocos2dxjs.extensions.ccui.baseclasses.ts_ccuiWidget

@js.native
trait t_ccuiLayout extends t_ccuiWidget {
  var clippingEnabled: Boolean = js.native
  var clippingType: Float = js.native
  var layoutType: Float = js.native
  override def onEnter():Unit = js.native
  override def onExit():Unit = js.native
  def visit(parent:t_ccNode):Unit = js.native
  def setLoopFocus(loop:Boolean):Unit = js.native
  def isLoopFocus():Boolean = js.native
  def setPassFocusToChild(pass:js.Dynamic):Unit = js.native
  def isPassFocusToChild():Boolean = js.native
  def findNextFocusedWidget(direction:Float, current:t_ccuiWidget):ccuiWidget = js.native
  def onPassFocusToChild(direction:Float, current:t_ccuiWidget):Unit = js.native
  def addChild(widget:t_ccuiWidget, zOrder:Float, tag:Float|String):Unit = js.native
  def removeChild(widget:t_ccuiWidget, cleanup:Boolean):Unit = js.native
  def removeAllChildren(cleanup:Boolean):Unit = js.native
  def removeAllChildrenWithCleanup(cleanup:Boolean):Unit = js.native
  def isClippingEnabled():Boolean = js.native
  def setClippingEnabled(able:Boolean):Unit = js.native
  def setClippingType(_type:Float):Unit = js.native
  def getClippingType():Float = js.native
  def setBackGroundImageScale9Enabled(able:Boolean):Unit = js.native
  def isBackGroundImageScale9Enabled():Boolean = js.native
  def setBackGroundImage(fileName:String, texType:Float):Unit = js.native
  def setBackGroundImageCapInsets(capInsets:t_ccRect):Unit = js.native
  def getBackGroundImageCapInsets():ccRect = js.native
  def removeBackGroundImage():Unit = js.native
  def setBackGroundColorType(_type:Float):Unit = js.native
  def getBackGroundColorType():Float = js.native
  def setBackGroundColor(color:t_ccColor, endColor:t_ccColor):Unit = js.native
  def getBackGroundColor():ccColor = js.native
  def getBackGroundStartColor():ccColor = js.native
  def getBackGroundEndColor():ccColor = js.native
  def setBackGroundColorOpacity(opacity:Float):Unit = js.native
  def getBackGroundColorOpacity():Float = js.native
  def setBackGroundColorVector(vector:t_ccPoint):Unit = js.native
  def getBackGroundColorVector():ccPoint = js.native
  def setBackGroundImageColor(color:t_ccColor):Unit = js.native
  def setBackGroundImageOpacity(opacity:Float):Unit = js.native
  def getBackGroundImageColor():ccColor = js.native
  def getBackGroundImageOpacity():Float = js.native
  def getBackGroundImageTextureSize():ccSize = js.native
  def setLayoutType(_type:Float):Unit = js.native
  def getLayoutType():Null = js.native
  def requestDoLayout():Unit = js.native
  def _getLayoutAccumulatedSize():ccSize = js.native
  def _findNearestChildWidgetIndex(direction:Float, baseWidget:t_ccuiWidget):Float = js.native
  def _findFarthestChildWidgetIndex(direction:Float, baseWidget:t_ccuiWidget):Float = js.native
  def _calculateNearestDistance(baseWidget:t_ccuiWidget):Float = js.native
  def _calculateFarthestDistance(baseWidget:js.Dynamic):Float = js.native
  def _findProperSearchingFunctor(direction:js.Dynamic, baseWidget:js.Dynamic):Unit = js.native
  def _findFirstNonLayoutWidget():ccuiWidget = js.native
  def _findFirstFocusEnabledWidgetIndex():Float = js.native
  def _findFocusEnabledChildWidgetByIndex(index:js.Dynamic):js.Dynamic = js.native
  def _getWorldCenterPoint(widget:t_ccuiWidget):ccPoint = js.native
  def _getNextFocusedWidget(direction:Float, current:t_ccuiWidget):ccuiWidget = js.native
  def _getPreviousFocusedWidget(direction:js.Dynamic, current:t_ccuiWidget):ccuiWidget = js.native
  def _getChildWidgetByIndex(index:Float):ccuiWidget = js.native
  def _isLastWidgetInContainer(widget:t_ccuiWidget, direction:Float):Boolean = js.native
  def _isWidgetAncestorSupportLoopFocus(widget:t_ccuiWidget, direction:Float):Boolean = js.native
  def _passFocusToChild(direction:Float, current:t_ccuiWidget):ccuiWidget = js.native
  def _checkFocusEnabledChild():Boolean = js.native
  override def getDescription():String = js.native
  def forceDoLayout():Unit = js.native
}

@js.native
trait ts_ccuiLayout extends ts_ccuiWidget {
}

@js.native
@JSGlobal("ccui.Layout")
class ccuiLayout() extends t_ccuiLayout {
  var onFocusChanged: js.Dynamic = js.native
  var onNextFocusedWidget: js.Dynamic = js.native
}

@js.native
@JSGlobal("ccui.Layout")
object ccuiLayout extends ts_ccuiLayout {
  val BG_COLOR_NONE: Float = js.native
  val BG_COLOR_SOLID: Float = js.native
  val BG_COLOR_GRADIENT: Float = js.native
  val ABSOLUTE: Float = js.native
  val LINEAR_VERTICAL: Float = js.native
  val LINEAR_HORIZONTAL: Float = js.native
  val RELATIVE: Float = js.native
  val CLIPPING_STENCIL: Float = js.native
  val CLIPPING_SCISSOR: Float = js.native
  val BACKGROUND_IMAGE_ZORDER: Float = js.native
  val BACKGROUND_RENDERER_ZORDER: Float = js.native
}


