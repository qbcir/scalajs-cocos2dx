package org.cocos2dxjs.cocos2d.core

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.{ccClass, t_ccClass}
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass

@js.native
trait t_ccScheduler extends t_ccClass {
  def setTimeScale(timeScale:Float):Unit = js.native
  def getTimeScale:Float = js.native
  def update(dt:Float):Unit = js.native
  def pauseAllTargets():Unit = js.native
  def pauseAllTargetsWithMinPriority(minPriority:Float):Unit = js.native
  def resumeTargets(targetsToResume:js.Array[js.Any]):Unit = js.native
  def pauseTarget(target:t_ccClass):Unit = js.native
  def resumeTarget(target:t_ccClass):Unit = js.native
  def isTargetPaused(target:t_ccClass):Boolean = js.native
}

@js.native
trait ts_ccScheduler extends ts_ccClass {
}

@js.native
@JSGlobal("cc.Scheduler")
class ccScheduler extends t_ccScheduler {
}

@js.native
@JSGlobal("cc.Scheduler")
object ccScheduler extends ts_ccScheduler {
  val PRIORITY_SYSTEM: Float = js.native
  val PRIORITY_NON_SYSTEM: Float = js.native
}


