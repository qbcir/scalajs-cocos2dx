package org.cocos2dxjs.extensions.cocostudio.armature.animation

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass
import org.cocos2dxjs.extensions.cocostudio.ts_ccsClass
import org.cocos2dxjs.extensions.cocostudio.armature.{ccsArmature, t_ccsArmature}
import org.cocos2dxjs.extensions.cocostudio.armature.{ccsBone, t_ccsBone}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsAnimationData, t_ccsAnimationData}

@js.native
trait t_ccsAnimationEvent extends t_ccsClass {
}

@js.native
trait ts_ccsAnimationEvent extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.AnimationEvent")
class ccsAnimationEvent(callFunc:js.Function, target:types.DynObject, data:types.DynObject) extends t_ccsAnimationEvent {
}

@js.native
@JSGlobal("ccs.AnimationEvent")
object ccsAnimationEvent extends ts_ccsAnimationEvent {
}

@js.native
trait t_ccsMovementEvent extends js.Object {
  var armature: ccsArmature = js.native
  var movementType: Float = js.native
  var movementID: String = js.native
}

@js.native
trait ts_ccsMovementEvent extends js.Object {
}

@js.native
@JSGlobal("ccs.MovementEvent")
class ccsMovementEvent extends t_ccsMovementEvent {
}

@js.native
@JSGlobal("ccs.MovementEvent")
object ccsMovementEvent extends ts_ccsMovementEvent {
}

@js.native
trait t_ccsFrameEvent extends js.Object {
  var bone: ccsBone = js.native
  var frameEventName: String = js.native
  var originFrameIndex: Float = js.native
  var currentFrameIndex: Float = js.native
}

@js.native
trait ts_ccsFrameEvent extends js.Object {
}

@js.native
@JSGlobal("ccs.FrameEvent")
class ccsFrameEvent extends t_ccsFrameEvent {
}

@js.native
@JSGlobal("ccs.FrameEvent")
object ccsFrameEvent extends ts_ccsFrameEvent {
}

@js.native
trait t_ccsArmatureAnimation extends t_ccsProcessBase {
  var animationData: ccsAnimationData = js.native
  var userObject: types.DynObject = js.native
  var ignoreFrameEvent: Boolean = js.native
  var speedScale: Float = js.native
  var animationScale: Float = js.native
  def init(armature:t_ccsArmature):Boolean = js.native
  override def pause():Unit = js.native
  override def resume():Unit = js.native
  override def stop():Unit = js.native
  def setSpeedScale(speedScale:Float):Unit = js.native
  def getSpeedScale:Float = js.native
  def play(animationName:String, durationTo:Float, loop:Float):Unit = js.native
  def playWithIndex(animationIndex:Float | js.Array[js.Any], durationTo:Float, loop:Float):Unit = js.native
  def playWithNames(movementNames:js.Array[js.Any], durationTo:Float, loop:Boolean):Unit = js.native
  def playWithIndexes(movementIndexes:js.Array[js.Any], durationTo:Float, loop:Boolean):Unit = js.native
  def gotoAndPlay(frameIndex:Float):Unit = js.native
  def gotoAndPause(frameIndex:Float):Unit = js.native
  def getMovementCount:Float = js.native
  override def update(dt:Float):Unit = js.native
  override def updateHandler():Unit = js.native
  def getCurrentMovementID:String = js.native
  def setMovementEventCallFunc(callFunc:js.Function, target:types.DynObject):Unit = js.native
  def setFrameEventCallFunc(callFunc:js.Function, target:types.DynObject):Unit = js.native
  def setUserObject(userObject:types.DynObject):Unit = js.native
  def frameEvent(bone:t_ccsBone, frameEventName:String, originFrameIndex:Float, currentFrameIndex:Float):Unit = js.native
  def movementEvent(armature:t_ccsArmature, movementType:Float, movementID:String):Unit = js.native
  def updateMovementList():Unit = js.native
  def setAnimationData(data:t_ccsAnimationData):Unit = js.native
  def getAnimationData:ccsAnimationData = js.native
  def getUserObject:types.DynObject = js.native
  def isIgnoreFrameEvent:Boolean = js.native
}

@js.native
trait ts_ccsArmatureAnimation extends ts_ccsProcessBase {
}

@js.native
@JSGlobal("ccs.ArmatureAnimation")
class ccsArmatureAnimation(armature:t_ccsArmature) extends t_ccsArmatureAnimation {
}

@js.native
@JSGlobal("ccs.ArmatureAnimation")
object ccsArmatureAnimation extends ts_ccsArmatureAnimation {
}


