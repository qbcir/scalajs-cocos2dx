package org.cocos2dxjs.extensions.cocostudio.armature.display

import scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.extensions.cocostudio.armature.physics.ccsColliderDetector
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsDisplayData
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass

@js.native
trait t_ccsDecorativeDisplay extends t_ccsClass {
  def init:Boolean = js.native
  def setDisplay(display:ccNode):Unit = js.native
  def getDisplay:ccNode = js.native
  def setColliderDetector(colliderDetector:ccsColliderDetector):Unit = js.native
  def getColliderDetector:ccsColliderDetector = js.native
  def setDisplayData(displayData:ccsDisplayData):Unit = js.native
  def getDisplayData:ccsDisplayData = js.native
}

@js.native
@JSGlobal("ccs.DecorativeDisplay")
class ccsDecorativeDisplay extends t_ccsDecorativeDisplay {
}

@js.native
@JSGlobal("ccs.DecorativeDisplay")
object ccsDecorativeDisplay extends js.Object {
}



