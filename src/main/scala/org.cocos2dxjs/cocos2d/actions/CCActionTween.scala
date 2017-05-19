package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccClass

@js.native
@JSGlobal("cc.ActionTweenDelegate")
class ccActionTweenDelegate extends ccClass {
  def updateTweenAction(value:js.Any, key:js.Any):Unit = js.native
}

@js.native
@JSGlobal("cc.ActionTween")
class ccActionTween extends ccActionInterval {
  def initWithDuration(duration:Float, key:String, from:Float, to:Float):Boolean = js.native
  def startWithTarget(target:ccActionTweenDelegate):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

