package org.cocos2dxjs.cocos2d.clippingnodes

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode

@js.native
trait t_ccClippingNode extends t_ccNode {
  var alphaThreshold: Float = js.native
  var inverted: Boolean = js.native
  var stencil: ccNode = js.native
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

@js.native
trait ts_ccClippingNode extends ts_ccNode {
}

@js.native
@JSGlobal("cc.ClippingNode")
class ccClippingNode(stencil:ccNode) extends t_ccClippingNode {
}

@js.native
@JSGlobal("cc.ClippingNode")
object ccClippingNode extends ts_ccClippingNode {
}


