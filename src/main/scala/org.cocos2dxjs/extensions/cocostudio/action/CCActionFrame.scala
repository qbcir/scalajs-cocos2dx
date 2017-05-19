package org.cocos2dxjs.extensions.cocostudio.action

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.cocostudio.ccsClass
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.actions.ccMoveTo
import org.cocos2dxjs.cocos2d.actions.ccScaleTo
import org.cocos2dxjs.cocos2d.actions.ccFadeTo
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.actions.ccTintTo

@js.native
@JSGlobal("ccs.ActionFrame")
class ccsActionFrame extends ccsClass {
  def getAction(duration:Float, srcFrame:ccsActionFrame):js.Any = js.native
  def setEasingParameter(parameter:js.Array[js.Any]):Unit = js.native
  def setEasingType(easingType:Float):Unit = js.native
}

@js.native
@JSGlobal("ccs.ActionMoveFrame")
class ccsActionMoveFrame extends ccsActionFrame {
  def setPosition(pos:ccPoint, y:Float):Unit = js.native
  def getPosition:ccPoint = js.native
  def getAction(duration:Float):ccMoveTo = js.native
}

@js.native
@JSGlobal("ccs.ActionScaleFrame")
class ccsActionScaleFrame extends ccsActionFrame {
  def setScaleX(scaleX:Float):Unit = js.native
  def getScaleX:Float = js.native
  def setScaleY(scaleY:Float):Unit = js.native
  def getScaleY:Float = js.native
  def getAction(duration:Float):ccScaleTo = js.native
}

@js.native
@JSGlobal("ccs.ActionRotationFrame")
class ccsActionRotationFrame extends ccsActionFrame {
  def setRotation(rotation:Float):Unit = js.native
  def getRotation:Float = js.native
  override def getAction(duration:Float, srcFrame:ccsActionFrame):js.Any = js.native
}

@js.native
@JSGlobal("ccs.ActionFadeFrame")
class ccsActionFadeFrame extends ccsActionFrame {
  def setOpacity(opacity:Float):Unit = js.native
  def getOpacity:Float = js.native
  def getAction(duration:Float):ccFadeTo = js.native
}

@js.native
@JSGlobal("ccs.ActionTintFrame")
class ccsActionTintFrame extends ccsActionFrame {
  def setColor(color:ccColor):Unit = js.native
  def getColor:ccColor = js.native
  def getAction(duration:js.Any):ccTintTo = js.native
}

