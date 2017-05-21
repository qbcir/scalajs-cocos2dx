package org.cocos2dxjs.cocos2d.progresstimer

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode

@js.native
trait t_ccProgressTimer extends t_ccNode {
  def getMidpoint:ccPoint = js.native
  def setMidpoint(mpoint:ccPoint):Unit = js.native
  def getBarChangeRate:ccPoint = js.native
  def setBarChangeRate(barChangeRate:ccPoint):Unit = js.native
  def getType:Float = js.native
  def getPercentage:Float = js.native
  def getSprite:ccSprite = js.native
  def setPercentage(percentage:Float):Unit = js.native
  def setOpacityModifyRGB(bValue:js.Any):Unit = js.native
  override def isOpacityModifyRGB:Boolean = js.native
  def isReverseDirection:Boolean = js.native
  override def setColor(color:ccColor):Unit = js.native
  override def setOpacity(opacity:Float):Unit = js.native
  override def getColor:ccColor = js.native
  override def getOpacity:Float = js.native
  def setReverseProgress(reverse:Boolean):Unit = js.native
  def setSprite(sprite:ccSprite):Unit = js.native
  def setType(_type:Float):Unit = js.native
  def setReverseDirection(reverse:Boolean):Unit = js.native
  def initWithSprite(sprite:ccSprite):Boolean = js.native
}

@js.native
@JSGlobal("cc.ProgressTimer")
class ccProgressTimer(sprite:ccSprite) extends t_ccProgressTimer {
}

@js.native
@JSGlobal("cc.ProgressTimer")
object ccProgressTimer extends js.Object {
}



