package org.cocos2dxjs.cocos2d.core

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccClass
import org.cocos2dxjs.cocos2d.actions.ccAction
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode

@js.native
@JSGlobal("cc.HashElement")
class ccHashElement extends ccClass {
}

@js.native
@JSGlobal("cc.ActionManager")
class ccActionManager extends ccClass {
  def addAction(action:ccAction, target:ccNode, paused:Boolean):Unit = js.native
  def removeAllActions():Unit = js.native
  def removeAllActionsFromTarget(target:js.Object, forceDelete:Boolean):Unit = js.native
  def removeAction(action:ccAction):Unit = js.native
  def removeActionByTag(tag:Float, target:js.Object):Unit = js.native
  def getActionByTag(tag:Float, target:js.Object):ccAction = js.native
  def numberOfRunningActionsInTarget(target:js.Object):Float = js.native
  def pauseTarget(target:js.Object):Unit = js.native
  def resumeTarget(target:js.Object):Unit = js.native
  def pauseAllRunningActions:js.Array[js.Any] = js.native
  def resumeTargets(targetsToResume:js.Array[js.Any]):Unit = js.native
  def purgeSharedManager():Unit = js.native
  def update(dt:Float):Unit = js.native
}

