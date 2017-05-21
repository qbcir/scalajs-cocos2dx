package org.cocos2dxjs.cocos2d.core.layers

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.platform.ccBlendFunc
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
trait t_ccLayer extends t_ccNode {
  def bake():Unit = js.native
  def unbake():Unit = js.native
  def isBaked:Boolean = js.native
}

@js.native
@JSGlobal("cc.Layer")
class ccLayer extends t_ccLayer {
}

@js.native
@JSGlobal("cc.Layer")
object ccLayer extends js.Object {
}

@js.native
trait t_ccLayerColor extends t_ccLayer {
  def getBlendFunc:ccBlendFunc = js.native
  def init(color:ccColor, width:Float, height:Float):Boolean = js.native
  def setBlendFunc(src:Float, dst:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.LayerColor")
class ccLayerColor(color:ccColor, width:Float, height:Float) extends t_ccLayerColor {
}

@js.native
@JSGlobal("cc.LayerColor")
object ccLayerColor extends js.Object {
}

@js.native
trait t_ccLayerGradient extends t_ccLayerColor {
  def init(start:ccColor, end:ccColor, v:ccPoint, stops:js.Array[js.Any]):Boolean = js.native
  override def setContentSize(size:ccSize, height:Float):Unit = js.native
  def getStartColor:ccColor = js.native
  def setStartColor(color:ccColor):Unit = js.native
  def setEndColor(color:ccColor):Unit = js.native
  def getEndColor:ccColor = js.native
  def setStartOpacity(o:Float):Unit = js.native
  def getStartOpacity:Float = js.native
  def setEndOpacity(o:Float):Unit = js.native
  def getEndOpacity:Float = js.native
  def setVector(Var:ccPoint):Unit = js.native
  def getVector:ccPoint = js.native
  def isCompressedInterpolation:Boolean = js.native
  def setCompressedInterpolation(compress:Boolean):Unit = js.native
  def getColorStops:js.Array[js.Any] = js.native
  def setColorStops(colorStops:js.Any):Unit = js.native
}

@js.native
@JSGlobal("cc.LayerGradient")
class ccLayerGradient(start:ccColor, end:ccColor, v:ccPoint, stops:js.Array[js.Any]) extends t_ccLayerGradient {
}

@js.native
@JSGlobal("cc.LayerGradient")
object ccLayerGradient extends js.Object {
}

@js.native
trait t_ccLayerMultiplex extends t_ccLayer {
  def initWithLayers(layers:js.Array[js.Any]):Boolean = js.native
  def switchTo(n:Float):Unit = js.native
  def switchToAndReleaseMe(n:Float):Unit = js.native
  def addLayer(layer:ccLayer):Unit = js.native
}

@js.native
@JSGlobal("cc.LayerMultiplex")
class ccLayerMultiplex(layers:js.Array[js.Any]) extends t_ccLayerMultiplex {
}

@js.native
@JSGlobal("cc.LayerMultiplex")
object ccLayerMultiplex extends js.Object {
}



