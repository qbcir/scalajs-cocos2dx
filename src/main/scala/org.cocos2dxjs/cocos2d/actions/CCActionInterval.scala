package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.sprites.ccAnimation
import org.cocos2dxjs.cocos2d.core.sprites.ccSprite

@js.native
@JSGlobal("cc.ActionInterval")
class ccActionInterval extends ccFiniteTimeAction {
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
@JSGlobal("cc.Sequence")
class ccSequence extends ccActionInterval {
  def initWithTwoActions(actionOne:ccFiniteTimeAction, actionTwo:ccFiniteTimeAction):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def stop():Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  def _actionOneTwo(actionOne:ccFiniteTimeAction, actionTwo:ccFiniteTimeAction):ccSequence = js.native
}

@js.native
@JSGlobal("cc.Repeat")
class ccRepeat extends ccActionInterval {
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
@JSGlobal("cc.RepeatForever")
class ccRepeatForever extends ccActionInterval {
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
@JSGlobal("cc.Spawn")
class ccSpawn extends ccActionInterval {
  def initWithTwoActions(action1:ccFiniteTimeAction, action2:ccFiniteTimeAction):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def stop():Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  def _actionOneTwo(action1:ccFiniteTimeAction, action2:ccFiniteTimeAction):ccSpawn = js.native
}

@js.native
@JSGlobal("cc.RotateTo")
class ccRotateTo extends ccActionInterval {
  def initWithDuration(duration:Float, deltaAngleX:Float, deltaAngleY:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def reverse:ccAction = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.RotateBy")
class ccRotateBy extends ccActionInterval {
  def initWithDuration(duration:Float, deltaAngleX:Float, deltaAngleY:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.MoveBy")
class ccMoveBy extends ccActionInterval {
  def initWithDuration(duration:Float, position:ccPoint, y:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.MoveTo")
class ccMoveTo extends ccMoveBy {
  override def initWithDuration(duration:Float, position:ccPoint, y:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.SkewTo")
class ccSkewTo extends ccActionInterval {
  def initWithDuration(t:Float, sx:Float, sy:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.SkewBy")
class ccSkewBy extends ccSkewTo {
  override def initWithDuration(t:Float, deltaSkewX:Float, deltaSkewY:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.JumpBy")
class ccJumpBy extends ccActionInterval {
  def initWithDuration(duration:Float, position:ccPoint, y:Float, height:Float, jumps:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.JumpTo")
class ccJumpTo extends ccJumpBy {
  override def initWithDuration(duration:Float, position:ccPoint, y:Float, height:Float, jumps:Float):Boolean = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.BezierBy")
class ccBezierBy extends ccActionInterval {
  def initWithDuration(t:Float, c:js.Array[js.Any]):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.BezierTo")
class ccBezierTo extends ccBezierBy {
  override def initWithDuration(t:Float, c:js.Array[js.Any]):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.ScaleTo")
class ccScaleTo extends ccActionInterval {
  def initWithDuration(duration:Float, sx:Float, sy:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.ScaleBy")
class ccScaleBy extends ccScaleTo {
  override def startWithTarget(target:ccNode):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.Blink")
class ccBlink extends ccActionInterval {
  def initWithDuration(duration:Float, blinks:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def update(dt:Float):Unit = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def stop():Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.FadeTo")
class ccFadeTo extends ccActionInterval {
  def initWithDuration(duration:Float, opacity:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def update(time:Float):Unit = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.FadeIn")
class ccFadeIn extends ccFadeTo {
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.FadeOut")
class ccFadeOut extends ccFadeTo {
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.TintTo")
class ccTintTo extends ccActionInterval {
  def initWithDuration(duration:Float, red:Float, green:Float, blue:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.TintBy")
class ccTintBy extends ccActionInterval {
  def initWithDuration(duration:Float, deltaRed:Float, deltaGreen:Float, deltaBlue:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.DelayTime")
class ccDelayTime extends ccActionInterval {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.ReverseTime")
class ccReverseTime extends ccActionInterval {
  def initWithAction(action:ccFiniteTimeAction):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def stop():Unit = js.native
}

@js.native
@JSGlobal("cc.Animate")
class ccAnimate extends ccActionInterval {
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
@JSGlobal("cc.TargetedAction")
class ccTargetedAction extends ccActionInterval {
  def initWithTarget(target:ccNode, action:ccFiniteTimeAction):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def stop():Unit = js.native
  override def update(dt:Float):Unit = js.native
  def getForcedTarget:ccNode = js.native
  def setForcedTarget(forcedTarget:ccNode):Unit = js.native
}

