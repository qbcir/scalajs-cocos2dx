package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.sprites.ccAnimation
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite

@js.native
trait t_ccActionInterval extends t_ccFiniteTimeAction {
  def getElapsed:Float = js.native
  def initWithDuration(d:Float):Boolean = js.native
  override def isDone:Boolean = js.native
  def _cloneDecoration(action:ccAction):Unit = js.native
  override def clone:ccAction = js.native
  def easing(easeObj:js.Object):ccActionInterval = js.native
  override def step(dt:Float):Unit = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def reverse:ccAction = js.native
  def setAmplitudeRate(amp:Float):Unit = js.native
  def getAmplitudeRate:Float = js.native
  def speed(speed:js.Any):ccAction = js.native
  def getSpeed:Float = js.native
  def setSpeed(speed:Float):ccActionInterval = js.native
  def repeat(times:js.Any):ccActionInterval = js.native
  def repeatForever:ccActionInterval = js.native
}

@js.native
@JSGlobal("cc.ActionInterval")
class ccActionInterval(d:Float) extends t_ccActionInterval {
}

@js.native
@JSGlobal("cc.ActionInterval")
object ccActionInterval extends js.Object {
}

@js.native
trait t_ccSequence extends t_ccActionInterval {
  def initWithTwoActions(actionOne:ccFiniteTimeAction, actionTwo:ccFiniteTimeAction):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def stop():Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.Sequence")
class ccSequence(tempArray:js.Array[js.Any]) extends t_ccSequence {
}

@js.native
@JSGlobal("cc.Sequence")
object ccSequence extends js.Object {
  def _actionOneTwo(actionOne:ccFiniteTimeAction, actionTwo:ccFiniteTimeAction):ccSequence = js.native
}

@js.native
trait t_ccRepeat extends t_ccActionInterval {
  def initWithAction(action:ccFiniteTimeAction, times:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def stop():Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def isDone:Boolean = js.native
  override def reverse:ccAction = js.native
  def setInnerAction(action:ccFiniteTimeAction):Unit = js.native
  def getInnerAction:ccFiniteTimeAction = js.native
}

@js.native
@JSGlobal("cc.Repeat")
class ccRepeat(action:ccFiniteTimeAction, times:Float) extends t_ccRepeat {
}

@js.native
@JSGlobal("cc.Repeat")
object ccRepeat extends js.Object {
}

@js.native
trait t_ccRepeatForever extends t_ccActionInterval {
  def initWithAction(action:ccActionInterval):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  def step(dt:js.Any):Unit = js.native
  override def isDone:Boolean = js.native
  override def reverse:ccAction = js.native
  def setInnerAction(action:ccActionInterval):Unit = js.native
  def getInnerAction:ccActionInterval = js.native
}

@js.native
@JSGlobal("cc.RepeatForever")
class ccRepeatForever(action:ccFiniteTimeAction) extends t_ccRepeatForever {
}

@js.native
@JSGlobal("cc.RepeatForever")
object ccRepeatForever extends js.Object {
}

@js.native
trait t_ccSpawn extends t_ccActionInterval {
  def initWithTwoActions(action1:ccFiniteTimeAction, action2:ccFiniteTimeAction):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def stop():Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.Spawn")
class ccSpawn(tempArray:js.Array[js.Any]) extends t_ccSpawn {
}

@js.native
@JSGlobal("cc.Spawn")
object ccSpawn extends js.Object {
  def _actionOneTwo(action1:ccFiniteTimeAction, action2:ccFiniteTimeAction):ccSpawn = js.native
}

@js.native
trait t_ccRotateTo extends t_ccActionInterval {
  def initWithDuration(duration:Float, deltaAngleX:Float, deltaAngleY:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def reverse:ccAction = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.RotateTo")
class ccRotateTo(duration:Float, deltaAngleX:Float, deltaAngleY:Float) extends t_ccRotateTo {
}

@js.native
@JSGlobal("cc.RotateTo")
object ccRotateTo extends js.Object {
}

@js.native
trait t_ccRotateBy extends t_ccActionInterval {
  def initWithDuration(duration:Float, deltaAngleX:Float, deltaAngleY:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.RotateBy")
class ccRotateBy(duration:Float, deltaAngleX:Float, deltaAngleY:Float) extends t_ccRotateBy {
}

@js.native
@JSGlobal("cc.RotateBy")
object ccRotateBy extends js.Object {
}

@js.native
trait t_ccMoveBy extends t_ccActionInterval {
  def initWithDuration(duration:Float, position:ccPoint, y:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.MoveBy")
class ccMoveBy(duration:Float, deltaPos:ccPoint, deltaY:Float) extends t_ccMoveBy {
}

@js.native
@JSGlobal("cc.MoveBy")
object ccMoveBy extends js.Object {
}

@js.native
trait t_ccMoveTo extends t_ccMoveBy {
  override def initWithDuration(duration:Float, position:ccPoint, y:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.MoveTo")
class ccMoveTo(duration:Float, position:ccPoint, y:Float) extends t_ccMoveTo {
}

@js.native
@JSGlobal("cc.MoveTo")
object ccMoveTo extends js.Object {
}

@js.native
trait t_ccSkewTo extends t_ccActionInterval {
  def initWithDuration(t:Float, sx:Float, sy:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.SkewTo")
class ccSkewTo(t:Float, sx:Float, sy:Float) extends t_ccSkewTo {
}

@js.native
@JSGlobal("cc.SkewTo")
object ccSkewTo extends js.Object {
}

@js.native
trait t_ccSkewBy extends t_ccSkewTo {
  override def initWithDuration(t:Float, deltaSkewX:Float, deltaSkewY:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.SkewBy")
class ccSkewBy(t:Float, sx:Float, sy:Float) extends t_ccSkewBy {
}

@js.native
@JSGlobal("cc.SkewBy")
object ccSkewBy extends js.Object {
}

@js.native
trait t_ccJumpBy extends t_ccActionInterval {
  def initWithDuration(duration:Float, position:ccPoint, y:Float, height:Float, jumps:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.JumpBy")
class ccJumpBy(duration:Float, position:ccPoint, y:Float, height:Float, jumps:Float) extends t_ccJumpBy {
}

@js.native
@JSGlobal("cc.JumpBy")
object ccJumpBy extends js.Object {
}

@js.native
trait t_ccJumpTo extends t_ccJumpBy {
  override def initWithDuration(duration:Float, position:ccPoint, y:Float, height:Float, jumps:Float):Boolean = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.JumpTo")
class ccJumpTo(duration:Float, position:ccPoint, y:Float, height:Float, jumps:Float) extends t_ccJumpTo {
}

@js.native
@JSGlobal("cc.JumpTo")
object ccJumpTo extends js.Object {
}

@js.native
trait t_ccBezierBy extends t_ccActionInterval {
  def initWithDuration(t:Float, c:js.Array[js.Any]):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.BezierBy")
class ccBezierBy(t:Float, c:js.Array[js.Any]) extends t_ccBezierBy {
}

@js.native
@JSGlobal("cc.BezierBy")
object ccBezierBy extends js.Object {
}

@js.native
trait t_ccBezierTo extends t_ccBezierBy {
  override def initWithDuration(t:Float, c:js.Array[js.Any]):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.BezierTo")
class ccBezierTo(t:Float, c:js.Array[js.Any]) extends t_ccBezierTo {
}

@js.native
@JSGlobal("cc.BezierTo")
object ccBezierTo extends js.Object {
}

@js.native
trait t_ccScaleTo extends t_ccActionInterval {
  def initWithDuration(duration:Float, sx:Float, sy:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.ScaleTo")
class ccScaleTo(duration:Float, sx:Float, sy:Float) extends t_ccScaleTo {
}

@js.native
@JSGlobal("cc.ScaleTo")
object ccScaleTo extends js.Object {
}

@js.native
trait t_ccScaleBy extends t_ccScaleTo {
  override def startWithTarget(target:ccNode):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.ScaleBy")
class ccScaleBy extends t_ccScaleBy {
}

@js.native
@JSGlobal("cc.ScaleBy")
object ccScaleBy extends js.Object {
}

@js.native
trait t_ccBlink extends t_ccActionInterval {
  def initWithDuration(duration:Float, blinks:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def update(dt:Float):Unit = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def stop():Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.Blink")
class ccBlink(duration:Float, blinks:Float) extends t_ccBlink {
}

@js.native
@JSGlobal("cc.Blink")
object ccBlink extends js.Object {
}

@js.native
trait t_ccFadeTo extends t_ccActionInterval {
  def initWithDuration(duration:Float, opacity:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def update(time:Float):Unit = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.FadeTo")
class ccFadeTo(duration:Float, opacity:Float) extends t_ccFadeTo {
}

@js.native
@JSGlobal("cc.FadeTo")
object ccFadeTo extends js.Object {
}

@js.native
trait t_ccFadeIn extends t_ccFadeTo {
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.FadeIn")
class ccFadeIn(duration:Float) extends t_ccFadeIn {
}

@js.native
@JSGlobal("cc.FadeIn")
object ccFadeIn extends js.Object {
}

@js.native
trait t_ccFadeOut extends t_ccFadeTo {
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.FadeOut")
class ccFadeOut(duration:Float) extends t_ccFadeOut {
}

@js.native
@JSGlobal("cc.FadeOut")
object ccFadeOut extends js.Object {
}

@js.native
trait t_ccTintTo extends t_ccActionInterval {
  def initWithDuration(duration:Float, red:Float, green:Float, blue:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.TintTo")
class ccTintTo(duration:Float, red:Float, green:Float, blue:Float) extends t_ccTintTo {
}

@js.native
@JSGlobal("cc.TintTo")
object ccTintTo extends js.Object {
}

@js.native
trait t_ccTintBy extends t_ccActionInterval {
  def initWithDuration(duration:Float, deltaRed:Float, deltaGreen:Float, deltaBlue:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.TintBy")
class ccTintBy(duration:Float, deltaRed:Float, deltaGreen:Float, deltaBlue:Float) extends t_ccTintBy {
}

@js.native
@JSGlobal("cc.TintBy")
object ccTintBy extends js.Object {
}

@js.native
trait t_ccDelayTime extends t_ccActionInterval {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.DelayTime")
class ccDelayTime extends t_ccDelayTime {
}

@js.native
@JSGlobal("cc.DelayTime")
object ccDelayTime extends js.Object {
}

@js.native
trait t_ccReverseTime extends t_ccActionInterval {
  def initWithAction(action:ccFiniteTimeAction):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def stop():Unit = js.native
}

@js.native
@JSGlobal("cc.ReverseTime")
class ccReverseTime(action:ccFiniteTimeAction) extends t_ccReverseTime {
}

@js.native
@JSGlobal("cc.ReverseTime")
object ccReverseTime extends js.Object {
}

@js.native
trait t_ccAnimate extends t_ccActionInterval {
  def getAnimation:ccAnimation = js.native
  def setAnimation(animation:ccAnimation):Unit = js.native
  def getCurrentFrameIndex:Float = js.native
  def initWithAnimation(animation:ccAnimation):Boolean = js.native
  override def clone:ccAction = js.native
  def startWithTarget(target:ccSprite):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def stop():Unit = js.native
}

@js.native
@JSGlobal("cc.Animate")
class ccAnimate(animation:ccAnimation) extends t_ccAnimate {
}

@js.native
@JSGlobal("cc.Animate")
object ccAnimate extends js.Object {
}

@js.native
trait t_ccTargetedAction extends t_ccActionInterval {
  def initWithTarget(target:ccNode, action:ccFiniteTimeAction):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def stop():Unit = js.native
  override def update(dt:Float):Unit = js.native
  def getForcedTarget:ccNode = js.native
  def setForcedTarget(forcedTarget:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.TargetedAction")
class ccTargetedAction(target:ccNode, action:ccFiniteTimeAction) extends t_ccTargetedAction {
}

@js.native
@JSGlobal("cc.TargetedAction")
object ccTargetedAction extends js.Object {
}



