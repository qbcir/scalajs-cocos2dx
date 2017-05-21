package org.cocos2dxjs.extensions.cocostudio.armature.animation

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.extensions.cocostudio.armature.ccsBone
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsMovementBoneData
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsFrameData

@js.native
trait t_ccsTween extends t_ccsProcessBase {
  var animation: ccsArmatureAnimation = js.native
  def init(bone:ccsBone):Boolean = js.native
  def play(movementBoneData:ccsMovementBoneData, durationTo:Float, durationTween:Float, loop:Boolean, tweenEasing:js.Any/*ccsTweenType*/):Unit = js.native
  def gotoAndPlay(frameIndex:Float):Unit = js.native
  def gotoAndPause(frameIndex:Float):Unit = js.native
  override def updateHandler():Unit = js.native
  def setBetween(from:ccsFrameData, to:ccsFrameData, limit:Boolean):Unit = js.native
  def arriveKeyFrame(keyFrameData:ccsFrameData):Unit = js.native
  def tweenNodeTo(percent:Float, node:ccsFrameData):ccsFrameData = js.native
  def tweenColorTo(percent:Float, node:ccsFrameData):Unit = js.native
  def updateFrameData(currentPercent:Float):Float = js.native
  def setAnimation(animation:ccsArmatureAnimation):Unit = js.native
  def getAnimation:ccsArmatureAnimation = js.native
  def setMovementBoneData(data:js.Any):Unit = js.native
}

@js.native
@JSGlobal("ccs.Tween")
class ccsTween(The:ccsBone) extends t_ccsTween {
}

@js.native
@JSGlobal("ccs.Tween")
object ccsTween extends js.Object {
}


