package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}

@js.native
trait t_ccActionInstant extends t_ccFiniteTimeAction {
  override def isDone:Boolean = js.native
  override def step(dt:Float):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
trait ts_ccActionInstant extends ts_ccFiniteTimeAction {
}

@js.native
@JSGlobal("cc.ActionInstant")
class ccActionInstant extends t_ccActionInstant {
}

@js.native
@JSGlobal("cc.ActionInstant")
object ccActionInstant extends ts_ccActionInstant {
}

@js.native
trait t_ccShow extends t_ccActionInstant {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
trait ts_ccShow extends ts_ccActionInstant {
}

@js.native
@JSGlobal("cc.Show")
class ccShow extends t_ccShow {
}

@js.native
@JSGlobal("cc.Show")
object ccShow extends ts_ccShow {
}

@js.native
trait t_ccHide extends t_ccActionInstant {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
trait ts_ccHide extends ts_ccActionInstant {
}

@js.native
@JSGlobal("cc.Hide")
class ccHide extends t_ccHide {
}

@js.native
@JSGlobal("cc.Hide")
object ccHide extends ts_ccHide {
}

@js.native
trait t_ccToggleVisibility extends t_ccActionInstant {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
trait ts_ccToggleVisibility extends ts_ccActionInstant {
}

@js.native
@JSGlobal("cc.ToggleVisibility")
class ccToggleVisibility extends t_ccToggleVisibility {
}

@js.native
@JSGlobal("cc.ToggleVisibility")
object ccToggleVisibility extends ts_ccToggleVisibility {
}

@js.native
trait t_ccRemoveSelf extends t_ccActionInstant {
}

@js.native
trait ts_ccRemoveSelf extends ts_ccActionInstant {
}

@js.native
@JSGlobal("cc.RemoveSelf")
class ccRemoveSelf(isNeedCleanUp:Boolean) extends t_ccRemoveSelf {
}

@js.native
@JSGlobal("cc.RemoveSelf")
object ccRemoveSelf extends ts_ccRemoveSelf {
}

@js.native
trait t_ccFlipX extends t_ccActionInstant {
  def initWithFlipX(flip:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
trait ts_ccFlipX extends ts_ccActionInstant {
}

@js.native
@JSGlobal("cc.FlipX")
class ccFlipX(flip:Boolean) extends t_ccFlipX {
}

@js.native
@JSGlobal("cc.FlipX")
object ccFlipX extends ts_ccFlipX {
}

@js.native
trait t_ccFlipY extends t_ccActionInstant {
  def initWithFlipY(flip:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
trait ts_ccFlipY extends ts_ccActionInstant {
}

@js.native
@JSGlobal("cc.FlipY")
class ccFlipY(flip:Boolean) extends t_ccFlipY {
}

@js.native
@JSGlobal("cc.FlipY")
object ccFlipY extends ts_ccFlipY {
}

@js.native
trait t_ccPlace extends t_ccActionInstant {
  def initWithPosition(x:Float, y:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
}

@js.native
trait ts_ccPlace extends ts_ccActionInstant {
}

@js.native
@JSGlobal("cc.Place")
class ccPlace(pos:Float|t_ccPoint, y:Float) extends t_ccPlace {
}

@js.native
@JSGlobal("cc.Place")
object ccPlace extends ts_ccPlace {
}

@js.native
trait t_ccCallFunc extends t_ccActionInstant {
  def initWithFunction(selector:js.Function, selectorTarget:js.Dynamic|types.DynObject, data:js.Dynamic):Boolean = js.native
  def execute():Unit = js.native
  override def update(dt:Float):Unit = js.native
  def getTargetCallback:types.DynObject = js.native
  def setTargetCallback(sel:types.DynObject):Unit = js.native
  override def clone:ccAction = js.native
}

@js.native
trait ts_ccCallFunc extends ts_ccActionInstant {
}

@js.native
@JSGlobal("cc.CallFunc")
class ccCallFunc(selector:js.Function, selectorTarget:Null|types.DynObject, data:Null|js.Dynamic) extends t_ccCallFunc {
}

@js.native
@JSGlobal("cc.CallFunc")
object ccCallFunc extends ts_ccCallFunc {
}


