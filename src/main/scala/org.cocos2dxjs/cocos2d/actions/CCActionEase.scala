package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import scala.scalajs.js.annotation._

import org.cocos2dxjs.cocos2d.core.basenodes.ccNode

@js.native
trait t_ccActionEase extends t_ccActionInterval {
  def initWithAction(action:ccActionInterval):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def stop():Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  def getInnerAction:ccActionInterval = js.native
}

@js.native
@JSGlobal("cc.ActionEase")
class ccActionEase(action:ccActionInterval) extends t_ccActionEase {
}

@js.native
@JSGlobal("cc.ActionEase")
object ccActionEase extends js.Object {
}

@js.native
trait t_ccEaseRateAction extends t_ccActionEase {
  def setRate(rate:Float):Unit = js.native
  def getRate:Float = js.native
  def initWithAction(action:ccActionInterval, rate:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseRateAction")
class ccEaseRateAction(action:ccActionInterval, rate:Float) extends t_ccEaseRateAction {
}

@js.native
@JSGlobal("cc.EaseRateAction")
object ccEaseRateAction extends js.Object {
}

@js.native
trait t_ccEaseIn extends t_ccEaseRateAction {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseIn")
class ccEaseIn extends t_ccEaseIn {
}

@js.native
@JSGlobal("cc.EaseIn")
object ccEaseIn extends js.Object {
}

@js.native
trait t_ccEaseOut extends t_ccEaseRateAction {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseOut")
class ccEaseOut extends t_ccEaseOut {
}

@js.native
@JSGlobal("cc.EaseOut")
object ccEaseOut extends js.Object {
}

@js.native
trait t_ccEaseInOut extends t_ccEaseRateAction {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseInOut")
class ccEaseInOut extends t_ccEaseInOut {
}

@js.native
@JSGlobal("cc.EaseInOut")
object ccEaseInOut extends js.Object {
}

@js.native
trait t_ccEaseExponentialIn extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseExponentialIn")
class ccEaseExponentialIn extends t_ccEaseExponentialIn {
}

@js.native
@JSGlobal("cc.EaseExponentialIn")
object ccEaseExponentialIn extends js.Object {
}

@js.native
trait t_ccEaseExponentialOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseExponentialOut")
class ccEaseExponentialOut extends t_ccEaseExponentialOut {
}

@js.native
@JSGlobal("cc.EaseExponentialOut")
object ccEaseExponentialOut extends js.Object {
}

@js.native
trait t_ccEaseExponentialInOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseExponentialInOut")
class ccEaseExponentialInOut extends t_ccEaseExponentialInOut {
}

@js.native
@JSGlobal("cc.EaseExponentialInOut")
object ccEaseExponentialInOut extends js.Object {
}

@js.native
trait t_ccEaseSineIn extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseSineIn")
class ccEaseSineIn extends t_ccEaseSineIn {
}

@js.native
@JSGlobal("cc.EaseSineIn")
object ccEaseSineIn extends js.Object {
}

@js.native
trait t_ccEaseSineOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseSineOut")
class ccEaseSineOut extends t_ccEaseSineOut {
}

@js.native
@JSGlobal("cc.EaseSineOut")
object ccEaseSineOut extends js.Object {
}

@js.native
trait t_ccEaseSineInOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseSineInOut")
class ccEaseSineInOut extends t_ccEaseSineInOut {
}

@js.native
@JSGlobal("cc.EaseSineInOut")
object ccEaseSineInOut extends js.Object {
}

@js.native
trait t_ccEaseElastic extends t_ccActionEase {
  def getPeriod:Float = js.native
  def setPeriod(period:Float):Unit = js.native
  def initWithAction(action:ccActionInterval, period:Float):Boolean = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseElastic")
class ccEaseElastic(action:ccActionInterval, period:Float) extends t_ccEaseElastic {
}

@js.native
@JSGlobal("cc.EaseElastic")
object ccEaseElastic extends js.Object {
}

@js.native
trait t_ccEaseElasticIn extends t_ccEaseElastic {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseElasticIn")
class ccEaseElasticIn extends t_ccEaseElasticIn {
}

@js.native
@JSGlobal("cc.EaseElasticIn")
object ccEaseElasticIn extends js.Object {
}

@js.native
trait t_ccEaseElasticOut extends t_ccEaseElastic {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseElasticOut")
class ccEaseElasticOut extends t_ccEaseElasticOut {
}

@js.native
@JSGlobal("cc.EaseElasticOut")
object ccEaseElasticOut extends js.Object {
}

@js.native
trait t_ccEaseElasticInOut extends t_ccEaseElastic {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseElasticInOut")
class ccEaseElasticInOut extends t_ccEaseElasticInOut {
}

@js.native
@JSGlobal("cc.EaseElasticInOut")
object ccEaseElasticInOut extends js.Object {
}

@js.native
trait t_ccEaseBounce extends t_ccActionEase {
  def bounceTime(time1:Float):Float = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBounce")
class ccEaseBounce extends t_ccEaseBounce {
}

@js.native
@JSGlobal("cc.EaseBounce")
object ccEaseBounce extends js.Object {
}

@js.native
trait t_ccEaseBounceIn extends t_ccEaseBounce {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBounceIn")
class ccEaseBounceIn extends t_ccEaseBounceIn {
}

@js.native
@JSGlobal("cc.EaseBounceIn")
object ccEaseBounceIn extends js.Object {
}

@js.native
trait t_ccEaseBounceOut extends t_ccEaseBounce {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBounceOut")
class ccEaseBounceOut extends t_ccEaseBounceOut {
}

@js.native
@JSGlobal("cc.EaseBounceOut")
object ccEaseBounceOut extends js.Object {
}

@js.native
trait t_ccEaseBounceInOut extends t_ccEaseBounce {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBounceInOut")
class ccEaseBounceInOut extends t_ccEaseBounceInOut {
}

@js.native
@JSGlobal("cc.EaseBounceInOut")
object ccEaseBounceInOut extends js.Object {
}

@js.native
trait t_ccEaseBackIn extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBackIn")
class ccEaseBackIn extends t_ccEaseBackIn {
}

@js.native
@JSGlobal("cc.EaseBackIn")
object ccEaseBackIn extends js.Object {
}

@js.native
trait t_ccEaseBackOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBackOut")
class ccEaseBackOut extends t_ccEaseBackOut {
}

@js.native
@JSGlobal("cc.EaseBackOut")
object ccEaseBackOut extends js.Object {
}

@js.native
trait t_ccEaseBackInOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseBackInOut")
class ccEaseBackInOut extends t_ccEaseBackInOut {
}

@js.native
@JSGlobal("cc.EaseBackInOut")
object ccEaseBackInOut extends js.Object {
}

@js.native
trait t_ccEaseBezierAction extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
  def setBezierParamer(p0:js.Any, p1:js.Any, p2:js.Any, p3:js.Any):Unit = js.native
}

@js.native
@JSGlobal("cc.EaseBezierAction")
class ccEaseBezierAction(action:ccAction) extends t_ccEaseBezierAction {
}

@js.native
@JSGlobal("cc.EaseBezierAction")
object ccEaseBezierAction extends js.Object {
}

@js.native
trait t_ccEaseQuadraticActionIn extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuadraticActionIn")
class ccEaseQuadraticActionIn extends t_ccEaseQuadraticActionIn {
}

@js.native
@JSGlobal("cc.EaseQuadraticActionIn")
object ccEaseQuadraticActionIn extends js.Object {
}

@js.native
trait t_ccEaseQuadraticActionOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuadraticActionOut")
class ccEaseQuadraticActionOut extends t_ccEaseQuadraticActionOut {
}

@js.native
@JSGlobal("cc.EaseQuadraticActionOut")
object ccEaseQuadraticActionOut extends js.Object {
}

@js.native
trait t_ccEaseQuadraticActionInOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuadraticActionInOut")
class ccEaseQuadraticActionInOut extends t_ccEaseQuadraticActionInOut {
}

@js.native
@JSGlobal("cc.EaseQuadraticActionInOut")
object ccEaseQuadraticActionInOut extends js.Object {
}

@js.native
trait t_ccEaseQuarticActionIn extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuarticActionIn")
class ccEaseQuarticActionIn extends t_ccEaseQuarticActionIn {
}

@js.native
@JSGlobal("cc.EaseQuarticActionIn")
object ccEaseQuarticActionIn extends js.Object {
}

@js.native
trait t_ccEaseQuarticActionOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuarticActionOut")
class ccEaseQuarticActionOut extends t_ccEaseQuarticActionOut {
}

@js.native
@JSGlobal("cc.EaseQuarticActionOut")
object ccEaseQuarticActionOut extends js.Object {
}

@js.native
trait t_ccEaseQuarticActionInOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuarticActionInOut")
class ccEaseQuarticActionInOut extends t_ccEaseQuarticActionInOut {
}

@js.native
@JSGlobal("cc.EaseQuarticActionInOut")
object ccEaseQuarticActionInOut extends js.Object {
}

@js.native
trait t_ccEaseQuinticActionIn extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuinticActionIn")
class ccEaseQuinticActionIn extends t_ccEaseQuinticActionIn {
}

@js.native
@JSGlobal("cc.EaseQuinticActionIn")
object ccEaseQuinticActionIn extends js.Object {
}

@js.native
trait t_ccEaseQuinticActionOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuinticActionOut")
class ccEaseQuinticActionOut extends t_ccEaseQuinticActionOut {
}

@js.native
@JSGlobal("cc.EaseQuinticActionOut")
object ccEaseQuinticActionOut extends js.Object {
}

@js.native
trait t_ccEaseQuinticActionInOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseQuinticActionInOut")
class ccEaseQuinticActionInOut extends t_ccEaseQuinticActionInOut {
}

@js.native
@JSGlobal("cc.EaseQuinticActionInOut")
object ccEaseQuinticActionInOut extends js.Object {
}

@js.native
trait t_ccEaseCircleActionIn extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseCircleActionIn")
class ccEaseCircleActionIn extends t_ccEaseCircleActionIn {
}

@js.native
@JSGlobal("cc.EaseCircleActionIn")
object ccEaseCircleActionIn extends js.Object {
}

@js.native
trait t_ccEaseCircleActionOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseCircleActionOut")
class ccEaseCircleActionOut extends t_ccEaseCircleActionOut {
}

@js.native
@JSGlobal("cc.EaseCircleActionOut")
object ccEaseCircleActionOut extends js.Object {
}

@js.native
trait t_ccEaseCircleActionInOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseCircleActionInOut")
class ccEaseCircleActionInOut extends t_ccEaseCircleActionInOut {
}

@js.native
@JSGlobal("cc.EaseCircleActionInOut")
object ccEaseCircleActionInOut extends js.Object {
}

@js.native
trait t_ccEaseCubicActionIn extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseCubicActionIn")
class ccEaseCubicActionIn extends t_ccEaseCubicActionIn {
}

@js.native
@JSGlobal("cc.EaseCubicActionIn")
object ccEaseCubicActionIn extends js.Object {
}

@js.native
trait t_ccEaseCubicActionOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseCubicActionOut")
class ccEaseCubicActionOut extends t_ccEaseCubicActionOut {
}

@js.native
@JSGlobal("cc.EaseCubicActionOut")
object ccEaseCubicActionOut extends js.Object {
}

@js.native
trait t_ccEaseCubicActionInOut extends t_ccActionEase {
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
  override def reverse:ccAction = js.native
}

@js.native
@JSGlobal("cc.EaseCubicActionInOut")
class ccEaseCubicActionInOut extends t_ccEaseCubicActionInOut {
}

@js.native
@JSGlobal("cc.EaseCubicActionInOut")
object ccEaseCubicActionInOut extends js.Object {
}


