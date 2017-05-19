package org.cocos2dxjs.extensions.cocostudio.armature.datas

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.extensions.cocostudio.ccsClass
import org.cocos2dxjs.cocos2d.core.cocoa.ccAffineTransform
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint

@js.native
@JSGlobal("ccs.BaseData")
class ccsBaseData extends ccsClass {
  def copy(node:ccsBaseData):Unit = js.native
  def setColor(color:ccColor):Unit = js.native
  def getColor:ccColor = js.native
  def subtract(from:ccsBaseData, to:ccsBaseData, limit:Boolean):Unit = js.native
}

@js.native
@JSGlobal("ccs.DisplayData")
class ccsDisplayData extends ccsClass {
  def changeDisplayToTexture(displayName:String):String = js.native
  def copy(displayData:ccsDisplayData):Unit = js.native
}

@js.native
@JSGlobal("ccs.SpriteDisplayData")
class ccsSpriteDisplayData extends ccsDisplayData {
  def copy(displayData:ccsSpriteDisplayData):Unit = js.native
}

@js.native
@JSGlobal("ccs.ArmatureDisplayData")
class ccsArmatureDisplayData extends ccsDisplayData {
}

@js.native
@JSGlobal("ccs.ParticleDisplayData")
class ccsParticleDisplayData extends ccsDisplayData {
}

@js.native
@JSGlobal("ccs.BoneData")
class ccsBoneData extends ccsBaseData {
  def init:Boolean = js.native
  def addDisplayData(displayData:ccsDisplayData):Unit = js.native
  def getDisplayData(index:Float):ccsDisplayData = js.native
}

@js.native
@JSGlobal("ccs.ArmatureData")
class ccsArmatureData extends ccsClass {
  def init:Boolean = js.native
  def addBoneData(boneData:ccsBoneData):Unit = js.native
  def getBoneDataDic:js.Object = js.native
  def getBoneData(boneName:String):ccsBoneData = js.native
}

@js.native
@JSGlobal("ccs.FrameData")
class ccsFrameData extends ccsBaseData {
  def copy(frameData:js.Any):Unit = js.native
}

@js.native
@JSGlobal("ccs.MovementBoneData")
class ccsMovementBoneData extends ccsClass {
  def init:Boolean = js.native
  def addFrameData(frameData:ccsFrameData):Unit = js.native
  def getFrameData(index:Float):ccsFrameData = js.native
}

@js.native
@JSGlobal("ccs.MovementData")
class ccsMovementData extends js.Object {
  def addMovementBoneData(movBoneData:ccsMovementBoneData):Unit = js.native
  def getMovementBoneData(boneName:js.Any):ccsMovementBoneData = js.native
}

@js.native
@JSGlobal("ccs.AnimationData")
class ccsAnimationData extends ccsClass {
  def addMovement(moveData:ccsMovementData):Unit = js.native
  def getMovement(moveName:String):ccsMovementData = js.native
  def getMovementCount:Float = js.native
}

@js.native
@JSGlobal("ccs.ContourVertex2")
class ccsContourVertex2 extends js.Object {
}

@js.native
@JSGlobal("ccs.ContourData")
class ccsContourData extends js.Object {
  def addVertex(p:ccPoint):Unit = js.native
}

@js.native
@JSGlobal("ccs.TextureData")
class ccsTextureData extends js.Object {
  def addContourData(contourData:ccsContourData):Unit = js.native
  def getContourData(index:Float):ccsContourData = js.native
}

