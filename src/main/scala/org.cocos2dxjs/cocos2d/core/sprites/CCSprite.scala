package org.cocos2dxjs.cocos2d.core.sprites

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.textures.{ccTexture2D, t_ccTexture2D}
import org.cocos2dxjs.cocos2d.core.textures.{ccTextureAtlas, t_ccTextureAtlas}
import org.cocos2dxjs.cocos2d.core.platform.{ccV3F_C4B_T2F_Quad, t_ccV3F_C4B_T2F_Quad}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.platform.{ccBlendFunc, t_ccBlendFunc}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode

@js.native
trait t_ccSprite extends t_ccNode {
  var dirty: Boolean = js.native
  var flippedX: Boolean = js.native
  var flippedY: Boolean = js.native
  val offsetX: Float = js.native
  val offsetY: Float = js.native
  var atlasIndex: Float = js.native
  var texture: ccTexture2D = js.native
  val textureRectRotated: Boolean = js.native
  var textureAtlas: ccTextureAtlas = js.native
  var batchNode: ccSpriteBatchNode = js.native
  val quad: ccV3F_C4B_T2F_Quad = js.native
  def textureLoaded():Boolean = js.native
  def isDirty():Boolean = js.native
  def setDirty(bDirty:Boolean):Unit = js.native
  def isTextureRectRotated():Boolean = js.native
  def getAtlasIndex():Float = js.native
  def setAtlasIndex(atlasIndex:Float):Unit = js.native
  def getTextureRect():ccRect = js.native
  def getTextureAtlas():ccTextureAtlas = js.native
  def setTextureAtlas(textureAtlas:t_ccTextureAtlas):Unit = js.native
  def getOffsetPosition():ccPoint = js.native
  def getBlendFunc():ccBlendFunc = js.native
  def initWithSpriteFrame(spriteFrame:t_ccSpriteFrame):Boolean = js.native
  def initWithSpriteFrameName(spriteFrameName:String):Boolean = js.native
  def useBatchNode(batchNode:t_ccSpriteBatchNode):Unit = js.native
  def setVertexRect(rect:t_ccRect):Unit = js.native
  def setFlippedX(flippedX:Boolean):Unit = js.native
  def setFlippedY(flippedY:Boolean):Unit = js.native
  def isFlippedX():Boolean = js.native
  def isFlippedY():Boolean = js.native
  override def setOpacityModifyRGB(modify:Boolean):Unit = js.native
  override def isOpacityModifyRGB():Boolean = js.native
  def setDisplayFrameWithAnimationName(animationName:String, frameIndex:Float):Unit = js.native
  def getBatchNode():Null|ccSpriteBatchNode = js.native
  def getTexture():ccTexture2D = js.native
  def getQuad():Null|ccV3F_C4B_T2F_Quad = js.native
  def setBlendFunc(src:Float|t_ccBlendFunc, dst:Float):Unit = js.native
  override def init():Boolean = js.native
  def initWithFile(filename:String, rect:t_ccRect):Boolean = js.native
  def initWithTexture(texture:js.Dynamic|t_ccTexture2D, rect:t_ccRect, rotated:Boolean, counterclockwise:Boolean):Boolean = js.native
  def setTextureRect(rect:t_ccRect, rotated:Boolean, untrimmedSize:t_ccSize, needConvert:Boolean):Unit = js.native
  def addChild(child:t_ccSprite, localZOrder:Float, tag:Float|String):Unit = js.native
  def setSpriteFrame(newFrame:String|t_ccSpriteFrame):Unit = js.native
  def isFrameDisplayed(frame:t_ccSpriteFrame):Boolean = js.native
  def getSpriteFrame():ccSpriteFrame = js.native
  def setBatchNode(spriteBatchNode:Null|t_ccSpriteBatchNode):Unit = js.native
  def setTexture(texture:String|t_ccTexture2D):Unit = js.native
}

@js.native
trait ts_ccSprite extends ts_ccNode {
}

@js.native
@JSGlobal("cc.Sprite")
class ccSprite(fileName:String|js.Dynamic|t_ccSpriteFrame|t_ccTexture2D, rect:t_ccRect, rotated:Boolean) extends t_ccSprite {
}

@js.native
@JSGlobal("cc.Sprite")
object ccSprite extends ts_ccSprite {
  val INDEX_NOT_INITIALIZED: Float = js.native
}


