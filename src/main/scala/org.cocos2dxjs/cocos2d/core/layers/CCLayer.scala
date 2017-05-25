package org.cocos2dxjs.cocos2d.core.layers

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.platform.{ccBlendFunc, t_ccBlendFunc}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}

@js.native
trait t_ccLayer extends t_ccNode {
  def bake():Unit = js.native
  def unbake():Unit = js.native
  def isBaked():Boolean = js.native
}

@js.native
trait ts_ccLayer extends ts_ccNode {
}

@js.native
@JSGlobal("cc.Layer")
class ccLayer() extends t_ccLayer {
}

@js.native
@JSGlobal("cc.Layer")
object ccLayer extends ts_ccLayer {
}

@js.native
trait t_ccLayerColor extends t_ccLayer {
  def getBlendFunc():ccBlendFunc = js.native
  def init(color:t_ccColor, width:Float, height:Float):Boolean = js.native
  def setBlendFunc(src:Float|t_ccBlendFunc, dst:Float):Unit = js.native
}

@js.native
trait ts_ccLayerColor extends ts_ccLayer {
}

@js.native
@JSGlobal("cc.LayerColor")
class ccLayerColor(color:t_ccColor, width:Float, height:Float) extends t_ccLayerColor {
}

@js.native
@JSGlobal("cc.LayerColor")
object ccLayerColor extends ts_ccLayerColor {
}

@js.native
trait t_ccLayerGradient extends t_ccLayerColor {
  var startColor: ccColor = js.native
  var endColor: ccColor = js.native
  var startOpacity: Float = js.native
  var endOpacity: Float = js.native
  var vector: Float = js.native
  var compressedInterpolation: Float = js.native
  def init(start:t_ccColor, end:t_ccColor, v:js.Dynamic|t_ccPoint, stops:js.Array[js.Any]|js.Dynamic):Boolean = js.native
  def getStartColor():ccColor = js.native
  def setStartColor(color:t_ccColor):Unit = js.native
  def setEndColor(color:t_ccColor):Unit = js.native
  def getEndColor():ccColor = js.native
  def setStartOpacity(o:Float):Unit = js.native
  def getStartOpacity():Float = js.native
  def setEndOpacity(o:Float):Unit = js.native
  def getEndOpacity():Float = js.native
  def setVector(Var:t_ccPoint):Unit = js.native
  def getVector():ccPoint = js.native
  def isCompressedInterpolation():Boolean = js.native
  def setCompressedInterpolation(compress:Boolean):Unit = js.native
  def getColorStops():js.Array[js.Any] = js.native
  def setColorStops(colorStops:js.Dynamic):Unit = js.native
}

@js.native
trait ts_ccLayerGradient extends ts_ccLayerColor {
}

@js.native
@JSGlobal("cc.LayerGradient")
class ccLayerGradient(start:t_ccColor, end:t_ccColor, v:t_ccPoint, stops:js.Array[js.Any]|js.Dynamic) extends t_ccLayerGradient {
}

@js.native
@JSGlobal("cc.LayerGradient")
object ccLayerGradient extends ts_ccLayerGradient {
}

@js.native
trait t_ccLayerMultiplex extends t_ccLayer {
  def initWithLayers(layers:js.Array[js.Any]):Boolean = js.native
  def switchTo(n:Float):Unit = js.native
  def switchToAndReleaseMe(n:Float):Unit = js.native
  def addLayer(layer:t_ccLayer):Unit = js.native
}

@js.native
trait ts_ccLayerMultiplex extends ts_ccLayer {
}

@js.native
@JSGlobal("cc.LayerMultiplex")
class ccLayerMultiplex(layers:js.Array[js.Any]) extends t_ccLayerMultiplex {
}

@js.native
@JSGlobal("cc.LayerMultiplex")
object ccLayerMultiplex extends ts_ccLayerMultiplex {
}


