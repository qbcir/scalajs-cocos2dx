package org.cocos2dxjs.cocos2d.core

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccClass

@js.native
@JSGlobal("cc.Scheduler")
class ccScheduler extends ccClass {
  def setTimeScale(timeScale:Float):Unit = js.native
  def getTimeScale:Float = js.native
  def update(dt:Float):Unit = js.native
  def pauseAllTargets():Unit = js.native
  def pauseAllTargetsWithMinPriority(minPriority:Float):Unit = js.native
  def resumeTargets(targetsToResume:js.Array[js.Any]):Unit = js.native
  def pauseTarget(target:ccClass):Unit = js.native
  def resumeTarget(target:ccClass):Unit = js.native
  def isTargetPaused(target:ccClass):Boolean = js.native
}

