package org.cocos2dxjs.cocos2d.parallax

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.ccClass

@js.native
@JSGlobal("cc.PointObject")
class ccPointObject extends ccClass {
  def getRatio:ccPoint = js.native
  def setRatio(value:ccPoint):Unit = js.native
  def getOffset:ccPoint = js.native
  def setOffset(value:ccPoint):Unit = js.native
  def getChild:ccNode = js.native
  def setChild(value:ccNode):Unit = js.native
  def initWithCCPoint(ratio:ccPoint, offset:ccPoint):Boolean = js.native
}

@js.native
@JSGlobal("cc.ParallaxNode")
class ccParallaxNode extends ccNode {
  def getParallaxArray:js.Array[js.Any] = js.native
  def setParallaxArray(value:js.Array[js.Any]):Unit = js.native
  def addChild(child:ccNode, z:Float, ratio:ccPoint, offset:ccPoint):Unit = js.native
  override def removeChild(child:ccNode, cleanup:Boolean):Unit = js.native
  override def removeAllChildren(cleanup:Boolean):Unit = js.native
}

