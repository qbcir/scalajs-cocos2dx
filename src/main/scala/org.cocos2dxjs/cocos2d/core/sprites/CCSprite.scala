package org.cocos2dxjs.cocos2d.core.sprites

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.textures.ccTexture2D
import org.cocos2dxjs.cocos2d.core.textures.ccTextureAtlas
import org.cocos2dxjs.cocos2d.core.platform.ccV3F_C4B_T2F_Quad
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.platform.ccBlendFunc
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode

@js.native
trait t_ccSprite extends t_ccNode {
  def textureLoaded:Boolean = js.native
  def isDirty:Boolean = js.native
  def setDirty(bDirty:Boolean):Unit = js.native
  def isTextureRectRotated:Boolean = js.native
  def getAtlasIndex:Float = js.native
  def setAtlasIndex(atlasIndex:Float):Unit = js.native
  def getTextureRect:ccRect = js.native
  def getTextureAtlas:ccTextureAtlas = js.native
  def setTextureAtlas(textureAtlas:ccTextureAtlas):Unit = js.native
  def getOffsetPosition:ccPoint = js.native
  def getBlendFunc:ccBlendFunc = js.native
  def initWithSpriteFrame(spriteFrame:ccSpriteFrame):Boolean = js.native
  def initWithSpriteFrameName(spriteFrameName:String):Boolean = js.native
  def useBatchNode(batchNode:ccSpriteBatchNode):Unit = js.native
  def setVertexRect(rect:ccRect):Unit = js.native
  def setFlippedX(flippedX:Boolean):Unit = js.native
  def setFlippedY(flippedY:Boolean):Unit = js.native
  def isFlippedX:Boolean = js.native
  def isFlippedY:Boolean = js.native
  override def setOpacityModifyRGB(modify:Boolean):Unit = js.native
  override def isOpacityModifyRGB:Boolean = js.native
  def setDisplayFrameWithAnimationName(animationName:String, frameIndex:Float):Unit = js.native
  def getBatchNode:ccSpriteBatchNode = js.native
  def getTexture:ccTexture2D = js.native
  def getQuad:ccV3F_C4B_T2F_Quad = js.native
  def setBlendFunc(src:Float, dst:Float):Unit = js.native
  override def init:Boolean = js.native
  def initWithFile(filename:String, rect:ccRect):Boolean = js.native
  def initWithTexture(texture:ccTexture2D, rect:ccRect, rotated:Boolean, counterclockwise:Boolean):Boolean = js.native
  def setTextureRect(rect:ccRect, rotated:Boolean, untrimmedSize:ccSize, needConvert:Boolean):Unit = js.native
  def addChild(child:ccSprite, localZOrder:Float, tag:Float):Unit = js.native
  def setSpriteFrame(newFrame:ccSpriteFrame):Unit = js.native
  def isFrameDisplayed(frame:ccSpriteFrame):Boolean = js.native
  def getSpriteFrame:ccSpriteFrame = js.native
  def setBatchNode(spriteBatchNode:ccSpriteBatchNode):Unit = js.native
  def setTexture(texture:ccTexture2D):Unit = js.native
}

@js.native
@JSGlobal("cc.Sprite")
class ccSprite extends t_ccSprite {
}

@js.native
@JSGlobal("cc.Sprite")
object ccSprite extends js.Object {
}

