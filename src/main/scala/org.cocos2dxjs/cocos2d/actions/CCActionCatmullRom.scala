package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint

@js.native
trait t_ccCardinalSplineTo extends t_ccActionInterval {
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
@JSGlobal("cc.CardinalSplineTo")
class ccCardinalSplineTo(duration:Float, points:js.Array[js.Any], tension:Float) extends t_ccCardinalSplineTo {
}

@js.native
@JSGlobal("cc.CardinalSplineTo")
object ccCardinalSplineTo extends js.Object {
}

@js.native
trait t_ccCardinalSplineBy extends t_ccCardinalSplineTo {
  override def startWithTarget(target:ccNode):Unit = js.native
  override def reverse:ccAction = js.native
  override def updatePosition(newPos:ccPoint):Unit = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.CardinalSplineBy")
class ccCardinalSplineBy(duration:Float, points:js.Array[js.Any], tension:Float) extends t_ccCardinalSplineBy {
}

@js.native
@JSGlobal("cc.CardinalSplineBy")
object ccCardinalSplineBy extends js.Object {
}

@js.native
trait t_ccCatmullRomTo extends t_ccCardinalSplineTo {
  def initWithDuration(dt:Float, points:js.Array[js.Any]):Unit = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.CatmullRomTo")
class ccCatmullRomTo(dt:Float, points:js.Array[js.Any]) extends t_ccCatmullRomTo {
}

@js.native
@JSGlobal("cc.CatmullRomTo")
object ccCatmullRomTo extends js.Object {
}

@js.native
trait t_ccCatmullRomBy extends t_ccCardinalSplineBy {
}

@js.native
@JSGlobal("cc.CatmullRomBy")
class ccCatmullRomBy extends t_ccCatmullRomBy {
}

@js.native
@JSGlobal("cc.CatmullRomBy")
object ccCatmullRomBy extends js.Object {
}

