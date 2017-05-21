package org.cocos2dxjs.cocos2d.motionstreak

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.textures.ccTexture2D
import org.cocos2dxjs.cocos2d.core.platform.ccBlendFunc
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode

@js.native
trait t_ccMotionStreak extends t_ccNode {
  var texture: ccTexture2D = js.native
  var fastMode: Boolean = js.native
  var startingPositionInitialized: Boolean = js.native
  def getTexture:ccTexture2D = js.native
  def setTexture(texture:ccTexture2D):Unit = js.native
  def getBlendFunc:ccBlendFunc = js.native
  def setBlendFunc(src:Float, dst:Float):Unit = js.native
  override def getOpacity:Float = js.native
  def setOpacity(opacity:js.Any):Unit = js.native
  def setOpacityModifyRGB(value:js.Any):Unit = js.native
  override def isOpacityModifyRGB:Boolean = js.native
  def isFastMode:Boolean = js.native
  def setFastMode(fastMode:Boolean):Unit = js.native
  def isStartingPositionInitialized:Boolean = js.native
  def setStartingPositionInitialized(startingPositionInitialized:Boolean):Unit = js.native
  def getStroke:Float = js.native
  def setStroke(stroke:Float):Unit = js.native
  def initWithFade(fade:Float, minSeg:Float, stroke:Float, color:Float, texture:String):Boolean = js.native
  def tintWithColor(color:ccColor):Unit = js.native
  def reset():Unit = js.native
  override def setPosition(position:ccPoint, yValue:Float):Unit = js.native
  override def getPositionX:Float = js.native
  override def setPositionX(x:Float):Unit = js.native
  override def getPositionY:Float = js.native
  override def setPositionY(y:Float):Unit = js.native
  override def update(delta:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.MotionStreak")
class ccMotionStreak(fade:Float, minSeg:Float, stroke:Float, color:Float, texture:String) extends t_ccMotionStreak {
  var _pointVertexes: js.Any = js.native
}

@js.native
@JSGlobal("cc.MotionStreak")
object ccMotionStreak extends js.Object {
}


