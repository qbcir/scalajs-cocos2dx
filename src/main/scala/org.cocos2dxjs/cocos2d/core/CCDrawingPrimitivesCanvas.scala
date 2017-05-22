package org.cocos2dxjs.cocos2d.core

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass

@js.native
trait t_ccDrawingPrimitiveCanvas extends t_ccClass {
  def drawPoint(point:t_ccPoint, size:Float):Unit = js.native
  def drawPoints(points:js.Array[js.Any], numberOfPoints:Float, size:Float):Unit = js.native
  def drawLine(origin:t_ccPoint, destination:t_ccPoint):Unit = js.native
  def drawRect(origin:t_ccPoint, destination:t_ccPoint):Unit = js.native
  def drawSolidRect(origin:t_ccPoint, destination:t_ccPoint, color:t_ccColor):Unit = js.native
  def drawPoly(vertices:js.Array[js.Any], numOfVertices:Float, closePolygon:Boolean, fill:Boolean):Unit = js.native
  def drawSolidPoly(polygons:js.Array[js.Any], numberOfPoints:Float, color:t_ccColor):Unit = js.native
  def drawCircle(center:t_ccPoint, radius:Float, angle:Float, segments:Float, drawLineToCenter:Boolean):Unit = js.native
  def drawQuadBezier(origin:t_ccPoint, control:t_ccPoint, destination:t_ccPoint, segments:Float):Unit = js.native
  def drawCubicBezier(origin:t_ccPoint, control1:t_ccPoint, control2:t_ccPoint, destination:t_ccPoint, segments:Float):Unit = js.native
  def drawCatmullRom(points:js.Array[js.Any], segments:Float):Unit = js.native
  def drawCardinalSpline(config:js.Array[js.Any], tension:Float, segments:Float):Unit = js.native
  def drawImage(image:js.Dynamic | js.Dynamic, sourcePoint:t_ccPoint, sourceSize:t_ccSize, destPoint:t_ccPoint, destSize:t_ccSize):Unit = js.native
  def drawStar(ctx:js.Any/*ccCanvasContextWrapper*/, radius:Float, color:t_ccColor):Unit = js.native
  def drawColorBall(ctx:js.Any/*ccCanvasContextWrapper*/, radius:Float, color:t_ccColor):Unit = js.native
  def fillText(strText:String, x:Float, y:Float):Unit = js.native
  def setDrawColor(r:Float, g:Float, b:Float, a:Float):Unit = js.native
  def setPointSize(pointSize:Float):Unit = js.native
  def setLineWidth(width:Float):Unit = js.native
}

@js.native
trait ts_ccDrawingPrimitiveCanvas extends ts_ccClass {
}

@js.native
@JSGlobal("cc.DrawingPrimitiveCanvas")
class ccDrawingPrimitiveCanvas(renderContext:js.Any/*ccCanvasContextWrapper*/) extends t_ccDrawingPrimitiveCanvas {
}

@js.native
@JSGlobal("cc.DrawingPrimitiveCanvas")
object ccDrawingPrimitiveCanvas extends ts_ccDrawingPrimitiveCanvas {
}


