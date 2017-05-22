package org.cocos2dxjs.extensions.cocostudio.armature.animation

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass
import org.cocos2dxjs.extensions.cocostudio.ts_ccsClass

@js.native
trait t_ccsProcessBase extends t_ccsClass {
  val currentFrameIndex: Float = js.native
  val paused: Boolean = js.native
  val completed: Boolean = js.native
  val currentPercent: Float = js.native
  val rawDuration: Float = js.native
  val loop: Float = js.native
  val tweenEasing: Float = js.native
  var animationInterval: Float = js.native
  var processScale: Float = js.native
  val playing: Boolean = js.native
  def pause():Unit = js.native
  def resume():Unit = js.native
  def stop():Unit = js.native
  def play(durationTo:Float, durationTween:Float, loop:Float, tweenEasing:Float):Unit = js.native
  def update(dt:Float):Unit = js.native
  def gotoFrame(frameIndex:Float):Unit = js.native
  def getCurrentFrameIndex:Float = js.native
  def updateHandler():Unit = js.native
  def isPause:Boolean = js.native
  def isComplete:Boolean = js.native
  def getCurrentPercent:Float = js.native
  def getRawDuration:Float = js.native
  def getLoop:Float = js.native
  def getTweenEasing:Float = js.native
  def getAnimationInternal:Float = js.native
  def setAnimationInternal(animationInternal:js.Dynamic):Unit = js.native
  def getProcessScale:Float = js.native
  def setProcessScale(processScale:js.Dynamic):Unit = js.native
  def isPlaying:Boolean = js.native
}

@js.native
trait ts_ccsProcessBase extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.ProcessBase")
class ccsProcessBase extends t_ccsProcessBase {
}

@js.native
@JSGlobal("ccs.ProcessBase")
object ccsProcessBase extends ts_ccsProcessBase {
}


