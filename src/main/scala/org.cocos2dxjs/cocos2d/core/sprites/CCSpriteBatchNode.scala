package org.cocos2dxjs.cocos2d.core.sprites

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.textures.{ccTextureAtlas, t_ccTextureAtlas}
import org.cocos2dxjs.cocos2d.core.textures.{ccTexture2D, t_ccTexture2D}
import org.cocos2dxjs.cocos2d.core.platform.{ccBlendFunc, t_ccBlendFunc}
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode

@js.native
trait t_ccSpriteBatchNode extends t_ccNode {
  var textureAtlas: ccTextureAtlas = js.native
  val descendants: js.Array[js.Any] = js.native
  def initWithFile(fileImage:String, capacity:Float):Boolean = js.native
  def init(fileImage:String, capacity:Float):Boolean = js.native
  def removeChildAtIndex(index:Float, doCleanup:Boolean):Unit = js.native
  def setBlendFunc(src:Float | t_ccBlendFunc, dst:Float):Unit = js.native
  def getBlendFunc:ccBlendFunc = js.native
  def updateQuadFromSprite(sprite:t_ccSprite, index:Float):Unit = js.native
  def appendChild(sprite:t_ccSprite):Unit = js.native
  def initWithTexture(tex:t_ccTexture2D):Boolean = js.native
  def getTexture:ccTexture2D = js.native
  def setTexture(texture:t_ccTexture2D):Unit = js.native
  def addChild(child:t_ccSprite, zOrder:Float, tag:Float):Unit = js.native
}

@js.native
trait ts_ccSpriteBatchNode extends ts_ccNode {
}

@js.native
@JSGlobal("cc.SpriteBatchNode")
class ccSpriteBatchNode(fileImage:String | t_ccTexture2D) extends t_ccSpriteBatchNode {
}

@js.native
@JSGlobal("cc.SpriteBatchNode")
object ccSpriteBatchNode extends ts_ccSpriteBatchNode {
}


