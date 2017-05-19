package org.cocos2dxjs.extensions.cocostudio.armature.display

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.extensions.cocostudio.armature.ccsBone
import org.cocos2dxjs.cocos2d.core.cocoa.ccRect
import org.cocos2dxjs.extensions.cocostudio.armature.datas.ccsBaseData
import org.cocos2dxjs.cocos2d.core.cocoa.ccAffineTransform
import org.cocos2dxjs.extensions.cocostudio.ccsSprite

@js.native
@JSGlobal("ccs.Skin")
class ccsSkin extends ccsSprite {
  def initWithSpriteFrameName(spriteFrameName:String):Boolean = js.native
  def initWithFile(fileName:String, rect:ccRect):Boolean = js.native
  def setSkinData(skinData:ccsBaseData):Unit = js.native
  def getSkinData:ccsBaseData = js.native
  def updateArmatureTransform():Unit = js.native
  def getNodeToWorldTransform:ccAffineTransform = js.native
  def setBone(bone:js.Any):Unit = js.native
  def getBone:js.Any = js.native
  def getDisplayName:String = js.native
}
