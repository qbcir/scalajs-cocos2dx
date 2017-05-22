package org.cocos2dxjs.cocos2d.core

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass

@js.native
trait t_ccDrawingPrimitiveWebGL extends t_ccClass {
  def drawInit():Unit = js.native
  def drawPoint(point:ccPoint):Unit = js.native
  def drawPoints(points:js.Array[js.Any], numberOfPoints:Float):Unit = js.native
  def drawLine(origin:ccPoint, destination:ccPoint):Unit = js.native
  def drawRect(origin:ccPoint, destination:ccPoint):Unit = js.native
  def drawSolidRect(origin:ccPoint, destination:ccPoint, color:ccColor):Unit = js.native
  def drawPoly(vertices:js.Array[js.Any], numOfVertices:Float, closePolygon:Boolean):Unit = js.native
  def drawSolidPoly(poli:js.Array[js.Any], numberOfPoints:Float, color:ccColor):Unit = js.native
  def drawCircle(center:ccPoint, radius:Float, angle:Float, segments:Float, drawLineToCenter:Boolean):Unit = js.native
  def drawQuadBezier(origin:ccPoint, control:ccPoint, destination:ccPoint, segments:Float):Unit = js.native
  def drawCubicBezier(origin:ccPoint, control1:ccPoint, control2:ccPoint, destination:ccPoint, segments:Float):Unit = js.native
  def drawCatmullRom(points:js.Array[js.Any], segments:Float):Unit = js.native
  def drawCardinalSpline(config:js.Array[js.Any], tension:Float, segments:Float):Unit = js.native
  def setDrawColor(r:Float, g:Float, b:Float, a:Float):Unit = js.native
  def setPointSize(pointSize:Float):Unit = js.native
  def setLineWidth(width:Float):Unit = js.native
}

@js.native
trait ts_ccDrawingPrimitiveWebGL extends ts_ccClass {
}

@js.native
@JSGlobal("cc.DrawingPrimitiveWebGL")
class ccDrawingPrimitiveWebGL(ctx:js.Dynamic) extends t_ccDrawingPrimitiveWebGL {
}

@js.native
@JSGlobal("cc.DrawingPrimitiveWebGL")
object ccDrawingPrimitiveWebGL extends ts_ccDrawingPrimitiveWebGL {
}


