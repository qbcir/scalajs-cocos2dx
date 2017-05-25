package org.cocos2dxjs.cocos2d.actions3d

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.cocoa.{ccSize, t_ccSize}
import org.cocos2dxjs.cocos2d.actions.{ccAction, t_ccAction}
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.cocos2d.effects.{ccGridBase, t_ccGridBase}
import org.cocos2dxjs.cocos2d.actions.t_ccActionInterval
import org.cocos2dxjs.cocos2d.actions.ts_ccActionInterval
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}
import org.cocos2dxjs.cocos2d.core.platform.{ccVertex3F, t_ccVertex3F}
import org.cocos2dxjs.cocos2d.core.platform.{ccQuad3, t_ccQuad3}
import org.cocos2dxjs.cocos2d.actions.t_ccActionInstant
import org.cocos2dxjs.cocos2d.actions.ts_ccActionInstant

@js.native
trait t_ccGridAction extends t_ccActionInterval {
  override def clone():ccAction = js.native
  override def startWithTarget(target:t_ccNode):Unit = js.native
  override def reverse():ccAction = js.native
  def initWithDuration(duration:Float, gridSize:t_ccSize):Boolean = js.native
  def getGrid():ccGridBase = js.native
}

@js.native
trait ts_ccGridAction extends ts_ccActionInterval {
}

@js.native
@JSGlobal("cc.GridAction")
class ccGridAction(duration:Float, gridSize:t_ccSize) extends t_ccGridAction {
}

@js.native
@JSGlobal("cc.GridAction")
object ccGridAction extends ts_ccGridAction {
}

@js.native
trait t_ccGrid3DAction extends t_ccGridAction {
  override def getGrid():ccGridBase = js.native
  def getGridRect():ccRect = js.native
  def vertex(position:t_ccPoint):ccVertex3F = js.native
  def getVertex(position:t_ccPoint):ccVertex3F = js.native
  def originalVertex(position:t_ccPoint):ccVertex3F = js.native
  def getOriginalVertex(position:t_ccPoint):ccVertex3F = js.native
  def setVertex(position:t_ccPoint, vertex:t_ccVertex3F):Unit = js.native
}

@js.native
trait ts_ccGrid3DAction extends ts_ccGridAction {
}

@js.native
@JSGlobal("cc.Grid3DAction")
class ccGrid3DAction() extends t_ccGrid3DAction {
}

@js.native
@JSGlobal("cc.Grid3DAction")
object ccGrid3DAction extends ts_ccGrid3DAction {
}

@js.native
trait t_ccTiledGrid3DAction extends t_ccGridAction {
  def tile(position:t_ccPoint):ccQuad3 = js.native
  def getTile(position:t_ccPoint):ccQuad3 = js.native
  def originalTile(position:t_ccPoint):ccQuad3 = js.native
  def getOriginalTile(position:t_ccPoint):ccQuad3 = js.native
  def setTile(position:t_ccPoint, coords:t_ccQuad3):Unit = js.native
  override def getGrid():ccGridBase = js.native
}

@js.native
trait ts_ccTiledGrid3DAction extends ts_ccGridAction {
}

@js.native
@JSGlobal("cc.TiledGrid3DAction")
class ccTiledGrid3DAction() extends t_ccTiledGrid3DAction {
}

@js.native
@JSGlobal("cc.TiledGrid3DAction")
object ccTiledGrid3DAction extends ts_ccTiledGrid3DAction {
}

@js.native
trait t_ccStopGrid extends t_ccActionInstant {
  override def startWithTarget(target:t_ccNode):Unit = js.native
}

@js.native
trait ts_ccStopGrid extends ts_ccActionInstant {
}

@js.native
@JSGlobal("cc.StopGrid")
class ccStopGrid() extends t_ccStopGrid {
}

@js.native
@JSGlobal("cc.StopGrid")
object ccStopGrid extends ts_ccStopGrid {
}

@js.native
trait t_ccReuseGrid extends t_ccActionInstant {
  def initWithTimes(times:Float):Boolean = js.native
  override def startWithTarget(target:t_ccNode):Unit = js.native
}

@js.native
trait ts_ccReuseGrid extends ts_ccActionInstant {
}

@js.native
@JSGlobal("cc.ReuseGrid")
class ccReuseGrid(times:Float) extends t_ccReuseGrid {
}

@js.native
@JSGlobal("cc.ReuseGrid")
object ccReuseGrid extends ts_ccReuseGrid {
}


