package org.cocos2dxjs.extensions.cocostudio.armature.display

import scalajs.js
import org.cocos2dxjs.core.types
import scala.scalajs.js.annotation._
import scala.scalajs.js.|
import org.cocos2dxjs.extensions.cocostudio.armature.{ccsBone, t_ccsBone}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccRect, t_ccRect}
import org.cocos2dxjs.extensions.cocostudio.armature.datas.{ccsBaseData, t_ccsBaseData}
import org.cocos2dxjs.cocos2d.core.cocoa.{ccAffineTransform, t_ccAffineTransform}
import org.cocos2dxjs.extensions.cocostudio.t_ccsSprite
import org.cocos2dxjs.extensions.cocostudio.ts_ccsSprite

@js.native
trait t_ccsSkin extends t_ccsSprite {
  var skinData: types.DynObject = js.native
  var bone: ccsBone = js.native
  val displayName: String = js.native
  def initWithSpriteFrameName(spriteFrameName:String):Boolean = js.native
  def initWithFile(fileName:String, rect:t_ccRect):Boolean = js.native
  def setSkinData(skinData:t_ccsBaseData):Unit = js.native
  def getSkinData():ccsBaseData = js.native
  def updateArmatureTransform():Unit = js.native
  def getNodeToWorldTransform():ccAffineTransform = js.native
  def setBone(bone:js.Dynamic):Unit = js.native
  def getBone():Null = js.native
  def getDisplayName():String = js.native
}

@js.native
trait ts_ccsSkin extends ts_ccsSprite {
}

@js.native
@JSGlobal("ccs.Skin")
class ccsSkin(fileName:String, rect:t_ccRect) extends t_ccsSkin {
}

@js.native
@JSGlobal("ccs.Skin")
object ccsSkin extends ts_ccsSkin {
}


