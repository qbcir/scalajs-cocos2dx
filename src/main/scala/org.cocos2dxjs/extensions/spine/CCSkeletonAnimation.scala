package org.cocos2dxjs.extensions.spine

import scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait t_spSkeletonAnimation extends t_spSkeleton {
  override def init:Boolean = js.native
  def setAnimationStateData(stateData:js.Any):Unit = js.native
  def setMix(fromAnimation:String, toAnimation:String, duration:Float):Unit = js.native
  def setAnimationListener(target:js.Object, callback:js.Function):Unit = js.native
  def setAnimation(trackIndex:Float, name:String, loop:Boolean):js.Any = js.native
  def addAnimation(trackIndex:Float, name:String, loop:Boolean, delay:Float):js.Any = js.native
  def getCurrent(trackIndex:js.Any):js.Any = js.native
  def clearTracks():Unit = js.native
  def clearTrack(trackIndex:Float):Unit = js.native
  override def update(dt:Float):Unit = js.native
  def setStartListener(listener:js.Function):Unit = js.native
  def setInterruptListener(listener:js.Function):Unit = js.native
  def setEndListener(listener:js.Function):Unit = js.native
  def setDisposeListener(listener:js.Function):Unit = js.native
}

@js.native
@JSGlobal("sp.SkeletonAnimation")
class spSkeletonAnimation extends t_spSkeletonAnimation {
}

@js.native
@JSGlobal("sp.SkeletonAnimation")
object spSkeletonAnimation extends js.Object {
}

