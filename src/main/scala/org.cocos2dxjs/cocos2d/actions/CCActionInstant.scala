package org.cocos2dxjs.cocos2d.actions

import scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal("cc.ActionInstant")
class ccActionInstant extends ccFiniteTimeAction {
  override def isDone:Boolean = js.native
  override def step(dt:Float):Unit = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.Show")
class ccShow extends ccActionInstant {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.Hide")
class ccHide extends ccActionInstant {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.ToggleVisibility")
class ccToggleVisibility extends ccActionInstant {
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.RemoveSelf")
class ccRemoveSelf extends ccActionInstant {
}

@js.native
@JSGlobal("cc.FlipX")
class ccFlipX extends ccActionInstant {
  def initWithFlipX(flip:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.FlipY")
class ccFlipY extends ccActionInstant {
  def initWithFlipY(flip:Boolean):Boolean = js.native
  override def update(dt:Float):Unit = js.native
  override def reverse:ccAction = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.Place")
class ccPlace extends ccActionInstant {
  def initWithPosition(x:Float, y:Float):Boolean = js.native
  override def update(dt:Float):Unit = js.native
  override def clone:ccAction = js.native
}

@js.native
@JSGlobal("cc.CallFunc")
class ccCallFunc extends ccActionInstant {
  def initWithFunction(selector:js.Function, selectorTarget:js.Object, data:js.Any):Boolean = js.native
  def execute():Unit = js.native
  override def update(dt:Float):Unit = js.native
  def getTargetCallback:js.Object = js.native
  def setTargetCallback(sel:js.Object):Unit = js.native
  override def clone:ccAction = js.native
}

