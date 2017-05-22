package org.cocos2dxjs.extensions.cocostudio.armature.display

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.cocos2d.core.basenodes.{ccNode, t_ccNode}
import org.cocos2dxjs.extensions.cocostudio.armature.physics.{ccsColliderDetector, t_ccsColliderDetector}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsDisplayData, t_ccsDisplayData}
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass
import org.cocos2dxjs.extensions.cocostudio.ts_ccsClass

@js.native
trait t_ccsDecorativeDisplay extends t_ccsClass {
  def init:Boolean = js.native
  def setDisplay(display:t_ccNode):Unit = js.native
  def getDisplay:ccNode = js.native
  def setColliderDetector(colliderDetector:t_ccsColliderDetector):Unit = js.native
  def getColliderDetector:ccsColliderDetector = js.native
  def setDisplayData(displayData:t_ccsDisplayData):Unit = js.native
  def getDisplayData:ccsDisplayData = js.native
}

@js.native
trait ts_ccsDecorativeDisplay extends ts_ccsClass {
}

@js.native
@JSGlobal("ccs.DecorativeDisplay")
class ccsDecorativeDisplay extends t_ccsDecorativeDisplay {
}

@js.native
@JSGlobal("ccs.DecorativeDisplay")
object ccsDecorativeDisplay extends ts_ccsDecorativeDisplay {
}


