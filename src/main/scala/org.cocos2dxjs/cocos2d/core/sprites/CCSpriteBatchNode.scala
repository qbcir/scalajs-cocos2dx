package org.cocos2dxjs.cocos2d.core.sprites

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.textures.ccTextureAtlas
import org.cocos2dxjs.cocos2d.core.platform.ccBlendFunc
import org.cocos2dxjs.cocos2d.core.textures.ccTexture2D
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode

@js.native
trait t_ccSpriteBatchNode extends t_ccNode {
  def initWithFile(fileImage:String, capacity:Float):Boolean = js.native
  def init(fileImage:String, capacity:Float):Boolean = js.native
  def removeChildAtIndex(index:Float, doCleanup:Boolean):Unit = js.native
  def setBlendFunc(src:Float, dst:Float):Unit = js.native
  def getBlendFunc:ccBlendFunc = js.native
  def updateQuadFromSprite(sprite:ccSprite, index:Float):Unit = js.native
  def appendChild(sprite:ccSprite):Unit = js.native
  def initWithTexture(tex:ccTexture2D):Boolean = js.native
  def getTexture:ccTexture2D = js.native
  def setTexture(texture:ccTexture2D):Unit = js.native
  def addChild(child:ccSprite, zOrder:Float, tag:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.SpriteBatchNode")
class ccSpriteBatchNode extends t_ccSpriteBatchNode {
}

@js.native
@JSGlobal("cc.SpriteBatchNode")
object ccSpriteBatchNode extends js.Object {
}



