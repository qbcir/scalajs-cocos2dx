package org.cocos2dxjs.extensions.cocostudio.armature.animation

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass
import org.cocos2dxjs.extensions.cocostudio.armature.ccsArmature
import org.cocos2dxjs.extensions.cocostudio.armature.ccsBone
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsAnimationData

@js.native
trait t_ccsAnimationEvent extends t_ccsClass {
}

@js.native
@JSGlobal("ccs.AnimationEvent")
class ccsAnimationEvent(callFunc:js.Function, target:js.Object, data:js.Object) extends t_ccsAnimationEvent {
}

@js.native
@JSGlobal("ccs.AnimationEvent")
object ccsAnimationEvent extends js.Object {
}

@js.native
trait t_ccsMovementEvent extends js.Object {
}

@js.native
@JSGlobal("ccs.MovementEvent")
class ccsMovementEvent extends t_ccsMovementEvent {
}

@js.native
@JSGlobal("ccs.MovementEvent")
object ccsMovementEvent extends js.Object {
}

@js.native
trait t_ccsFrameEvent extends js.Object {
}

@js.native
@JSGlobal("ccs.FrameEvent")
class ccsFrameEvent extends t_ccsFrameEvent {
}

@js.native
@JSGlobal("ccs.FrameEvent")
object ccsFrameEvent extends js.Object {
}

@js.native
trait t_ccsArmatureAnimation extends t_ccsProcessBase {
  def init(armature:ccsArmature):Boolean = js.native
  override def pause():Unit = js.native
  override def resume():Unit = js.native
  override def stop():Unit = js.native
  def setSpeedScale(speedScale:Float):Unit = js.native
  def getSpeedScale:Float = js.native
  def play(animationName:String, durationTo:Float, loop:Float):Unit = js.native
  def playWithIndex(animationIndex:Float, durationTo:Float, loop:Float):Unit = js.native
  def playWithNames(movementNames:js.Array[js.Any], durationTo:Float, loop:Boolean):Unit = js.native
  def playWithIndexes(movementIndexes:js.Array[js.Any], durationTo:Float, loop:Boolean):Unit = js.native
  def gotoAndPlay(frameIndex:Float):Unit = js.native
  def gotoAndPause(frameIndex:Float):Unit = js.native
  def getMovementCount:Float = js.native
  override def update(dt:Float):Unit = js.native
  override def updateHandler():Unit = js.native
  def getCurrentMovementID:String = js.native
  def setMovementEventCallFunc(callFunc:js.Function, target:js.Object):Unit = js.native
  def setFrameEventCallFunc(callFunc:js.Function, target:js.Object):Unit = js.native
  def setUserObject(userObject:js.Object):Unit = js.native
  def frameEvent(bone:ccsBone, frameEventName:String, originFrameIndex:Float, currentFrameIndex:Float):Unit = js.native
  def movementEvent(armature:ccsArmature, movementType:Float, movementID:String):Unit = js.native
  def updateMovementList():Unit = js.native
  def setAnimationData(data:ccsAnimationData):Unit = js.native
  def getAnimationData:ccsAnimationData = js.native
  def getUserObject:js.Object = js.native
  def isIgnoreFrameEvent:Boolean = js.native
}

@js.native
@JSGlobal("ccs.ArmatureAnimation")
class ccsArmatureAnimation extends t_ccsArmatureAnimation {
}

@js.native
@JSGlobal("ccs.ArmatureAnimation")
object ccsArmatureAnimation extends js.Object {
}



