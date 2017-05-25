package org.cocos2dxjs.cocos2d.rendertexture

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.sprites.{ccSprite, t_ccSprite}
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}
import org.cocos2dxjs.cocos2d.core.platform.{ccClass, t_ccClass}
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode

@js.native
trait t_ccRenderTexture extends t_ccNode {
  var sprite: ccSprite = js.native
  var clearFlags: ccSprite = js.native
  var clearDepthVal: Float = js.native
  var autoDraw: Boolean = js.native
  var clearStencilVal: Float = js.native
  var clearColorVal: ccColor = js.native
  override def cleanup():Unit = js.native
  def getSprite():ccSprite = js.native
  def setSprite(sprite:t_ccSprite):Unit = js.native
  def setVirtualViewport(rtBegin:t_ccPoint, fullRect:t_ccRect, fullViewport:t_ccRect):Unit = js.native
  def initWithWidthAndHeight(width:Float, height:Float, format:Float, depthStencilFormat:Float):Boolean = js.native
  def begin():Unit = js.native
  def beginWithClear(r:Float, g:Float, b:Float, a:Float, depthValue:Float, stencilValue:Float):Unit = js.native
  def end():Unit = js.native
  def clear(r:Float|t_ccRect, g:Float, b:Float, a:Float):Unit = js.native
  def clearRect(x:Float, y:Float, width:Float, height:Float):Unit = js.native
  def clearDepth(depthValue:Float):Unit = js.native
  def clearStencil(stencilValue:Float):Unit = js.native
  def getClearFlags():Float = js.native
  def setClearFlags(clearFlags:Float):Unit = js.native
  def getClearColor():ccColor = js.native
  def setClearColor(clearColor:t_ccColor):Unit = js.native
  def getClearDepth():Float = js.native
  def setClearDepth(clearDepth:Float):Unit = js.native
  def getClearStencil():Float = js.native
  def setClearStencil():Float = js.native
  def isAutoDraw():Boolean = js.native
  def setAutoDraw():Boolean = js.native
  def saveToFile(filePath:Float, format:Float):Unit = js.native
  def newCCImage():js.Dynamic = js.native
  def listenToBackground(obj:t_ccClass):Unit = js.native
  def listenToForeground(obj:t_ccClass):Unit = js.native
}

@js.native
trait ts_ccRenderTexture extends ts_ccNode {
}

@js.native
@JSGlobal("cc.RenderTexture")
class ccRenderTexture(width:Float, height:Float, format:Float, depthStencilFormat:Float) extends t_ccRenderTexture {
}

@js.native
@JSGlobal("cc.RenderTexture")
object ccRenderTexture extends ts_ccRenderTexture {
}


