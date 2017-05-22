package org.cocos2dxjs.cocos2d.core

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass
import org.cocos2dxjs.cocos2d.actions.{ccAction, t_ccAction}
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}

@js.native
trait t_ccHashElement extends t_ccClass {
}

@js.native
trait ts_ccHashElement extends ts_ccClass {
}

@js.native
@JSGlobal("cc.HashElement")
class ccHashElement extends t_ccHashElement {
}

@js.native
@JSGlobal("cc.HashElement")
object ccHashElement extends ts_ccHashElement {
}

@js.native
trait t_ccActionManager extends t_ccClass {
  def addAction(action:t_ccAction, target:t_ccNode, paused:Boolean):Unit = js.native
  def removeAllActions():Unit = js.native
  def removeAllActionsFromTarget(target:types.DynObject, forceDelete:Boolean):Unit = js.native
  def removeAction(action:t_ccAction):Unit = js.native
  def removeActionByTag(tag:Float, target:types.DynObject):Unit = js.native
  def getActionByTag(tag:Float, target:types.DynObject):ccAction | js.Dynamic = js.native
  def numberOfRunningActionsInTarget(target:types.DynObject):Float = js.native
  def pauseTarget(target:types.DynObject):Unit = js.native
  def resumeTarget(target:types.DynObject):Unit = js.native
  def pauseAllRunningActions:js.Array[js.Any] = js.native
  def resumeTargets(targetsToResume:js.Array[js.Any]):Unit = js.native
  def purgeSharedManager():Unit = js.native
  def update(dt:Float):Unit = js.native
}

@js.native
trait ts_ccActionManager extends ts_ccClass {
}

@js.native
@JSGlobal("cc.ActionManager")
class ccActionManager extends t_ccActionManager {
}

@js.native
@JSGlobal("cc.ActionManager")
object ccActionManager extends ts_ccActionManager {
}


