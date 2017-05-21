package org.cocos2dxjs.cocos2d.parallax

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode

@js.native
trait t_ccPointObject extends t_ccClass {
  def getRatio:ccPoint = js.native
  def setRatio(value:ccPoint):Unit = js.native
  def getOffset:ccPoint = js.native
  def setOffset(value:ccPoint):Unit = js.native
  def getChild:ccNode = js.native
  def setChild(value:ccNode):Unit = js.native
  def initWithCCPoint(ratio:ccPoint, offset:ccPoint):Boolean = js.native
}

@js.native
@JSGlobal("cc.PointObject")
class ccPointObject extends t_ccPointObject {
}

@js.native
@JSGlobal("cc.PointObject")
object ccPointObject extends js.Object {
}

@js.native
trait t_ccParallaxNode extends t_ccNode {
  def getParallaxArray:js.Array[js.Any] = js.native
  def setParallaxArray(value:js.Array[js.Any]):Unit = js.native
  def addChild(child:ccNode, z:Float, ratio:ccPoint, offset:ccPoint):Unit = js.native
  override def removeChild(child:ccNode, cleanup:Boolean):Unit = js.native
  override def removeAllChildren(cleanup:Boolean):Unit = js.native
}

@js.native
@JSGlobal("cc.ParallaxNode")
class ccParallaxNode extends t_ccParallaxNode {
}

@js.native
@JSGlobal("cc.ParallaxNode")
object ccParallaxNode extends js.Object {
}



