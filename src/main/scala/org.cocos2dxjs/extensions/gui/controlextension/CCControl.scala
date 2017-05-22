package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.eventmanager.{ccTouch, t_ccTouch}
import org.cocos2dxjs.cocos2d.core.layers.t_ccLayer
import org.cocos2dxjs.cocos2d.core.layers.ts_ccLayer

@js.native
trait t_ccControl extends t_ccLayer {
  val state: Float = js.native
  var enabled: Boolean = js.native
  var selected: Boolean = js.native
  var highlighted: Boolean = js.native
  def setEnabled(enabled:Boolean):Unit = js.native
  def setSelected(selected:Boolean):Unit = js.native
  def setHighlighted(highlighted:Boolean):Unit = js.native
  def sendActionsForControlEvents(controlEvents:Float):Unit = js.native
  def addTargetWithActionForControlEvents(target:types.DynObject, action:js.Function, controlEvents:Float):Unit = js.native
  def removeTargetWithActionForControlEvents(target:types.DynObject, action:js.Function, controlEvents:Float):Unit = js.native
  def getTouchLocation(touch:t_ccTouch):Unit = js.native
  def isTouchInside(touch:t_ccTouch):Boolean = js.native
  def _invocationWithTargetAndActionForControlEvent(target:types.DynObject, action:js.Function, controlEvent:Float):ccInvocation = js.native
  def _dispatchListforControlEvent(controlEvent:Float):ccInvocation = js.native
  def _addTargetWithActionForControlEvent(target:js.Dynamic, action:js.Dynamic, controlEvent:js.Dynamic):Unit = js.native
  def _removeTargetWithActionForControlEvent(target:types.DynObject, action:js.Function, controlEvent:Float):Unit = js.native
  def needsLayout():Unit = js.native
}

@js.native
trait ts_ccControl extends ts_ccLayer {
}

@js.native
@JSGlobal("cc.Control")
class ccControl extends t_ccControl {
  var _state: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.Control")
object ccControl extends ts_ccControl {
}


