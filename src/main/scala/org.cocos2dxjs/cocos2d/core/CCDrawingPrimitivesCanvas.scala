package org.cocos2dxjs.cocos2d.core

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass

@js.native
trait t_ccDrawingPrimitiveCanvas extends t_ccClass {
  def drawPoint(point:ccPoint, size:Float):Unit = js.native
  def drawPoints(points:js.Array[js.Any], numberOfPoints:Float, size:Float):Unit = js.native
  def drawLine(origin:ccPoint, destination:ccPoint):Unit = js.native
  def drawRect(origin:ccPoint, destination:ccPoint):Unit = js.native
  def drawSolidRect(origin:ccPoint, destination:ccPoint, color:ccColor):Unit = js.native
  def drawPoly(vertices:js.Array[js.Any], numOfVertices:Float, closePolygon:Boolean, fill:Boolean):Unit = js.native
  def drawSolidPoly(polygons:js.Array[js.Any], numberOfPoints:Float, color:ccColor):Unit = js.native
  def drawCircle(center:ccPoint, radius:Float, angle:Float, segments:Float, drawLineToCenter:Boolean):Unit = js.native
  def drawQuadBezier(origin:ccPoint, control:ccPoint, destination:ccPoint, segments:Float):Unit = js.native
  def drawCubicBezier(origin:ccPoint, control1:ccPoint, control2:ccPoint, destination:ccPoint, segments:Float):Unit = js.native
  def drawCatmullRom(points:js.Array[js.Any], segments:Float):Unit = js.native
  def drawCardinalSpline(config:js.Array[js.Any], tension:Float, segments:Float):Unit = js.native
  def drawImage(image:js.Any, sourcePoint:ccPoint, sourceSize:ccSize, destPoint:ccPoint, destSize:ccSize):Unit = js.native
  def drawStar(ctx:js.Any/*ccCanvasContextWrapper*/, radius:Float, color:ccColor):Unit = js.native
  def drawColorBall(ctx:js.Any/*ccCanvasContextWrapper*/, radius:Float, color:ccColor):Unit = js.native
  def fillText(strText:String, x:Float, y:Float):Unit = js.native
  def setDrawColor(r:Float, g:Float, b:Float, a:Float):Unit = js.native
  def setPointSize(pointSize:Float):Unit = js.native
  def setLineWidth(width:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.DrawingPrimitiveCanvas")
class ccDrawingPrimitiveCanvas(renderContext:js.Any/*ccCanvasContextWrapper*/) extends t_ccDrawingPrimitiveCanvas {
}

@js.native
@JSGlobal("cc.DrawingPrimitiveCanvas")
object ccDrawingPrimitiveCanvas extends js.Object {
}



