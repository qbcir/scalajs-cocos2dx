package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass

@js.native
trait t_ccActionTweenDelegate extends t_ccClass {
}

@js.native
trait ts_ccActionTweenDelegate extends ts_ccClass {
  def updateTweenAction(value:js.Dynamic, key:js.Dynamic):Unit = js.native
}

@js.native
@JSGlobal("cc.ActionTweenDelegate")
class ccActionTweenDelegate extends t_ccActionTweenDelegate {
}

@js.native
@JSGlobal("cc.ActionTweenDelegate")
object ccActionTweenDelegate extends ts_ccActionTweenDelegate {
}

@js.native
trait t_ccActionTween extends t_ccActionInterval {
  def initWithDuration(duration:Float, key:String, from:Float, to:Float):Boolean = js.native
  def startWithTarget(target:t_ccActionTweenDelegate):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
trait ts_ccActionTween extends ts_ccActionInterval {
}

@js.native
@JSGlobal("cc.ActionTween")
class ccActionTween(duration:Float, key:String, from:Float, to:Float) extends t_ccActionTween {
}

@js.native
@JSGlobal("cc.ActionTween")
object ccActionTween extends ts_ccActionTween {
}


