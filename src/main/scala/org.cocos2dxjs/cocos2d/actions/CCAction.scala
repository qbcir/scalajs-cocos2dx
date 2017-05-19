package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.platform.ccClass
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect

@js.native
@JSGlobal("cc.Action")
class ccAction extends ccClass {
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
@JSGlobal("cc.FiniteTimeAction")
class ccFiniteTimeAction extends ccAction {
  def getDuration:Float = js.native
  def setDuration(duration:Float):Unit = js.native
  def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.Speed")
class ccSpeed extends ccAction {
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
@JSGlobal("cc.Follow")
class ccFollow extends ccAction {
  override def clone:ccAction = js.native
  def isBoundarySet:Boolean = js.native
  def setBoudarySet(value:Boolean):Unit = js.native
  def initWithTarget(followedNode:ccNode, rect:ccRect):Boolean = js.native
  override def step(dt:Float):Unit = js.native
  override def isDone:Boolean = js.native
  override def stop():Unit = js.native
}

