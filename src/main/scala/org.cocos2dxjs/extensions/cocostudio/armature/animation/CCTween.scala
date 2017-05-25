package org.cocos2dxjs.extensions.cocostudio.armature.animation

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.armature.{ccsBone, t_ccsBone}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsMovementBoneData, t_ccsMovementBoneData}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsFrameData, t_ccsFrameData}

@js.native
trait t_ccsTween extends t_ccsProcessBase {
  var animation: ccsArmatureAnimation = js.native
  def init(bone:t_ccsBone):Boolean = js.native
  def play(movementBoneData:t_ccsMovementBoneData, durationTo:Float, durationTween:Float, loop:Boolean, tweenEasing:js.Any/*ccsTweenType*/):Unit = js.native
  def gotoAndPlay(frameIndex:Float):Unit = js.native
  def gotoAndPause(frameIndex:Float):Unit = js.native
  override def updateHandler():Unit = js.native
  def setBetween(from:t_ccsFrameData, to:t_ccsFrameData, limit:Boolean):Unit = js.native
  def arriveKeyFrame(keyFrameData:t_ccsFrameData):Unit = js.native
  def tweenNodeTo(percent:Float, node:t_ccsFrameData):ccsFrameData = js.native
  def tweenColorTo(percent:Float, node:t_ccsFrameData):Unit = js.native
  def updateFrameData(currentPercent:Float):Float = js.native
  def setAnimation(animation:t_ccsArmatureAnimation):Unit = js.native
  def getAnimation():ccsArmatureAnimation = js.native
  def setMovementBoneData(data:js.Dynamic):Unit = js.native
}

@js.native
trait ts_ccsTween extends ts_ccsProcessBase {
}

@js.native
@JSGlobal("ccs.Tween")
class ccsTween(The:t_ccsBone) extends t_ccsTween {
}

@js.native
@JSGlobal("ccs.Tween")
object ccsTween extends ts_ccsTween {
}


