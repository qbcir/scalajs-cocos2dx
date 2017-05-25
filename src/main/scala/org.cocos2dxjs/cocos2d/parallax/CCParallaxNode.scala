package org.cocos2dxjs.cocos2d.parallax

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode

@js.native
trait t_ccPointObject extends t_ccClass {
  def getRatio():ccPoint = js.native
  def setRatio(value:t_ccPoint):Unit = js.native
  def getOffset():ccPoint = js.native
  def setOffset(value:t_ccPoint):Unit = js.native
  def getChild():ccNode = js.native
  def setChild(value:t_ccNode):Unit = js.native
  def initWithCCPoint(ratio:t_ccPoint, offset:t_ccPoint):Boolean = js.native
}

@js.native
trait ts_ccPointObject extends ts_ccClass {
}

@js.native
@JSGlobal("cc.PointObject")
class ccPointObject() extends t_ccPointObject {
}

@js.native
@JSGlobal("cc.PointObject")
object ccPointObject extends ts_ccPointObject {
}

@js.native
trait t_ccParallaxNode extends t_ccNode {
  var parallaxArray: js.Array[js.Any] = js.native
  def getParallaxArray():js.Array[js.Any] = js.native
  def setParallaxArray(value:js.Array[js.Any]):Unit = js.native
  def addChild(child:t_ccNode, z:Float, ratio:t_ccPoint, offset:t_ccPoint):Unit = js.native
  override def removeChild(child:t_ccNode, cleanup:Boolean):Unit = js.native
  override def removeAllChildren(cleanup:Boolean):Unit = js.native
}

@js.native
trait ts_ccParallaxNode extends ts_ccNode {
}

@js.native
@JSGlobal("cc.ParallaxNode")
class ccParallaxNode() extends t_ccParallaxNode {
}

@js.native
@JSGlobal("cc.ParallaxNode")
object ccParallaxNode extends ts_ccParallaxNode {
}


