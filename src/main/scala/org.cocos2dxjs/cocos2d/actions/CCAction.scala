package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import org.cocos2dxjs.core.{types, Implicits}
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect

@js.native
trait t_ccAction extends t_ccClass {
  var target: ccNode = js.native
  var originalTarget: ccNode = js.native
  var tag: Float = js.native
  override def clone:ccAction = js.native
  def isDone:Boolean = js.native
  def startWithTarget(target:ccNode):Unit = js.native
  def stop():Unit = js.native
  def step(dt:Float):Unit = js.native
  def update(dt:Float):Unit = js.native
  def getTarget:ccNode = js.native
  def setTarget(target:ccNode):Unit = js.native
  def getOriginalTarget:ccNode = js.native
  def setOriginalTarget(originalTarget:ccNode):Unit = js.native
  def getTag:Float = js.native
  def setTag(tag:Float):Unit = js.native
  def retain():Unit = js.native
  def release():Unit = js.native
}

@js.native
trait ts_ccAction extends ts_ccClass {
}

@js.native
@JSGlobal("cc.Action")
class ccAction extends t_ccAction {
}

@js.native
@JSGlobal("cc.Action")
object ccAction extends ts_ccAction {
}

@js.native
trait t_ccFiniteTimeAction extends t_ccAction {
  def getDuration:Float = js.native
  def setDuration(duration:Float):Unit = js.native
  def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
trait ts_ccFiniteTimeAction extends ts_ccAction {
}

@js.native
@JSGlobal("cc.FiniteTimeAction")
class ccFiniteTimeAction extends t_ccFiniteTimeAction {
}

@js.native
@JSGlobal("cc.FiniteTimeAction")
object ccFiniteTimeAction extends ts_ccFiniteTimeAction {
}

@js.native
trait t_ccSpeed extends t_ccAction {
  def getSpeed:Float = js.native
  def setSpeed(speed:Float):Unit = js.native
  def initWithAction(action:ccActionInterval, speed:Float):Boolean = js.native
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def stop():Unit = js.native
  override def step(dt:Float):Unit = js.native
  override def isDone:Boolean = js.native
  def reverse:ccSpeed = js.native
  def setInnerAction(action:ccActionInterval):Unit = js.native
  def getInnerAction:ccActionInterval = js.native
}

@js.native
trait ts_ccSpeed extends ts_ccAction {
}

@js.native
@JSGlobal("cc.Speed")
class ccSpeed(action:ccActionInterval, speed:Float) extends t_ccSpeed {
}

@js.native
@JSGlobal("cc.Speed")
object ccSpeed extends ts_ccSpeed {
}

@js.native
trait t_ccFollow extends t_ccAction {
  var leftBoundary: Float = js.native
  var rightBoundary: Float = js.native
  var topBoundary: Float = js.native
  var bottomBoundary: Float = js.native
  override def clone:ccAction = js.native
  def isBoundarySet:Boolean = js.native
  def setBoudarySet(value:Boolean):Unit = js.native
  def initWithTarget(followedNode:ccNode, rect:ccRect):Boolean = js.native
  override def step(dt:Float):Unit = js.native
  override def isDone:Boolean = js.native
  override def stop():Unit = js.native
}

@js.native
trait ts_ccFollow extends ts_ccAction {
}

@js.native
@JSGlobal("cc.Follow")
class ccFollow(followedNode:ccNode, rect:ccRect) extends t_ccFollow {
}

@js.native
@JSGlobal("cc.Follow")
object ccFollow extends ts_ccFollow {
}


