package org.cocos2dxjs.extensions.gui.scrollview

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.layers.ccLayer
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.layers.t_ccLayer
import org.cocos2dxjs.cocos2d.core.layers.ts_ccLayer

@js.native
trait t_ccScrollView extends t_ccLayer {
  val minOffset: ccPoint = js.native
  val maxOffset: ccPoint = js.native
  var bounceable: Boolean = js.native
  var viewSize: ccSize = js.native
  var container: ccLayer = js.native
  var direction: Float = js.native
  var delegate: js.Any/*ccScrollViewDelegate*/ = js.native
  var clippingToBounds: Boolean = js.native
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
  def _initWithViewSize(size:js.Dynamic):Unit = js.native
  def _relocateContainer(animated:js.Dynamic):Unit = js.native
  def _deaccelerateScrolling(dt:Float):Unit = js.native
  def _performedAnimatedScroll():Unit = js.native
  def _stoppedAnimatedScroll():Unit = js.native
  def _handleZoom():Unit = js.native
}

@js.native
trait ts_ccScrollView extends ts_ccLayer {
}

@js.native
@JSGlobal("cc.ScrollView")
class ccScrollView(size:js.Dynamic, container:js.Dynamic) extends t_ccScrollView {
}

@js.native
@JSGlobal("cc.ScrollView")
object ccScrollView extends ts_ccScrollView {
}


