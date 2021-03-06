package org.cocos2dxjs.extensions.gui.controlextension

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.core.platform.{ccColor, t_ccColor}
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}

@js.native
trait t_ccControlButton extends t_ccControl {
  var adjustBackgroundImage: Boolean = js.native
  var zoomOnTouchDown: Boolean = js.native
  var preferredSize: ccSize = js.native
  var labelAnchor: Boolean = js.native
  def doesAdjustBackgroundImage():Boolean = js.native
  def getZoomOnTouchDown():Unit = js.native
  def getPreferredSize():Unit = js.native
  def _getCurrentTitle():String = js.native
  def _getCurrentTitleColor():Unit = js.native
  def isPushed():Unit = js.native
  def setMargins(marginH:Float, marginV:Float):Unit = js.native
  def getTitleForState(state:Float):String = js.native
  def setTitleForState(title:String, state:Float):Unit = js.native
  def getTitleColorForState(state:Float):ccColor = js.native
  def setTitleColorForState(color:t_ccColor, state:Float):Unit = js.native
  def getTitleLabelForState(state:js.Dynamic):ccNode = js.native
  def setTitleLabelForState(titleLabel:t_ccNode, state:Float):Unit = js.native
  def setTitleTTFForState(fntFile:String, state:Float):Unit = js.native
  def getTitleTTFForState(state:Float):String = js.native
  def setTitleTTFSizeForState(size:Float, state:Float):Unit = js.native
  def getTitleTTFSizeForState(state:Float):Float = js.native
  def setTitleBMFontForState(fntFile:String, state:Float):Unit = js.native
  def getBackgroundSpriteForState(state:Float):Unit = js.native
  def setBackgroundSpriteForState(sprite:js.Dynamic, state:Float):Unit = js.native
  def setBackgroundSpriteFrameForState(spriteFrame:js.Dynamic, state:Float):Unit = js.native
}

@js.native
trait ts_ccControlButton extends ts_ccControl {
}

@js.native
@JSGlobal("cc.ControlButton")
class ccControlButton() extends t_ccControlButton {
  var _state: js.Dynamic = js.native
}

@js.native
@JSGlobal("cc.ControlButton")
object ccControlButton extends ts_ccControlButton {
}


