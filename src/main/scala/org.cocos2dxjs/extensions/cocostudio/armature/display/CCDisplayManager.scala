package org.cocos2dxjs.extensions.cocostudio.armature.display

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsDisplayData
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsBoneData
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint

@js.native
trait t_ccsDisplayManager extends js.Object {
}

@js.native
@JSGlobal("ccs.DisplayManager")
class ccsDisplayManager extends t_ccsDisplayManager {
}

@js.native
@JSGlobal("ccs.DisplayManager")
object ccsDisplayManager extends js.Object {
  def init(bone:js.Any):Boolean = js.native
  def addDisplay(display:ccsDisplayData, index:Float):Unit = js.native
  def removeDisplay(index:Float):Unit = js.native
  def getDecorativeDisplayList:js.Array[js.Any] = js.native
  def changeDisplayWithIndex(index:Float, force:Boolean):Unit = js.native
  def changeDisplayWithName(name:String, force:Boolean):Unit = js.native
  def setCurrentDecorativeDisplay(decoDisplay:ccsDecorativeDisplay):Unit = js.native
  def getDisplayRenderNode:ccNode = js.native
  def getDisplayRenderNodeType:Float = js.native
  def getCurrentDisplayIndex:Float = js.native
  def getCurrentDecorativeDisplay:ccsDecorativeDisplay = js.native
  def getDecorativeDisplayByIndex(index:js.Any):ccsDecorativeDisplay = js.native
  def initDisplayList(boneData:ccsBoneData):Unit = js.native
  def containPoint(point:ccPoint, y:Float):Boolean = js.native
  def setVisible(visible:Boolean):Unit = js.native
  def isVisible:Boolean = js.native
}

