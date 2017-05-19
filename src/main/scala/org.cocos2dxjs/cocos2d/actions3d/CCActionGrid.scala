package org.cocos2dxjs.cocos2d.actions3d

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.actions.ccAction
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.cocos2d.core.cocoa.ccSize
import org.cocos2dxjs.cocos2d.effects.ccGridBase
import org.cocos2dxjs.cocos2d.actions.ccActionInterval
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint
import org.cocos2dxjs.cocos2d.core.platform.ccVertex3F
import org.cocos2dxjs.cocos2d.core.platform.ccQuad3
import org.cocos2dxjs.cocos2d.actions.ccActionInstant

@js.native
@JSGlobal("cc.GridAction")
class ccGridAction extends ccActionInterval {
  override def clone:ccAction = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
  override def reverse:ccAction = js.native
  def initWithDuration(duration:Float, gridSize:ccSize):Boolean = js.native
  def getGrid:ccGridBase = js.native
}

@js.native
@JSGlobal("cc.Grid3DAction")
class ccGrid3DAction extends ccGridAction {
  override def getGrid:ccGridBase = js.native
  def getGridRect:ccRect = js.native
  def vertex(position:ccPoint):ccVertex3F = js.native
  def getVertex(position:ccPoint):ccVertex3F = js.native
  def originalVertex(position:ccPoint):ccVertex3F = js.native
  def getOriginalVertex(position:ccPoint):ccVertex3F = js.native
  def setVertex(position:ccPoint, vertex:ccVertex3F):Unit = js.native
}

@js.native
@JSGlobal("cc.TiledGrid3DAction")
class ccTiledGrid3DAction extends ccGridAction {
  def tile(position:ccPoint):ccQuad3 = js.native
  def getTile(position:ccPoint):ccQuad3 = js.native
  def originalTile(position:ccPoint):ccQuad3 = js.native
  def getOriginalTile(position:ccPoint):ccQuad3 = js.native
  def setTile(position:ccPoint, coords:ccQuad3):Unit = js.native
  override def getGrid:ccGridBase = js.native
}

@js.native
@JSGlobal("cc.StopGrid")
class ccStopGrid extends ccActionInstant {
  override def startWithTarget(target:ccNode):Unit = js.native
}

@js.native
@JSGlobal("cc.ReuseGrid")
class ccReuseGrid extends ccActionInstant {
  def initWithTimes(times:Float):Boolean = js.native
  override def startWithTarget(target:ccNode):Unit = js.native
}
