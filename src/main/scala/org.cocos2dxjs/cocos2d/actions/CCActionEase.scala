package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode

@js.native
@JSGlobal("cc.ActionEase")
class ccActionEase extends ccActionInterval {
  def initWithAction(action:ccActionInterval):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def stop():Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  def getInnerAction:ccActionInterval = js.native
}

@js.native
@JSGlobal("cc.EaseRateAction")
class ccEaseRateAction extends ccActionEase {
  def setRate(rate:Float):Unit = js.native
  def getRate:Float = js.native
  def initWithAction(action:ccActionInterval, rate:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseIn")
class ccEaseIn extends ccEaseRateAction {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseOut")
class ccEaseOut extends ccEaseRateAction {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseInOut")
class ccEaseInOut extends ccEaseRateAction {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseExponentialIn")
class ccEaseExponentialIn extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseExponentialOut")
class ccEaseExponentialOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseExponentialInOut")
class ccEaseExponentialInOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseSineIn")
class ccEaseSineIn extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseSineOut")
class ccEaseSineOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseSineInOut")
class ccEaseSineInOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseElastic")
class ccEaseElastic extends ccActionEase {
  def getPeriod:Float = js.native
  def setPeriod(period:Float):Unit = js.native
  def initWithAction(action:ccActionInterval, period:Float):Boolean = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseElasticIn")
class ccEaseElasticIn extends ccEaseElastic {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseElasticOut")
class ccEaseElasticOut extends ccEaseElastic {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseElasticInOut")
class ccEaseElasticInOut extends ccEaseElastic {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBounce")
class ccEaseBounce extends ccActionEase {
  def bounceTime(time1:Float):Float = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBounceIn")
class ccEaseBounceIn extends ccEaseBounce {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBounceOut")
class ccEaseBounceOut extends ccEaseBounce {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBounceInOut")
class ccEaseBounceInOut extends ccEaseBounce {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBackIn")
class ccEaseBackIn extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBackOut")
class ccEaseBackOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBackInOut")
class ccEaseBackInOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBezierAction")
class ccEaseBezierAction extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
  def setBezierParamer(p0:js.Any, p1:js.Any, p2:js.Any, p3:js.Any):Unit = js.native
}

@js.native
@JSGlobal("cc.EaseQuadraticActionIn")
class ccEaseQuadraticActionIn extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuadraticActionOut")
class ccEaseQuadraticActionOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuadraticActionInOut")
class ccEaseQuadraticActionInOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuarticActionIn")
class ccEaseQuarticActionIn extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuarticActionOut")
class ccEaseQuarticActionOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuarticActionInOut")
class ccEaseQuarticActionInOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuinticActionIn")
class ccEaseQuinticActionIn extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuinticActionOut")
class ccEaseQuinticActionOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuinticActionInOut")
class ccEaseQuinticActionInOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseCircleActionIn")
class ccEaseCircleActionIn extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseCircleActionOut")
class ccEaseCircleActionOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseCircleActionInOut")
class ccEaseCircleActionInOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseCubicActionIn")
class ccEaseCubicActionIn extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseCubicActionOut")
class ccEaseCubicActionOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseCubicActionInOut")
class ccEaseCubicActionInOut extends ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

