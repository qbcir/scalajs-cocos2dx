package org.cocos2dxjs.cocos2d.progresstimer

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.actions.{ccAction, t_ccAction}
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.actions.t_ccActionInterval
import org.cocos2dxjs.cocos2d.actions.ts_ccActionInterval

@js.native
trait t_ccProgressTo extends t_ccActionInterval {
  def initWithDuration(duration:Float, percent:Float):Boolean = js.native
  override def clone():ccAction = js.native
  override def reverse():ccAction = js.native
  override def startWithTarget(target:t_ccNode):Unit = js.native
  override def update(time:Float):Unit = js.native
}

@js.native
trait ts_ccProgressTo extends ts_ccActionInterval {
}

@js.native
@JSGlobal("cc.ProgressTo")
class ccProgressTo(duration:Float, percent:Float) extends t_ccProgressTo {
}

@js.native
@JSGlobal("cc.ProgressTo")
object ccProgressTo extends ts_ccProgressTo {
}

@js.native
trait t_ccProgressFromTo extends t_ccActionInterval {
  def initWithDuration(duration:Float, fromPercentage:Float, toPercentage:Float):Boolean = js.native
  override def clone():ccAction = js.native
  override def reverse():ccAction = js.native
  override def startWithTarget(target:t_ccNode):Unit = js.native
  override def update(time:Float):Unit = js.native
}

@js.native
trait ts_ccProgressFromTo extends ts_ccActionInterval {
}

@js.native
@JSGlobal("cc.ProgressFromTo")
class ccProgressFromTo(duration:Float, fromPercentage:Float, toPercentage:Float) extends t_ccProgressFromTo {
}

@js.native
@JSGlobal("cc.ProgressFromTo")
object ccProgressFromTo extends ts_ccProgressFromTo {
}


