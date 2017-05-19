package org.cocos2dxjs.cocos2d.effects

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.textures.ccTexture2D
import org.cocos2dxjs.cocos2d.core.platform.ccClass
import org.cocos2dxjs.cocos2d.core.platform.ccVertex3F
import org.cocos2dxjs.cocos2d.core.platform.ccQuad3

@js.native
@JSGlobal("cc.GridBase")
class ccGridBase extends ccClass {
  def isActive:Boolean = js.native
  def setActive(active:Float):Unit = js.native
  def getReuseGrid:Float = js.native
  def setReuseGrid(reuseGrid:js.Any):Unit = js.native
  def getGridSize:ccSize = js.native
  def setGridSize(gridSize:ccSize):Unit = js.native
  def setGridRect(rect:ccRect):Unit = js.native
  def getGridRect:ccRect = js.native
  def getStep:ccPoint = js.native
  def setStep(step:ccPoint):Unit = js.native
  def isTextureFlipped:Boolean = js.native
  def setTextureFlipped(flipped:Boolean):Unit = js.native
  def initWithSize(gridSize:ccSize, texture:ccTexture2D, flipped:Boolean, rect:ccRect):Boolean = js.native
}

@js.native
@JSGlobal("cc.Grid3D")
class ccGrid3D extends ccGridBase {
  def vertex(pos:ccPoint):ccVertex3F = js.native
  def getVertex(pos:ccPoint):ccVertex3F = js.native
  def originalVertex(pos:ccPoint):ccVertex3F = js.native
  def getOriginalVertex(pos:ccPoint):ccVertex3F = js.native
  def setVertex(pos:ccPoint, vertex:ccVertex3F):Unit = js.native
}

@js.native
@JSGlobal("cc.TiledGrid3D")
class ccTiledGrid3D extends ccGridBase {
  def tile(pos:ccPoint):ccQuad3 = js.native
  def getTile(pos:ccPoint):ccQuad3 = js.native
  def getOriginalTile(pos:ccPoint):ccQuad3 = js.native
  def originalTile(pos:ccPoint):ccQuad3 = js.native
  def setTile(pos:ccPoint, coords:ccQuad3):Unit = js.native
}

