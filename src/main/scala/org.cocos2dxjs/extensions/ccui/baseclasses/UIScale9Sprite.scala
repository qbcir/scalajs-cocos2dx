package org.cocos2dxjs.extensions.ccui.baseclasses

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode

@js.native
trait t_ccuiScale9Sprite extends t_ccNode {
  def initWithSpriteFrame(spriteFrameOrSFName:js.Any):Unit = js.native
  def setTexture(textureOrTextureFile:js.Any):Unit = js.native
  def setSpriteFrame(spriteFrameOrSFFileName:js.Any):Unit = js.native
  def setBlendFunc(blendFunc:js.Any):Unit = js.native
  def getBlendFunc():Unit = js.native
  def setState(state:js.Any):Unit = js.native
  def getState():Unit = js.native
  def setRenderingType():Unit = js.native
  def getRenderingType():Unit = js.native
  def setInsetLeft(insetLeft:js.Any):Unit = js.native
  def getInsetLeft():Unit = js.native
  def setInsetTop(insetTop:js.Any):Unit = js.native
  def getInsetTop():Unit = js.native
  def setInsetRight(insetRight:js.Any):Unit = js.native
  def getInsetRight():Unit = js.native
  def setInsetBottom(insetBottom:js.Any):Unit = js.native
  def getInsetBottom():Unit = js.native
}

@js.native
@JSGlobal("ccui.Scale9Sprite")
class ccuiScale9Sprite(file:String, rectOrCapInsets:ccRect, capInsets:ccRect) extends t_ccuiScale9Sprite {
}

@js.native
@JSGlobal("ccui.Scale9Sprite")
object ccuiScale9Sprite extends js.Object {
}

