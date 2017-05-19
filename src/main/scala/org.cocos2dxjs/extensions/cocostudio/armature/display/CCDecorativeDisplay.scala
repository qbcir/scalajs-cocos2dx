package org.cocos2dxjs.extensions.cocostudio.armature.display

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.basenodes.ccNode
import org.cocos2dxjs.extensions.cocostudio.armature.physics.ccsColliderDetector
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsDisplayData
import org.cocos2dxjs.extensions.cocostudio.ccsClass

@js.native
@JSGlobal("ccs.DecorativeDisplay")
class ccsDecorativeDisplay extends ccsClass {
  def init:Boolean = js.native
  def setDisplay(display:ccNode):Unit = js.native
  def getDisplay:ccNode = js.native
  def setColliderDetector(colliderDetector:ccsColliderDetector):Unit = js.native
  def getColliderDetector:ccsColliderDetector = js.native
  def setDisplayData(displayData:ccsDisplayData):Unit = js.native
  def getDisplayData:ccsDisplayData = js.native
}

