package org.cocos2dxjs.cocos2d.rendertexture

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.platform.ccClass
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode

@js.native
trait t_ccRenderTexture extends t_ccNode {
  override def cleanup():Unit = js.native
  def getSprite:ccSprite = js.native
  def setSprite(sprite:ccSprite):Unit = js.native
  def setVirtualViewport(rtBegin:ccPoint, fullRect:ccRect, fullViewport:ccRect):Unit = js.native
  def initWithWidthAndHeight(width:Float, height:Float, format:Float, depthStencilFormat:Float):Boolean = js.native
  def begin():Unit = js.native
  def beginWithClear(r:Float, g:Float, b:Float, a:Float, depthValue:Float, stencilValue:Float):Unit = js.native
  def end():Unit = js.native
  def clear(r:Float, g:Float, b:Float, a:Float):Unit = js.native
  def clearRect(x:Float, y:Float, width:Float, height:Float):Unit = js.native
  def clearDepth(depthValue:Float):Unit = js.native
  def clearStencil(stencilValue:Float):Unit = js.native
  def getClearFlags:Float = js.native
  def setClearFlags(clearFlags:Float):Unit = js.native
  def getClearColor:ccColor = js.native
  def setClearColor(clearColor:ccColor):Unit = js.native
  def getClearDepth:Float = js.native
  def setClearDepth(clearDepth:Float):Unit = js.native
  def getClearStencil:Float = js.native
  def setClearStencil:Float = js.native
  def isAutoDraw:Boolean = js.native
  def setAutoDraw:Boolean = js.native
  def saveToFile(filePath:Float, format:Float):Unit = js.native
  def newCCImage:js.Any = js.native
  def listenToBackground(obj:ccClass):Unit = js.native
  def listenToForeground(obj:ccClass):Unit = js.native
}

@js.native
@JSGlobal("cc.RenderTexture")
class ccRenderTexture(width:Float, height:Float, format:Float, depthStencilFormat:Float) extends t_ccRenderTexture {
}

@js.native
@JSGlobal("cc.RenderTexture")
object ccRenderTexture extends js.Object {
}

