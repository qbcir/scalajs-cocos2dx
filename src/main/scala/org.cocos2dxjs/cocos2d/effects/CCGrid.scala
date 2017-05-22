package org.cocos2dxjs.cocos2d.effects

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.core.textures.{ccTexture2D, t_ccTexture2D}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.platform.t_ccClass
import org.cocos2dxjs.cocos2d.core.platform.ts_ccClass
import org.cocos2dxjs.cocos2d.core.platform.{ccVertex3F, t_ccVertex3F}
import org.cocos2dxjs.cocos2d.core.platform.{ccQuad3, t_ccQuad3}

@js.native
trait t_ccGridBase extends t_ccClass {
  def isActive:Boolean = js.native
  def setActive(active:Float):Unit = js.native
  def getReuseGrid:Float = js.native
  def setReuseGrid(reuseGrid:js.Dynamic):Unit = js.native
  def getGridSize:ccSize = js.native
  def setGridSize(gridSize:t_ccSize):Unit = js.native
  def setGridRect(rect:t_ccRect):Unit = js.native
  def getGridRect:ccRect = js.native
  def getStep:ccPoint = js.native
  def setStep(step:t_ccPoint):Unit = js.native
  def isTextureFlipped:Boolean = js.native
  def setTextureFlipped(flipped:Boolean):Unit = js.native
  def initWithSize(gridSize:t_ccSize, texture:t_ccTexture2D, flipped:Boolean, rect:t_ccRect):Boolean = js.native
}

@js.native
trait ts_ccGridBase extends ts_ccClass {
}

@js.native
@JSGlobal("cc.GridBase")
class ccGridBase(gridSize:t_ccSize, texture:t_ccTexture2D, flipped:Boolean, rect:t_ccRect) extends t_ccGridBase {
}

@js.native
@JSGlobal("cc.GridBase")
object ccGridBase extends ts_ccGridBase {
}

@js.native
trait t_ccGrid3D extends t_ccGridBase {
  def vertex(pos:t_ccPoint):ccVertex3F = js.native
  def getVertex(pos:t_ccPoint):ccVertex3F = js.native
  def originalVertex(pos:t_ccPoint):ccVertex3F = js.native
  def getOriginalVertex(pos:t_ccPoint):ccVertex3F = js.native
  def setVertex(pos:t_ccPoint, vertex:t_ccVertex3F):Unit = js.native
}

@js.native
trait ts_ccGrid3D extends ts_ccGridBase {
}

@js.native
@JSGlobal("cc.Grid3D")
class ccGrid3D(gridSize:t_ccSize, texture:t_ccTexture2D, flipped:Boolean, rect:t_ccRect) extends t_ccGrid3D {
}

@js.native
@JSGlobal("cc.Grid3D")
object ccGrid3D extends ts_ccGrid3D {
}

@js.native
trait t_ccTiledGrid3D extends t_ccGridBase {
  def tile(pos:t_ccPoint):ccQuad3 = js.native
  def getTile(pos:t_ccPoint):ccQuad3 = js.native
  def getOriginalTile(pos:t_ccPoint):ccQuad3 = js.native
  def originalTile(pos:t_ccPoint):ccQuad3 = js.native
  def setTile(pos:t_ccPoint, coords:t_ccQuad3):Unit = js.native
}

@js.native
trait ts_ccTiledGrid3D extends ts_ccGridBase {
}

@js.native
@JSGlobal("cc.TiledGrid3D")
class ccTiledGrid3D(gridSize:t_ccSize, texture:t_ccTexture2D, flipped:Boolean) extends t_ccTiledGrid3D {
}

@js.native
@JSGlobal("cc.TiledGrid3D")
object ccTiledGrid3D extends ts_ccTiledGrid3D {
}


