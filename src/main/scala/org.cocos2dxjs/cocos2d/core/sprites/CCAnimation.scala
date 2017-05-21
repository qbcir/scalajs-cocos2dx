package org.cocos2dxjs.cocos2d.core.sprites

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.textures.ccTexture2D
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect

@js.native
trait t_ccAnimationFrame extends t_ccClass {
  override def clone:js.Any = js.native
  def copyWithZone:js.Any = js.native
  def copy:js.Any = js.native
  def initWithSpriteFrame(spriteFrame:ccSpriteFrame, delayUnits:Float, userInfo:js.Object):Unit = js.native
  def getSpriteFrame:ccSpriteFrame = js.native
  def setSpriteFrame(spriteFrame:ccSpriteFrame):Unit = js.native
  def getDelayUnits:Float = js.native
  def setDelayUnits(delayUnits:js.Any):Unit = js.native
  def getUserInfo:js.Object = js.native
  def setUserInfo(userInfo:js.Object):Unit = js.native
}

@js.native
@JSGlobal("cc.AnimationFrame")
class ccAnimationFrame(spriteFrame:js.Any, delayUnits:js.Any, userInfo:js.Any) extends t_ccAnimationFrame {
}

@js.native
@JSGlobal("cc.AnimationFrame")
object ccAnimationFrame extends js.Object {
}

@js.native
trait t_ccAnimation extends t_ccClass {
  def getFrames:js.Array[js.Any] = js.native
  def setFrames(frames:js.Array[js.Any]):Unit = js.native
  def addSpriteFrame(frame:ccSpriteFrame):Unit = js.native
  def addSpriteFrameWithFile(fileName:String):Unit = js.native
  def addSpriteFrameWithTexture(texture:ccTexture2D, rect:ccRect):Unit = js.native
  def initWithAnimationFrames(arrayOfAnimationFrames:js.Array[js.Any], delayPerUnit:Float, loops:Float):Unit = js.native
  override def clone:ccAnimation = js.native
  def copyWithZone:ccAnimation = js.native
  def copy(pZone:js.Any):ccAnimation = js.native
  def getLoops:Float = js.native
  def setLoops(value:Float):Unit = js.native
  def setRestoreOriginalFrame(restOrigFrame:Boolean):Unit = js.native
  def getRestoreOriginalFrame:Boolean = js.native
  def getDuration:Float = js.native
  def getDelayPerUnit:Float = js.native
  def setDelayPerUnit(delayPerUnit:Float):Unit = js.native
  def getTotalDelayUnits:Float = js.native
  def initWithSpriteFrames(frames:js.Array[js.Any], delay:Float, loops:Float):Unit = js.native
  def retain():Unit = js.native
  def release():Unit = js.native
}

@js.native
@JSGlobal("cc.Animation")
class ccAnimation(frames:js.Array[js.Any], delay:Float, loops:Float) extends t_ccAnimation {
}

@js.native
@JSGlobal("cc.Animation")
object ccAnimation extends js.Object {
}


