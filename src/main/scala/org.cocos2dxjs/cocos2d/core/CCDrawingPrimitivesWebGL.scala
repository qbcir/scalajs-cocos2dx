package org.cocos2dxjs.cocos2d.core

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass

@js.native
trait t_ccDrawingPrimitiveWebGL extends t_ccClass {
  def drawInit():Unit = js.native
  def drawPoint(point:t_ccPoint):Unit = js.native
  def drawPoints(points:js.Array[js.Any], numberOfPoints:Float):Unit = js.native
  def drawLine(origin:t_ccPoint, destination:t_ccPoint):Unit = js.native
  def drawRect(origin:t_ccPoint, destination:t_ccPoint):Unit = js.native
  def drawSolidRect(origin:t_ccPoint, destination:t_ccPoint, color:t_ccColor):Unit = js.native
  def drawPoly(vertices:js.Array[js.Any], numOfVertices:Float, closePolygon:Boolean):Unit = js.native
  def drawSolidPoly(poli:js.Array[js.Any], numberOfPoints:Float, color:t_ccColor):Unit = js.native
  def drawCircle(center:t_ccPoint, radius:Float, angle:Float, segments:Float, drawLineToCenter:Boolean):Unit = js.native
  def drawQuadBezier(origin:t_ccPoint, control:t_ccPoint, destination:t_ccPoint, segments:Float):Unit = js.native
  def drawCubicBezier(origin:t_ccPoint, control1:t_ccPoint, control2:t_ccPoint, destination:t_ccPoint, segments:Float):Unit = js.native
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


