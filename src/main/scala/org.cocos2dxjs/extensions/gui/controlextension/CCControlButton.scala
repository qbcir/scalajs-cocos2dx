package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode

@js.native
trait t_ccControlButton extends t_ccControl {
  def doesAdjustBackgroundImage:Boolean = js.native
  def getZoomOnTouchDown():Unit = js.native
  def getPreferredSize():Unit = js.native
  def _getCurrentTitle:String = js.native
  def _getCurrentTitleColor():Unit = js.native
  def isPushed():Unit = js.native
  def setMargins(marginH:Float, marginV:Float):Unit = js.native
  def getTitleForState(state:Float):String = js.native
  def setTitleForState(title:String, state:Float):Unit = js.native
  def getTitleColorForState(state:Float):ccColor = js.native
  def setTitleColorForState(color:ccColor, state:Float):Unit = js.native
  def getTitleLabelForState(state:js.Any):ccNode = js.native
  def setTitleLabelForState(titleLabel:ccNode, state:Float):Unit = js.native
  def setTitleTTFForState(fntFile:String, state:Float):Unit = js.native
  def getTitleTTFForState(state:Float):String = js.native
  def setTitleTTFSizeForState(size:Float, state:Float):Unit = js.native
  def getTitleTTFSizeForState(state:Float):Float = js.native
  def setTitleBMFontForState(fntFile:String, state:Float):Unit = js.native
  def getBackgroundSpriteForState(state:Float):Unit = js.native
  def setBackgroundSpriteForState(sprite:js.Any, state:Float):Unit = js.native
  def setBackgroundSpriteFrameForState(spriteFrame:js.Any, state:Float):Unit = js.native
}

@js.native
@JSGlobal("cc.ControlButton")
class ccControlButton extends t_ccControlButton {
}

@js.native
@JSGlobal("cc.ControlButton")
object ccControlButton extends js.Object {
}

