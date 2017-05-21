package org.cocos2dxjs.cocos2d.particle

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.textures.ccTexture2D
import org.cocos2dxjs.cocos2d.core.textures.ccTextureAtlas
import org.cocos2dxjs.cocos2d.core.platform.ccBlendFunc

@js.native
trait t_ccParticleBatchNode extends t_ccParticleSystem {
  def initWithTexture(texture:ccTexture2D, capacity:Float):Boolean = js.native
  def initWithFile(fileImage:String, capacity:Float):Boolean = js.native
  def init(fileImage:String, capacity:Float):Boolean = js.native
  def addChild(child:ccParticleSystem, zOrder:Float, tag:Float):Unit = js.native
  def insertChild(pSystem:ccParticleSystem, index:Float):Unit = js.native
  def removeChild(child:ccParticleSystem, cleanup:Boolean):Unit = js.native
  def reorderChild(child:ccParticleSystem, zOrder:Float):Unit = js.native
  def removeChildAtIndex(index:Float, doCleanup:Boolean):Unit = js.native
  override def removeAllChildren(doCleanup:Boolean):Unit = js.native
  def disableParticle(particleIndex:Float):Unit = js.native
  override def getTexture:ccTexture2D = js.native
  override def setTexture(texture:ccTexture2D):Unit = js.native
  override def setBlendFunc(src:Float, dst:Float):Unit = js.native
  override def getBlendFunc:ccBlendFunc = js.native
  def getTextureAtlas:ccTextureAtlas = js.native
  def setTextureAtlas(textureAtlas:ccTextureAtlas):Unit = js.native
}

@js.native
@JSGlobal("cc.ParticleBatchNode")
class ccParticleBatchNode(fileImage:String, capacity:Float) extends t_ccParticleBatchNode {
}

@js.native
@JSGlobal("cc.ParticleBatchNode")
object ccParticleBatchNode extends js.Object {
  def CanvasRenderCmd():Unit = js.native
  def WebGLRenderCmd():Unit = js.native
}



