package org.cocos2dxjs.cocos2d.progresstimer

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.sprites.{ccSprite, t_ccSprite}
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode

@js.native
trait t_ccProgressTimer extends t_ccNode {
  var midPoint: ccPoint = js.native
  var barChangeRate: ccPoint = js.native
  @JSName("type")
  var _type: js.Dynamic = js.native
  var percentage: Float = js.native
  var sprite: ccSprite = js.native
  var reverseDir: Boolean = js.native
  def getMidpoint:ccPoint = js.native
  def setMidpoint(mpoint:t_ccPoint):Unit = js.native
  def getBarChangeRate:ccPoint = js.native
  def setBarChangeRate(barChangeRate:t_ccPoint):Unit = js.native
  def getType:Float = js.native
  def getPercentage:Float = js.native
  def getSprite:ccSprite = js.native
  def setPercentage(percentage:Float):Unit = js.native
  def setOpacityModifyRGB(bValue:js.Dynamic):Unit = js.native
  override def isOpacityModifyRGB:Boolean = js.native
  def isReverseDirection:Boolean = js.native
  override def setColor(color:t_ccColor):Unit = js.native
  override def setOpacity(opacity:Float):Unit = js.native
  override def getColor:ccColor = js.native
  override def getOpacity:Float = js.native
  def setReverseProgress(reverse:Boolean):Unit = js.native
  def setSprite(sprite:t_ccSprite):Unit = js.native
  def setType(_type:Float):Unit = js.native
  def setReverseDirection(reverse:Boolean):Unit = js.native
  def initWithSprite(sprite:t_ccSprite):Boolean = js.native
}

@js.native
trait ts_ccProgressTimer extends ts_ccNode {
}

@js.native
@JSGlobal("cc.ProgressTimer")
class ccProgressTimer(sprite:t_ccSprite) extends t_ccProgressTimer {
}

@js.native
@JSGlobal("cc.ProgressTimer")
object ccProgressTimer extends ts_ccProgressTimer {
  val TEXTURE_COORDS_COUNT: Float = js.native
  val TEXTURE_COORDS: Float = js.native
  val TYPE_RADIAL: Float = js.native
  val TYPE_BAR: Float = js.native
}


