package org.cocos2dxjs.extensions.cocostudio.action

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.actions.ccMoveTo
import org.cocos2dxjs.cocos2d.actions.ccScaleTo
import org.cocos2dxjs.cocos2d.actions.ccFadeTo
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.actions.ccTintTo

@js.native
trait t_ccsActionFrame extends t_ccsClass {
  def getAction(duration:Float, srcFrame:ccsActionFrame):js.Any = js.native
  def setEasingParameter(parameter:js.Array[js.Any]):Unit = js.native
  def setEasingType(easingType:Float):Unit = js.native
}

@js.native
@JSGlobal("ccs.ActionFrame")
class ccsActionFrame extends t_ccsActionFrame {
}

@js.native
@JSGlobal("ccs.ActionFrame")
object ccsActionFrame extends js.Object {
}

@js.native
trait t_ccsActionMoveFrame extends t_ccsActionFrame {
  def setPosition(pos:ccPoint, y:Float):Unit = js.native
  def getPosition:ccPoint = js.native
  def getAction(duration:Float):ccMoveTo = js.native
}

@js.native
@JSGlobal("ccs.ActionMoveFrame")
class ccsActionMoveFrame extends t_ccsActionMoveFrame {
}

@js.native
@JSGlobal("ccs.ActionMoveFrame")
object ccsActionMoveFrame extends js.Object {
}

@js.native
trait t_ccsActionScaleFrame extends t_ccsActionFrame {
  def setScaleX(scaleX:Float):Unit = js.native
  def getScaleX:Float = js.native
  def setScaleY(scaleY:Float):Unit = js.native
  def getScaleY:Float = js.native
  def getAction(duration:Float):ccScaleTo = js.native
}

@js.native
@JSGlobal("ccs.ActionScaleFrame")
class ccsActionScaleFrame extends t_ccsActionScaleFrame {
}

@js.native
@JSGlobal("ccs.ActionScaleFrame")
object ccsActionScaleFrame extends js.Object {
}

@js.native
trait t_ccsActionRotationFrame extends t_ccsActionFrame {
  def setRotation(rotation:Float):Unit = js.native
  def getRotation:Float = js.native
  override def getAction(duration:Float, srcFrame:ccsActionFrame):js.Any = js.native
}

@js.native
@JSGlobal("ccs.ActionRotationFrame")
class ccsActionRotationFrame extends t_ccsActionRotationFrame {
}

@js.native
@JSGlobal("ccs.ActionRotationFrame")
object ccsActionRotationFrame extends js.Object {
}

@js.native
trait t_ccsActionFadeFrame extends t_ccsActionFrame {
  def setOpacity(opacity:Float):Unit = js.native
  def getOpacity:Float = js.native
  def getAction(duration:Float):ccFadeTo = js.native
}

@js.native
@JSGlobal("ccs.ActionFadeFrame")
class ccsActionFadeFrame extends t_ccsActionFadeFrame {
}

@js.native
@JSGlobal("ccs.ActionFadeFrame")
object ccsActionFadeFrame extends js.Object {
}

@js.native
trait t_ccsActionTintFrame extends t_ccsActionFrame {
  def setColor(color:ccColor):Unit = js.native
  def getColor:ccColor = js.native
  def getAction(duration:js.Any):ccTintTo = js.native
}

@js.native
@JSGlobal("ccs.ActionTintFrame")
class ccsActionTintFrame extends t_ccsActionTintFrame {
}

@js.native
@JSGlobal("ccs.ActionTintFrame")
object ccsActionTintFrame extends js.Object {
}

