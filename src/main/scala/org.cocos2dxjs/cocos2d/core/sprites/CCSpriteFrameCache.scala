package org.cocos2dxjs.cocos2d.core.sprites

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
trait t_ccspriteFrameCache extends js.Object {
}

@js.native
@JSGlobal("cc.spriteFrameCache")
class ccspriteFrameCache extends t_ccspriteFrameCache {
}

@js.native
@JSGlobal("cc.spriteFrameCache")
object ccspriteFrameCache extends js.Object {
  def addSpriteFrames(url:String, texture:js.Any):Unit = js.native
  def addSpriteFrame(frame:ccSpriteFrame, frameName:String):Unit = js.native
  def removeSpriteFrames():Unit = js.native
  def removeSpriteFrameByName(name:String):Unit = js.native
  def removeSpriteFramesFromFile(url:String):Unit = js.native
  def removeSpriteFramesFromTexture(texture:js.Any):Unit = js.native
  def getSpriteFrame(name:String):ccSpriteFrame = js.native
}



