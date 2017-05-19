package org.cocos2dxjs.cocos2d.core.sprites

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.textures.ccTexture2D
import org.cocos2dxjs.cocos2d.core.platform.ccClass

@js.native
@JSGlobal("cc.SpriteFrame")
class ccSpriteFrame extends ccClass {
  def textureLoaded:Boolean = js.native
  def getRectInPixels:ccRect = js.native
  def setRectInPixels(rectInPixels:ccRect):Unit = js.native
  def isRotated:Boolean = js.native
  def setRotated(bRotated:Boolean):Unit = js.native
  def getRect:ccRect = js.native
  def setRect(rect:ccRect):Unit = js.native
  def getOffsetInPixels:ccPoint = js.native
  def setOffsetInPixels(offsetInPixels:ccPoint):Unit = js.native
  def getOriginalSizeInPixels:ccSize = js.native
  def setOriginalSizeInPixels(sizeInPixels:ccSize):Unit = js.native
  def getOriginalSize:ccSize = js.native
  def setOriginalSize(sizeInPixels:ccSize):Unit = js.native
  def getTexture:ccTexture2D = js.native
  def setTexture(texture:ccTexture2D):Unit = js.native
  def getOffset:ccPoint = js.native
  def setOffset(offsets:ccPoint):Unit = js.native
  override def clone:js.Any = js.native
  def copyWithZone:ccSpriteFrame = js.native
  def copy:ccSpriteFrame = js.native
  def initWithTexture(texture:String, rect:ccRect, rotated:Boolean, offset:ccPoint, originalSize:ccSize):Boolean = js.native
}

