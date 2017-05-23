package org.cocos2dxjs.cocos2d.shapenodes

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode

@js.native
trait t_ccDrawNode extends t_ccNode {
  def getBlendFunc:types.DynObject = js.native
  def setBlendFunc(blendFunc:js.Dynamic, dst:js.Dynamic):Unit = js.native
  def setLineWidth(width:Float):Unit = js.native
  def getLineWidth:Float = js.native
  def setDrawColor(color:t_ccColor):Unit = js.native
  def getDrawColor:ccColor = js.native
  def drawRect(origin:t_ccPoint, destination:t_ccPoint, fillColor:t_ccColor, lineWidth:Float, lineColor:t_ccColor):Unit = js.native
  def drawCircle(center:t_ccPoint, radius:Float, angle:Float, segments:Float, drawLineToCenter:Boolean, lineWidth:Float, color:t_ccColor):Unit = js.native
  def drawQuadBezier(origin:t_ccPoint, control:t_ccPoint, destination:t_ccPoint, segments:Float, lineWidth:Float, color:t_ccColor):Unit = js.native
  def drawCubicBezier(origin:t_ccPoint, control1:t_ccPoint, control2:t_ccPoint, destination:t_ccPoint, segments:Float, lineWidth:Float, color:t_ccColor):Unit = js.native
  def drawCatmullRom(points:js.Array[js.Any], segments:Float, lineWidth:Float, color:t_ccColor):Unit = js.native
  def drawCardinalSpline(config:js.Array[js.Any], tension:Float, segments:Float, lineWidth:Float, color:t_ccColor):Unit = js.native
  def drawDot(pos:t_ccPoint, radius:Float, color:t_ccColor):Unit = js.native
  def drawDots(points:js.Array[js.Any], radius:Float, color:t_ccColor):Unit = js.native
  def drawSegment(from:t_ccPoint, to:t_ccPoint, lineWidth:Float, color:t_ccColor):Unit = js.native
  def drawPoly_(verts:js.Array[js.Any], fillColor:Null|t_ccColor, lineWidth:Float, color:t_ccColor):Unit = js.native
  def drawPoly(verts:js.Array[js.Any], fillColor:Null|t_ccColor, lineWidth:Float, lineColor:t_ccColor):Unit = js.native
  def clear():Unit = js.native
}

@js.native
trait ts_ccDrawNode extends ts_ccNode {
}

@js.native
@JSGlobal("cc.DrawNode")
class ccDrawNode extends t_ccDrawNode {
}

@js.native
@JSGlobal("cc.DrawNode")
object ccDrawNode extends ts_ccDrawNode {
}


