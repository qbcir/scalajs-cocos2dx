package org.cocos2dxjs.extensions.gui.scrollview

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.layers.ccLayer
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode

@js.native
@JSGlobal("cc.ScrollView")
class ccScrollView extends ccLayer {
  def initWithViewSize(size:ccSize, container:ccNode):Boolean = js.native
  def setContentOffset(offset:ccPoint, animated:Float):Unit = js.native
  def setContentOffsetInDuration(offset:ccPoint, dt:Float):Unit = js.native
  def setZoomScale(scale:Float, animated:Boolean):Unit = js.native
  def setZoomScaleInDuration(s:Float, dt:Float):Unit = js.native
  def minContainerOffset:ccPoint = js.native
  def maxContainerOffset:ccPoint = js.native
  def isNodeVisible(node:ccNode):Boolean = js.native
  override def pause():Unit = js.native
  override def resume():Unit = js.native
  def getViewSize():Unit = js.native
  def getDirection():Unit = js.native
  def onTouchBegan():Unit = js.native
  def isClippingToBounds():Unit = js.native
  def _initWithViewSize(size:js.Any):Unit = js.native
  def _relocateContainer(animated:js.Any):Unit = js.native
  def _deaccelerateScrolling(dt:Float):Unit = js.native
  def _performedAnimatedScroll():Unit = js.native
  def _stoppedAnimatedScroll():Unit = js.native
  def _handleZoom():Unit = js.native
}

