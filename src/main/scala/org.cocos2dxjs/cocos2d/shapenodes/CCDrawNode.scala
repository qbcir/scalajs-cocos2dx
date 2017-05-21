package org.cocos2dxjs.cocos2d.shapenodes

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode

@js.native
trait t_ccDrawNode extends t_ccNode {
  def getBlendFunc:js.Object = js.native
  def setBlendFunc(blendFunc:js.Any, dst:js.Any):Unit = js.native
  def setLineWidth(width:Float):Unit = js.native
  def getLineWidth:Float = js.native
  def setDrawColor(color:ccColor):Unit = js.native
  def getDrawColor:ccColor = js.native
  def drawRect(origin:ccPoint, destination:ccPoint, fillColor:ccColor, lineWidth:Float, lineColor:ccColor):Unit = js.native
  def drawCircle(center:ccPoint, radius:Float, angle:Float, segments:Float, drawLineToCenter:Boolean, lineWidth:Float, color:ccColor):Unit = js.native
  def drawQuadBezier(origin:ccPoint, control:ccPoint, destination:ccPoint, segments:Float, lineWidth:Float, color:ccColor):Unit = js.native
  def drawCubicBezier(origin:ccPoint, control1:ccPoint, control2:ccPoint, destination:ccPoint, segments:Float, lineWidth:Float, color:ccColor):Unit = js.native
  def drawCatmullRom(points:js.Array[js.Any], segments:Float, lineWidth:Float, color:ccColor):Unit = js.native
  def drawCardinalSpline(config:js.Array[js.Any], tension:Float, segments:Float, lineWidth:Float, color:ccColor):Unit = js.native
  def drawDot(pos:ccPoint, radius:Float, color:ccColor):Unit = js.native
  def drawDots(points:js.Array[js.Any], radius:Float, color:ccColor):Unit = js.native
  def drawSegment(from:ccPoint, to:ccPoint, lineWidth:Float, color:ccColor):Unit = js.native
  def drawPoly_(verts:js.Array[js.Any], fillColor:ccColor, lineWidth:Float, color:ccColor):Unit = js.native
  def drawPoly(verts:js.Array[js.Any], fillColor:ccColor, lineWidth:Float, lineColor:ccColor):Unit = js.native
  def clear():Unit = js.native
}

@js.native
@JSGlobal("cc.DrawNode")
class ccDrawNode extends t_ccDrawNode {
}

@js.native
@JSGlobal("cc.DrawNode")
object ccDrawNode extends js.Object {
}


