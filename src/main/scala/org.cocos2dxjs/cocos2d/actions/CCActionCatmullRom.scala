package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint

@js.native
@JSGlobal("cc.CardinalSplineTo")
class ccCardinalSplineTo extends ccActionInterval {
  def initWithDuration(duration:Float, points:js.Array[js.Any], tension:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  def updatePosition(newPos:ccPoint):Unit = js.native
  def getPoints:js.Array[js.Any] = js.native
  def setPoints(points:js.Array[js.Any]):Unit = js.native
}

@js.native
@JSGlobal("cc.CardinalSplineBy")
class ccCardinalSplineBy extends ccCardinalSplineTo {
  override def startWithTarget(target:ccNode):Unit = js.native
  override def reverse:ccAction = js.native
  override def updatePosition(newPos:ccPoint):Unit = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.CatmullRomTo")
class ccCatmullRomTo extends ccCardinalSplineTo {
  def initWithDuration(dt:Float, points:js.Array[js.Any]):Unit = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.CatmullRomBy")
class ccCatmullRomBy extends ccCardinalSplineBy {
}

