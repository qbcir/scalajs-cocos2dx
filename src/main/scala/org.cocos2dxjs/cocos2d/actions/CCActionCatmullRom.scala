package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}

@js.native
trait t_ccCardinalSplineTo extends t_ccActionInterval {
  def initWithDuration(duration:Float, points:js.Array[js.Any], tension:Float):Boolean = js.native
  override def clone():ccAction = js.native
  override def startWithTarget(target:t_ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse():ccAction = js.native
  def updatePosition(newPos:t_ccPoint):Unit = js.native
  def getPoints():js.Array[js.Any] = js.native
  def setPoints(points:js.Array[js.Any]):Unit = js.native
}

@js.native
trait ts_ccCardinalSplineTo extends ts_ccActionInterval {
}

@js.native
@JSGlobal("cc.CardinalSplineTo")
class ccCardinalSplineTo(duration:Float, points:js.Array[js.Any], tension:Float) extends t_ccCardinalSplineTo {
  var _points: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.CardinalSplineTo")
object ccCardinalSplineTo extends ts_ccCardinalSplineTo {
}

@js.native
trait t_ccCardinalSplineBy extends t_ccCardinalSplineTo {
  override def startWithTarget(target:t_ccNode):Unit = js.native
  override def reverse():ccAction = js.native
  override def updatePosition(newPos:t_ccPoint):Unit = js.native
  override def clone():ccAction = js.native
}

@js.native
trait ts_ccCardinalSplineBy extends ts_ccCardinalSplineTo {
}

@js.native
@JSGlobal("cc.CardinalSplineBy")
class ccCardinalSplineBy(duration:Float, points:js.Array[js.Any], tension:Float) extends t_ccCardinalSplineBy {
  var _points: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.CardinalSplineBy")
object ccCardinalSplineBy extends ts_ccCardinalSplineBy {
}

@js.native
trait t_ccCatmullRomTo extends t_ccCardinalSplineTo {
  def initWithDuration(dt:Float, points:js.Array[js.Any]):Unit = js.native
  override def clone():ccAction = js.native
}

@js.native
trait ts_ccCatmullRomTo extends ts_ccCardinalSplineTo {
}

@js.native
@JSGlobal("cc.CatmullRomTo")
class ccCatmullRomTo(dt:Float, points:js.Array[js.Any]) extends t_ccCatmullRomTo {
  var _points: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.CatmullRomTo")
object ccCatmullRomTo extends ts_ccCatmullRomTo {
}

@js.native
trait t_ccCatmullRomBy extends t_ccCardinalSplineBy {
}

@js.native
trait ts_ccCatmullRomBy extends ts_ccCardinalSplineBy {
}

@js.native
@JSGlobal("cc.CatmullRomBy")
class ccCatmullRomBy(dt:Float, points:js.Array[js.Any]) extends t_ccCatmullRomBy {
  var _points: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.CatmullRomBy")
object ccCatmullRomBy extends ts_ccCatmullRomBy {
}


