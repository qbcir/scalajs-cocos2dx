package org.cocos2dxjs.extensions.cocostudio.armature.datas

import scalajs.js
import scala.scalajs.js.annotation._
import org.cocos2dxjs.cocos2d.core.platform.ccColor
import org.cocos2dxjs.extensions.cocostudio.t_ccsClass
import org.cocos2dxjs.cocos2d.core.cocoa.ccAffineTransform
import org.cocos2dxjs.cocos2d.core.cocoa.ccPoint

@js.native
trait t_ccsBaseData extends t_ccsClass {
  def copy(node:ccsBaseData):Unit = js.native
  def setColor(color:ccColor):Unit = js.native
  def getColor:ccColor = js.native
  def subtract(from:ccsBaseData, to:ccsBaseData, limit:Boolean):Unit = js.native
}

@js.native
@JSGlobal("ccs.BaseData")
class ccsBaseData extends t_ccsBaseData {
}

@js.native
@JSGlobal("ccs.BaseData")
object ccsBaseData extends js.Object {
}

@js.native
trait t_ccsDisplayData extends t_ccsClass {
  def changeDisplayToTexture(displayName:String):String = js.native
  def copy(displayData:ccsDisplayData):Unit = js.native
}

@js.native
@JSGlobal("ccs.DisplayData")
class ccsDisplayData extends t_ccsDisplayData {
}

@js.native
@JSGlobal("ccs.DisplayData")
object ccsDisplayData extends js.Object {
}

@js.native
trait t_ccsSpriteDisplayData extends t_ccsDisplayData {
  def copy(displayData:ccsSpriteDisplayData):Unit = js.native
}

@js.native
@JSGlobal("ccs.SpriteDisplayData")
class ccsSpriteDisplayData extends t_ccsSpriteDisplayData {
}

@js.native
@JSGlobal("ccs.SpriteDisplayData")
object ccsSpriteDisplayData extends js.Object {
}

@js.native
trait t_ccsArmatureDisplayData extends t_ccsDisplayData {
}

@js.native
@JSGlobal("ccs.ArmatureDisplayData")
class ccsArmatureDisplayData extends t_ccsArmatureDisplayData {
}

@js.native
@JSGlobal("ccs.ArmatureDisplayData")
object ccsArmatureDisplayData extends js.Object {
}

@js.native
trait t_ccsParticleDisplayData extends t_ccsDisplayData {
}

@js.native
@JSGlobal("ccs.ParticleDisplayData")
class ccsParticleDisplayData extends t_ccsParticleDisplayData {
}

@js.native
@JSGlobal("ccs.ParticleDisplayData")
object ccsParticleDisplayData extends js.Object {
}

@js.native
trait t_ccsBoneData extends t_ccsBaseData {
  def init:Boolean = js.native
  def addDisplayData(displayData:ccsDisplayData):Unit = js.native
  def getDisplayData(index:Float):ccsDisplayData = js.native
}

@js.native
@JSGlobal("ccs.BoneData")
class ccsBoneData extends t_ccsBoneData {
}

@js.native
@JSGlobal("ccs.BoneData")
object ccsBoneData extends js.Object {
}

@js.native
trait t_ccsArmatureData extends t_ccsClass {
  def init:Boolean = js.native
  def addBoneData(boneData:ccsBoneData):Unit = js.native
  def getBoneDataDic:js.Object = js.native
  def getBoneData(boneName:String):ccsBoneData = js.native
}

@js.native
@JSGlobal("ccs.ArmatureData")
class ccsArmatureData extends t_ccsArmatureData {
}

@js.native
@JSGlobal("ccs.ArmatureData")
object ccsArmatureData extends js.Object {
}

@js.native
trait t_ccsFrameData extends t_ccsBaseData {
  def copy(frameData:js.Any):Unit = js.native
}

@js.native
@JSGlobal("ccs.FrameData")
class ccsFrameData extends t_ccsFrameData {
}

@js.native
@JSGlobal("ccs.FrameData")
object ccsFrameData extends js.Object {
}

@js.native
trait t_ccsMovementBoneData extends t_ccsClass {
  def init:Boolean = js.native
  def addFrameData(frameData:ccsFrameData):Unit = js.native
  def getFrameData(index:Float):ccsFrameData = js.native
}

@js.native
@JSGlobal("ccs.MovementBoneData")
class ccsMovementBoneData extends t_ccsMovementBoneData {
}

@js.native
@JSGlobal("ccs.MovementBoneData")
object ccsMovementBoneData extends js.Object {
}

@js.native
trait t_ccsMovementData extends js.Object {
  def addMovementBoneData(movBoneData:ccsMovementBoneData):Unit = js.native
  def getMovementBoneData(boneName:js.Any):ccsMovementBoneData = js.native
}

@js.native
@JSGlobal("ccs.MovementData")
class ccsMovementData extends t_ccsMovementData {
}

@js.native
@JSGlobal("ccs.MovementData")
object ccsMovementData extends js.Object {
}

@js.native
trait t_ccsAnimationData extends t_ccsClass {
  def addMovement(moveData:ccsMovementData):Unit = js.native
  def getMovement(moveName:String):ccsMovementData = js.native
  def getMovementCount:Float = js.native
}

@js.native
@JSGlobal("ccs.AnimationData")
class ccsAnimationData extends t_ccsAnimationData {
}

@js.native
@JSGlobal("ccs.AnimationData")
object ccsAnimationData extends js.Object {
}

@js.native
trait t_ccsContourVertex2 extends js.Object {
}

@js.native
@JSGlobal("ccs.ContourVertex2")
class ccsContourVertex2 extends t_ccsContourVertex2 {
}

@js.native
@JSGlobal("ccs.ContourVertex2")
object ccsContourVertex2 extends js.Object {
}

@js.native
trait t_ccsContourData extends js.Object {
  def addVertex(p:ccPoint):Unit = js.native
}

@js.native
@JSGlobal("ccs.ContourData")
class ccsContourData extends t_ccsContourData {
}

@js.native
@JSGlobal("ccs.ContourData")
object ccsContourData extends js.Object {
}

@js.native
trait t_ccsTextureData extends js.Object {
  def addContourData(contourData:ccsContourData):Unit = js.native
  def getContourData(index:Float):ccsContourData = js.native
}

@js.native
@JSGlobal("ccs.TextureData")
class ccsTextureData extends t_ccsTextureData {
}

@js.native
@JSGlobal("ccs.TextureData")
object ccsTextureData extends js.Object {
}

