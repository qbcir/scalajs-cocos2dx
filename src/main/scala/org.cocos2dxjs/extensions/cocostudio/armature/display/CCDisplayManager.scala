package org.cocos2dxjs.extensions.cocostudio.armature.display

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.armature.{ccsBone, t_ccsBone}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsDisplayData, t_ccsDisplayData}
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsBoneData, t_ccsBoneData}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccPoint, t_ccPoint}

@js.native
trait t_ccsDisplayManager extends js.Object {
}

@js.native
trait ts_ccsDisplayManager extends js.Object {
  def init(bone:js.Dynamic):Boolean = js.native
  def addDisplay(display:t_ccNode|t_ccsDisplayData, index:Float):Unit = js.native
  def removeDisplay(index:Float):Unit = js.native
  def getDecorativeDisplayList():js.Array[js.Any] = js.native
  def changeDisplayWithIndex(index:Float, force:Boolean):Unit = js.native
  def changeDisplayWithName(name:String, force:Boolean):Unit = js.native
  def setCurrentDecorativeDisplay(decoDisplay:t_ccsDecorativeDisplay):Unit = js.native
  def getDisplayRenderNode():ccNode = js.native
  def getDisplayRenderNodeType():Float = js.native
  def getCurrentDisplayIndex():Float = js.native
  def getCurrentDecorativeDisplay():ccsDecorativeDisplay = js.native
  def getDecorativeDisplayByIndex(index:js.Dynamic):ccsDecorativeDisplay = js.native
  def initDisplayList(boneData:t_ccsBoneData):Unit = js.native
  def containPoint(point:Float|t_ccPoint, y:Float):Boolean = js.native
  def setVisible(visible:Boolean):Unit = js.native
  def isVisible():Boolean = js.native
}

@js.native
@JSGlobal("ccs.DisplayManager")
class ccsDisplayManager(bone:t_ccsBone) extends t_ccsDisplayManager {
}

@js.native
@JSGlobal("ccs.DisplayManager")
object ccsDisplayManager extends ts_ccsDisplayManager {
}


