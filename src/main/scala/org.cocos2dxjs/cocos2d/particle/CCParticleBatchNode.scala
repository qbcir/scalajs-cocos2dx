package org.cocos2dxjs.cocos2d.particle

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.textures.{ccTexture2D, t_ccTexture2D}
import org.cocos2dxjs.cocos2d.core.textures.{ccTextureAtlas, t_ccTextureAtlas}
import org.cocos2dxjs.cocos2d.core.platform.{ccBlendFunc, t_ccBlendFunc}

@js.native
trait t_ccParticleBatchNode extends t_ccParticleSystem {
  var textureAtlas: ccTextureAtlas = js.native
  def initWithTexture(texture:t_ccTexture2D | js.Dynamic | js.Dynamic, capacity:Float):Boolean = js.native
  def initWithFile(fileImage:String, capacity:Float):Boolean = js.native
  def init(fileImage:String, capacity:Float):Boolean = js.native
  def addChild(child:t_ccParticleSystem, zOrder:Float, tag:Float):Unit = js.native
  def insertChild(pSystem:t_ccParticleSystem, index:Float):Unit = js.native
  def removeChild(child:t_ccParticleSystem, cleanup:Boolean):Unit = js.native
  def reorderChild(child:t_ccParticleSystem, zOrder:Float):Unit = js.native
  def removeChildAtIndex(index:Float, doCleanup:Boolean):Unit = js.native
  override def removeAllChildren(doCleanup:Boolean):Unit = js.native
  def disableParticle(particleIndex:Float):Unit = js.native
  override def getTexture:ccTexture2D = js.native
  override def setTexture(texture:t_ccTexture2D):Unit = js.native
  def setBlendFunc(src:Float | types.DynObject, dst:Float):Unit = js.native
  override def getBlendFunc:ccBlendFunc = js.native
  def getTextureAtlas:ccTextureAtlas = js.native
  def setTextureAtlas(textureAtlas:t_ccTextureAtlas):Unit = js.native
}

@js.native
trait ts_ccParticleBatchNode extends ts_ccParticleSystem {
  def CanvasRenderCmd():Unit = js.native
  override def WebGLRenderCmd():Unit = js.native
}

@js.native
@JSGlobal("cc.ParticleBatchNode")
class ccParticleBatchNode(fileImage:String | t_ccTexture2D, capacity:Float) extends t_ccParticleBatchNode {
}

@js.native
@JSGlobal("cc.ParticleBatchNode")
object ccParticleBatchNode extends ts_ccParticleBatchNode {
}


