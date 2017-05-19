package org.cocos2dxjs.cocos2d.clippingnodes

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode

@js.native
@JSGlobal("cc.ClippingNode")
class ccClippingNode extends ccNode {
  override def onEnter():Unit = js.native
  override def onEnterTransitionDidFinish():Unit = js.native
  override def onExitTransitionDidStart():Unit = js.native
  override def onExit():Unit = js.native
  def getAlphaThreshold:Float = js.native
  def setAlphaThreshold(alphaThreshold:Float):Unit = js.native
  def isInverted:Boolean = js.native
  def setInverted(inverted:Boolean):Unit = js.native
  def getStencil:ccNode = js.native
  def setStencil(stencil:ccNode):Unit = js.native
}

