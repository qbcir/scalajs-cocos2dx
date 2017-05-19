package org.cocos2dxjs.cocos2d.core.layers

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.ccBlendFunc
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize

@js.native
@JSGlobal("cc.Layer")
class ccLayer extends ccNode {
  def bake():Unit = js.native
  def unbake():Unit = js.native
  def isBaked:Boolean = js.native
}

@js.native
@JSGlobal("cc.LayerColor")
class ccLayerColor extends ccLayer {
  def getBlendFunc:ccBlendFunc = js.native
  def init(color:ccColor, width:Float, height:Float):Boolean = js.native
  def setBlendFunc(src:Float, dst:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.LayerGradient")
class ccLayerGradient extends ccLayerColor {
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
@JSGlobal("cc.LayerMultiplex")
class ccLayerMultiplex extends ccLayer {
  def initWithLayers(layers:js.Array[js.Any]):Boolean = js.native
  def switchTo(n:Float):Unit = js.native
  def switchToAndReleaseMe(n:Float):Unit = js.native
  def addLayer(layer:ccLayer):Unit = js.native
}

