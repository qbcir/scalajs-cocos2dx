package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint

@js.native
trait t_ccActionInstant extends t_ccFiniteTimeAction {
  override def isDone:Boolean = js.native
  override def step(dt:Float):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.ActionInstant")
class ccActionInstant extends t_ccActionInstant {
}

@js.native
@JSGlobal("cc.ActionInstant")
object ccActionInstant extends js.Object {
}

@js.native
trait t_ccShow extends t_ccActionInstant {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.Show")
class ccShow extends t_ccShow {
}

@js.native
@JSGlobal("cc.Show")
object ccShow extends js.Object {
}

@js.native
trait t_ccHide extends t_ccActionInstant {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.Hide")
class ccHide extends t_ccHide {
}

@js.native
@JSGlobal("cc.Hide")
object ccHide extends js.Object {
}

@js.native
trait t_ccToggleVisibility extends t_ccActionInstant {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.ToggleVisibility")
class ccToggleVisibility extends t_ccToggleVisibility {
}

@js.native
@JSGlobal("cc.ToggleVisibility")
object ccToggleVisibility extends js.Object {
}

@js.native
trait t_ccRemoveSelf extends t_ccActionInstant {
}

@js.native
@JSGlobal("cc.RemoveSelf")
class ccRemoveSelf extends t_ccRemoveSelf {
}

@js.native
@JSGlobal("cc.RemoveSelf")
object ccRemoveSelf extends js.Object {
}

@js.native
trait t_ccFlipX extends t_ccActionInstant {
  def initWithFlipX(flip:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.FlipX")
class ccFlipX(flip:Boolean) extends t_ccFlipX {
}

@js.native
@JSGlobal("cc.FlipX")
object ccFlipX extends js.Object {
}

@js.native
trait t_ccFlipY extends t_ccActionInstant {
  def initWithFlipY(flip:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.FlipY")
class ccFlipY(flip:Boolean) extends t_ccFlipY {
}

@js.native
@JSGlobal("cc.FlipY")
object ccFlipY extends js.Object {
}

@js.native
trait t_ccPlace extends t_ccActionInstant {
  def initWithPosition(x:Float, y:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.Place")
class ccPlace(pos:ccPoint, y:Float) extends t_ccPlace {
}

@js.native
@JSGlobal("cc.Place")
object ccPlace extends js.Object {
}

@js.native
trait t_ccCallFunc extends t_ccActionInstant {
  def initWithFunction(selector:js.Function, selectorTarget:js.Object, data:js.Any):Boolean = js.native
  def execute():Unit = js.native
  override def update(dt:Float):Unit = js.native
  def getTargetCallback:js.Object = js.native
  def setTargetCallback(sel:js.Object):Unit = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.CallFunc")
class ccCallFunc(selector:js.Function, selectorTarget:js.Object, data:js.Any) extends t_ccCallFunc {
}

@js.native
@JSGlobal("cc.CallFunc")
object ccCallFunc extends js.Object {
}



