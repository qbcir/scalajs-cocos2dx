package org.cocos2dxjs.extensions.ccui.baseclasses

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}
import org.cocos2dxjs.cocos2d.core.sprites.{ccSpriteFrame, t_ccSpriteFrame}
import org.cocos2dxjs.cocos2d.core.basenodes.t_ccNode
import org.cocos2dxjs.cocos2d.core.basenodes.ts_ccNode

@js.native
trait t_ccuiScale9Sprite extends t_ccNode {
  var preferredSize: ccSize = js.native
  var capInsets: ccRect = js.native
  var insetLeft: Float = js.native
  var insetTop: Float = js.native
  var insetRight: Float = js.native
  var insetBottom: Float = js.native
  def initWithSpriteFrame(spriteFrameOrSFName:js.Dynamic):Unit = js.native
  def setTexture(textureOrTextureFile:js.Dynamic):Unit = js.native
  def setSpriteFrame(spriteFrameOrSFFileName:js.Dynamic):Unit = js.native
  def setBlendFunc(blendFunc:js.Dynamic):Unit = js.native
  def getBlendFunc():Unit = js.native
  def setState(state:js.Dynamic):Unit = js.native
  def getState():Unit = js.native
  def setRenderingType():Unit = js.native
  def getRenderingType():Unit = js.native
  def setInsetLeft(insetLeft:js.Dynamic):Unit = js.native
  def getInsetLeft():Unit = js.native
  def setInsetTop(insetTop:js.Dynamic):Unit = js.native
  def getInsetTop():Unit = js.native
  def setInsetRight(insetRight:js.Dynamic):Unit = js.native
  def getInsetRight():Unit = js.native
  def setInsetBottom(insetBottom:js.Dynamic):Unit = js.native
  def getInsetBottom():Unit = js.native
}

@js.native
trait ts_ccuiScale9Sprite extends ts_ccNode {
}

@js.native
@JSGlobal("ccui.Scale9Sprite")
class ccuiScale9Sprite(file:String|t_ccSpriteFrame, rectOrCapInsets:t_ccRect, capInsets:t_ccRect) extends t_ccuiScale9Sprite {
}

@js.native
@JSGlobal("ccui.Scale9Sprite")
object ccuiScale9Sprite extends ts_ccuiScale9Sprite {
  var POSITIONS_CENTRE: js.Dynamic = js.native
}


