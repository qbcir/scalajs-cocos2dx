package org.cocos2dxjs.cocos2d.core.sprites

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass
import org.cocos2dxjs.cocos2d.core.textures.{ccTexture2D, t_ccTexture2D}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}

@js.native
trait t_ccAnimationFrame extends t_ccClass {
  override def clone:js.Dynamic = js.native
  def copyWithZone:js.Dynamic = js.native
  def copy:js.Dynamic = js.native
  def initWithSpriteFrame(spriteFrame:t_ccSpriteFrame, delayUnits:Float, userInfo:types.DynObject):Unit = js.native
  def getSpriteFrame:ccSpriteFrame = js.native
  def setSpriteFrame(spriteFrame:t_ccSpriteFrame):Unit = js.native
  def getDelayUnits:Float = js.native
  def setDelayUnits(delayUnits:js.Dynamic):Unit = js.native
  def getUserInfo:types.DynObject = js.native
  def setUserInfo(userInfo:types.DynObject):Unit = js.native
}

@js.native
trait ts_ccAnimationFrame extends ts_ccClass {
}

@js.native
@JSGlobal("cc.AnimationFrame")
class ccAnimationFrame(spriteFrame:js.Dynamic, delayUnits:js.Dynamic, userInfo:js.Dynamic) extends t_ccAnimationFrame {
}

@js.native
@JSGlobal("cc.AnimationFrame")
object ccAnimationFrame extends ts_ccAnimationFrame {
}

@js.native
trait t_ccAnimation extends t_ccClass {
  def getFrames:js.Array[js.Any] = js.native
  def setFrames(frames:js.Array[js.Any]):Unit = js.native
  def addSpriteFrame(frame:t_ccSpriteFrame):Unit = js.native
  def addSpriteFrameWithFile(fileName:String):Unit = js.native
  def addSpriteFrameWithTexture(texture:t_ccTexture2D, rect:t_ccRect):Unit = js.native
  def initWithAnimationFrames(arrayOfAnimationFrames:js.Array[js.Any], delayPerUnit:Float, loops:Float):Unit = js.native
  override def clone:ccAnimation = js.native
  def copyWithZone:ccAnimation = js.native
  def copy(pZone:js.Dynamic):ccAnimation = js.native
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
trait ts_ccAnimation extends ts_ccClass {
}

@js.native
@JSGlobal("cc.Animation")
class ccAnimation(frames:js.Array[js.Any], delay:Float, loops:Float) extends t_ccAnimation {
}

@js.native
@JSGlobal("cc.Animation")
object ccAnimation extends ts_ccAnimation {
}


