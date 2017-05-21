package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.eventmanager.ccTouch
import org.cocos2dxjs.cocos2d.core.layers.t_ccLayer

@js.native
trait t_ccControl extends t_ccLayer {
  def setEnabled(enabled:Boolean):Unit = js.native
  def setSelected(selected:Boolean):Unit = js.native
  def setHighlighted(highlighted:Boolean):Unit = js.native
  def sendActionsForControlEvents(controlEvents:Float):Unit = js.native
  def addTargetWithActionForControlEvents(target:js.Object, action:js.Function, controlEvents:Float):Unit = js.native
  def removeTargetWithActionForControlEvents(target:js.Object, action:js.Function, controlEvents:Float):Unit = js.native
  def getTouchLocation(touch:ccTouch):Unit = js.native
  def isTouchInside(touch:ccTouch):Boolean = js.native
  def _invocationWithTargetAndActionForControlEvent(target:js.Object, action:js.Function, controlEvent:Float):ccInvocation = js.native
  def _dispatchListforControlEvent(controlEvent:Float):ccInvocation = js.native
  def _addTargetWithActionForControlEvent(target:js.Any, action:js.Any, controlEvent:js.Any):Unit = js.native
  def _removeTargetWithActionForControlEvent(target:js.Object, action:js.Function, controlEvent:Float):Unit = js.native
  def needsLayout():Unit = js.native
}

@js.native
@JSGlobal("cc.Control")
class ccControl extends t_ccControl {
}

@js.native
@JSGlobal("cc.Control")
object ccControl extends js.Object {
}

